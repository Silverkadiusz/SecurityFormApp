package com.example.securityformapplication.web;

import com.example.securityformapplication.message.WelcomeMessageService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class SecuredController {

    private final WelcomeMessageService welcomeMessageService;

    public SecuredController(WelcomeMessageService welcomeMessageService) {
        this.welcomeMessageService = welcomeMessageService;
    }

    @GetMapping("/secured")
    String home(@RequestParam(defaultValue = "en")String lang, Model model) {
        String welcomeMessage = welcomeMessageService.getWelcomeMessage(lang);
        model.addAttribute("welcomeMessage", welcomeMessage);
        return "secured";
    }
}
