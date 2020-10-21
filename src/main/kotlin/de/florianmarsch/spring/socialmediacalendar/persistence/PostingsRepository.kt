package de.florianmarsch.spring.socialmediacalendar.persistence



import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository
import javax.persistence.EntityManager

@Repository
interface PostingsRepository : PagingAndSortingRepository<Posting?, String?>{


}