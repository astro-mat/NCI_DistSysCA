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
    comments = "Source: StudentLearningAssistant.proto")
public final class StudentLearningAssistantGrpc {

  private StudentLearningAssistantGrpc() {}

  public static final String SERVICE_NAME = "StudentLearningAssistant";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationRequest,
      com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationResponse> getGetLearningRecommendationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getLearningRecommendation",
      requestType = com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationRequest.class,
      responseType = com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationRequest,
      com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationResponse> getGetLearningRecommendationMethod() {
    io.grpc.MethodDescriptor<com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationRequest, com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationResponse> getGetLearningRecommendationMethod;
    if ((getGetLearningRecommendationMethod = StudentLearningAssistantGrpc.getGetLearningRecommendationMethod) == null) {
      synchronized (StudentLearningAssistantGrpc.class) {
        if ((getGetLearningRecommendationMethod = StudentLearningAssistantGrpc.getGetLearningRecommendationMethod) == null) {
          StudentLearningAssistantGrpc.getGetLearningRecommendationMethod = getGetLearningRecommendationMethod = 
              io.grpc.MethodDescriptor.<com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationRequest, com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "StudentLearningAssistant", "getLearningRecommendation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentLearningAssistantMethodDescriptorSupplier("getLearningRecommendation"))
                  .build();
          }
        }
     }
     return getGetLearningRecommendationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentRequest,
      com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentResponse> getSubmitAssessmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitAssessment",
      requestType = com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentRequest.class,
      responseType = com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentRequest,
      com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentResponse> getSubmitAssessmentMethod() {
    io.grpc.MethodDescriptor<com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentRequest, com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentResponse> getSubmitAssessmentMethod;
    if ((getSubmitAssessmentMethod = StudentLearningAssistantGrpc.getSubmitAssessmentMethod) == null) {
      synchronized (StudentLearningAssistantGrpc.class) {
        if ((getSubmitAssessmentMethod = StudentLearningAssistantGrpc.getSubmitAssessmentMethod) == null) {
          StudentLearningAssistantGrpc.getSubmitAssessmentMethod = getSubmitAssessmentMethod = 
              io.grpc.MethodDescriptor.<com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentRequest, com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "StudentLearningAssistant", "SubmitAssessment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentLearningAssistantMethodDescriptorSupplier("SubmitAssessment"))
                  .build();
          }
        }
     }
     return getSubmitAssessmentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentLearningAssistantStub newStub(io.grpc.Channel channel) {
    return new StudentLearningAssistantStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentLearningAssistantBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StudentLearningAssistantBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentLearningAssistantFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StudentLearningAssistantFutureStub(channel);
  }

  /**
   */
  public static abstract class StudentLearningAssistantImplBase implements io.grpc.BindableService {

    /**
     */
    public void getLearningRecommendation(com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationRequest request,
        io.grpc.stub.StreamObserver<com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLearningRecommendationMethod(), responseObserver);
    }

    /**
     */
    public void submitAssessment(com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentRequest request,
        io.grpc.stub.StreamObserver<com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubmitAssessmentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLearningRecommendationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationRequest,
                com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationResponse>(
                  this, METHODID_GET_LEARNING_RECOMMENDATION)))
          .addMethod(
            getSubmitAssessmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentRequest,
                com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentResponse>(
                  this, METHODID_SUBMIT_ASSESSMENT)))
          .build();
    }
  }

  /**
   */
  public static final class StudentLearningAssistantStub extends io.grpc.stub.AbstractStub<StudentLearningAssistantStub> {
    private StudentLearningAssistantStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentLearningAssistantStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentLearningAssistantStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentLearningAssistantStub(channel, callOptions);
    }

    /**
     */
    public void getLearningRecommendation(com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationRequest request,
        io.grpc.stub.StreamObserver<com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLearningRecommendationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void submitAssessment(com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentRequest request,
        io.grpc.stub.StreamObserver<com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubmitAssessmentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StudentLearningAssistantBlockingStub extends io.grpc.stub.AbstractStub<StudentLearningAssistantBlockingStub> {
    private StudentLearningAssistantBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentLearningAssistantBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentLearningAssistantBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentLearningAssistantBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationResponse getLearningRecommendation(com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLearningRecommendationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentResponse submitAssessment(com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getSubmitAssessmentMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StudentLearningAssistantFutureStub extends io.grpc.stub.AbstractStub<StudentLearningAssistantFutureStub> {
    private StudentLearningAssistantFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentLearningAssistantFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentLearningAssistantFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentLearningAssistantFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationResponse> getLearningRecommendation(
        com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLearningRecommendationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentResponse> submitAssessment(
        com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSubmitAssessmentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LEARNING_RECOMMENDATION = 0;
  private static final int METHODID_SUBMIT_ASSESSMENT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StudentLearningAssistantImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StudentLearningAssistantImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LEARNING_RECOMMENDATION:
          serviceImpl.getLearningRecommendation((com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationRequest) request,
              (io.grpc.stub.StreamObserver<com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.RecommendationResponse>) responseObserver);
          break;
        case METHODID_SUBMIT_ASSESSMENT:
          serviceImpl.submitAssessment((com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentRequest) request,
              (io.grpc.stub.StreamObserver<com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.AssessmentResponse>) responseObserver);
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

  private static abstract class StudentLearningAssistantBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentLearningAssistantBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.eLearningSystem.grpc.StudentLearningAssistantOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentLearningAssistant");
    }
  }

  private static final class StudentLearningAssistantFileDescriptorSupplier
      extends StudentLearningAssistantBaseDescriptorSupplier {
    StudentLearningAssistantFileDescriptorSupplier() {}
  }

  private static final class StudentLearningAssistantMethodDescriptorSupplier
      extends StudentLearningAssistantBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StudentLearningAssistantMethodDescriptorSupplier(String methodName) {
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
      synchronized (StudentLearningAssistantGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentLearningAssistantFileDescriptorSupplier())
              .addMethod(getGetLearningRecommendationMethod())
              .addMethod(getSubmitAssessmentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
