package com.matmic.demodi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en", "default"})
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hi from Primary Bean?";
    }
}
