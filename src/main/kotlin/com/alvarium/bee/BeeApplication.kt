package com.alvarium.bee

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BeeApplication

fun main(args: Array<String>) {
	runApplication<BeeApplication>(*args)
}

