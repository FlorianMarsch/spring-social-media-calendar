package de.florianmarsch.spring.socialmediacalendar

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SocialMediaCalendarApplication{

	var logger: Logger = LoggerFactory.getLogger(SocialMediaCalendarApplication::class.java)

	init {





		println("  ____             _       _   __  __          _ _          ____      _                _            \n" +
				" / ___|  ___   ___(_) __ _| | |  \\/  | ___  __| (_) __ _   / ___|__ _| | ___ _ __   __| | __ _ _ __ \n" +
				" \\___ \\ / _ \\ / __| |/ _` | | | |\\/| |/ _ \\/ _` | |/ _` | | |   / _` | |/ _ \\ '_ \\ / _` |/ _` | '__|\n" +
				"  ___) | (_) | (__| | (_| | | | |  | |  __/ (_| | | (_| | | |__| (_| | |  __/ | | | (_| | (_| | |   \n" +
				" |____/ \\___/ \\___|_|\\__,_|_| |_|  |_|\\___|\\__,_|_|\\__,_|  \\____\\__,_|_|\\___|_| |_|\\__,_|\\__,_|_|   \n" +
				"                                                                                                    ")

	}
}

fun main(args: Array<String>) {
	runApplication<SocialMediaCalendarApplication>(*args)
}
