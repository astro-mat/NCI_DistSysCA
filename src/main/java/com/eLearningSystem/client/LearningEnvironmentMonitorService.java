package com.eLearningSystem.client;

import com.eLearningSystem.grpc.LearningEnvironmentMonitorGrpc.LearningEnvironmentMonitorImplBase;
import com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsRequest;
import com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsResponse;
import com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdRequest;
import com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdResponse;

import io.grpc.stub.StreamObserver;

public class LearningEnvironmentMonitorService extends LearningEnvironmentMonitorImplBase {

	@Override
	public void getRoomConditions(RoomConditionsRequest request,StreamObserver<RoomConditionsResponse> responseObserver) {

		System.out.println("Inside getRoomConditions");
		
		string location = request.getLocation();
		
		
		
//		float temperature = 1;
//		float humidity = 2;
//		float co2Level = 3;
//		float airQuality = 4;
		
	}

	@Override
	public void setThresholds(ThresholdRequest request, StreamObserver<ThresholdResponse> responseObserver) {

		System.out.println("Inside setThresholds");
		
		string location = request.getLocation();
		float temperatureMin = request.getTemperatureMin();
		float humidityMax = request.getHumidityMax();
		float co2Threshold = request.getCo2Threshold();
		
		
		
		
//		string message = 1;
		
		
	}
	
	

}







//service LearningEnvironmentMonitor {	
//	rpc GetRoomConditions(RoomConditionsRequest) returns (RoomConditionsResponse);
//	rpc SetThresholds(ThresholdRequest) returns (ThresholdResponse);
//}
//
//message RoomConditionsRequest{
//	string location = 1;
//
//}
//
//message RoomConditionsResponse{
//	float temperature = 1;
//	float humidity = 2;
//	float co2Level = 3;
//	float airQuality = 4;
//
//}
//
//message ThresholdRequest{
//	string location = 1;
//	float temperatureMin = 2;
//	float humidityMax = 3;
//	float co2Threshold = 4;
//}
//
//message ThresholdResponse{
//	string message = 1;
//}