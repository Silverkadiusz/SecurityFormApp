package com.example.securityformapplication.message;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class WelcomeMessageService {

    private static final String LANG_EN = "en";
    private static final String LANG_PL = "pl";
    private static final String LANG_ES = "es";

    public String getWelcomeMessage(String lang) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        String welcomeMessage = switch(lang) {
            case LANG_ES -> "HOLA";
            case LANG_PL -> "Cześć";
            default -> "Hello";
        };
        return welcomeMessage + " "+ username;
    }




}
