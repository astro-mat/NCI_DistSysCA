package com.eLearningSystem.client;

import com.eLearningSystem.grpc.SmartAttendanceMonitorGrpc;
import com.eLearningSystem.grpc.SmartAttendanceMonitorGrpc.SmartAttendanceMonitorBlockingStub;
import com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceRequest;
import com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceResponse;

import io.grpc.ManagedChannelBuilder;
import io.grpc.ManagedChannel;

public class GrpcClient {
	// main method
	public static void main(String[] args) {
		
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
		
		// stubs - generate from proto file
		SmartAttendanceMonitorBlockingStub SmartAttendanceMonitorStub =  SmartAttendanceMonitorGrpc.newBlockingStub(channel);
		
		
		// construct AttendanceRequest
		AttendanceRequest attendancerequest = AttendanceRequest.newBuilder().setStudentId("S0435").setTimeStamp("2025-06-30.09:00:00").setLocation("Room 504").build();
		
		// call the api's
		AttendanceResponse response = SmartAttendanceMonitorStub.recordAttendance(attendancerequest);
		
		// print the response
		System.out.println(response.getStatus());
	}

}
