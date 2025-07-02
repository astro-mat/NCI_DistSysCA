package user;

import com.eLearningSystem.SmartAttendanceMonitorGrpc.SmartAttendanceMonitorImplBase;
import com.eLearningSystem.SmartAttendanceMonitorOuterClass.AttendanceRequest;
import com.eLearningSystem.SmartAttendanceMonitorOuterClass.AttendanceResponse;
import com.eLearningSystem.SmartAttendanceMonitorOuterClass.SummaryRequest;
import com.eLearningSystem.SmartAttendanceMonitorOuterClass.SummaryResponse;

import io.grpc.stub.StreamObserver;

public class UserService extends SmartAttendanceMonitorImplBase{

	@Override
	public void recordAttendance(AttendanceRequest request, StreamObserver<AttendanceResponse> responseObserver) {
		System.out.println("Inside recordAttendance");
		
		String studentId = request.getStudentId();
		String timeStamp = request.getTimeStamp();
		String location = request.getLocation();
		
		AttendanceResponse.Builder response = AttendanceResponse.newBuilder();
		
		// basic test validation
		if(studentId.equals(location)) {
			// return success message

			response.setStatus(location).setStatus("Attendance recorded successfully");
		}
		else {
			// return failure message
			response.setStatus(location).setStatus("Attendance not recorded");
		}
		
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
	}

	@Override
	public void getAttendanceSummary(SummaryRequest request, StreamObserver<SummaryResponse> responseObserver) {

	}

	
	
}
