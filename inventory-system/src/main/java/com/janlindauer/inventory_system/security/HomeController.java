package com.janlindauer.inventory_system.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/index.html"})
    public String home() {
        return "index";
    }

    @GetMapping({"/login", "/login.html"})
    public String login() {
        return "login";
    }

    @GetMapping("/logout")
    public String logout() {
        return "login";
    }
}

