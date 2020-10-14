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

        @Column(nullable = false)
        var text : String? = null

        @Column(nullable = false)
        var channel : String? = null

        @Column(nullable = false)
        var picture : String? = null

        @Column(nullable = false)
        @Temporal(TemporalType.TIMESTAMP)
        var publishDate : Date? = null

        @Column(nullable = false)
        @Temporal(TemporalType.TIMESTAMP)
        var plannedDate : Date? = null

        @Column(nullable = false)
        var status : String? = null

        @Column(nullable = false)
        var link : String? = null

}