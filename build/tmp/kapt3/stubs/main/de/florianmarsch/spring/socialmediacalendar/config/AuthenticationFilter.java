package de.florianmarsch.spring.socialmediacalendar.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0012X\u0093\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lde/florianmarsch/spring/socialmediacalendar/config/AuthenticationFilter;", "Ljavax/servlet/Filter;", "()V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "setLogger", "(Lorg/slf4j/Logger;)V", "token", "", "authFailed", "", "response", "Ljavax/servlet/ServletResponse;", "doFilter", "request", "Ljavax/servlet/ServletRequest;", "chain", "Ljavax/servlet/FilterChain;", "social-media-calendar"})
@org.springframework.core.annotation.Order(value = 1)
@org.springframework.stereotype.Component()
public class AuthenticationFilter implements javax.servlet.Filter {
    @org.jetbrains.annotations.NotNull()
    private org.slf4j.Logger logger;
    @org.springframework.beans.factory.annotation.Value(value = "${authToken}")
    private final java.lang.String token = null;
    
    @org.jetbrains.annotations.NotNull()
    public org.slf4j.Logger getLogger() {
        return null;
    }
    
    public void setLogger(@org.jetbrains.annotations.NotNull()
    org.slf4j.Logger p0) {
    }
    
    @java.lang.Override()
    public void doFilter(@org.jetbrains.annotations.NotNull()
    javax.servlet.ServletRequest request, @org.jetbrains.annotations.NotNull()
    javax.servlet.ServletResponse response, @org.jetbrains.annotations.NotNull()
    javax.servlet.FilterChain chain) throws java.io.IOException, javax.servlet.ServletException {
    }
    
    public void authFailed(@org.jetbrains.annotations.NotNull()
    javax.servlet.ServletResponse response) {
    }
    
    public AuthenticationFilter() {
        super();
    }
}