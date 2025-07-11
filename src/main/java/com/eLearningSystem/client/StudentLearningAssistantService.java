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
		
		RecommendationResponse.Builder response = RecommendationResponse.newBuilder();
		
		// validation 

        //  validation to check if studentId is included
        if (studentId == null || studentId.isEmpty()) {
            response.setRecommendedSubject("Invalid input: studentId is required.");
        // validation to check if subject is included
        } else if (subject == null || subject.isEmpty()) {
            response.setRecommendedSubject("Invalid input: subject is required.");
        // validation to check if performance score is out of range
        } else if (performanceScore < 0 || performanceScore > 100) {
            response.setRecommendedSubject("Invalid input: performanceScore must be between 0 and 100.");
        } else {
            // Basic recommendation logic
            String recommendedSubject;

            if (performanceScore < 50) {
                recommendedSubject = "Review basics of " + subject;
            } else if (performanceScore < 75) {
                recommendedSubject = "Practice intermediate level " + subject;
            } else {
                recommendedSubject = "Explore advanced topics in " + subject;
            }

            response.setRecommendedSubject(recommendedSubject);
        }

        // send the response
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
		
	}

	@Override
	public void submitAssessment(AssessmentRequest request, StreamObserver<AssessmentResponse> responseObserver) {
		
		System.out.println("Inside submitAssessment");
		
		String studentId = request.getStudentId();
		
		AssessmentResponse.Builder response = AssessmentResponse.newBuilder();
		
		// test validation 
		
		// validation to check if studentId is included
        if (studentId == null || studentId.isEmpty()) {
            response.setStudentId("");
            response.setAssessmentId("N/A");
            response.setFeedback("Invalid input: studentId is required.");
        } else {
            // Basic assessment feedback logic
            response.setStudentId(studentId);
            response.setAssessmentId("ASSMNT-" + (int)(Math.random() * 1000));
            response.setFeedback("Assessment submitted successfully.");
        }

        // send the response
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

		
	}

	
	
}
