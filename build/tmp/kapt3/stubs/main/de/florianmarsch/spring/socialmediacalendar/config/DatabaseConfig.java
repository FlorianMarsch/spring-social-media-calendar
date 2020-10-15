package de.florianmarsch.spring.socialmediacalendar.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0017R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0012X\u0093\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0012X\u0093\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0012X\u0093\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lde/florianmarsch/spring/socialmediacalendar/config/DatabaseConfig;", "", "()V", "dbPassword", "", "dbUrl", "dbUser", "dataSource", "Ljavax/sql/DataSource;", "social-media-calendar"})
@org.springframework.context.annotation.Configuration()
public class DatabaseConfig {
    @org.springframework.beans.factory.annotation.Value(value = "${spring.datasource.url}")
    private final java.lang.String dbUrl = null;
    @org.springframework.beans.factory.annotation.Value(value = "${spring.datasource.username}")
    private final java.lang.String dbUser = null;
    @org.springframework.beans.factory.annotation.Value(value = "${spring.datasource.password}")
    private final java.lang.String dbPassword = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public javax.sql.DataSource dataSource() {
        return null;
    }
    
    public DatabaseConfig() {
        super();
    }
}