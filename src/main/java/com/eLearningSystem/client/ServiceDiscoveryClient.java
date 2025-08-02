package com.eLearningSystem.client;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

import java.io.IOException;
import java.net.InetAddress;

public class ServiceDiscoveryClient {

    public static void main(String[] args) throws IOException, InterruptedException {

        // Create a JmDNS instance and bind it to the local host's IP address.
        // This allows it to discover services being advertised on the local network.
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

        // This is the service type we want to discover.
        // It must match the type used when the services were registered with JmDNS.
        String serviceType = "_grpc._tcp.local.";  // Could also be "_smartattendance._tcp.local." etc.

        System.out.println("Listening for services of type: " + serviceType);

        // Add a service listener that will handle events when services are added, removed, or resolved.
        jmdns.addServiceListener(serviceType, new ServiceListener() {

            // Called when a service is found but not yet resolved (full details not available yet)
            @Override
            public void serviceAdded(ServiceEvent event) {
                System.out.println("Service added: " + event.getName());
            }

            // Called when a service is removed from the network
            @Override
            public void serviceRemoved(ServiceEvent event) {
                System.out.println("Service removed: " + event.getName());
            }

            // Called when a service has been fully resolved, meaning we can now access all its details
            @Override
            public void serviceResolved(ServiceEvent event) {
                ServiceInfo info = event.getInfo();

                // Output the resolved details of the discovered service
                System.out.println("Service resolved:");
                System.out.println("  Name: " + info.getName());
                System.out.println("  Type: " + info.getType());
                System.out.println("  Address: " + info.getHostAddresses()[0]);
                System.out.println("  Port: " + info.getPort());
                System.out.println("  Desc: " + info.getNiceTextString());
            }
        });

        // Allow the discovery process to run for 10 seconds
        // This gives enough time for services to appear and be resolved
        Thread.sleep(10000);

        // Close JmDNS once discovery is complete to release resources
        jmdns.close();
    }
}
