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
    comments = "Source: GroupNoticeServices.proto")
public class GroupNoticeServiceGrpc {

  private GroupNoticeServiceGrpc() {}

  public static final String SERVICE_NAME = "com.gomeplus.grpc.protobuf.GroupNoticeService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice,
      com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> METHOD_SAVE_GROUP_NOTICE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupNoticeService", "saveGroupNotice"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice,
      com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> METHOD_GET_GROUP_NOTICE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupNoticeService", "getGroupNotice"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice,
      com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> METHOD_UPDATE_GROUP_NOTICE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupNoticeService", "updateGroupNotice"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice,
      com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> METHOD_UPDATE_OR_INSERT_GROUP_NOTICE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupNoticeService", "updateOrInsertGroupNotice"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice,
      com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> METHOD_GET_GROUP_NOTICE_BY_GROUP_IDS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupNoticeService", "getGroupNoticeByGroupIds"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice,
      com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> METHOD_GET_GROUP_ID2NOTICE_MAP =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupNoticeService", "getGroupId2NoticeMap"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupNoticeServiceStub newStub(io.grpc.Channel channel) {
    return new GroupNoticeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupNoticeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GroupNoticeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static GroupNoticeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GroupNoticeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GroupNoticeServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *保存群公告 请求参数：GroupNotice
     * </pre>
     */
    public void saveGroupNotice(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAVE_GROUP_NOTICE, responseObserver);
    }

    /**
     * <pre>
     *得到群公告 请求参数： groupId 返回参数：groupNotice
     * </pre>
     */
    public void getGroupNotice(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_GROUP_NOTICE, responseObserver);
    }

    /**
     * <pre>
     *修改群公告 请求参数：groupId,userId,noticeContent(可以为空)
     * </pre>
     */
    public void updateGroupNotice(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_GROUP_NOTICE, responseObserver);
    }

    /**
     * <pre>
     *插入或更新群公告 请求参数：groupId,userId,noticeContent(可以为空)
     * </pre>
     */
    public void updateOrInsertGroupNotice(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_OR_INSERT_GROUP_NOTICE, responseObserver);
    }

    /**
     * <pre>
     *根据groupids批量得到公告
     *请求参数： groupIds(List&lt;String&gt;)--群ID集合
     *返回参数：groupNotices(List&lt;GroupNotice&gt;)-群公告集合
     * </pre>
     */
    public void getGroupNoticeByGroupIds(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_GROUP_NOTICE_BY_GROUP_IDS, responseObserver);
    }

    /**
     * <pre>
     *TODO 暂时没有实现，以后增加 根据groupId集合批量得到群成员Map(groupId-&gt;GroupNoticeMap)
     * </pre>
     */
    public void getGroupId2NoticeMap(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_GROUP_ID2NOTICE_MAP, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SAVE_GROUP_NOTICE,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice,
                com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice>(
                  this, METHODID_SAVE_GROUP_NOTICE)))
          .addMethod(
            METHOD_GET_GROUP_NOTICE,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice,
                com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice>(
                  this, METHODID_GET_GROUP_NOTICE)))
          .addMethod(
            METHOD_UPDATE_GROUP_NOTICE,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice,
                com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice>(
                  this, METHODID_UPDATE_GROUP_NOTICE)))
          .addMethod(
            METHOD_UPDATE_OR_INSERT_GROUP_NOTICE,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice,
                com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice>(
                  this, METHODID_UPDATE_OR_INSERT_GROUP_NOTICE)))
          .addMethod(
            METHOD_GET_GROUP_NOTICE_BY_GROUP_IDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice,
                com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice>(
                  this, METHODID_GET_GROUP_NOTICE_BY_GROUP_IDS)))
          .addMethod(
            METHOD_GET_GROUP_ID2NOTICE_MAP,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice,
                com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice>(
                  this, METHODID_GET_GROUP_ID2NOTICE_MAP)))
          .build();
    }
  }

  /**
   */
  public static final class GroupNoticeServiceStub extends io.grpc.stub.AbstractStub<GroupNoticeServiceStub> {
    private GroupNoticeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupNoticeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupNoticeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupNoticeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *保存群公告 请求参数：GroupNotice
     * </pre>
     */
    public void saveGroupNotice(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAVE_GROUP_NOTICE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *得到群公告 请求参数： groupId 返回参数：groupNotice
     * </pre>
     */
    public void getGroupNotice(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_NOTICE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *修改群公告 请求参数：groupId,userId,noticeContent(可以为空)
     * </pre>
     */
    public void updateGroupNotice(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_GROUP_NOTICE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *插入或更新群公告 请求参数：groupId,userId,noticeContent(可以为空)
     * </pre>
     */
    public void updateOrInsertGroupNotice(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_OR_INSERT_GROUP_NOTICE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据groupids批量得到公告
     *请求参数： groupIds(List&lt;String&gt;)--群ID集合
     *返回参数：groupNotices(List&lt;GroupNotice&gt;)-群公告集合
     * </pre>
     */
    public void getGroupNoticeByGroupIds(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_NOTICE_BY_GROUP_IDS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *TODO 暂时没有实现，以后增加 根据groupId集合批量得到群成员Map(groupId-&gt;GroupNoticeMap)
     * </pre>
     */
    public void getGroupId2NoticeMap(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_ID2NOTICE_MAP, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GroupNoticeServiceBlockingStub extends io.grpc.stub.AbstractStub<GroupNoticeServiceBlockingStub> {
    private GroupNoticeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupNoticeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupNoticeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupNoticeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *保存群公告 请求参数：GroupNotice
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice saveGroupNotice(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAVE_GROUP_NOTICE, getCallOptions(), request);
    }

    /**
     * <pre>
     *得到群公告 请求参数： groupId 返回参数：groupNotice
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice getGroupNotice(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_GROUP_NOTICE, getCallOptions(), request);
    }

    /**
     * <pre>
     *修改群公告 请求参数：groupId,userId,noticeContent(可以为空)
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice updateGroupNotice(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_GROUP_NOTICE, getCallOptions(), request);
    }

    /**
     * <pre>
     *插入或更新群公告 请求参数：groupId,userId,noticeContent(可以为空)
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice updateOrInsertGroupNotice(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_OR_INSERT_GROUP_NOTICE, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据groupids批量得到公告
     *请求参数： groupIds(List&lt;String&gt;)--群ID集合
     *返回参数：groupNotices(List&lt;GroupNotice&gt;)-群公告集合
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice getGroupNoticeByGroupIds(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_GROUP_NOTICE_BY_GROUP_IDS, getCallOptions(), request);
    }

    /**
     * <pre>
     *TODO 暂时没有实现，以后增加 根据groupId集合批量得到群成员Map(groupId-&gt;GroupNoticeMap)
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice getGroupId2NoticeMap(com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_GROUP_ID2NOTICE_MAP, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GroupNoticeServiceFutureStub extends io.grpc.stub.AbstractStub<GroupNoticeServiceFutureStub> {
    private GroupNoticeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupNoticeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupNoticeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupNoticeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *保存群公告 请求参数：GroupNotice
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> saveGroupNotice(
        com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAVE_GROUP_NOTICE, getCallOptions()), request);
    }

    /**
     * <pre>
     *得到群公告 请求参数： groupId 返回参数：groupNotice
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> getGroupNotice(
        com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_NOTICE, getCallOptions()), request);
    }

    /**
     * <pre>
     *修改群公告 请求参数：groupId,userId,noticeContent(可以为空)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> updateGroupNotice(
        com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_GROUP_NOTICE, getCallOptions()), request);
    }

    /**
     * <pre>
     *插入或更新群公告 请求参数：groupId,userId,noticeContent(可以为空)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> updateOrInsertGroupNotice(
        com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_OR_INSERT_GROUP_NOTICE, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据groupids批量得到公告
     *请求参数： groupIds(List&lt;String&gt;)--群ID集合
     *返回参数：groupNotices(List&lt;GroupNotice&gt;)-群公告集合
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> getGroupNoticeByGroupIds(
        com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_NOTICE_BY_GROUP_IDS, getCallOptions()), request);
    }

    /**
     * <pre>
     *TODO 暂时没有实现，以后增加 根据groupId集合批量得到群成员Map(groupId-&gt;GroupNoticeMap)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice> getGroupId2NoticeMap(
        com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_ID2NOTICE_MAP, getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_GROUP_NOTICE = 0;
  private static final int METHODID_GET_GROUP_NOTICE = 1;
  private static final int METHODID_UPDATE_GROUP_NOTICE = 2;
  private static final int METHODID_UPDATE_OR_INSERT_GROUP_NOTICE = 3;
  private static final int METHODID_GET_GROUP_NOTICE_BY_GROUP_IDS = 4;
  private static final int METHODID_GET_GROUP_ID2NOTICE_MAP = 5;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GroupNoticeServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(GroupNoticeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_GROUP_NOTICE:
          serviceImpl.saveGroupNotice((com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice>) responseObserver);
          break;
        case METHODID_GET_GROUP_NOTICE:
          serviceImpl.getGroupNotice((com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP_NOTICE:
          serviceImpl.updateGroupNotice((com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice>) responseObserver);
          break;
        case METHODID_UPDATE_OR_INSERT_GROUP_NOTICE:
          serviceImpl.updateOrInsertGroupNotice((com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice>) responseObserver);
          break;
        case METHODID_GET_GROUP_NOTICE_BY_GROUP_IDS:
          serviceImpl.getGroupNoticeByGroupIds((com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice>) responseObserver);
          break;
        case METHODID_GET_GROUP_ID2NOTICE_MAP:
          serviceImpl.getGroupId2NoticeMap((com.gomeplus.grpc.protobuf.GroupNoticeServices.RequestGroupNotice) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupNoticeServices.ResponseGroupNotice>) responseObserver);
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
        METHOD_SAVE_GROUP_NOTICE,
        METHOD_GET_GROUP_NOTICE,
        METHOD_UPDATE_GROUP_NOTICE,
        METHOD_UPDATE_OR_INSERT_GROUP_NOTICE,
        METHOD_GET_GROUP_NOTICE_BY_GROUP_IDS,
        METHOD_GET_GROUP_ID2NOTICE_MAP);
  }

}
