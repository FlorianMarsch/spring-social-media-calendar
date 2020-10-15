package de.florianmarsch.spring.socialmediacalendar.persistence

import java.io.InputStream
import java.io.Serializable
import java.util.*
import javax.persistence.*

@Entity
data class Upload(
        @Id
        var id: String = UUID.randomUUID().toString()
) :Serializable{


        @Lob
        @Column(nullable = false)
        var file : String? = null

}