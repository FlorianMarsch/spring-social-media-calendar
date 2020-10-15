package de.florianmarsch.spring.socialmediacalendar



import com.querydsl.core.BooleanBuilder
import com.querydsl.jpa.impl.JPAQuery
import de.florianmarsch.spring.socialmediacalendar.persistence.*
import de.florianmarsch.spring.socialmediacalendar.service.PostingServicer
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired

import org.springframework.web.bind.annotation.*
import java.util.*
import javax.persistence.EntityManager


@RestController
class ReferenceDataRestController {

	var logger: Logger = LoggerFactory.getLogger(ReferenceDataRestController::class.java)

	@Autowired
	lateinit var channelRepo : ChannelRepository

	@Autowired
	lateinit var entityManager : EntityManager

	@Autowired
	lateinit var postingRepo : PostingsRepository

	@Autowired
	lateinit var postingServicer : PostingServicer

	@GetMapping("/api/theWorkDone")
	fun proccessPostings() {

		var query = JPAQuery<Posting>(entityManager)


		val condition = BooleanBuilder()
		condition.and(QPosting.posting.plannedDate.before(Date()))
		condition.and(QPosting.posting.plannedDate.isNotNull)
		condition.and(QPosting.posting.publishDate.isNull)
		condition.and(QPosting.posting.picture.isNotNull)
		condition.and(QPosting.posting.channel.isNotNull)

		 query
			.select(
					QPosting.posting
			)
			.from(QPosting.posting)
				 .where(condition)
			.fetchResults()
			.results.forEach {
			 	processPosting(it)
		 	}

		}

	private fun processPosting(posting: Posting) {


		val findById: Optional<Channel> = channelRepo.findById(posting.channel!!)
		val response = if(findById.isPresent){
			val channel = findById.get()
			postingServicer.post(posting, channel)
		}else{
			posting.apply {
				status="invalid Channel"
			}
		}

		postingRepo.save(response)

	}


}