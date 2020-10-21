package de.florianmarsch.spring.socialmediacalendar.service.instagram

import de.florianmarsch.spring.socialmediacalendar.persistence.Channel
import de.florianmarsch.spring.socialmediacalendar.persistence.Posting
import de.florianmarsch.spring.socialmediacalendar.service.PostingStrategy
import org.brunocvcunha.instagram4j.Instagram4j
import org.brunocvcunha.instagram4j.requests.InstagramUploadStoryPhotoRequest
import org.brunocvcunha.instagram4j.requests.payload.InstagramConfigureStoryResult
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.io.File
import java.io.FileOutputStream
import java.net.URL
import java.time.LocalDateTime
import java.util.*


@Service
class InstagramStoryStrategy : PostingStrategy{


    override fun post(posting: Posting, channel: Channel): Posting {

        val response = posting


        val instagram = Instagram4j.builder().username(channel.username).password(channel.password).build()

        instagram.apply {
            setup()
            login()

            val file: File = File.createTempFile(UUID.randomUUID().toString(),".jpg")
            URL(posting.picture).openConnection().getInputStream().copyTo(FileOutputStream(file))


            //val decode: ByteArray = Base64.getDecoder().decode(findById.file)
            //file.writeBytes(decode)

            val storyResult: InstagramConfigureStoryResult = instagram.sendRequest(InstagramUploadStoryPhotoRequest(
                    file))

            response.status = storyResult.status
            response.link = storyResult.checkpoint_url
            response.publishDate = LocalDateTime.now()
        }

        return response
    }
}