package com.keereesoft.sfgdi.controllers;

import com.keereesoft.sfgdi.services.GreetingService;

public class SettingBaseController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
