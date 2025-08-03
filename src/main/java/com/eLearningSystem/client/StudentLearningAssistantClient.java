package com.eLearningSystem.client;

import com.eLearningSystem.grpc.StudentLearningAssistantGrpc;
import com.eLearningSystem.grpc.StudentLearningAssistantGrpc.StudentLearningAssistantBlockingStub;
import com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationRequest;
import com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationResponse;
import com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentRequest;
import com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class StudentLearningAssistantClient {
	// main method
	public static void main(String[] args) {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
		
		// stubs - generate from proto file
		StudentLearningAssistantBlockingStub studentLearningAssistantStub = StudentLearningAssistantGrpc.newBlockingStub(channel);
		
		// construct AssessmentRequest
		AssessmentRequest assessmentRequest = AssessmentRequest.newBuilder()
			.setStudentId("S0435")
			.build();
		
		// call the submitAssessment RPC
		AssessmentResponse assessmentResponse = studentLearningAssistantStub.submitAssessment(assessmentRequest);

		// print the response
		System.out.println("-----AssessmentResponse-----");
		System.out.println("Student ID: " + assessmentResponse.getStudentId());
		System.out.println("Assessment ID: " + assessmentResponse.getAssessmentId());
		System.out.println("Feedback: " + assessmentResponse.getFeedback());
		
		// construct RecommendationRequest
		RecommendationRequest recommendationRequest = RecommendationRequest.newBuilder()
			.setStudentId("S0435")
			.setSubject("Mathematics")
			.setPerformanceScore(65)
			.build();
		
		// call the getLearningRecommendation RPC
		RecommendationResponse recommendationResponse = studentLearningAssistantStub.getLearningRecommendation(recommendationRequest);
		
		// print the response
		System.out.println("-----RecommendationResponse-----");
		System.out.println("Recommended Subject: " + recommendationResponse.getRecommendedSubject());



		channel.shutdown();
	}
}
