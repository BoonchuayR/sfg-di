package com.keereesoft.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class I18nEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
