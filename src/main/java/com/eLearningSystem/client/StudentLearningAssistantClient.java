package com.eLearningSystem.client;


import com.eLearningSystem.grpc.StudentLearningAssistantGrpc;
import com.eLearningSystem.grpc.StudentLearningAssistantGrpc.StudentLearningAssistantBlockingStub;
import com.eLearningSystem.grpc.StudentLearningAssistantGrpc.StudentLearningAssistantStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class StudentLearningAssistantClient {
	// main method
	public static void main(String[] args) {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
		
		// stubs - generate from proto file
		StudentLearningAssistantBlockingStub studentLearningAssistantStub = StudentLearningAssistantGrpc.newBlockingStub(channel);

		
	}

}
