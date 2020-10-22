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
import java.awt.image.BufferedImage
import java.io.File
import java.io.FileOutputStream
import java.net.URL
import java.nio.file.Files
import java.time.LocalDateTime
import java.util.*
import javax.imageio.ImageIO


@Service
class InstagramPostStrategy : PostingStrategy{

    override fun post(posting: Posting, channel: Channel): Posting {

        val response = posting


        val instagram = Instagram4j.builder().username(channel.username).password(channel.password).build()

        instagram.apply {
            setup()
            login()

            val temp: File = File.createTempFile(UUID.randomUUID().toString(),".jpg")
            URL(posting.picture).openConnection().getInputStream().copyTo(FileOutputStream(temp))


            val bimg: BufferedImage = ImageIO.read(temp)
            val width = bimg.width
            val height = bimg.height

            if(width != height ){
                response.status = "Not a square : ${width}x${height} px."
            }else{



                val config = TikaConfig.getDefaultConfig()
                val mimeTypeString :String = Files.probeContentType(temp.toPath())
                val mimeType: MimeType = config.mimeRepository.forName(mimeTypeString)
                val extension: String = mimeType.extension

                val file = File.createTempFile(UUID.randomUUID().toString(), ".${extension}")
                temp.renameTo(file)

                if(posting.text.isNullOrEmpty()){
                    response.status = "Text is null or empty"
                }

                posting.text?.let{

                    val storyResult: InstagramConfigureMediaResult = instagram.sendRequest(InstagramUploadPhotoRequest(
                            file, it))

                    response.status = storyResult.status
                    response.link = storyResult.checkpoint_url
                    response.publishDate = LocalDateTime.now()
                }
            }
        }

        return response
    }
}