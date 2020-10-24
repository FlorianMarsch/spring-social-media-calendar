package de.florianmarsch.spring.socialmediacalendar.service.instagram

import de.florianmarsch.spring.socialmediacalendar.persistence.Channel
import de.florianmarsch.spring.socialmediacalendar.persistence.Posting
import de.florianmarsch.spring.socialmediacalendar.service.PostingStrategy
import org.apache.tika.config.TikaConfig
import org.apache.tika.mime.MimeType
import org.brunocvcunha.instagram4j.Instagram4j
import org.brunocvcunha.instagram4j.requests.InstagramUploadPhotoRequest
import org.brunocvcunha.instagram4j.requests.payload.InstagramConfigureMediaResult
import org.springframework.stereotype.Service
import java.awt.Color
import java.awt.Graphics2D
import java.awt.image.BufferedImage
import java.io.File
import java.io.FileOutputStream
import java.net.URL
import java.nio.file.Files
import java.time.LocalDateTime
import java.time.ZoneId
import java.util.*
import javax.imageio.ImageIO
import kotlin.math.max


@Service
class InstagramPostStrategy : PostingStrategy{

    override fun post(posting: Posting, channel: Channel): Posting {

        val response = posting


        val instagram = Instagram4j.builder().username(channel.username).password(channel.password).build()


        val temp: File = File.createTempFile(UUID.randomUUID().toString(),".jpg")
        URL(posting.picture).openConnection().getInputStream().copyTo(FileOutputStream(temp))


        val source: BufferedImage = ImageIO.read(temp)
        val width = source.width
        val height = source.height

        if(width != height ) {


            val dimension = max(width, height)
            val scale = (1080f/dimension).toDouble()

            val borderLeft = ((dimension-width)/2)
            val borderTop = ((dimension-height)/2)

            val borderedImageWidth: Int = dimension
            val borderedImageHeight: Int = dimension
            val img = BufferedImage(borderedImageWidth, borderedImageHeight, BufferedImage.TYPE_3BYTE_BGR)
            img.createGraphics()
            val g = img.graphics as Graphics2D
            g.color = Color.black
            g.fillRect(0, 0, borderedImageWidth, borderedImageHeight)
            g.drawImage(source, borderLeft, borderTop, width + borderLeft, height + borderTop, 0, 0, width, height, Color.black, null)
            g.scale(scale,scale)
            ImageIO.write(img, "jpg", temp)
        }



        val config = TikaConfig.getDefaultConfig()
        val mimeTypeString :String = Files.probeContentType(temp.toPath())
        val mimeType: MimeType = config.mimeRepository.forName(mimeTypeString)
        val extension: String = mimeType.extension

        val file = File.createTempFile(UUID.randomUUID().toString(), extension)
        temp.renameTo(file)

        if(posting.text.isNullOrEmpty()){
            response.status = "Text is null or empty"
        }

        posting.text?.let{
            try{

                instagram.apply {
                    setup()
                    val login = login()
                    if(login.isSpam){
                        throw IllegalStateException("login is spam.")
                    }
                    if(login.status == "fail"){
                        throw IllegalStateException("login.status : ${login.message}.")
                    }

                    val storyResult: InstagramConfigureMediaResult = instagram.sendRequest(InstagramUploadPhotoRequest(
                            file, it))

                    response.status = storyResult.status
                    response.link = storyResult.checkpoint_url
                    response.publishDate = LocalDateTime.now(ZoneId.of("CET"))
                }
            }catch(e:Throwable){
                response.status = e.message
            }

        }


        return response
    }
}