package com.skyscent.churchmate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChurchmateApplication

fun main(args: Array<String>) {
	runApplication<ChurchmateApplication>(*args)
}
