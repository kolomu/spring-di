package com.kolomu.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class I18nSpanishGreetingService implements GreetingService {
    private GreetingRepository greetingRepository;

    public I18nSpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hola Amigos - ES";
    }
}
