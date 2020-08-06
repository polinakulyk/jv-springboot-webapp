package com.example.webapp

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ThisWillActuallyRun {
    @RequestMapping("/")
    String home() {
        return "Hello, World!";
    }
}
