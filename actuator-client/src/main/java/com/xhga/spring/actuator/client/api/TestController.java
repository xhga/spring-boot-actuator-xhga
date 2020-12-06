package com.xhga.spring.actuator.client.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "hello world !";
    }
}
