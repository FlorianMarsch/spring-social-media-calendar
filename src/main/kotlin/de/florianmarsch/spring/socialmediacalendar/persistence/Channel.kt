package de.florianmarsch.spring.socialmediacalendar.persistence

import java.io.InputStream
import java.io.Serializable
import java.util.*
import javax.persistence.*

@Entity
data class Channel(
        @Id
        var id: String = UUID.randomUUID().toString()
) :Serializable{

        @Column(nullable = false)
        var name : String? = null

        @Column(nullable = false)
        var username : String? = null

        @Column(nullable = false)
        var password : String? = null

        @Column(nullable = false)
        var strategy : String? = null

}