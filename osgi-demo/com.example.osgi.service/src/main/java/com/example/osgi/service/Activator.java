package com.example.osgi.service;

import com.example.osgi.api.GreetingService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        GreetingService service = new GreetingServiceImpl();
        bundleContext.registerService(GreetingService.class.getName(), service, null);
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("Greeting service one is disabled.");
    }
}
