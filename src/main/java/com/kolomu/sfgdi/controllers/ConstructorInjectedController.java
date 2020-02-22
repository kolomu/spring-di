package com.kolomu.sfgdi.controllers;

import com.kolomu.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    // AUTOWIRED Annotation is optional here!
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
