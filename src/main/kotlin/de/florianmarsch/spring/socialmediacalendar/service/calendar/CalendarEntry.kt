package de.florianmarsch.spring.socialmediacalendar.service.calendar

import de.florianmarsch.spring.socialmediacalendar.persistence.Channel
import de.florianmarsch.spring.socialmediacalendar.persistence.Posting
import de.florianmarsch.spring.socialmediacalendar.persistence.Upload
import java.time.DayOfWeek
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatterBuilder

class CalendarEntry {
    var channel : Channel? = null
    var upload : Upload? = null
    var posting : Posting? = null
}

class CalendarHour {
    var time : String = "00:00"
    var mo:List<CalendarEntry> = emptyList()
    var tue:List<CalendarEntry> = emptyList()
    var we:List<CalendarEntry> = emptyList()
    var thu:List<CalendarEntry> = emptyList()
    var fr:List<CalendarEntry> = emptyList()
    var sa:List<CalendarEntry> = emptyList()
    var so:List<CalendarEntry> = emptyList()

    fun add(entry : CalendarEntry){
        var plannedDay = entry.posting?.plannedDate?.dayOfWeek
        println(plannedDay)
        when(plannedDay){
            DayOfWeek.MONDAY -> {mo = mo.toMutableList().apply {
                add(entry)
            }}
            DayOfWeek.TUESDAY -> {tue = tue.toMutableList().apply {
                add(entry)
            }}
            DayOfWeek.WEDNESDAY -> {we = we.toMutableList().apply {
                add(entry)
            }}
            DayOfWeek.THURSDAY -> {thu = thu.toMutableList().apply {
                add(entry)
            }}
            DayOfWeek.FRIDAY -> {fr = fr.toMutableList().apply {
                add(entry)
            }}
            DayOfWeek.SATURDAY -> {sa = sa.toMutableList().apply {
                add(entry)
            }}
            DayOfWeek.SUNDAY -> {so = so.toMutableList().apply {
                add(entry)
            }}
        }

    }
}

class CalendarWeek {
    var rows :List<CalendarHour> = emptyList()

    fun add(entry :CalendarEntry){

        entry.posting?.plannedDate?.let {
            var time = it.toLocalTime()
            time = time.minusMinutes(time.minute.toLong())

             val format = time.format(DateTimeFormatter.ofPattern("HH:mm"))
            println(format)
            rows.filter {
                it.time == format
            }.forEach {
                it.add(entry)
            }
        }

    }

    companion object{
        fun produceWeek() : CalendarWeek{
            return CalendarWeek().apply {
                rows = listOf(
                    "00:00", "01:00", "02:00","03:00","04:00","05:00",
                    "06:00","07:00","08:00","09:00","10:00",
                    "11:00","12:00","13:00","14:00","15:00",
                    "16:00","17:00","18:00","19:00","20:00",
                    "21:00","22:00","23:00").map {
                    CalendarHour().apply {
                        time = it
                    }
                }
            }
        }
    }
}