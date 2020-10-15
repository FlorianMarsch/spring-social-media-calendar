package de.florianmarsch.spring.socialmediacalendar



import com.querydsl.jpa.impl.JPAQuery
import de.florianmarsch.spring.socialmediacalendar.persistence.*
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired

import org.springframework.web.bind.annotation.*
import javax.persistence.EntityManager


@RestController
class ReferenceDataRestController {

	var logger: Logger = LoggerFactory.getLogger(ReferenceDataRestController::class.java)

	@Autowired
	lateinit var channelRepo : ChannelRepository

	@Autowired
	lateinit var uploadRepo : UploadRepository

	@Autowired
	lateinit var postingRepo : PostingsRepository

	@Autowired
	lateinit var entityManager : EntityManager

	@GetMapping("/api/upload")
	fun getUploads(): List<String> {

		var query = JPAQuery<Upload>(entityManager)

		return query
				.select(
						QUpload.upload.id
				)
				.from(QUpload.upload)
				.fetchResults()
				.results

		}


}