package de.florianmarsch.spring.socialmediacalendar.persistence



import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface ChannelRepository : PagingAndSortingRepository<Channel, String>{



}