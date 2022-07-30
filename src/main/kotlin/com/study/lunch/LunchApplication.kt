package com.study.lunch

import com.study.lunch.config.BlogProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class LunchApplication

fun main(args: Array<String>) {
	runApplication<LunchApplication>(*args)
}
