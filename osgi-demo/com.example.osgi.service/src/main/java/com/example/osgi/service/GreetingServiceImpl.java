package com.example.osgi.service;


import com.example.osgi.api.GreetingService;

import javax.swing.*;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public void sayHello(String name)
    {
        JOptionPane.showMessageDialog(null, "Hello " + name);
    }
}
