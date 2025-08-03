package com.eLearningSystem.server;

import com.eLearningSystem.grpc.LearningEnvironmentMonitorGrpc.LearningEnvironmentMonitorImplBase;
import com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsRequest;
import com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsResponse;
import com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdRequest;
import com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdResponse;

import io.grpc.stub.StreamObserver;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;


public class LearningEnvironmentMonitorService extends LearningEnvironmentMonitorImplBase {

	public LearningEnvironmentMonitorService() {
		System.out.println("LearningEnvironmentMonitorService constructor called");
		
	    try {
	        // Create a jmDNS instance
	        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

	        // Register the service with jmDNS
	        ServiceInfo serviceInfo = ServiceInfo.create(
	            "_environmentmonitor._tcp.local.",   // Service type
	            "LearningEnvironmentMonitorService", // Service name
	            9090,                                 // Port
	            "path=environment.html"              // Optional description
	        );

	        jmdns.registerService(serviceInfo);
	        System.out.println("LearningEnvironmentMonitorService registered with jmDNS");

	    } catch (IOException e) {
	        System.out.println("Failed to register LearningEnvironmentMonitorService with jmDNS");
	        e.printStackTrace();
	    }
	}

	
	@Override
	public void getRoomConditions(RoomConditionsRequest request,StreamObserver<RoomConditionsResponse> responseObserver) {

		System.out.println("Inside getRoomConditions");
		
		String location = request.getLocation();
		
		// Create Response builder
		RoomConditionsResponse.Builder response = RoomConditionsResponse.newBuilder();
		
		// Validation to check that location is provided
        if (location == null || location.isEmpty()) {
            // Return default/error values
            response.setTemperature(0);
            response.setHumidity(0);
            response.setCo2Level(0);
            response.setAirQuality(0);

            System.out.println("Invalid input: location is required.");
        } else {

            // dummy values:
            response.setTemperature(22.5f);
            response.setHumidity(45.0f);
            response.setCo2Level(400.0f);
            response.setAirQuality(0.8f);
        }
		
		
		
        // send the response
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
	}

	@Override
	public void setThresholds(ThresholdRequest request, StreamObserver<ThresholdResponse> responseObserver) {

		System.out.println("Inside setThresholds");
		
		String location = request.getLocation();
		float temperatureMin = request.getTemperatureMin();
		float humidityMax = request.getHumidityMax();
		float co2Threshold = request.getCo2Threshold();
		
		// Response Builder
		ThresholdResponse.Builder response = ThresholdResponse.newBuilder();
		
		// Validation
        if (location == null || location.isEmpty()) {
            response.setMessage("Invalid input: location is required.");
        } else if (temperatureMin < -50 || temperatureMin > 50) {
            response.setMessage("Invalid input: temperatureMin must be between -50 and 50 degrees.");
        } else if (humidityMax < 0 || humidityMax > 100) {
            response.setMessage("Invalid input: humidityMax must be between 0 and 100 percent.");
        } else if (co2Threshold < 0) {
            response.setMessage("Invalid input: co2Threshold must be non-negative.");
        } else {
            // Assume thresholds are saved successfully
            response.setMessage("Thresholds set successfully for location: " + location);
        }
		
		
        // send the response
        responseObserver.onNext(response.build());
        // close the call
        responseObserver.onCompleted();
	}
	
	

}