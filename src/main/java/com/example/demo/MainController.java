package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    String HomeController() {
        return "홈 화면 !!";
    }

    @GetMapping("/user")
    String UserController() {
        return "유저 화면";
    }
}
