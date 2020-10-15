package de.florianmarsch.spring.socialmediacalendar.service

import de.florianmarsch.spring.socialmediacalendar.persistence.Channel
import de.florianmarsch.spring.socialmediacalendar.persistence.Posting
import de.florianmarsch.spring.socialmediacalendar.service.instagram.InstagramStoryStrategy
import net.bytebuddy.implementation.bytecode.Throw
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PostingServicer : PostingStrategy {

    @Autowired
    private lateinit var instagramStoryStrategy :InstagramStoryStrategy


    override fun post(posting: Posting, channel: Channel): Posting {

        val strategies = mapOf<String, PostingStrategy>(
                "instagram.story" to instagramStoryStrategy
        )

        try{
            return strategies.get(channel.strategy)?.post(posting, channel) ?: posting.apply {
                status = "unknown Channel Strategy"
            }
        }catch (e:Throwable){
            e.printStackTrace()
            return posting.apply {
                status = e.message
            }
        }

    }


}