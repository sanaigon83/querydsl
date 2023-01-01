package com.example.querydsl.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class HelloController {

    @GetMapping
    fun hello(): String = "hello"
}