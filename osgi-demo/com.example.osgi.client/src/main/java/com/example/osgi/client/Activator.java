package com.example.osgi.client;

import com.example.osgi.api.GreetingService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import javax.swing.*;

public class Activator implements BundleActivator
{
    @Override
    public void start(BundleContext bundleContext) throws Exception
    {
        System.out.println("hey!");
        ServiceReference<?> ref = bundleContext.getServiceReference(GreetingService.class
                .getName());

        if (ref != null)
        {
            GreetingService service = (GreetingService) bundleContext.getService(ref);
            String name = JOptionPane.showInputDialog(null, "enter you name:");
            service.sayHello(name);
        }

    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("stopping client");
    }
}
