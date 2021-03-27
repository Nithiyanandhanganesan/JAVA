package com.example.springkotlindemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringkotlindemoApplication

fun main(args: Array<String>) {
	println("test")
	runApplication<SpringkotlindemoApplication>(*args)
}
