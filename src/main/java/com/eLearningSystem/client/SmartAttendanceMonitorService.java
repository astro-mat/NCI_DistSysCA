package com.eLearningSystem.client;

import com.eLearningSystem.grpc.SmartAttendanceMonitorGrpc.SmartAttendanceMonitorImplBase;
import com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceRequest;
import com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceResponse;
import com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryRequest;
import com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryResponse;

import io.grpc.stub.StreamObserver;

public class SmartAttendanceMonitorService extends SmartAttendanceMonitorImplBase{

	@Override
	public void recordAttendance(AttendanceRequest request, StreamObserver<AttendanceResponse> responseObserver) {
		System.out.println("Inside recordAttendance");
		
		String studentId = request.getStudentId();
		String timeStamp = request.getTimeStamp();
		String location = request.getLocation();
		
		AttendanceResponse.Builder response = AttendanceResponse.newBuilder();
		
		// validation to see if required fields are empty
		if(!studentId.isEmpty() && !timeStamp.isEmpty() && !location.isEmpty()) {
			// return success message

			response.setStatus("Attendance recorded successfully");
		}
		else {
			// return failure message
			response.setStatus("Attendance not recorded - Missing Fields");
		}
		
		// send the response
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
	}

	@Override
	public void getAttendanceSummary(SummaryRequest request, StreamObserver<SummaryResponse> responseObserver) {
		System.out.println("Inside getAttendanceSummary");
		
		String studentId = request.getStudentId();
		
		SummaryResponse.Builder response = SummaryResponse.newBuilder();
		
		// validation to see if studentId is provided
		if (!studentId.isEmpty()) {
	        // Test values
	        int totalSessions = 10;
	        int attendedSessions = 7;
	        float attendanceRate = ((float) attendedSessions / totalSessions) * 100;

	        response.setSessionsTotal(totalSessions);
	        response.setSessionsAttended(attendedSessions);
	        response.setAttendanceRate(attendanceRate);
	    } else {
	        // If studentId is missing, set default values
	        response.setSessionsTotal(0);
	        response.setSessionsAttended(0);
	        response.setAttendanceRate(0);
	        System.out.println("Attendance summary not provided - Missing studentId");
	    }

		// send response to client
	    responseObserver.onNext(response.build());
	    
	    // complete
	    responseObserver.onCompleted();
	}

	
	
}
