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
		
		// test validation to see if required fields are empty
		if(!studentId.isEmpty() && !timeStamp.isEmpty() && !location.isEmpty()) {
			// return success message

			response.setStatus("Attendance recorded successfully");
		}
		else {
			// return failure message
			response.setStatus("Attendance not recorded - Missing Fields");
		}
		
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
	}

	@Override
	public void getAttendanceSummary(SummaryRequest request, StreamObserver<SummaryResponse> responseObserver) {

	}

	
	
}
