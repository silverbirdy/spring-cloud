package com.example.msafirstservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first-service")
public class FirstServiceController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the first Service";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("first-request") String header) {
        return header;
    }

    @GetMapping("/check")
    public String check() {
        System.out.println("check");
        return "Hi, this is a message from First Service";
    }
}
