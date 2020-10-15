package de.florianmarsch.spring.socialmediacalendar.persistence



import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.web.PageableDefault
import org.springframework.stereotype.Repository

@Repository
interface UploadRepository : PagingAndSortingRepository<Upload, String> {



}