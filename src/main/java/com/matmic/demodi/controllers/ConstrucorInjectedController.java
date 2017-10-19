package com.matmic.demodi.controllers;

import com.matmic.demodi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstrucorInjectedController {


    private GreetingService greetingService;


    public ConstrucorInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }


}
