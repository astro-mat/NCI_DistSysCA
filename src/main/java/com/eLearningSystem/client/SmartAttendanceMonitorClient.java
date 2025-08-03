package com.eLearningSystem.client;

import com.eLearningSystem.grpc.SmartAttendanceMonitorGrpc;
import com.eLearningSystem.grpc.SmartAttendanceMonitorGrpc.SmartAttendanceMonitorBlockingStub;
import com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceRequest;
import com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceResponse;
import com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryRequest;
import com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SmartAttendanceMonitorClient {
	// main method
	public static void main(String[] args) {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
		
		// stubs - generate from proto file
		SmartAttendanceMonitorBlockingStub smartAttendanceMonitorStub =  SmartAttendanceMonitorGrpc.newBlockingStub(channel);
		
		// construct AttendanceRequest
		AttendanceRequest attendancerequest = AttendanceRequest.newBuilder().setStudentId("S0435").setTimeStamp("2025-06-30 09:00:00").setLocation("Room 504").build();
		
		// call the recordAttendance RPC
		AttendanceResponse response = smartAttendanceMonitorStub.recordAttendance(attendancerequest);
		
		// print the response
		System.out.println("-----AttendanceResponse-----");
		System.out.println("Attendance Status: " + response.getStatus()); // <-- FIXED: added label

		// construct SummaryRequest
		SummaryRequest summaryRequest = SummaryRequest.newBuilder().setStudentId("S0435").build();

		// call the GetAttendanceSummary RPC
		SummaryResponse summaryResponse = smartAttendanceMonitorStub.getAttendanceSummary(summaryRequest); // <-- ADDED

		// print summary
		System.out.println("-----SummaryResponse-----");
		System.out.println("Sessions Total: " + summaryResponse.getSessionsTotal()); 
		System.out.println("Sessions Attended: " + summaryResponse.getSessionsAttended()); 
		System.out.println("Attendance Rate: " + summaryResponse.getAttendanceRate()); 

		channel.shutdown();
		
		

	}
}
