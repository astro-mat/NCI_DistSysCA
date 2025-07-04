package com.eLearningSystem.client;

import com.eLearningSystem.grpc.StudentLearningAssistantGrpc.StudentLearningAssistantImplBase;
import com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentRequest;
import com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentResponse;
import com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationRequest;
import com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationResponse;

import io.grpc.stub.StreamObserver;

public class StudentLearningAssistantService extends StudentLearningAssistantImplBase{

	@Override
	public void getLearningRecommendation(RecommendationRequest request, StreamObserver<RecommendationResponse> responseObserver) {
		
		System.out.println("Inside getLearningRecommendation");
		
		String studentId = request.getStudentId();
		String subject = request.getSubject();
		Integer performanceScore = request.getPerformanceScore();
		
		
		
		
	}

	@Override
	public void SubmitAssessment(AssessmentRequest request, StreamObserver<AssessmentResponse> responseObserver) {
		
		System.out.println("Inside submitAssessment");
		
		String studentId = request.getStudentId();
		
		

		
	}

	
	
}
