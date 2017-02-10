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
    comments = "Source: GroupMsgServices.proto")
public class GroupMsgServiceGrpc {

  private GroupMsgServiceGrpc() {}

  public static final String SERVICE_NAME = "com.gomeplus.grpc.protobuf.GroupMsgService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg,
      com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg> METHOD_LIST_GROUP_MSG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMsgService", "listGroupMsg"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg,
      com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg> METHOD_GET_INIT_SEQ_BY_GROUP_ID_AND_UID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMsgService", "getInitSeqByGroupIdAndUid"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg,
      com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg> METHOD_GET_MARK_READ_MSG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMsgService", "getMarkReadMsg"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupMsgServiceStub newStub(io.grpc.Channel channel) {
    return new GroupMsgServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupMsgServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GroupMsgServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static GroupMsgServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GroupMsgServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GroupMsgServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *分页获取聊天消息
     *请求参数：userId,groupId,seqId（群当前最大消息ID）,size(每页大小),time（上次拉群的时间）,
     *返回参数：GrouMsgs (List&lt;GroupMsg&gt;)-群消息集合
     * </pre>
     */
    public void listGroupMsg(com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_GROUP_MSG, responseObserver);
    }

    /**
     * <pre>
     *从redis中获取成员initSeq
     * </pre>
     */
    public void getInitSeqByGroupIdAndUid(com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_INIT_SEQ_BY_GROUP_ID_AND_UID, responseObserver);
    }

    /**
     * <pre>
     *获取单条消息的已/未读人员列表
     * </pre>
     */
    public void getMarkReadMsg(com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_MARK_READ_MSG, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_GROUP_MSG,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg,
                com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg>(
                  this, METHODID_LIST_GROUP_MSG)))
          .addMethod(
            METHOD_GET_INIT_SEQ_BY_GROUP_ID_AND_UID,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg,
                com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg>(
                  this, METHODID_GET_INIT_SEQ_BY_GROUP_ID_AND_UID)))
          .addMethod(
            METHOD_GET_MARK_READ_MSG,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg,
                com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg>(
                  this, METHODID_GET_MARK_READ_MSG)))
          .build();
    }
  }

  /**
   */
  public static final class GroupMsgServiceStub extends io.grpc.stub.AbstractStub<GroupMsgServiceStub> {
    private GroupMsgServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupMsgServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupMsgServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupMsgServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *分页获取聊天消息
     *请求参数：userId,groupId,seqId（群当前最大消息ID）,size(每页大小),time（上次拉群的时间）,
     *返回参数：GrouMsgs (List&lt;GroupMsg&gt;)-群消息集合
     * </pre>
     */
    public void listGroupMsg(com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_GROUP_MSG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *从redis中获取成员initSeq
     * </pre>
     */
    public void getInitSeqByGroupIdAndUid(com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_INIT_SEQ_BY_GROUP_ID_AND_UID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取单条消息的已/未读人员列表
     * </pre>
     */
    public void getMarkReadMsg(com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_MARK_READ_MSG, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GroupMsgServiceBlockingStub extends io.grpc.stub.AbstractStub<GroupMsgServiceBlockingStub> {
    private GroupMsgServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupMsgServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupMsgServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupMsgServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *分页获取聊天消息
     *请求参数：userId,groupId,seqId（群当前最大消息ID）,size(每页大小),time（上次拉群的时间）,
     *返回参数：GrouMsgs (List&lt;GroupMsg&gt;)-群消息集合
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg listGroupMsg(com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_GROUP_MSG, getCallOptions(), request);
    }

    /**
     * <pre>
     *从redis中获取成员initSeq
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg getInitSeqByGroupIdAndUid(com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_INIT_SEQ_BY_GROUP_ID_AND_UID, getCallOptions(), request);
    }

    /**
     * <pre>
     *获取单条消息的已/未读人员列表
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg getMarkReadMsg(com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_MARK_READ_MSG, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GroupMsgServiceFutureStub extends io.grpc.stub.AbstractStub<GroupMsgServiceFutureStub> {
    private GroupMsgServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupMsgServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupMsgServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupMsgServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *分页获取聊天消息
     *请求参数：userId,groupId,seqId（群当前最大消息ID）,size(每页大小),time（上次拉群的时间）,
     *返回参数：GrouMsgs (List&lt;GroupMsg&gt;)-群消息集合
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg> listGroupMsg(
        com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_GROUP_MSG, getCallOptions()), request);
    }

    /**
     * <pre>
     *从redis中获取成员initSeq
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg> getInitSeqByGroupIdAndUid(
        com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_INIT_SEQ_BY_GROUP_ID_AND_UID, getCallOptions()), request);
    }

    /**
     * <pre>
     *获取单条消息的已/未读人员列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg> getMarkReadMsg(
        com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_MARK_READ_MSG, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_GROUP_MSG = 0;
  private static final int METHODID_GET_INIT_SEQ_BY_GROUP_ID_AND_UID = 1;
  private static final int METHODID_GET_MARK_READ_MSG = 2;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GroupMsgServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(GroupMsgServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_GROUP_MSG:
          serviceImpl.listGroupMsg((com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg>) responseObserver);
          break;
        case METHODID_GET_INIT_SEQ_BY_GROUP_ID_AND_UID:
          serviceImpl.getInitSeqByGroupIdAndUid((com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg>) responseObserver);
          break;
        case METHODID_GET_MARK_READ_MSG:
          serviceImpl.getMarkReadMsg((com.gomeplus.grpc.protobuf.GroupMsgServices.RequestGroupMsg) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMsgServices.ResponseGroupMsg>) responseObserver);
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
        METHOD_LIST_GROUP_MSG,
        METHOD_GET_INIT_SEQ_BY_GROUP_ID_AND_UID,
        METHOD_GET_MARK_READ_MSG);
  }

}
