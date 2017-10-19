package com.matmic.demodi.services;

import org.springframework.stereotype.Service;

@Service
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hi from Primary Bean?";
    }
}
