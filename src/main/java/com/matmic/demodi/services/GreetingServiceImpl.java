package com.matmic.demodi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO_GURU = "Hello Gurus!!";


    @Override
    public String sayGreeting() {
        return HELLO_GURU;
    }
}
