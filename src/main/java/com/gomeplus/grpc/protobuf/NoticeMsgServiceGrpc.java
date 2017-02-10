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
    comments = "Source: NoticeMsgServices.proto")
public class NoticeMsgServiceGrpc {

  private NoticeMsgServiceGrpc() {}

  public static final String SERVICE_NAME = "com.gomeplus.grpc.protobuf.NoticeMsgService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.NoticeMsgServices.RequestNoticeMsg,
      com.gomeplus.grpc.protobuf.NoticeMsgServices.RespnseNoticeMsg> METHOD_LIST_OFFLINE_NOTICE_MSG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.NoticeMsgService", "listOfflineNoticeMsg"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.NoticeMsgServices.RequestNoticeMsg.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.NoticeMsgServices.RespnseNoticeMsg.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.NoticeMsgServices.RequestNoticeMsg,
      com.gomeplus.grpc.protobuf.NoticeMsgServices.RespnseNoticeMsg> METHOD_GET_OFFLINE_NOTICE_MSG_TOTAL_COUNT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.NoticeMsgService", "getOfflineNoticeMsgTotalCount"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.NoticeMsgServices.RequestNoticeMsg.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.NoticeMsgServices.RespnseNoticeMsg.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NoticeMsgServiceStub newStub(io.grpc.Channel channel) {
    return new NoticeMsgServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NoticeMsgServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NoticeMsgServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static NoticeMsgServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NoticeMsgServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class NoticeMsgServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 分页获取功能性离线消息
     *请求参数： userId,time(上一次拉群时间),pageSize,clientId 
     *返回参数：saveNoticeMsgs(List&lt;SaveNoticeMsg&gt;)--功能性消息集合
     * </pre>
     */
    public void listOfflineNoticeMsg(com.gomeplus.grpc.protobuf.NoticeMsgServices.RequestNoticeMsg request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.NoticeMsgServices.RespnseNoticeMsg> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_OFFLINE_NOTICE_MSG, responseObserver);
    }

    /**
     * <pre>
     * 得到离线消息的总记录数 
     *请求参数：  userId,time(上一次拉群时间),pageSize,clientId 
     *返回参数：offlineNoticeMsgTotalCount --离线功能性消息数
     * </pre>
     */
    public void getOfflineNoticeMsgTotalCount(com.gomeplus.grpc.protobuf.NoticeMsgServices.RequestNoticeMsg request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.NoticeMsgServices.RespnseNoticeMsg> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_OFFLINE_NOTICE_MSG_TOTAL_COUNT, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_OFFLINE_NOTICE_MSG,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.NoticeMsgServices.RequestNoticeMsg,
                com.gomeplus.grpc.protobuf.NoticeMsgServices.RespnseNoticeMsg>(
                  this, METHODID_LIST_OFFLINE_NOTICE_MSG)))
          .addMethod(
            METHOD_GET_OFFLINE_NOTICE_MSG_TOTAL_COUNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.NoticeMsgServices.RequestNoticeMsg,
                com.gomeplus.grpc.protobuf.NoticeMsgServices.RespnseNoticeMsg>(
                  this, METHODID_GET_OFFLINE_NOTICE_MSG_TOTAL_COUNT)))
          .build();
    }
  }

  /**
   */
  public static final class NoticeMsgServiceStub extends io.grpc.stub.AbstractStub<NoticeMsgServiceStub> {
    private NoticeMsgServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NoticeMsgServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NoticeMsgServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NoticeMsgServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 分页获取功能性离线消息
     *请求参数： userId,time(上一次拉群时间),pageSize,clientId 
     *返回参数：saveNoticeMsgs(List&lt;SaveNoticeMsg&gt;)--功能性消息集合
     * </pre>
     */
    public void listOfflineNoticeMsg(com.gomeplus.grpc.protobuf.NoticeMsgServices.RequestNoticeMsg request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.NoticeMsgServices.RespnseNoticeMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_OFFLINE_NOTICE_MSG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 得到离线消息的总记录数 
     *请求参数：  userId,time(上一次拉群时间),pageSize,clientId 
     *返回参数：offlineNoticeMsgTotalCount --离线功能性消息数
     * </pre>
     */
    public void getOfflineNoticeMsgTotalCount(com.gomeplus.grpc.protobuf.NoticeMsgServices.RequestNoticeMsg request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.NoticeMsgServices.RespnseNoticeMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_OFFLINE_NOTICE_MSG_TOTAL_COUNT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NoticeMsgServiceBlockingStub extends io.grpc.stub.AbstractStub<NoticeMsgServiceBlockingStub> {
    private NoticeMsgServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NoticeMsgServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NoticeMsgServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NoticeMsgServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 分页获取功能性离线消息
     *请求参数： userId,time(上一次拉群时间),pageSize,clientId 
     *返回参数：saveNoticeMsgs(List&lt;SaveNoticeMsg&gt;)--功能性消息集合
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.NoticeMsgServices.RespnseNoticeMsg listOfflineNoticeMsg(com.gomeplus.grpc.protobuf.NoticeMsgServices.RequestNoticeMsg request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_OFFLINE_NOTICE_MSG, getCallOptions(), request);
    }

    /**
     * <pre>
     * 得到离线消息的总记录数 
     *请求参数：  userId,time(上一次拉群时间),pageSize,clientId 
     *返回参数：offlineNoticeMsgTotalCount --离线功能性消息数
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.NoticeMsgServices.RespnseNoticeMsg getOfflineNoticeMsgTotalCount(com.gomeplus.grpc.protobuf.NoticeMsgServices.RequestNoticeMsg request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_OFFLINE_NOTICE_MSG_TOTAL_COUNT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NoticeMsgServiceFutureStub extends io.grpc.stub.AbstractStub<NoticeMsgServiceFutureStub> {
    private NoticeMsgServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NoticeMsgServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NoticeMsgServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NoticeMsgServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 分页获取功能性离线消息
     *请求参数： userId,time(上一次拉群时间),pageSize,clientId 
     *返回参数：saveNoticeMsgs(List&lt;SaveNoticeMsg&gt;)--功能性消息集合
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.NoticeMsgServices.RespnseNoticeMsg> listOfflineNoticeMsg(
        com.gomeplus.grpc.protobuf.NoticeMsgServices.RequestNoticeMsg request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_OFFLINE_NOTICE_MSG, getCallOptions()), request);
    }

    /**
     * <pre>
     * 得到离线消息的总记录数 
     *请求参数：  userId,time(上一次拉群时间),pageSize,clientId 
     *返回参数：offlineNoticeMsgTotalCount --离线功能性消息数
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.NoticeMsgServices.RespnseNoticeMsg> getOfflineNoticeMsgTotalCount(
        com.gomeplus.grpc.protobuf.NoticeMsgServices.RequestNoticeMsg request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_OFFLINE_NOTICE_MSG_TOTAL_COUNT, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_OFFLINE_NOTICE_MSG = 0;
  private static final int METHODID_GET_OFFLINE_NOTICE_MSG_TOTAL_COUNT = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NoticeMsgServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(NoticeMsgServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_OFFLINE_NOTICE_MSG:
          serviceImpl.listOfflineNoticeMsg((com.gomeplus.grpc.protobuf.NoticeMsgServices.RequestNoticeMsg) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.NoticeMsgServices.RespnseNoticeMsg>) responseObserver);
          break;
        case METHODID_GET_OFFLINE_NOTICE_MSG_TOTAL_COUNT:
          serviceImpl.getOfflineNoticeMsgTotalCount((com.gomeplus.grpc.protobuf.NoticeMsgServices.RequestNoticeMsg) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.NoticeMsgServices.RespnseNoticeMsg>) responseObserver);
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
        METHOD_LIST_OFFLINE_NOTICE_MSG,
        METHOD_GET_OFFLINE_NOTICE_MSG_TOTAL_COUNT);
  }

}
