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
    comments = "Source: GroupServices.proto")
public class GroupServiceGrpc {

  private GroupServiceGrpc() {}

  public static final String SERVICE_NAME = "com.gomeplus.grpc.protobuf.GroupService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupServices.RequestGroup,
      com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> METHOD_SAVE_GROUP =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupService", "SaveGroup"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupServices.RequestGroup,
      com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> METHOD_UPDATE_GROUP =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupService", "UpdateGroup"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupServices.RequestGroup,
      com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> METHOD_GET_GROUP_NO_SEQ_INFO_BY_GROUP_ID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupService", "getGroupNoSeqInfoByGroupId"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupServices.RequestGroup,
      com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> METHOD_GET_GROUP_CONTAIN_SEQ_INFO_BY_GROUP_ID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupService", "getGroupContainSeqInfoByGroupId"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupServices.RequestGroup,
      com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> METHOD_SET_GROUP_IS_DEL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupService", "setGroupIsDel"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupServices.RequestGroup,
      com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> METHOD_GET_GROUPS_BY_GROUP_IDS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupService", "getGroupsByGroupIds"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupServices.RequestGroup,
      com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> METHOD_GET_GROUP_ID2GROUP_MAP =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupService", "getGroupId2GroupMap"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupServices.RequestGroup,
      com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> METHOD_SAVE_OR_UPDATE_GROUP_BY_ID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupService", "saveOrUpdateGroupById"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupServices.RequestGroup,
      com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> METHOD_GET_GROUP_CONTAIN_DEL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupService", "getGroupContainDel"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupServiceStub newStub(io.grpc.Channel channel) {
    return new GroupServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GroupServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static GroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GroupServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GroupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *保存群组 请求参数：Group
     * </pre>
     */
    public void saveGroup(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAVE_GROUP, responseObserver);
    }

    /**
     * <pre>
     *更新群组 请求参数：Group
     * </pre>
     */
    public void updateGroup(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_GROUP, responseObserver);
    }

    /**
     * <pre>
     *得到群组信息（无消息信息seq） ,请求参数：groupId,返回参数：Group
     * </pre>
     */
    public void getGroupNoSeqInfoByGroupId(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_GROUP_NO_SEQ_INFO_BY_GROUP_ID, responseObserver);
    }

    /**
     * <pre>
     *得到群组信息（包含群消息seq） ,请求参数：groupId,返回参数：Group
     * </pre>
     */
    public void getGroupContainSeqInfoByGroupId(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_GROUP_CONTAIN_SEQ_INFO_BY_GROUP_ID, responseObserver);
    }

    /**
     * <pre>
     *设置群为删除状态（群的删除未逻辑删除）,  请求参数：groupId
     * </pre>
     */
    public void setGroupIsDel(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_GROUP_IS_DEL, responseObserver);
    }

    /**
     * <pre>
     *根据groupIdList得到群信息集合 ,请求参数：groupIds,返回参数:groups(群集合List&lt;Group&gt;)
     * </pre>
     */
    public void getGroupsByGroupIds(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_GROUPS_BY_GROUP_IDS, responseObserver);
    }

    /**
     * <pre>
     *根据groupId集合批量获取Group映射 ,请求参数：groupIds，返回参数：groupId2GroupMap(map&lt;string,Group&gt; ) //key:groupId-&gt;value:(Group)
     * </pre>
     */
    public void getGroupId2GroupMap(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_GROUP_ID2GROUP_MAP, responseObserver);
    }

    /**
     * <pre>
     *保存群组 请求参数：Group
     * </pre>
     */
    public void saveOrUpdateGroupById(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAVE_OR_UPDATE_GROUP_BY_ID, responseObserver);
    }

    /**
     * <pre>
     *得到包含删除的群组信息
     * </pre>
     */
    public void getGroupContainDel(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_GROUP_CONTAIN_DEL, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SAVE_GROUP,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupServices.RequestGroup,
                com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup>(
                  this, METHODID_SAVE_GROUP)))
          .addMethod(
            METHOD_UPDATE_GROUP,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupServices.RequestGroup,
                com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup>(
                  this, METHODID_UPDATE_GROUP)))
          .addMethod(
            METHOD_GET_GROUP_NO_SEQ_INFO_BY_GROUP_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupServices.RequestGroup,
                com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup>(
                  this, METHODID_GET_GROUP_NO_SEQ_INFO_BY_GROUP_ID)))
          .addMethod(
            METHOD_GET_GROUP_CONTAIN_SEQ_INFO_BY_GROUP_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupServices.RequestGroup,
                com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup>(
                  this, METHODID_GET_GROUP_CONTAIN_SEQ_INFO_BY_GROUP_ID)))
          .addMethod(
            METHOD_SET_GROUP_IS_DEL,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupServices.RequestGroup,
                com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup>(
                  this, METHODID_SET_GROUP_IS_DEL)))
          .addMethod(
            METHOD_GET_GROUPS_BY_GROUP_IDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupServices.RequestGroup,
                com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup>(
                  this, METHODID_GET_GROUPS_BY_GROUP_IDS)))
          .addMethod(
            METHOD_GET_GROUP_ID2GROUP_MAP,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupServices.RequestGroup,
                com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup>(
                  this, METHODID_GET_GROUP_ID2GROUP_MAP)))
          .addMethod(
            METHOD_SAVE_OR_UPDATE_GROUP_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupServices.RequestGroup,
                com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup>(
                  this, METHODID_SAVE_OR_UPDATE_GROUP_BY_ID)))
          .addMethod(
            METHOD_GET_GROUP_CONTAIN_DEL,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupServices.RequestGroup,
                com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup>(
                  this, METHODID_GET_GROUP_CONTAIN_DEL)))
          .build();
    }
  }

  /**
   */
  public static final class GroupServiceStub extends io.grpc.stub.AbstractStub<GroupServiceStub> {
    private GroupServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *保存群组 请求参数：Group
     * </pre>
     */
    public void saveGroup(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAVE_GROUP, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *更新群组 请求参数：Group
     * </pre>
     */
    public void updateGroup(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_GROUP, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *得到群组信息（无消息信息seq） ,请求参数：groupId,返回参数：Group
     * </pre>
     */
    public void getGroupNoSeqInfoByGroupId(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_NO_SEQ_INFO_BY_GROUP_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *得到群组信息（包含群消息seq） ,请求参数：groupId,返回参数：Group
     * </pre>
     */
    public void getGroupContainSeqInfoByGroupId(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_CONTAIN_SEQ_INFO_BY_GROUP_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *设置群为删除状态（群的删除未逻辑删除）,  请求参数：groupId
     * </pre>
     */
    public void setGroupIsDel(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_GROUP_IS_DEL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据groupIdList得到群信息集合 ,请求参数：groupIds,返回参数:groups(群集合List&lt;Group&gt;)
     * </pre>
     */
    public void getGroupsByGroupIds(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_GROUPS_BY_GROUP_IDS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据groupId集合批量获取Group映射 ,请求参数：groupIds，返回参数：groupId2GroupMap(map&lt;string,Group&gt; ) //key:groupId-&gt;value:(Group)
     * </pre>
     */
    public void getGroupId2GroupMap(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_ID2GROUP_MAP, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *保存群组 请求参数：Group
     * </pre>
     */
    public void saveOrUpdateGroupById(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAVE_OR_UPDATE_GROUP_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *得到包含删除的群组信息
     * </pre>
     */
    public void getGroupContainDel(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_CONTAIN_DEL, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GroupServiceBlockingStub extends io.grpc.stub.AbstractStub<GroupServiceBlockingStub> {
    private GroupServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *保存群组 请求参数：Group
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup saveGroup(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAVE_GROUP, getCallOptions(), request);
    }

    /**
     * <pre>
     *更新群组 请求参数：Group
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup updateGroup(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_GROUP, getCallOptions(), request);
    }

    /**
     * <pre>
     *得到群组信息（无消息信息seq） ,请求参数：groupId,返回参数：Group
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup getGroupNoSeqInfoByGroupId(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_GROUP_NO_SEQ_INFO_BY_GROUP_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     *得到群组信息（包含群消息seq） ,请求参数：groupId,返回参数：Group
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup getGroupContainSeqInfoByGroupId(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_GROUP_CONTAIN_SEQ_INFO_BY_GROUP_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     *设置群为删除状态（群的删除未逻辑删除）,  请求参数：groupId
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup setGroupIsDel(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_GROUP_IS_DEL, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据groupIdList得到群信息集合 ,请求参数：groupIds,返回参数:groups(群集合List&lt;Group&gt;)
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup getGroupsByGroupIds(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_GROUPS_BY_GROUP_IDS, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据groupId集合批量获取Group映射 ,请求参数：groupIds，返回参数：groupId2GroupMap(map&lt;string,Group&gt; ) //key:groupId-&gt;value:(Group)
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup getGroupId2GroupMap(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_GROUP_ID2GROUP_MAP, getCallOptions(), request);
    }

    /**
     * <pre>
     *保存群组 请求参数：Group
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup saveOrUpdateGroupById(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAVE_OR_UPDATE_GROUP_BY_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     *得到包含删除的群组信息
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup getGroupContainDel(com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_GROUP_CONTAIN_DEL, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GroupServiceFutureStub extends io.grpc.stub.AbstractStub<GroupServiceFutureStub> {
    private GroupServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *保存群组 请求参数：Group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> saveGroup(
        com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAVE_GROUP, getCallOptions()), request);
    }

    /**
     * <pre>
     *更新群组 请求参数：Group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> updateGroup(
        com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_GROUP, getCallOptions()), request);
    }

    /**
     * <pre>
     *得到群组信息（无消息信息seq） ,请求参数：groupId,返回参数：Group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> getGroupNoSeqInfoByGroupId(
        com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_NO_SEQ_INFO_BY_GROUP_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     *得到群组信息（包含群消息seq） ,请求参数：groupId,返回参数：Group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> getGroupContainSeqInfoByGroupId(
        com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_CONTAIN_SEQ_INFO_BY_GROUP_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     *设置群为删除状态（群的删除未逻辑删除）,  请求参数：groupId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> setGroupIsDel(
        com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_GROUP_IS_DEL, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据groupIdList得到群信息集合 ,请求参数：groupIds,返回参数:groups(群集合List&lt;Group&gt;)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> getGroupsByGroupIds(
        com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_GROUPS_BY_GROUP_IDS, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据groupId集合批量获取Group映射 ,请求参数：groupIds，返回参数：groupId2GroupMap(map&lt;string,Group&gt; ) //key:groupId-&gt;value:(Group)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> getGroupId2GroupMap(
        com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_ID2GROUP_MAP, getCallOptions()), request);
    }

    /**
     * <pre>
     *保存群组 请求参数：Group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> saveOrUpdateGroupById(
        com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAVE_OR_UPDATE_GROUP_BY_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     *得到包含删除的群组信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup> getGroupContainDel(
        com.gomeplus.grpc.protobuf.GroupServices.RequestGroup request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_CONTAIN_DEL, getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_GROUP = 0;
  private static final int METHODID_UPDATE_GROUP = 1;
  private static final int METHODID_GET_GROUP_NO_SEQ_INFO_BY_GROUP_ID = 2;
  private static final int METHODID_GET_GROUP_CONTAIN_SEQ_INFO_BY_GROUP_ID = 3;
  private static final int METHODID_SET_GROUP_IS_DEL = 4;
  private static final int METHODID_GET_GROUPS_BY_GROUP_IDS = 5;
  private static final int METHODID_GET_GROUP_ID2GROUP_MAP = 6;
  private static final int METHODID_SAVE_OR_UPDATE_GROUP_BY_ID = 7;
  private static final int METHODID_GET_GROUP_CONTAIN_DEL = 8;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GroupServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(GroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_GROUP:
          serviceImpl.saveGroup((com.gomeplus.grpc.protobuf.GroupServices.RequestGroup) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP:
          serviceImpl.updateGroup((com.gomeplus.grpc.protobuf.GroupServices.RequestGroup) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup>) responseObserver);
          break;
        case METHODID_GET_GROUP_NO_SEQ_INFO_BY_GROUP_ID:
          serviceImpl.getGroupNoSeqInfoByGroupId((com.gomeplus.grpc.protobuf.GroupServices.RequestGroup) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup>) responseObserver);
          break;
        case METHODID_GET_GROUP_CONTAIN_SEQ_INFO_BY_GROUP_ID:
          serviceImpl.getGroupContainSeqInfoByGroupId((com.gomeplus.grpc.protobuf.GroupServices.RequestGroup) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup>) responseObserver);
          break;
        case METHODID_SET_GROUP_IS_DEL:
          serviceImpl.setGroupIsDel((com.gomeplus.grpc.protobuf.GroupServices.RequestGroup) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup>) responseObserver);
          break;
        case METHODID_GET_GROUPS_BY_GROUP_IDS:
          serviceImpl.getGroupsByGroupIds((com.gomeplus.grpc.protobuf.GroupServices.RequestGroup) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup>) responseObserver);
          break;
        case METHODID_GET_GROUP_ID2GROUP_MAP:
          serviceImpl.getGroupId2GroupMap((com.gomeplus.grpc.protobuf.GroupServices.RequestGroup) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup>) responseObserver);
          break;
        case METHODID_SAVE_OR_UPDATE_GROUP_BY_ID:
          serviceImpl.saveOrUpdateGroupById((com.gomeplus.grpc.protobuf.GroupServices.RequestGroup) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup>) responseObserver);
          break;
        case METHODID_GET_GROUP_CONTAIN_DEL:
          serviceImpl.getGroupContainDel((com.gomeplus.grpc.protobuf.GroupServices.RequestGroup) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupServices.RespnoseGroup>) responseObserver);
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
        METHOD_SAVE_GROUP,
        METHOD_UPDATE_GROUP,
        METHOD_GET_GROUP_NO_SEQ_INFO_BY_GROUP_ID,
        METHOD_GET_GROUP_CONTAIN_SEQ_INFO_BY_GROUP_ID,
        METHOD_SET_GROUP_IS_DEL,
        METHOD_GET_GROUPS_BY_GROUP_IDS,
        METHOD_GET_GROUP_ID2GROUP_MAP,
        METHOD_SAVE_OR_UPDATE_GROUP_BY_ID,
        METHOD_GET_GROUP_CONTAIN_DEL);
  }

}
