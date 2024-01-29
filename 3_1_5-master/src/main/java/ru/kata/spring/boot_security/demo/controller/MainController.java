package ru.kata.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/api/user")
    public String showUserInfo() {
        return "/user";
    }

    @GetMapping("/api/admin")
    public String displayAllUsers() {
        return "/admin";
    }
}