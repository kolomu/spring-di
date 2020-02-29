package com.kolomu.sfgdi.services;

public class GreetingServiceFactory {
    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch(lang) {
            case "en": return new PrimaryGreetingService(greetingRepository);
            case "es": return new I18nSpanishGreetingService(greetingRepository);
            default: return new PrimaryGreetingService(greetingRepository);
        }
    }
}
