package de.florianmarsch.spring.socialmediacalendar.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lde/florianmarsch/spring/socialmediacalendar/service/PostingStrategy;", "", "post", "Lde/florianmarsch/spring/socialmediacalendar/persistence/Posting;", "posting", "channel", "Lde/florianmarsch/spring/socialmediacalendar/persistence/Channel;", "social-media-calendar"})
public abstract interface PostingStrategy {
    
    @org.jetbrains.annotations.NotNull()
    public abstract de.florianmarsch.spring.socialmediacalendar.persistence.Posting post(@org.jetbrains.annotations.NotNull()
    de.florianmarsch.spring.socialmediacalendar.persistence.Posting posting, @org.jetbrains.annotations.NotNull()
    de.florianmarsch.spring.socialmediacalendar.persistence.Channel channel);
}