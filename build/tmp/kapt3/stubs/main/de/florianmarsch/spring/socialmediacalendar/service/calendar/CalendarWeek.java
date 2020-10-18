package de.florianmarsch.spring.socialmediacalendar.service.calendar;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lde/florianmarsch/spring/socialmediacalendar/service/calendar/CalendarWeek;", "", "()V", "rows", "", "Lde/florianmarsch/spring/socialmediacalendar/service/calendar/CalendarHour;", "getRows", "()Ljava/util/List;", "setRows", "(Ljava/util/List;)V", "add", "", "entry", "Lde/florianmarsch/spring/socialmediacalendar/service/calendar/CalendarEntry;", "Companion", "social-media-calendar"})
public final class CalendarWeek {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<de.florianmarsch.spring.socialmediacalendar.service.calendar.CalendarHour> rows;
    public static final de.florianmarsch.spring.socialmediacalendar.service.calendar.CalendarWeek.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.florianmarsch.spring.socialmediacalendar.service.calendar.CalendarHour> getRows() {
        return null;
    }
    
    public final void setRows(@org.jetbrains.annotations.NotNull()
    java.util.List<de.florianmarsch.spring.socialmediacalendar.service.calendar.CalendarHour> p0) {
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    de.florianmarsch.spring.socialmediacalendar.service.calendar.CalendarEntry entry) {
    }
    
    public CalendarWeek() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lde/florianmarsch/spring/socialmediacalendar/service/calendar/CalendarWeek$Companion;", "", "()V", "produceWeek", "Lde/florianmarsch/spring/socialmediacalendar/service/calendar/CalendarWeek;", "social-media-calendar"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final de.florianmarsch.spring.socialmediacalendar.service.calendar.CalendarWeek produceWeek() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}