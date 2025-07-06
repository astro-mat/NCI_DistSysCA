package com.eLearningSystem.client;

import com.eLearningSystem.grpc.LearningEnvironmentMonitorGrpc;
import com.eLearningSystem.grpc.LearningEnvironmentMonitorGrpc.LearningEnvironmentMonitorBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class LearningEnvironmentMonitorClient {
	// main method
	public static void main(String[] args) {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
		
		// stubs - generate from proto file
		LearningEnvironmentMonitorBlockingStub LearningEnvironmentMonitorStub = LearningEnvironmentMonitorGrpc.newBlockingStub(channel)
				

		
	}
}
