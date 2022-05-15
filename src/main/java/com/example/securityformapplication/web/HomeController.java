package com.example.securityformapplication.web;

import com.example.securityformapplication.message.WelcomeMessageService;
import org.springframework.security.core.annotation.CurrentSecurityContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class HomeController {

    @GetMapping("/")
    String home() {
        return "index";
    }
}