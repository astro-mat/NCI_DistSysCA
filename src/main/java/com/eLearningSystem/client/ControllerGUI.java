package com.eLearningSystem.client;

// Attendance messages
import com.eLearningSystem.grpc.AttendanceRequest;
import com.eLearningSystem.grpc.AttendanceResponse;
import com.eLearningSystem.grpc.SummaryRequest;
import com.eLearningSystem.grpc.SummaryResponse;

// Environment messages
import com.eLearningSystem.grpc.RoomConditionsRequest;
import com.eLearningSystem.grpc.RoomConditionsResponse;

// Student assistant messages
import com.eLearningSystem.grpc.AssessmentRequest;
import com.eLearningSystem.grpc.AssessmentResponse;
import com.eLearningSystem.grpc.RecommendationRequest;
import com.eLearningSystem.grpc.RecommendationResponse;

import com.eLearningSystem.grpc.*;
import com.eLearningSystem.grpc.SmartAttendanceMonitorGrpc.SmartAttendanceMonitorBlockingStub;
import com.eLearningSystem.grpc.LearningEnvironmentMonitorGrpc.LearningEnvironmentMonitorBlockingStub;
import com.eLearningSystem.grpc.StudentLearningAssistantGrpc.StudentLearningAssistantBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerGUI {

    private SmartAttendanceMonitorBlockingStub attendanceStub;
    private LearningEnvironmentMonitorBlockingStub environmentStub;
    private StudentLearningAssistantBlockingStub assistantStub;

    private JTextField studentIdField, subjectField, scoreField, locationField;
    private JTextArea outputArea;

    public ControllerGUI() {
        // Create gRPC channel and stubs
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
        attendanceStub = SmartAttendanceMonitorGrpc.newBlockingStub(channel);
        environmentStub = LearningEnvironmentMonitorGrpc.newBlockingStub(channel);
        assistantStub = StudentLearningAssistantGrpc.newBlockingStub(channel);

        // Build GUI
        JFrame frame = new JFrame("eLearning System Controller");
        frame.setSize(700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(6, 2));
        studentIdField = new JTextField();
        subjectField = new JTextField();
        scoreField = new JTextField();
        locationField = new JTextField();

        inputPanel.add(new JLabel("Student ID:"));
        inputPanel.add(studentIdField);
        inputPanel.add(new JLabel("Subject:"));
        inputPanel.add(subjectField);
        inputPanel.add(new JLabel("Performance Score:"));
        inputPanel.add(scoreField);
        inputPanel.add(new JLabel("Location:"));
        inputPanel.add(locationField);

        JButton btnAttendance = new JButton("Record Attendance");
        JButton btnSummary = new JButton("Get Attendance Summary");
        JButton btnEnvironment = new JButton("Get Room Conditions");
        JButton btnRecommend = new JButton("Get Learning Recommendation");
        JButton btnAssessment = new JButton("Submit Assessment");

        inputPanel.add(btnAttendance);
        inputPanel.add(btnSummary);
        inputPanel.add(btnEnvironment);
        inputPanel.add(btnRecommend);
        inputPanel.add(btnAssessment);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Button actions
        btnAttendance.addActionListener(e -> {
            AttendanceRequest req = AttendanceRequest.newBuilder()
                .setStudentId(studentIdField.getText())
                .setTimeStamp("2025-08-03 10:00:00")
                .setLocation(locationField.getText())
                .build();
            AttendanceResponse res = attendanceStub.recordAttendance(req);
            outputArea.append("Attendance Status: " + res.getStatus() + "\n");
        });

        btnSummary.addActionListener(e -> {
            SummaryRequest req = SummaryRequest.newBuilder()
                .setStudentId(studentIdField.getText())
                .build();
            SummaryResponse res = attendanceStub.getAttendanceSummary(req);
            outputArea.append("Summary -> Total: " + res.getSessionsTotal() + ", Attended: " + res.getSessionsAttended() + ", Rate: " + res.getAttendanceRate() + "\n");
        });

        btnEnvironment.addActionListener(e -> {
            RoomConditionsRequest req = RoomConditionsRequest.newBuilder()
                .setLocation(locationField.getText())
                .build();
            RoomConditionsResponse res = environmentStub.getRoomConditions(req);
            outputArea.append("Environment -> Temp: " + res.getTemperature() + ", Humidity: " + res.getHumidity() + ", CO2: " + res.getCo2Level() + ", AQ: " + res.getAirQuality() + "\n");
        });

        btnRecommend.addActionListener(e -> {
            RecommendationRequest req = RecommendationRequest.newBuilder()
                .setStudentId(studentIdField.getText())
                .setSubject(subjectField.getText())
                .setPerformanceScore(Integer.parseInt(scoreField.getText()))
                .build();
            RecommendationResponse res = assistantStub.getLearningRecommendation(req);
            outputArea.append("Recommended Subject: " + res.getRecommendedSubject() + "\n");
        });

        btnAssessment.addActionListener(e -> {
            AssessmentRequest req = AssessmentRequest.newBuilder()
                .setStudentId(studentIdField.getText())
                .build();
            AssessmentResponse res = assistantStub.submitAssessment(req);
            outputArea.append("Assessment -> ID: " + res.getAssessmentId() + ", Feedback: " + res.getFeedback() + "\n");
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ControllerGUI::new);
    }
}

