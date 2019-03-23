package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class BackendController {

    @GetMapping("/")
    public String admin() { return "Hello World" ; }

    @GetMapping("/check")
    public String user() {
        return UUID.randomUUID().toString();
    }

    @GetMapping("/guest")
    public String guest() {
        return "Hello Guest!";
    }
}

