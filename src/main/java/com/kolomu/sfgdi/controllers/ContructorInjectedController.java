package com.kolomu.sfgdi.controllers;

import com.kolomu.sfgdi.services.GreetingService;

public class ContructorInjectedController {
    private final GreetingService greetingService;

    public ContructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
