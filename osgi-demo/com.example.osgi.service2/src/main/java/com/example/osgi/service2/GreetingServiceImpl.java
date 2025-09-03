package com.example.osgi.service2;

import com.example.osgi.api.GreetingService;

public class GreetingServiceImpl implements GreetingService
{

    @Override
    public void sayHello(String name) {
        System.out.println("Hello" + name);
    }
}
