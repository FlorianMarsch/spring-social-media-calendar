package de.florianmarsch.spring.socialmediacalendar.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lde/florianmarsch/spring/socialmediacalendar/service/PostingServicer;", "Lde/florianmarsch/spring/socialmediacalendar/service/PostingStrategy;", "()V", "instagramPostStrategy", "Lde/florianmarsch/spring/socialmediacalendar/service/instagram/InstagramPostStrategy;", "instagramStoryStrategy", "Lde/florianmarsch/spring/socialmediacalendar/service/instagram/InstagramStoryStrategy;", "post", "Lde/florianmarsch/spring/socialmediacalendar/persistence/Posting;", "posting", "channel", "Lde/florianmarsch/spring/socialmediacalendar/persistence/Channel;", "social-media-calendar"})
@org.springframework.stereotype.Service()
public class PostingServicer implements de.florianmarsch.spring.socialmediacalendar.service.PostingStrategy {
    @org.springframework.beans.factory.annotation.Autowired()
    private de.florianmarsch.spring.socialmediacalendar.service.instagram.InstagramStoryStrategy instagramStoryStrategy;
    @org.springframework.beans.factory.annotation.Autowired()
    private de.florianmarsch.spring.socialmediacalendar.service.instagram.InstagramPostStrategy instagramPostStrategy;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public de.florianmarsch.spring.socialmediacalendar.persistence.Posting post(@org.jetbrains.annotations.NotNull()
    de.florianmarsch.spring.socialmediacalendar.persistence.Posting posting, @org.jetbrains.annotations.NotNull()
    de.florianmarsch.spring.socialmediacalendar.persistence.Channel channel) {
        return null;
    }
    
    public PostingServicer() {
        super();
    }
}