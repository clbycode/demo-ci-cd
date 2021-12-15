package com.dbyapp.demo.controller

import lombok.extern.slf4j.Slf4j
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/demo")
@Slf4j
class DemoController {

    @GetMapping
    fun index():ResponseEntity<String>{
        return ResponseEntity.ok("Hello Me!!!")
    }

    @GetMapping("/index/{text}")
    fun index(@PathVariable text: String):ResponseEntity<String>{
        return ResponseEntity.ok("Hello Demo : $text")
    }
}