package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@RestController
public class MainController {
    @GetMapping("/")
    String HomeController() {
        return "홈 화면 !!";
    }

    @GetMapping("/user")
    String UserController() {
        Date date = new Date();
        long time = date.getTime();
        return "유저 화면 "+time;
    }

}
