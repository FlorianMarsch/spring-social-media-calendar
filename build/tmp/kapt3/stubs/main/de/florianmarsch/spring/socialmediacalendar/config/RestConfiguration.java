package de.florianmarsch.spring.socialmediacalendar.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0012X\u0093\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lde/florianmarsch/spring/socialmediacalendar/config/RestConfiguration;", "Lorg/springframework/data/rest/webmvc/config/RepositoryRestConfigurer;", "()V", "entityManager", "Ljavax/persistence/EntityManager;", "configureRepositoryRestConfiguration", "", "config", "Lorg/springframework/data/rest/core/config/RepositoryRestConfiguration;", "social-media-calendar"})
@org.springframework.context.annotation.Configuration()
public class RestConfiguration implements org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer {
    @org.springframework.beans.factory.annotation.Autowired()
    private final javax.persistence.EntityManager entityManager = null;
    
    @java.lang.Override()
    public void configureRepositoryRestConfiguration(@org.jetbrains.annotations.NotNull()
    org.springframework.data.rest.core.config.RepositoryRestConfiguration config) {
    }
    
    public RestConfiguration() {
        super();
    }
}