package com.eLearningSystem.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: SmartAttendanceMonitor.proto")
public final class SmartAttendanceMonitorGrpc {

  private SmartAttendanceMonitorGrpc() {}

  public static final String SERVICE_NAME = "SmartAttendanceMonitor";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceRequest,
      com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceResponse> getRecordAttendanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "recordAttendance",
      requestType = com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceRequest.class,
      responseType = com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceRequest,
      com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceResponse> getRecordAttendanceMethod() {
    io.grpc.MethodDescriptor<com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceRequest, com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceResponse> getRecordAttendanceMethod;
    if ((getRecordAttendanceMethod = SmartAttendanceMonitorGrpc.getRecordAttendanceMethod) == null) {
      synchronized (SmartAttendanceMonitorGrpc.class) {
        if ((getRecordAttendanceMethod = SmartAttendanceMonitorGrpc.getRecordAttendanceMethod) == null) {
          SmartAttendanceMonitorGrpc.getRecordAttendanceMethod = getRecordAttendanceMethod = 
              io.grpc.MethodDescriptor.<com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceRequest, com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartAttendanceMonitor", "recordAttendance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartAttendanceMonitorMethodDescriptorSupplier("recordAttendance"))
                  .build();
          }
        }
     }
     return getRecordAttendanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryRequest,
      com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryResponse> getGetAttendanceSummaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAttendanceSummary",
      requestType = com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryRequest.class,
      responseType = com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryRequest,
      com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryResponse> getGetAttendanceSummaryMethod() {
    io.grpc.MethodDescriptor<com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryRequest, com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryResponse> getGetAttendanceSummaryMethod;
    if ((getGetAttendanceSummaryMethod = SmartAttendanceMonitorGrpc.getGetAttendanceSummaryMethod) == null) {
      synchronized (SmartAttendanceMonitorGrpc.class) {
        if ((getGetAttendanceSummaryMethod = SmartAttendanceMonitorGrpc.getGetAttendanceSummaryMethod) == null) {
          SmartAttendanceMonitorGrpc.getGetAttendanceSummaryMethod = getGetAttendanceSummaryMethod = 
              io.grpc.MethodDescriptor.<com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryRequest, com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartAttendanceMonitor", "GetAttendanceSummary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartAttendanceMonitorMethodDescriptorSupplier("GetAttendanceSummary"))
                  .build();
          }
        }
     }
     return getGetAttendanceSummaryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartAttendanceMonitorStub newStub(io.grpc.Channel channel) {
    return new SmartAttendanceMonitorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartAttendanceMonitorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartAttendanceMonitorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartAttendanceMonitorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartAttendanceMonitorFutureStub(channel);
  }

  /**
   */
  public static abstract class SmartAttendanceMonitorImplBase implements io.grpc.BindableService {

    /**
     */
    public void recordAttendance(com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceRequest request,
        io.grpc.stub.StreamObserver<com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRecordAttendanceMethod(), responseObserver);
    }

    /**
     */
    public void getAttendanceSummary(com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryRequest request,
        io.grpc.stub.StreamObserver<com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAttendanceSummaryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRecordAttendanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceRequest,
                com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceResponse>(
                  this, METHODID_RECORD_ATTENDANCE)))
          .addMethod(
            getGetAttendanceSummaryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryRequest,
                com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryResponse>(
                  this, METHODID_GET_ATTENDANCE_SUMMARY)))
          .build();
    }
  }

  /**
   */
  public static final class SmartAttendanceMonitorStub extends io.grpc.stub.AbstractStub<SmartAttendanceMonitorStub> {
    private SmartAttendanceMonitorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartAttendanceMonitorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartAttendanceMonitorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartAttendanceMonitorStub(channel, callOptions);
    }

    /**
     */
    public void recordAttendance(com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceRequest request,
        io.grpc.stub.StreamObserver<com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRecordAttendanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAttendanceSummary(com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryRequest request,
        io.grpc.stub.StreamObserver<com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAttendanceSummaryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SmartAttendanceMonitorBlockingStub extends io.grpc.stub.AbstractStub<SmartAttendanceMonitorBlockingStub> {
    private SmartAttendanceMonitorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartAttendanceMonitorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartAttendanceMonitorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartAttendanceMonitorBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceResponse recordAttendance(com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getRecordAttendanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryResponse getAttendanceSummary(com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAttendanceSummaryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmartAttendanceMonitorFutureStub extends io.grpc.stub.AbstractStub<SmartAttendanceMonitorFutureStub> {
    private SmartAttendanceMonitorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartAttendanceMonitorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartAttendanceMonitorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartAttendanceMonitorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceResponse> recordAttendance(
        com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRecordAttendanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryResponse> getAttendanceSummary(
        com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAttendanceSummaryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECORD_ATTENDANCE = 0;
  private static final int METHODID_GET_ATTENDANCE_SUMMARY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartAttendanceMonitorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartAttendanceMonitorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECORD_ATTENDANCE:
          serviceImpl.recordAttendance((com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceRequest) request,
              (io.grpc.stub.StreamObserver<com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.AttendanceResponse>) responseObserver);
          break;
        case METHODID_GET_ATTENDANCE_SUMMARY:
          serviceImpl.getAttendanceSummary((com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryRequest) request,
              (io.grpc.stub.StreamObserver<com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.SummaryResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SmartAttendanceMonitorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartAttendanceMonitorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.eLearningSystem.grpc.SmartAttendanceMonitorOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartAttendanceMonitor");
    }
  }

  private static final class SmartAttendanceMonitorFileDescriptorSupplier
      extends SmartAttendanceMonitorBaseDescriptorSupplier {
    SmartAttendanceMonitorFileDescriptorSupplier() {}
  }

  private static final class SmartAttendanceMonitorMethodDescriptorSupplier
      extends SmartAttendanceMonitorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartAttendanceMonitorMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SmartAttendanceMonitorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartAttendanceMonitorFileDescriptorSupplier())
              .addMethod(getRecordAttendanceMethod())
              .addMethod(getGetAttendanceSummaryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
