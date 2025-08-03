package com.eLearningSystem.client;

import com.eLearningSystem.grpc.LearningEnvironmentMonitorGrpc;
import com.eLearningSystem.grpc.LearningEnvironmentMonitorGrpc.LearningEnvironmentMonitorBlockingStub;
import com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsRequest;
import com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsResponse;
import com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdRequest;
import com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class LearningEnvironmentMonitorClient {
	// main method
    public static void main(String[] args) {

        // Create a gRPC channel to connect to the server
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();

        // stubs - generate from proto file
        LearningEnvironmentMonitorBlockingStub stub = LearningEnvironmentMonitorGrpc.newBlockingStub(channel);

        // Construct RoomConditionsRequest
        RoomConditionsRequest roomConditionsRequest = RoomConditionsRequest.newBuilder().setLocation("Room 504").build();

        // call the recordAttendance RPC
        RoomConditionsResponse roomConditionsResponse = stub.getRoomConditions(roomConditionsRequest);

        // Print the response
        System.out.println("-----RoomConditionsResponse-----");
        System.out.println("Room Conditions for Room 504:");
        System.out.println("Temperature: " + roomConditionsResponse.getTemperature());
        System.out.println("Humidity: " + roomConditionsResponse.getHumidity());
        System.out.println("CO2 Level: " + roomConditionsResponse.getCo2Level());
        System.out.println("Air Quality: " + roomConditionsResponse.getAirQuality());

        // Construct ThresholdRequest
        ThresholdRequest thresholdRequest = ThresholdRequest.newBuilder().setLocation("Room 504").setTemperatureMin(18.0f).setHumidityMax(65.0f).setCo2Threshold(1000.0f).build();

     // Call ThresholdRequest RPC
        ThresholdResponse thresholdResponse = stub.setThresholds(thresholdRequest);

        // Print threshold response
        System.out.println("-----thresholdResponse-----");
        System.out.println("Threshold Set Response: " + thresholdResponse.getMessage());

        // Shutdown the channel
        channel.shutdown();
    }
}
