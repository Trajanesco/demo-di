package com.matmic.demodi.controllers;


import com.matmic.demodi.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ConstructorInjectedControllerTest {


    private ConstrucorInjectedController construcorInjectedController;

    @Before
    public void setUp()throws Exception{
        this.construcorInjectedController = new ConstrucorInjectedController (new GreetingServiceImpl());
    }

    @Test
    public void testGreeting()throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURU, construcorInjectedController.sayHello());
    }
}
