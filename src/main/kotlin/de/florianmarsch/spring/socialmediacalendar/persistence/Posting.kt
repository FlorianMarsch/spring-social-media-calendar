package de.florianmarsch.spring.socialmediacalendar.persistence

import java.io.InputStream
import java.io.Serializable
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
data class Posting(
        @Id
        var id: String = UUID.randomUUID().toString()
) :Serializable{

        @Column(nullable = true)
        var title : String? = null

        @Column(nullable = true)
        var description : String? = null

        @Lob
        @Column(nullable = true)
        var text : String? = null

        @Column(nullable = true)
        var channel : String? = null

        @Column(nullable = true)
        var picture : String? = null

        @Column(nullable = true)
        var publishDate : LocalDateTime? = null

        @Column(nullable = true)
        var plannedDate : LocalDateTime? = null

        @Column(nullable = true)
        var status : String? = null

        @Column(nullable = true)
        var link : String? = null

}