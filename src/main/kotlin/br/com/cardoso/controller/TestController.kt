package br.com.cardoso.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/hello")
    fun hello() = "Hello World"
}