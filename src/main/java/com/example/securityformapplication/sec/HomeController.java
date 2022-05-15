package com.example.securityformapplication.sec;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homepage() {
        return "home";
    }

    @GetMapping("/secure")
    public String secure() {
        return "secure";
    }
}
