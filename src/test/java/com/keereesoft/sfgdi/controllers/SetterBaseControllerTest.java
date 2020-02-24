package com.keereesoft.sfgdi.controllers;

import com.keereesoft.sfgdi.services.SetterInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterBaseControllerTest {

    SetterBaseController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterBaseController();
        controller.setGreetingService(new SetterInjectedGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}