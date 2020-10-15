package de.florianmarsch.spring.socialmediacalendar.persistence

import java.io.InputStream
import java.io.Serializable
import java.util.*
import javax.persistence.*

@Entity
data class Posting(
        @Id
        var id: String = UUID.randomUUID().toString()
) :Serializable{

        @Column(nullable = false)
        var title : String? = null

        @Column(nullable = false)
        var description : String? = null

        @Column(nullable = true)
        var text : String? = null

        @Column(nullable = true)
        var channel : String? = null

        @Column(nullable = true)
        var picture : String? = null

        @Column(nullable = true)
        @Temporal(TemporalType.TIMESTAMP)
        var publishDate : Date? = null

        @Column(nullable = true)
        @Temporal(TemporalType.TIMESTAMP)
        var plannedDate : Date? = null

        @Column(nullable = true)
        var status : String? = null

        @Column(nullable = true)
        var link : String? = null

}