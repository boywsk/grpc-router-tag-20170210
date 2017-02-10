package com.gomeplus.grpc.protobuf;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: UserRpcServices.proto")
public class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "com.gomeplus.grpc.protobuf.UserService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser,
      com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> METHOD_GET_TOKEN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.UserService", "getToken"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser,
      com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> METHOD_CHECK_USER_TOKEN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.UserService", "checkUserToken"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser,
      com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> METHOD_GET_PUSH_TOKEN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.UserService", "getPushToken"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser,
      com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> METHOD_SET_PUSH_TOKEN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.UserService", "setPushToken"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser,
      com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> METHOD_GET_IS_MSG_BLOCKED =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.UserService", "getIsMsgBlocked"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser,
      com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> METHOD_INC_PUSH_COUNT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.UserService", "incPushCount"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser,
      com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> METHOD_CLEAN_PUSH_COUNT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.UserService", "cleanPushCount"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *获取用户token 参数：appId,userId,返回 token
     * </pre>
     */
    public void getToken(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TOKEN, responseObserver);
    }

    /**
     * <pre>
     *检查用户token 是否有效，参数apppId,userId,token,返回：isVaild
     * </pre>
     */
    public void checkUserToken(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CHECK_USER_TOKEN, responseObserver);
    }

    /**
     * <pre>
     *得到pushToken
     * </pre>
     */
    public void getPushToken(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PUSH_TOKEN, responseObserver);
    }

    /**
     * <pre>
     *设置pushToken
     * </pre>
     */
    public void setPushToken(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_PUSH_TOKEN, responseObserver);
    }

    /**
     * <pre>
     *是不是消息免打扰
     * </pre>
     */
    public void getIsMsgBlocked(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_IS_MSG_BLOCKED, responseObserver);
    }

    /**
     * <pre>
     *push计数加1
     * </pre>
     */
    public void incPushCount(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_INC_PUSH_COUNT, responseObserver);
    }

    /**
     * <pre>
     *清除push计数
     * </pre>
     */
    public void cleanPushCount(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CLEAN_PUSH_COUNT, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_TOKEN,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser,
                com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser>(
                  this, METHODID_GET_TOKEN)))
          .addMethod(
            METHOD_CHECK_USER_TOKEN,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser,
                com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser>(
                  this, METHODID_CHECK_USER_TOKEN)))
          .addMethod(
            METHOD_GET_PUSH_TOKEN,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser,
                com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser>(
                  this, METHODID_GET_PUSH_TOKEN)))
          .addMethod(
            METHOD_SET_PUSH_TOKEN,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser,
                com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser>(
                  this, METHODID_SET_PUSH_TOKEN)))
          .addMethod(
            METHOD_GET_IS_MSG_BLOCKED,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser,
                com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser>(
                  this, METHODID_GET_IS_MSG_BLOCKED)))
          .addMethod(
            METHOD_INC_PUSH_COUNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser,
                com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser>(
                  this, METHODID_INC_PUSH_COUNT)))
          .addMethod(
            METHOD_CLEAN_PUSH_COUNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser,
                com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser>(
                  this, METHODID_CLEAN_PUSH_COUNT)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *获取用户token 参数：appId,userId,返回 token
     * </pre>
     */
    public void getToken(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TOKEN, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *检查用户token 是否有效，参数apppId,userId,token,返回：isVaild
     * </pre>
     */
    public void checkUserToken(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CHECK_USER_TOKEN, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *得到pushToken
     * </pre>
     */
    public void getPushToken(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PUSH_TOKEN, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *设置pushToken
     * </pre>
     */
    public void setPushToken(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_PUSH_TOKEN, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *是不是消息免打扰
     * </pre>
     */
    public void getIsMsgBlocked(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_IS_MSG_BLOCKED, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *push计数加1
     * </pre>
     */
    public void incPushCount(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_INC_PUSH_COUNT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *清除push计数
     * </pre>
     */
    public void cleanPushCount(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CLEAN_PUSH_COUNT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *获取用户token 参数：appId,userId,返回 token
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser getToken(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TOKEN, getCallOptions(), request);
    }

    /**
     * <pre>
     *检查用户token 是否有效，参数apppId,userId,token,返回：isVaild
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser checkUserToken(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CHECK_USER_TOKEN, getCallOptions(), request);
    }

    /**
     * <pre>
     *得到pushToken
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser getPushToken(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PUSH_TOKEN, getCallOptions(), request);
    }

    /**
     * <pre>
     *设置pushToken
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser setPushToken(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_PUSH_TOKEN, getCallOptions(), request);
    }

    /**
     * <pre>
     *是不是消息免打扰
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser getIsMsgBlocked(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_IS_MSG_BLOCKED, getCallOptions(), request);
    }

    /**
     * <pre>
     *push计数加1
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser incPushCount(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request) {
      return blockingUnaryCall(
          getChannel(), METHOD_INC_PUSH_COUNT, getCallOptions(), request);
    }

    /**
     * <pre>
     *清除push计数
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser cleanPushCount(com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CLEAN_PUSH_COUNT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *获取用户token 参数：appId,userId,返回 token
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> getToken(
        com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TOKEN, getCallOptions()), request);
    }

    /**
     * <pre>
     *检查用户token 是否有效，参数apppId,userId,token,返回：isVaild
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> checkUserToken(
        com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CHECK_USER_TOKEN, getCallOptions()), request);
    }

    /**
     * <pre>
     *得到pushToken
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> getPushToken(
        com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PUSH_TOKEN, getCallOptions()), request);
    }

    /**
     * <pre>
     *设置pushToken
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> setPushToken(
        com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_PUSH_TOKEN, getCallOptions()), request);
    }

    /**
     * <pre>
     *是不是消息免打扰
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> getIsMsgBlocked(
        com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_IS_MSG_BLOCKED, getCallOptions()), request);
    }

    /**
     * <pre>
     *push计数加1
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> incPushCount(
        com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_INC_PUSH_COUNT, getCallOptions()), request);
    }

    /**
     * <pre>
     *清除push计数
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser> cleanPushCount(
        com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CLEAN_PUSH_COUNT, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TOKEN = 0;
  private static final int METHODID_CHECK_USER_TOKEN = 1;
  private static final int METHODID_GET_PUSH_TOKEN = 2;
  private static final int METHODID_SET_PUSH_TOKEN = 3;
  private static final int METHODID_GET_IS_MSG_BLOCKED = 4;
  private static final int METHODID_INC_PUSH_COUNT = 5;
  private static final int METHODID_CLEAN_PUSH_COUNT = 6;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TOKEN:
          serviceImpl.getToken((com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser>) responseObserver);
          break;
        case METHODID_CHECK_USER_TOKEN:
          serviceImpl.checkUserToken((com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser>) responseObserver);
          break;
        case METHODID_GET_PUSH_TOKEN:
          serviceImpl.getPushToken((com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser>) responseObserver);
          break;
        case METHODID_SET_PUSH_TOKEN:
          serviceImpl.setPushToken((com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser>) responseObserver);
          break;
        case METHODID_GET_IS_MSG_BLOCKED:
          serviceImpl.getIsMsgBlocked((com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser>) responseObserver);
          break;
        case METHODID_INC_PUSH_COUNT:
          serviceImpl.incPushCount((com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser>) responseObserver);
          break;
        case METHODID_CLEAN_PUSH_COUNT:
          serviceImpl.cleanPushCount((com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser>) responseObserver);
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

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_GET_TOKEN,
        METHOD_CHECK_USER_TOKEN,
        METHOD_GET_PUSH_TOKEN,
        METHOD_SET_PUSH_TOKEN,
        METHOD_GET_IS_MSG_BLOCKED,
        METHOD_INC_PUSH_COUNT,
        METHOD_CLEAN_PUSH_COUNT);
  }

}
