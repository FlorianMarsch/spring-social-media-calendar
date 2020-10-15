package de.florianmarsch.spring.socialmediacalendar;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0017R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006$"}, d2 = {"Lde/florianmarsch/spring/socialmediacalendar/ReferenceDataRestController;", "", "()V", "channelRepo", "Lde/florianmarsch/spring/socialmediacalendar/persistence/ChannelRepository;", "getChannelRepo", "()Lde/florianmarsch/spring/socialmediacalendar/persistence/ChannelRepository;", "setChannelRepo", "(Lde/florianmarsch/spring/socialmediacalendar/persistence/ChannelRepository;)V", "entityManager", "Ljavax/persistence/EntityManager;", "getEntityManager", "()Ljavax/persistence/EntityManager;", "setEntityManager", "(Ljavax/persistence/EntityManager;)V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "setLogger", "(Lorg/slf4j/Logger;)V", "postingRepo", "Lde/florianmarsch/spring/socialmediacalendar/persistence/PostingsRepository;", "getPostingRepo", "()Lde/florianmarsch/spring/socialmediacalendar/persistence/PostingsRepository;", "setPostingRepo", "(Lde/florianmarsch/spring/socialmediacalendar/persistence/PostingsRepository;)V", "uploadRepo", "Lde/florianmarsch/spring/socialmediacalendar/persistence/UploadRepository;", "getUploadRepo", "()Lde/florianmarsch/spring/socialmediacalendar/persistence/UploadRepository;", "setUploadRepo", "(Lde/florianmarsch/spring/socialmediacalendar/persistence/UploadRepository;)V", "getUploads", "", "", "social-media-calendar"})
@org.springframework.web.bind.annotation.RestController()
public class ReferenceDataRestController {
    @org.jetbrains.annotations.NotNull()
    private org.slf4j.Logger logger;
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public de.florianmarsch.spring.socialmediacalendar.persistence.ChannelRepository channelRepo;
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public de.florianmarsch.spring.socialmediacalendar.persistence.UploadRepository uploadRepo;
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public de.florianmarsch.spring.socialmediacalendar.persistence.PostingsRepository postingRepo;
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public javax.persistence.EntityManager entityManager;
    
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
    public de.florianmarsch.spring.socialmediacalendar.persistence.UploadRepository getUploadRepo() {
        return null;
    }
    
    public void setUploadRepo(@org.jetbrains.annotations.NotNull()
    de.florianmarsch.spring.socialmediacalendar.persistence.UploadRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public de.florianmarsch.spring.socialmediacalendar.persistence.PostingsRepository getPostingRepo() {
        return null;
    }
    
    public void setPostingRepo(@org.jetbrains.annotations.NotNull()
    de.florianmarsch.spring.socialmediacalendar.persistence.PostingsRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public javax.persistence.EntityManager getEntityManager() {
        return null;
    }
    
    public void setEntityManager(@org.jetbrains.annotations.NotNull()
    javax.persistence.EntityManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/api/upload"})
    public java.util.List<java.lang.String> getUploads() {
        return null;
    }
    
    public ReferenceDataRestController() {
        super();
    }
}