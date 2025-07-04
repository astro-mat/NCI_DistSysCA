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
    comments = "Source: LearningEnvironmentMonitor.proto")
public final class LearningEnvironmentMonitorGrpc {

  private LearningEnvironmentMonitorGrpc() {}

  public static final String SERVICE_NAME = "LearningEnvironmentMonitor";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsRequest,
      com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsResponse> getGetRoomConditionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRoomConditions",
      requestType = com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsRequest.class,
      responseType = com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsRequest,
      com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsResponse> getGetRoomConditionsMethod() {
    io.grpc.MethodDescriptor<com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsRequest, com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsResponse> getGetRoomConditionsMethod;
    if ((getGetRoomConditionsMethod = LearningEnvironmentMonitorGrpc.getGetRoomConditionsMethod) == null) {
      synchronized (LearningEnvironmentMonitorGrpc.class) {
        if ((getGetRoomConditionsMethod = LearningEnvironmentMonitorGrpc.getGetRoomConditionsMethod) == null) {
          LearningEnvironmentMonitorGrpc.getGetRoomConditionsMethod = getGetRoomConditionsMethod = 
              io.grpc.MethodDescriptor.<com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsRequest, com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LearningEnvironmentMonitor", "GetRoomConditions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LearningEnvironmentMonitorMethodDescriptorSupplier("GetRoomConditions"))
                  .build();
          }
        }
     }
     return getGetRoomConditionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdRequest,
      com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdResponse> getSetThresholdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetThresholds",
      requestType = com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdRequest.class,
      responseType = com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdRequest,
      com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdResponse> getSetThresholdsMethod() {
    io.grpc.MethodDescriptor<com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdRequest, com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdResponse> getSetThresholdsMethod;
    if ((getSetThresholdsMethod = LearningEnvironmentMonitorGrpc.getSetThresholdsMethod) == null) {
      synchronized (LearningEnvironmentMonitorGrpc.class) {
        if ((getSetThresholdsMethod = LearningEnvironmentMonitorGrpc.getSetThresholdsMethod) == null) {
          LearningEnvironmentMonitorGrpc.getSetThresholdsMethod = getSetThresholdsMethod = 
              io.grpc.MethodDescriptor.<com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdRequest, com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LearningEnvironmentMonitor", "SetThresholds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LearningEnvironmentMonitorMethodDescriptorSupplier("SetThresholds"))
                  .build();
          }
        }
     }
     return getSetThresholdsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LearningEnvironmentMonitorStub newStub(io.grpc.Channel channel) {
    return new LearningEnvironmentMonitorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LearningEnvironmentMonitorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LearningEnvironmentMonitorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LearningEnvironmentMonitorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LearningEnvironmentMonitorFutureStub(channel);
  }

  /**
   */
  public static abstract class LearningEnvironmentMonitorImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRoomConditions(com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsRequest request,
        io.grpc.stub.StreamObserver<com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRoomConditionsMethod(), responseObserver);
    }

    /**
     */
    public void setThresholds(com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdRequest request,
        io.grpc.stub.StreamObserver<com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetThresholdsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRoomConditionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsRequest,
                com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsResponse>(
                  this, METHODID_GET_ROOM_CONDITIONS)))
          .addMethod(
            getSetThresholdsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdRequest,
                com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdResponse>(
                  this, METHODID_SET_THRESHOLDS)))
          .build();
    }
  }

  /**
   */
  public static final class LearningEnvironmentMonitorStub extends io.grpc.stub.AbstractStub<LearningEnvironmentMonitorStub> {
    private LearningEnvironmentMonitorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LearningEnvironmentMonitorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LearningEnvironmentMonitorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LearningEnvironmentMonitorStub(channel, callOptions);
    }

    /**
     */
    public void getRoomConditions(com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsRequest request,
        io.grpc.stub.StreamObserver<com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRoomConditionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setThresholds(com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdRequest request,
        io.grpc.stub.StreamObserver<com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetThresholdsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LearningEnvironmentMonitorBlockingStub extends io.grpc.stub.AbstractStub<LearningEnvironmentMonitorBlockingStub> {
    private LearningEnvironmentMonitorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LearningEnvironmentMonitorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LearningEnvironmentMonitorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LearningEnvironmentMonitorBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsResponse getRoomConditions(com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRoomConditionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdResponse setThresholds(com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetThresholdsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LearningEnvironmentMonitorFutureStub extends io.grpc.stub.AbstractStub<LearningEnvironmentMonitorFutureStub> {
    private LearningEnvironmentMonitorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LearningEnvironmentMonitorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LearningEnvironmentMonitorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LearningEnvironmentMonitorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsResponse> getRoomConditions(
        com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRoomConditionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdResponse> setThresholds(
        com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetThresholdsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ROOM_CONDITIONS = 0;
  private static final int METHODID_SET_THRESHOLDS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LearningEnvironmentMonitorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LearningEnvironmentMonitorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ROOM_CONDITIONS:
          serviceImpl.getRoomConditions((com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsRequest) request,
              (io.grpc.stub.StreamObserver<com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.RoomConditionsResponse>) responseObserver);
          break;
        case METHODID_SET_THRESHOLDS:
          serviceImpl.setThresholds((com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdRequest) request,
              (io.grpc.stub.StreamObserver<com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.ThresholdResponse>) responseObserver);
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

  private static abstract class LearningEnvironmentMonitorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LearningEnvironmentMonitorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.eLearningSystem.grpc.LearningEnvironmentMonitorOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LearningEnvironmentMonitor");
    }
  }

  private static final class LearningEnvironmentMonitorFileDescriptorSupplier
      extends LearningEnvironmentMonitorBaseDescriptorSupplier {
    LearningEnvironmentMonitorFileDescriptorSupplier() {}
  }

  private static final class LearningEnvironmentMonitorMethodDescriptorSupplier
      extends LearningEnvironmentMonitorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LearningEnvironmentMonitorMethodDescriptorSupplier(String methodName) {
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
      synchronized (LearningEnvironmentMonitorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LearningEnvironmentMonitorFileDescriptorSupplier())
              .addMethod(getGetRoomConditionsMethod())
              .addMethod(getSetThresholdsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
