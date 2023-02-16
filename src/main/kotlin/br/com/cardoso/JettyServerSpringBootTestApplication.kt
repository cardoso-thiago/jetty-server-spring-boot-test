package br.com.cardoso

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JettyServerSpringBootTestApplication

fun main(args: Array<String>) {
	runApplication<JettyServerSpringBootTestApplication>(*args)
}
