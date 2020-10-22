package de.florianmarsch.spring.socialmediacalendar;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010!\u001a\u00020\u00012\b\b\u0001\u0010\"\u001a\u00020#2\b\b\u0001\u0010$\u001a\u00020#H\u0017J\b\u0010%\u001a\u00020&H\u0017J\u0010\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0012R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006*"}, d2 = {"Lde/florianmarsch/spring/socialmediacalendar/ReferenceDataRestController;", "", "()V", "channelRepo", "Lde/florianmarsch/spring/socialmediacalendar/persistence/ChannelRepository;", "getChannelRepo", "()Lde/florianmarsch/spring/socialmediacalendar/persistence/ChannelRepository;", "setChannelRepo", "(Lde/florianmarsch/spring/socialmediacalendar/persistence/ChannelRepository;)V", "entityManager", "Ljavax/persistence/EntityManager;", "getEntityManager", "()Ljavax/persistence/EntityManager;", "setEntityManager", "(Ljavax/persistence/EntityManager;)V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "setLogger", "(Lorg/slf4j/Logger;)V", "postingRepo", "Lde/florianmarsch/spring/socialmediacalendar/persistence/PostingsRepository;", "getPostingRepo", "()Lde/florianmarsch/spring/socialmediacalendar/persistence/PostingsRepository;", "setPostingRepo", "(Lde/florianmarsch/spring/socialmediacalendar/persistence/PostingsRepository;)V", "postingServicer", "Lde/florianmarsch/spring/socialmediacalendar/service/PostingServicer;", "getPostingServicer", "()Lde/florianmarsch/spring/socialmediacalendar/service/PostingServicer;", "setPostingServicer", "(Lde/florianmarsch/spring/socialmediacalendar/service/PostingServicer;)V", "getCalendarPage", "from", "Ljava/time/LocalDateTime;", "to", "proccessPostings", "", "processPosting", "posting", "Lde/florianmarsch/spring/socialmediacalendar/persistence/Posting;", "social-media-calendar"})
@org.springframework.web.bind.annotation.RestController()
public class ReferenceDataRestController {
    @org.jetbrains.annotations.NotNull()
    private org.slf4j.Logger logger;
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public de.florianmarsch.spring.socialmediacalendar.persistence.ChannelRepository channelRepo;
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public javax.persistence.EntityManager entityManager;
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public de.florianmarsch.spring.socialmediacalendar.persistence.PostingsRepository postingRepo;
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public de.florianmarsch.spring.socialmediacalendar.service.PostingServicer postingServicer;
    
    @org.jetbrains.annotations.NotNull()
    public org.slf4j.Logger getLogger() {
        return null;
    }
    
    public void setLogger(@org.jetbrains.annotations.NotNull()
    org.slf4j.Logger p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public de.florianmarsch.spring.socialmediacalendar.persistence.ChannelRepository getChannelRepo() {
        return null;
    }
    
    public void setChannelRepo(@org.jetbrains.annotations.NotNull()
    de.florianmarsch.spring.socialmediacalendar.persistence.ChannelRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public javax.persistence.EntityManager getEntityManager() {
        return null;
    }
    
    public void setEntityManager(@org.jetbrains.annotations.NotNull()
    javax.persistence.EntityManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public de.florianmarsch.spring.socialmediacalendar.persistence.PostingsRepository getPostingRepo() {
        return null;
    }
    
    public void setPostingRepo(@org.jetbrains.annotations.NotNull()
    de.florianmarsch.spring.socialmediacalendar.persistence.PostingsRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public de.florianmarsch.spring.socialmediacalendar.service.PostingServicer getPostingServicer() {
        return null;
    }
    
    public void setPostingServicer(@org.jetbrains.annotations.NotNull()
    de.florianmarsch.spring.socialmediacalendar.service.PostingServicer p0) {
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/api/theWorkDone"})
    @org.springframework.transaction.annotation.Transactional()
    public void proccessPostings() {
    }
    
    private void processPosting(de.florianmarsch.spring.socialmediacalendar.persistence.Posting posting) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/api/calendar"})
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public java.lang.Object getCalendarPage(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "from")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    java.time.LocalDateTime from, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "to")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    java.time.LocalDateTime to) {
        return null;
    }
    
    public ReferenceDataRestController() {
        super();
    }
}