package com.eLearningSystem.server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import com.eLearningSystem.client.LearningEnvironmentMonitorService;
import com.eLearningSystem.client.SmartAttendanceMonitorService;
import com.eLearningSystem.client.StudentLearningAssistantService;

import java.net.InetAddress;

// import com.eLearningSystem.server.SmartAttendanceMonitorService;
// import com.eLearningSystem.server.StudentLearningAssistantService;
// import com.eLearningSystem.server.LearningEnvironmentMonitorService;

public class GRPCServer {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		Server server = ServerBuilder.forPort(9090)
				.addService(new SmartAttendanceMonitorService())
				.addService(new StudentLearningAssistantService())
				.addService(new LearningEnvironmentMonitorService())
				.build();
		
		// Starts the server
		server.start();
		
		
		JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
		
		// Register each service with a unique name and port
		ServiceInfo attendanceServiceInfo = ServiceInfo.create("_grpc._tcp.local.", "SmartAttendanceMonitor", 9090, "gRPC Smart Attendance Service");
		jmdns.registerService(attendanceServiceInfo);

		ServiceInfo learningEnvServiceInfo = ServiceInfo.create("_grpc._tcp.local.", "LearningEnvironmentMonitor", 9090, "gRPC Environment Monitor Service");
		jmdns.registerService(learningEnvServiceInfo);

		ServiceInfo assistantServiceInfo = ServiceInfo.create("_grpc._tcp.local.", "StudentLearningAssistant", 9090, "gRPC Learning Assistant Service");
		jmdns.registerService(assistantServiceInfo);

		System.out.println("Services registered with jmDNS");
		
		System.out.println("Server started at " + server.getPort());
		
		server.awaitTermination();
		
		
	}

}
