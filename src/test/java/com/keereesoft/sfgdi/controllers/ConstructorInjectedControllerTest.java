package com.keereesoft.sfgdi.controllers;

import com.keereesoft.sfgdi.services.SetterInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new ConstructorInjectedController(new SetterInjectedGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.sayGreeting());
    }
}