package de.florianmarsch.spring.socialmediacalendar.service

import de.florianmarsch.spring.socialmediacalendar.persistence.Channel
import de.florianmarsch.spring.socialmediacalendar.persistence.Posting

interface PostingStrategy {

    fun post(posting : Posting, channel: Channel) :Posting
}