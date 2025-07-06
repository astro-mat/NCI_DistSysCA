package com.eLearningSystem.server;

import java.io.IOException;

import com.eLearningSystem.client.SmartAttendanceMonitorService;
import com.eLearningSystem.client.StudentLearningAssistantService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GRPCServer {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		Server server = ServerBuilder.forPort(9090)
				.addService(new SmartAttendanceMonitorService())
				.addService(new StudentLearningAssistantService())
				.addService(LearningEnvironmentMonitorService)
				.build();
		
		server.start();
		
		System.out.println("Server started at " + server.getPort());
		
		server.awaitTermination();
		
		
	}

}
