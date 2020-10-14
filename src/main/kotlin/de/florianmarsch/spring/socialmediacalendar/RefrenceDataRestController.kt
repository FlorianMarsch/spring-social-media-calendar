package de.florianmarsch.spring.socialmediacalendar



import de.florianmarsch.spring.socialmediacalendar.persistence.ChannelRepository
import de.florianmarsch.spring.socialmediacalendar.persistence.PostingsRepository
import de.florianmarsch.spring.socialmediacalendar.persistence.UploadRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired

import org.springframework.web.bind.annotation.*




@RestController
class ReferenceDataRestController {

	var logger: Logger = LoggerFactory.getLogger(ReferenceDataRestController::class.java)

	@Autowired
	lateinit var channelRepo : ChannelRepository

	@Autowired
	lateinit var uploadRepo : UploadRepository

	@Autowired
	lateinit var postingRepo : PostingsRepository
}