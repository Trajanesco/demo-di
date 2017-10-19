package com.matmic.demodi.controllers;

import com.matmic.demodi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GetterInjectedController {

    @Autowired
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
    //change

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
