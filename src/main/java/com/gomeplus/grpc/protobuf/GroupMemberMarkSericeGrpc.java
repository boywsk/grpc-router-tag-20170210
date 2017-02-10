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
    comments = "Source: GroupMemberMarkServices.proto")
public class GroupMemberMarkSericeGrpc {

  private GroupMemberMarkSericeGrpc() {}

  public static final String SERVICE_NAME = "com.gomeplus.grpc.protobuf.GroupMemberMarkSerice";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark,
      com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> METHOD_SAVE_MEMBER_MARK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberMarkSerice", "saveMemberMark"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark,
      com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> METHOD_SAVE_BATCH_MEMBER_MARK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberMarkSerice", "saveBatchMemberMark"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark,
      com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> METHOD_UPDATE_MEMBER_MARK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberMarkSerice", "updateMemberMark"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark,
      com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> METHOD_DEL_MEMBER_MARK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberMarkSerice", "delMemberMark"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark,
      com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> METHOD_DEL_MEMBER_MARK_BATCH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberMarkSerice", "delMemberMarkBatch"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark,
      com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> METHOD_DEL_ALL_MEMBER_MARK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberMarkSerice", "delAllMemberMark"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark,
      com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> METHOD_GET_MEMBER_MARKS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberMarkSerice", "getMemberMarks"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark,
      com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> METHOD_GET_MEMBER_MARK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberMarkSerice", "getMemberMark"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark,
      com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> METHOD_GET_GROUP_ID2GROUP_MEMBER_MARK_MAP =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberMarkSerice", "getGroupId2GroupMemberMarkMap"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupMemberMarkSericeStub newStub(io.grpc.Channel channel) {
    return new GroupMemberMarkSericeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupMemberMarkSericeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GroupMemberMarkSericeBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static GroupMemberMarkSericeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GroupMemberMarkSericeFutureStub(channel);
  }

  /**
   */
  public static abstract class GroupMemberMarkSericeImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *保存群成员备注 请求参数：memberMark 
     * </pre>
     */
    public void saveMemberMark(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAVE_MEMBER_MARK, responseObserver);
    }

    /**
     * <pre>
     *批量保存群成员备注 请求参数：groupMemberMarks(List&lt;GroupMemberMark&gt;)-群成员备注集合
     * </pre>
     */
    public void saveBatchMemberMark(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAVE_BATCH_MEMBER_MARK, responseObserver);
    }

    /**
     * <pre>
     *更新群成员备注 请求参数：groupId,userId(备注者),markedUserId(被备注者),mark(备注)
     * </pre>
     */
    public void updateMemberMark(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_MEMBER_MARK, responseObserver);
    }

    /**
     * <pre>
     *删除所有用户对该用户的备注 请求参数:appId,userId
     * </pre>
     */
    public void delMemberMark(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DEL_MEMBER_MARK, responseObserver);
    }

    /**
     * <pre>
     *批量删除用户的备注 请求参数：groupId,idList(List&lt;Long&gt;)-群成员ID
     * </pre>
     */
    public void delMemberMarkBatch(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DEL_MEMBER_MARK_BATCH, responseObserver);
    }

    /**
     * <pre>
     * 删除群组相关的所有备注(解散群用) 请求参数：groupId
     * </pre>
     */
    public void delAllMemberMark(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DEL_ALL_MEMBER_MARK, responseObserver);
    }

    /**
     * <pre>
     * 获取某人所有的成员备注信息 请求参数：groupId,userId 返回参数：groupMemberMarks(List&lt;GroupMemberMark&gt;- 群成员备注集合)
     * </pre>
     */
    public void getMemberMarks(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_MEMBER_MARKS, responseObserver);
    }

    /**
     * <pre>
     *  获取某人对群组某成员的备注信息 请求参数： groupId,userId,markedUserId 返回参数：groupMemberMark
     * </pre>
     */
    public void getMemberMark(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_MEMBER_MARK, responseObserver);
    }

    /**
     * <pre>
     *批量得到群成员备注Map(groupId-&gt;ResultCollection.groupMemberMarks)
     *请求参数：userId,reqBatchGroupIdInfos-(groupId,userIds(List&lt;Long&gt;))
     *返回参数：groupId2GroupMemberMark (Map&lt;String, GroupMemberMarkCollection&gt; key:groupId-&gt;GroupMemberMarkCollection (包含的groupMemberMarks ))
     * </pre>
     */
    public void getGroupId2GroupMemberMarkMap(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_GROUP_ID2GROUP_MEMBER_MARK_MAP, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SAVE_MEMBER_MARK,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark,
                com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark>(
                  this, METHODID_SAVE_MEMBER_MARK)))
          .addMethod(
            METHOD_SAVE_BATCH_MEMBER_MARK,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark,
                com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark>(
                  this, METHODID_SAVE_BATCH_MEMBER_MARK)))
          .addMethod(
            METHOD_UPDATE_MEMBER_MARK,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark,
                com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark>(
                  this, METHODID_UPDATE_MEMBER_MARK)))
          .addMethod(
            METHOD_DEL_MEMBER_MARK,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark,
                com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark>(
                  this, METHODID_DEL_MEMBER_MARK)))
          .addMethod(
            METHOD_DEL_MEMBER_MARK_BATCH,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark,
                com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark>(
                  this, METHODID_DEL_MEMBER_MARK_BATCH)))
          .addMethod(
            METHOD_DEL_ALL_MEMBER_MARK,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark,
                com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark>(
                  this, METHODID_DEL_ALL_MEMBER_MARK)))
          .addMethod(
            METHOD_GET_MEMBER_MARKS,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark,
                com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark>(
                  this, METHODID_GET_MEMBER_MARKS)))
          .addMethod(
            METHOD_GET_MEMBER_MARK,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark,
                com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark>(
                  this, METHODID_GET_MEMBER_MARK)))
          .addMethod(
            METHOD_GET_GROUP_ID2GROUP_MEMBER_MARK_MAP,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark,
                com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark>(
                  this, METHODID_GET_GROUP_ID2GROUP_MEMBER_MARK_MAP)))
          .build();
    }
  }

  /**
   */
  public static final class GroupMemberMarkSericeStub extends io.grpc.stub.AbstractStub<GroupMemberMarkSericeStub> {
    private GroupMemberMarkSericeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupMemberMarkSericeStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupMemberMarkSericeStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupMemberMarkSericeStub(channel, callOptions);
    }

    /**
     * <pre>
     *保存群成员备注 请求参数：memberMark 
     * </pre>
     */
    public void saveMemberMark(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAVE_MEMBER_MARK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *批量保存群成员备注 请求参数：groupMemberMarks(List&lt;GroupMemberMark&gt;)-群成员备注集合
     * </pre>
     */
    public void saveBatchMemberMark(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAVE_BATCH_MEMBER_MARK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *更新群成员备注 请求参数：groupId,userId(备注者),markedUserId(被备注者),mark(备注)
     * </pre>
     */
    public void updateMemberMark(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_MEMBER_MARK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *删除所有用户对该用户的备注 请求参数:appId,userId
     * </pre>
     */
    public void delMemberMark(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DEL_MEMBER_MARK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *批量删除用户的备注 请求参数：groupId,idList(List&lt;Long&gt;)-群成员ID
     * </pre>
     */
    public void delMemberMarkBatch(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DEL_MEMBER_MARK_BATCH, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除群组相关的所有备注(解散群用) 请求参数：groupId
     * </pre>
     */
    public void delAllMemberMark(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DEL_ALL_MEMBER_MARK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取某人所有的成员备注信息 请求参数：groupId,userId 返回参数：groupMemberMarks(List&lt;GroupMemberMark&gt;- 群成员备注集合)
     * </pre>
     */
    public void getMemberMarks(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_MEMBER_MARKS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  获取某人对群组某成员的备注信息 请求参数： groupId,userId,markedUserId 返回参数：groupMemberMark
     * </pre>
     */
    public void getMemberMark(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_MEMBER_MARK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *批量得到群成员备注Map(groupId-&gt;ResultCollection.groupMemberMarks)
     *请求参数：userId,reqBatchGroupIdInfos-(groupId,userIds(List&lt;Long&gt;))
     *返回参数：groupId2GroupMemberMark (Map&lt;String, GroupMemberMarkCollection&gt; key:groupId-&gt;GroupMemberMarkCollection (包含的groupMemberMarks ))
     * </pre>
     */
    public void getGroupId2GroupMemberMarkMap(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_ID2GROUP_MEMBER_MARK_MAP, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GroupMemberMarkSericeBlockingStub extends io.grpc.stub.AbstractStub<GroupMemberMarkSericeBlockingStub> {
    private GroupMemberMarkSericeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupMemberMarkSericeBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupMemberMarkSericeBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupMemberMarkSericeBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *保存群成员备注 请求参数：memberMark 
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark saveMemberMark(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAVE_MEMBER_MARK, getCallOptions(), request);
    }

    /**
     * <pre>
     *批量保存群成员备注 请求参数：groupMemberMarks(List&lt;GroupMemberMark&gt;)-群成员备注集合
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark saveBatchMemberMark(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAVE_BATCH_MEMBER_MARK, getCallOptions(), request);
    }

    /**
     * <pre>
     *更新群成员备注 请求参数：groupId,userId(备注者),markedUserId(被备注者),mark(备注)
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark updateMemberMark(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_MEMBER_MARK, getCallOptions(), request);
    }

    /**
     * <pre>
     *删除所有用户对该用户的备注 请求参数:appId,userId
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark delMemberMark(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DEL_MEMBER_MARK, getCallOptions(), request);
    }

    /**
     * <pre>
     *批量删除用户的备注 请求参数：groupId,idList(List&lt;Long&gt;)-群成员ID
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark delMemberMarkBatch(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DEL_MEMBER_MARK_BATCH, getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除群组相关的所有备注(解散群用) 请求参数：groupId
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark delAllMemberMark(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DEL_ALL_MEMBER_MARK, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取某人所有的成员备注信息 请求参数：groupId,userId 返回参数：groupMemberMarks(List&lt;GroupMemberMark&gt;- 群成员备注集合)
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark getMemberMarks(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_MEMBER_MARKS, getCallOptions(), request);
    }

    /**
     * <pre>
     *  获取某人对群组某成员的备注信息 请求参数： groupId,userId,markedUserId 返回参数：groupMemberMark
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark getMemberMark(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_MEMBER_MARK, getCallOptions(), request);
    }

    /**
     * <pre>
     *批量得到群成员备注Map(groupId-&gt;ResultCollection.groupMemberMarks)
     *请求参数：userId,reqBatchGroupIdInfos-(groupId,userIds(List&lt;Long&gt;))
     *返回参数：groupId2GroupMemberMark (Map&lt;String, GroupMemberMarkCollection&gt; key:groupId-&gt;GroupMemberMarkCollection (包含的groupMemberMarks ))
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark getGroupId2GroupMemberMarkMap(com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_GROUP_ID2GROUP_MEMBER_MARK_MAP, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GroupMemberMarkSericeFutureStub extends io.grpc.stub.AbstractStub<GroupMemberMarkSericeFutureStub> {
    private GroupMemberMarkSericeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupMemberMarkSericeFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupMemberMarkSericeFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupMemberMarkSericeFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *保存群成员备注 请求参数：memberMark 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> saveMemberMark(
        com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAVE_MEMBER_MARK, getCallOptions()), request);
    }

    /**
     * <pre>
     *批量保存群成员备注 请求参数：groupMemberMarks(List&lt;GroupMemberMark&gt;)-群成员备注集合
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> saveBatchMemberMark(
        com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAVE_BATCH_MEMBER_MARK, getCallOptions()), request);
    }

    /**
     * <pre>
     *更新群成员备注 请求参数：groupId,userId(备注者),markedUserId(被备注者),mark(备注)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> updateMemberMark(
        com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_MEMBER_MARK, getCallOptions()), request);
    }

    /**
     * <pre>
     *删除所有用户对该用户的备注 请求参数:appId,userId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> delMemberMark(
        com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DEL_MEMBER_MARK, getCallOptions()), request);
    }

    /**
     * <pre>
     *批量删除用户的备注 请求参数：groupId,idList(List&lt;Long&gt;)-群成员ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> delMemberMarkBatch(
        com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DEL_MEMBER_MARK_BATCH, getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除群组相关的所有备注(解散群用) 请求参数：groupId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> delAllMemberMark(
        com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DEL_ALL_MEMBER_MARK, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取某人所有的成员备注信息 请求参数：groupId,userId 返回参数：groupMemberMarks(List&lt;GroupMemberMark&gt;- 群成员备注集合)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> getMemberMarks(
        com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_MEMBER_MARKS, getCallOptions()), request);
    }

    /**
     * <pre>
     *  获取某人对群组某成员的备注信息 请求参数： groupId,userId,markedUserId 返回参数：groupMemberMark
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> getMemberMark(
        com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_MEMBER_MARK, getCallOptions()), request);
    }

    /**
     * <pre>
     *批量得到群成员备注Map(groupId-&gt;ResultCollection.groupMemberMarks)
     *请求参数：userId,reqBatchGroupIdInfos-(groupId,userIds(List&lt;Long&gt;))
     *返回参数：groupId2GroupMemberMark (Map&lt;String, GroupMemberMarkCollection&gt; key:groupId-&gt;GroupMemberMarkCollection (包含的groupMemberMarks ))
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark> getGroupId2GroupMemberMarkMap(
        com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_ID2GROUP_MEMBER_MARK_MAP, getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_MEMBER_MARK = 0;
  private static final int METHODID_SAVE_BATCH_MEMBER_MARK = 1;
  private static final int METHODID_UPDATE_MEMBER_MARK = 2;
  private static final int METHODID_DEL_MEMBER_MARK = 3;
  private static final int METHODID_DEL_MEMBER_MARK_BATCH = 4;
  private static final int METHODID_DEL_ALL_MEMBER_MARK = 5;
  private static final int METHODID_GET_MEMBER_MARKS = 6;
  private static final int METHODID_GET_MEMBER_MARK = 7;
  private static final int METHODID_GET_GROUP_ID2GROUP_MEMBER_MARK_MAP = 8;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GroupMemberMarkSericeImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(GroupMemberMarkSericeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_MEMBER_MARK:
          serviceImpl.saveMemberMark((com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark>) responseObserver);
          break;
        case METHODID_SAVE_BATCH_MEMBER_MARK:
          serviceImpl.saveBatchMemberMark((com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark>) responseObserver);
          break;
        case METHODID_UPDATE_MEMBER_MARK:
          serviceImpl.updateMemberMark((com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark>) responseObserver);
          break;
        case METHODID_DEL_MEMBER_MARK:
          serviceImpl.delMemberMark((com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark>) responseObserver);
          break;
        case METHODID_DEL_MEMBER_MARK_BATCH:
          serviceImpl.delMemberMarkBatch((com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark>) responseObserver);
          break;
        case METHODID_DEL_ALL_MEMBER_MARK:
          serviceImpl.delAllMemberMark((com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark>) responseObserver);
          break;
        case METHODID_GET_MEMBER_MARKS:
          serviceImpl.getMemberMarks((com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark>) responseObserver);
          break;
        case METHODID_GET_MEMBER_MARK:
          serviceImpl.getMemberMark((com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark>) responseObserver);
          break;
        case METHODID_GET_GROUP_ID2GROUP_MEMBER_MARK_MAP:
          serviceImpl.getGroupId2GroupMemberMarkMap((com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RequestGroupMemberMark) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberMarkServices.RespnoseGroupMemberMark>) responseObserver);
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
        METHOD_SAVE_MEMBER_MARK,
        METHOD_SAVE_BATCH_MEMBER_MARK,
        METHOD_UPDATE_MEMBER_MARK,
        METHOD_DEL_MEMBER_MARK,
        METHOD_DEL_MEMBER_MARK_BATCH,
        METHOD_DEL_ALL_MEMBER_MARK,
        METHOD_GET_MEMBER_MARKS,
        METHOD_GET_MEMBER_MARK,
        METHOD_GET_GROUP_ID2GROUP_MEMBER_MARK_MAP);
  }

}
