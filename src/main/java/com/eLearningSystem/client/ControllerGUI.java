package com.eLearningSystem.client;

// Importing the gRPC message types for attendance
import com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceRequest;
import com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceResponse;
import com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryRequest;
import com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryResponse;

// Importing the environment monitoring messages
import com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsRequest;
import com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsResponse;

// Messages for the student learning assistant
import com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentRequest;
import com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentResponse;
import com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationRequest;
import com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationResponse;

// Importing the actual service stubs
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

    // These are the stubs that connect to the gRPC services
    private SmartAttendanceMonitorBlockingStub attendanceStub;
    private LearningEnvironmentMonitorBlockingStub environmentStub;
    private StudentLearningAssistantBlockingStub assistantStub;

    // Text fields for user input
    private JTextField studentIdField, subjectField, scoreField, locationField;
    private JTextArea outputArea;

    public ControllerGUI() {
        // Set up the gRPC channel to talk to the server on localhost, port 9090
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
        attendanceStub = SmartAttendanceMonitorGrpc.newBlockingStub(channel);
        environmentStub = LearningEnvironmentMonitorGrpc.newBlockingStub(channel);
        assistantStub = StudentLearningAssistantGrpc.newBlockingStub(channel);

        // Start building the GUI
        JFrame frame = new JFrame("eLearning System Controller");
        frame.setSize(700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Layout for the input fields and buttons – using GridBagLayout for flexibility
        JPanel inputPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Create the input boxes
        studentIdField = new JTextField();
        subjectField = new JTextField();
        scoreField = new JTextField();
        locationField = new JTextField();

        // lay out the input labels and text fields
        gbc.gridx = 0; gbc.gridy = 0;
        inputPanel.add(new JLabel("Student ID:"), gbc);
        gbc.gridx = 1;
        inputPanel.add(studentIdField, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        inputPanel.add(new JLabel("Subject:"), gbc);
        gbc.gridx = 1;
        inputPanel.add(subjectField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        inputPanel.add(new JLabel("Performance Score:"), gbc);
        gbc.gridx = 1;
        inputPanel.add(scoreField, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        inputPanel.add(new JLabel("Location:"), gbc);
        gbc.gridx = 1;
        inputPanel.add(locationField, gbc);

        // Add buttons for each function
        JButton btnAttendance = new JButton("Record Attendance");
        JButton btnSummary = new JButton("Get Attendance Summary");
        JButton btnEnvironment = new JButton("Get Room Conditions");
        JButton btnRecommend = new JButton("Get Learning Recommendation");
        JButton btnAssessment = new JButton("Submit Assessment");

        // Add buttons to the layout
        gbc.gridx = 0; gbc.gridy = 4;
        gbc.gridwidth = 1;
        inputPanel.add(btnAttendance, gbc);

        gbc.gridx = 1;
        inputPanel.add(btnSummary, gbc);

        gbc.gridx = 0; gbc.gridy = 5;
        inputPanel.add(btnEnvironment, gbc);

        gbc.gridx = 1;
        inputPanel.add(btnRecommend, gbc);

        gbc.gridx = 0; gbc.gridy = 6;
        gbc.gridwidth = 2;
        inputPanel.add(btnAssessment, gbc);

        // Output area to show responses from server
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Add everything to the frame
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Logic for each button

        // Attendance button – sends the student ID, location and timestamp
        btnAttendance.addActionListener(e -> {
            AttendanceRequest req = AttendanceRequest.newBuilder()
                .setStudentId(studentIdField.getText())
                .setTimeStamp("2025-08-03 10:00:00") // Hardcoded timestamp for now
                .setLocation(locationField.getText())
                .build();
            AttendanceResponse res = attendanceStub.recordAttendance(req);
            outputArea.append("Attendance Status: " + res.getStatus() + "\n");
        });

        // Summary button – just sends student ID
        btnSummary.addActionListener(e -> {
            SummaryRequest req = SummaryRequest.newBuilder()
                .setStudentId(studentIdField.getText())
                .build();
            SummaryResponse res = attendanceStub.getAttendanceSummary(req);
            outputArea.append("Summary -> Total: " + res.getSessionsTotal() + ", Attended: " + res.getSessionsAttended() + ", Rate: " + res.getAttendanceRate() + "\n");
        });

        // Environment button – gets room conditions for the given location
        btnEnvironment.addActionListener(e -> {
            RoomConditionsRequest req = RoomConditionsRequest.newBuilder()
                .setLocation(locationField.getText())
                .build();
            RoomConditionsResponse res = environmentStub.getRoomConditions(req);
            outputArea.append("Environment -> Temp: " + res.getTemperature() + ", Humidity: " + res.getHumidity() + ", CO2: " + res.getCo2Level() + ", AQ: " + res.getAirQuality() + "\n");
        });

        // Recommendation button – uses performance score and subject to get personalised advice
        btnRecommend.addActionListener(e -> {
            RecommendationRequest req = RecommendationRequest.newBuilder()
                .setStudentId(studentIdField.getText())
                .setSubject(subjectField.getText())
                .setPerformanceScore(Integer.parseInt(scoreField.getText()))
                .build();
            RecommendationResponse res = assistantStub.getLearningRecommendation(req);
            outputArea.append("Recommended Subject: " + res.getRecommendedSubject() + "\n");
        });

        // Assessment button – submits an assessment based on student ID
        btnAssessment.addActionListener(e -> {
            AssessmentRequest req = AssessmentRequest.newBuilder()
                .setStudentId(studentIdField.getText())
                .build();
            AssessmentResponse res = assistantStub.submitAssessment(req);
            outputArea.append("Assessment -> ID: " + res.getAssessmentId() + ", Feedback: " + res.getFeedback() + "\n");
        });

        // Show the window
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Start the GUI app
        SwingUtilities.invokeLater(ControllerGUI::new);
    }
}
