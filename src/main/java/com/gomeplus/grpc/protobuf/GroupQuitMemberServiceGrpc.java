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
    comments = "Source: GroupQuitMemberServices.proto")
public class GroupQuitMemberServiceGrpc {

  private GroupQuitMemberServiceGrpc() {}

  public static final String SERVICE_NAME = "com.gomeplus.grpc.protobuf.GroupQuitMemberService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember,
      com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> METHOD_SAVE_GROUP_QUIT_MEMBER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupQuitMemberService", "saveGroupQuitMember"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember,
      com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> METHOD_SAVE_GROUP_QUIT_MEMBERS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupQuitMemberService", "saveGroupQuitMembers"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember,
      com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> METHOD_DEL_QUIT_MEMBER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupQuitMemberService", "delQuitMember"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember,
      com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> METHOD_DEL_QUIT_MEMBERS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupQuitMemberService", "delQuitMembers"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember,
      com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> METHOD_GET_GROUP_QUIT_MEMBER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupQuitMemberService", "getGroupQuitMember"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember,
      com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> METHOD_LIST_GROUP_QUIT_MEMBER_BY_GROUP_ID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupQuitMemberService", "listGroupQuitMemberByGroupId"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember,
      com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> METHOD_LIST_GROUP_QUIT_MEMBER_BY_GROUP_ID_INFOS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupQuitMemberService", "listGroupQuitMemberByGroupIdInfos"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember,
      com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> METHOD_GET_GROUP_ID2GROUP_QUIT_MEMBER_MAP =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupQuitMemberService", "getGroupId2GroupQuitMemberMap"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember,
      com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> METHOD_COUNT_QUIT_GROUP_MEMBER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupQuitMemberService", "countQuitGroupMember"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupQuitMemberServiceStub newStub(io.grpc.Channel channel) {
    return new GroupQuitMemberServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupQuitMemberServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GroupQuitMemberServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static GroupQuitMemberServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GroupQuitMemberServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GroupQuitMemberServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *保存退出群成员 请求参数：GroupQuitMember 
     * </pre>
     */
    public void saveGroupQuitMember(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAVE_GROUP_QUIT_MEMBER, responseObserver);
    }

    /**
     * <pre>
     *批量保存退出群成员 请求参数：groupQuitMembers-List&lt;GroupQuitMember&gt;
     * </pre>
     */
    public void saveGroupQuitMembers(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAVE_GROUP_QUIT_MEMBERS, responseObserver);
    }

    /**
     * <pre>
     *根据退出群组id和用户id 删除记录 请求参数：groupId,userId
     * </pre>
     */
    public void delQuitMember(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DEL_QUIT_MEMBER, responseObserver);
    }

    /**
     * <pre>
     *删除多个成员 请求参数： groupId memberIds(List&lt;Long&gt;)-群成员ID集合
     * </pre>
     */
    public void delQuitMembers(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DEL_QUIT_MEMBERS, responseObserver);
    }

    /**
     * <pre>
     *根据用户userId,groupId获取退出成员 请求参数：groupId,userId 返回参数：groupQuitMember
     * </pre>
     */
    public void getGroupQuitMember(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_GROUP_QUIT_MEMBER, responseObserver);
    }

    /**
     * <pre>
     *根据groupId、time获取退出时间大于time的退出成员集合 
     *请求参数：groupId ,time 
     * 返回参数：groupQuitMember(List&lt;GroupQuitMember&gt;)-退出群成员集合
     * </pre>
     */
    public void listGroupQuitMemberByGroupId(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_GROUP_QUIT_MEMBER_BY_GROUP_ID, responseObserver);
    }

    /**
     * <pre>
     *ZHTODO 没有实现方法 我要删除 根据群ID信息和lastPushTimestamp 批量拉群获取退出成员
     * </pre>
     */
    public void listGroupQuitMemberByGroupIdInfos(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_GROUP_QUIT_MEMBER_BY_GROUP_ID_INFOS, responseObserver);
    }

    /**
     * <pre>
     *批量（增量）得到退出群成员Map(groupId-&gt;ResultCollection.groupQuitMembers)
     *请求参数：reqBatchGroupIdInfos (List&lt;ReqBatchGroupIdInfo&gt; {包含groupId,createTime})
     *返回参数：groupId2GroupQuitMember (Map&lt;String, GroupQuitMemberCollection&gt;--key:groupId-&gt;GroupQuitMemberCollection(包含))
     * </pre>
     */
    public void getGroupId2GroupQuitMemberMap(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_GROUP_ID2GROUP_QUIT_MEMBER_MAP, responseObserver);
    }

    /**
     * <pre>
     *批量（增量）得到退出群成员数
     * </pre>
     */
    public void countQuitGroupMember(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COUNT_QUIT_GROUP_MEMBER, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SAVE_GROUP_QUIT_MEMBER,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember,
                com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember>(
                  this, METHODID_SAVE_GROUP_QUIT_MEMBER)))
          .addMethod(
            METHOD_SAVE_GROUP_QUIT_MEMBERS,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember,
                com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember>(
                  this, METHODID_SAVE_GROUP_QUIT_MEMBERS)))
          .addMethod(
            METHOD_DEL_QUIT_MEMBER,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember,
                com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember>(
                  this, METHODID_DEL_QUIT_MEMBER)))
          .addMethod(
            METHOD_DEL_QUIT_MEMBERS,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember,
                com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember>(
                  this, METHODID_DEL_QUIT_MEMBERS)))
          .addMethod(
            METHOD_GET_GROUP_QUIT_MEMBER,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember,
                com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember>(
                  this, METHODID_GET_GROUP_QUIT_MEMBER)))
          .addMethod(
            METHOD_LIST_GROUP_QUIT_MEMBER_BY_GROUP_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember,
                com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember>(
                  this, METHODID_LIST_GROUP_QUIT_MEMBER_BY_GROUP_ID)))
          .addMethod(
            METHOD_LIST_GROUP_QUIT_MEMBER_BY_GROUP_ID_INFOS,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember,
                com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember>(
                  this, METHODID_LIST_GROUP_QUIT_MEMBER_BY_GROUP_ID_INFOS)))
          .addMethod(
            METHOD_GET_GROUP_ID2GROUP_QUIT_MEMBER_MAP,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember,
                com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember>(
                  this, METHODID_GET_GROUP_ID2GROUP_QUIT_MEMBER_MAP)))
          .addMethod(
            METHOD_COUNT_QUIT_GROUP_MEMBER,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember,
                com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember>(
                  this, METHODID_COUNT_QUIT_GROUP_MEMBER)))
          .build();
    }
  }

  /**
   */
  public static final class GroupQuitMemberServiceStub extends io.grpc.stub.AbstractStub<GroupQuitMemberServiceStub> {
    private GroupQuitMemberServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupQuitMemberServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupQuitMemberServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupQuitMemberServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *保存退出群成员 请求参数：GroupQuitMember 
     * </pre>
     */
    public void saveGroupQuitMember(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAVE_GROUP_QUIT_MEMBER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *批量保存退出群成员 请求参数：groupQuitMembers-List&lt;GroupQuitMember&gt;
     * </pre>
     */
    public void saveGroupQuitMembers(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAVE_GROUP_QUIT_MEMBERS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据退出群组id和用户id 删除记录 请求参数：groupId,userId
     * </pre>
     */
    public void delQuitMember(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DEL_QUIT_MEMBER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *删除多个成员 请求参数： groupId memberIds(List&lt;Long&gt;)-群成员ID集合
     * </pre>
     */
    public void delQuitMembers(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DEL_QUIT_MEMBERS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据用户userId,groupId获取退出成员 请求参数：groupId,userId 返回参数：groupQuitMember
     * </pre>
     */
    public void getGroupQuitMember(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_QUIT_MEMBER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据groupId、time获取退出时间大于time的退出成员集合 
     *请求参数：groupId ,time 
     * 返回参数：groupQuitMember(List&lt;GroupQuitMember&gt;)-退出群成员集合
     * </pre>
     */
    public void listGroupQuitMemberByGroupId(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_GROUP_QUIT_MEMBER_BY_GROUP_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *ZHTODO 没有实现方法 我要删除 根据群ID信息和lastPushTimestamp 批量拉群获取退出成员
     * </pre>
     */
    public void listGroupQuitMemberByGroupIdInfos(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_GROUP_QUIT_MEMBER_BY_GROUP_ID_INFOS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *批量（增量）得到退出群成员Map(groupId-&gt;ResultCollection.groupQuitMembers)
     *请求参数：reqBatchGroupIdInfos (List&lt;ReqBatchGroupIdInfo&gt; {包含groupId,createTime})
     *返回参数：groupId2GroupQuitMember (Map&lt;String, GroupQuitMemberCollection&gt;--key:groupId-&gt;GroupQuitMemberCollection(包含))
     * </pre>
     */
    public void getGroupId2GroupQuitMemberMap(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_ID2GROUP_QUIT_MEMBER_MAP, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *批量（增量）得到退出群成员数
     * </pre>
     */
    public void countQuitGroupMember(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COUNT_QUIT_GROUP_MEMBER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GroupQuitMemberServiceBlockingStub extends io.grpc.stub.AbstractStub<GroupQuitMemberServiceBlockingStub> {
    private GroupQuitMemberServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupQuitMemberServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupQuitMemberServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupQuitMemberServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *保存退出群成员 请求参数：GroupQuitMember 
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember saveGroupQuitMember(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAVE_GROUP_QUIT_MEMBER, getCallOptions(), request);
    }

    /**
     * <pre>
     *批量保存退出群成员 请求参数：groupQuitMembers-List&lt;GroupQuitMember&gt;
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember saveGroupQuitMembers(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAVE_GROUP_QUIT_MEMBERS, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据退出群组id和用户id 删除记录 请求参数：groupId,userId
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember delQuitMember(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DEL_QUIT_MEMBER, getCallOptions(), request);
    }

    /**
     * <pre>
     *删除多个成员 请求参数： groupId memberIds(List&lt;Long&gt;)-群成员ID集合
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember delQuitMembers(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DEL_QUIT_MEMBERS, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据用户userId,groupId获取退出成员 请求参数：groupId,userId 返回参数：groupQuitMember
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember getGroupQuitMember(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_GROUP_QUIT_MEMBER, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据groupId、time获取退出时间大于time的退出成员集合 
     *请求参数：groupId ,time 
     * 返回参数：groupQuitMember(List&lt;GroupQuitMember&gt;)-退出群成员集合
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember listGroupQuitMemberByGroupId(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_GROUP_QUIT_MEMBER_BY_GROUP_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     *ZHTODO 没有实现方法 我要删除 根据群ID信息和lastPushTimestamp 批量拉群获取退出成员
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember listGroupQuitMemberByGroupIdInfos(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_GROUP_QUIT_MEMBER_BY_GROUP_ID_INFOS, getCallOptions(), request);
    }

    /**
     * <pre>
     *批量（增量）得到退出群成员Map(groupId-&gt;ResultCollection.groupQuitMembers)
     *请求参数：reqBatchGroupIdInfos (List&lt;ReqBatchGroupIdInfo&gt; {包含groupId,createTime})
     *返回参数：groupId2GroupQuitMember (Map&lt;String, GroupQuitMemberCollection&gt;--key:groupId-&gt;GroupQuitMemberCollection(包含))
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember getGroupId2GroupQuitMemberMap(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_GROUP_ID2GROUP_QUIT_MEMBER_MAP, getCallOptions(), request);
    }

    /**
     * <pre>
     *批量（增量）得到退出群成员数
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember countQuitGroupMember(com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COUNT_QUIT_GROUP_MEMBER, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GroupQuitMemberServiceFutureStub extends io.grpc.stub.AbstractStub<GroupQuitMemberServiceFutureStub> {
    private GroupQuitMemberServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupQuitMemberServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupQuitMemberServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupQuitMemberServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *保存退出群成员 请求参数：GroupQuitMember 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> saveGroupQuitMember(
        com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAVE_GROUP_QUIT_MEMBER, getCallOptions()), request);
    }

    /**
     * <pre>
     *批量保存退出群成员 请求参数：groupQuitMembers-List&lt;GroupQuitMember&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> saveGroupQuitMembers(
        com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAVE_GROUP_QUIT_MEMBERS, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据退出群组id和用户id 删除记录 请求参数：groupId,userId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> delQuitMember(
        com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DEL_QUIT_MEMBER, getCallOptions()), request);
    }

    /**
     * <pre>
     *删除多个成员 请求参数： groupId memberIds(List&lt;Long&gt;)-群成员ID集合
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> delQuitMembers(
        com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DEL_QUIT_MEMBERS, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据用户userId,groupId获取退出成员 请求参数：groupId,userId 返回参数：groupQuitMember
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> getGroupQuitMember(
        com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_QUIT_MEMBER, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据groupId、time获取退出时间大于time的退出成员集合 
     *请求参数：groupId ,time 
     * 返回参数：groupQuitMember(List&lt;GroupQuitMember&gt;)-退出群成员集合
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> listGroupQuitMemberByGroupId(
        com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_GROUP_QUIT_MEMBER_BY_GROUP_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     *ZHTODO 没有实现方法 我要删除 根据群ID信息和lastPushTimestamp 批量拉群获取退出成员
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> listGroupQuitMemberByGroupIdInfos(
        com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_GROUP_QUIT_MEMBER_BY_GROUP_ID_INFOS, getCallOptions()), request);
    }

    /**
     * <pre>
     *批量（增量）得到退出群成员Map(groupId-&gt;ResultCollection.groupQuitMembers)
     *请求参数：reqBatchGroupIdInfos (List&lt;ReqBatchGroupIdInfo&gt; {包含groupId,createTime})
     *返回参数：groupId2GroupQuitMember (Map&lt;String, GroupQuitMemberCollection&gt;--key:groupId-&gt;GroupQuitMemberCollection(包含))
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> getGroupId2GroupQuitMemberMap(
        com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_ID2GROUP_QUIT_MEMBER_MAP, getCallOptions()), request);
    }

    /**
     * <pre>
     *批量（增量）得到退出群成员数
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember> countQuitGroupMember(
        com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COUNT_QUIT_GROUP_MEMBER, getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_GROUP_QUIT_MEMBER = 0;
  private static final int METHODID_SAVE_GROUP_QUIT_MEMBERS = 1;
  private static final int METHODID_DEL_QUIT_MEMBER = 2;
  private static final int METHODID_DEL_QUIT_MEMBERS = 3;
  private static final int METHODID_GET_GROUP_QUIT_MEMBER = 4;
  private static final int METHODID_LIST_GROUP_QUIT_MEMBER_BY_GROUP_ID = 5;
  private static final int METHODID_LIST_GROUP_QUIT_MEMBER_BY_GROUP_ID_INFOS = 6;
  private static final int METHODID_GET_GROUP_ID2GROUP_QUIT_MEMBER_MAP = 7;
  private static final int METHODID_COUNT_QUIT_GROUP_MEMBER = 8;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GroupQuitMemberServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(GroupQuitMemberServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_GROUP_QUIT_MEMBER:
          serviceImpl.saveGroupQuitMember((com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember>) responseObserver);
          break;
        case METHODID_SAVE_GROUP_QUIT_MEMBERS:
          serviceImpl.saveGroupQuitMembers((com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember>) responseObserver);
          break;
        case METHODID_DEL_QUIT_MEMBER:
          serviceImpl.delQuitMember((com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember>) responseObserver);
          break;
        case METHODID_DEL_QUIT_MEMBERS:
          serviceImpl.delQuitMembers((com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember>) responseObserver);
          break;
        case METHODID_GET_GROUP_QUIT_MEMBER:
          serviceImpl.getGroupQuitMember((com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember>) responseObserver);
          break;
        case METHODID_LIST_GROUP_QUIT_MEMBER_BY_GROUP_ID:
          serviceImpl.listGroupQuitMemberByGroupId((com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember>) responseObserver);
          break;
        case METHODID_LIST_GROUP_QUIT_MEMBER_BY_GROUP_ID_INFOS:
          serviceImpl.listGroupQuitMemberByGroupIdInfos((com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember>) responseObserver);
          break;
        case METHODID_GET_GROUP_ID2GROUP_QUIT_MEMBER_MAP:
          serviceImpl.getGroupId2GroupQuitMemberMap((com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember>) responseObserver);
          break;
        case METHODID_COUNT_QUIT_GROUP_MEMBER:
          serviceImpl.countQuitGroupMember((com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RequestGroupQuitMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupQuitMemberServices.RespnoseGroupQuitMember>) responseObserver);
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
        METHOD_SAVE_GROUP_QUIT_MEMBER,
        METHOD_SAVE_GROUP_QUIT_MEMBERS,
        METHOD_DEL_QUIT_MEMBER,
        METHOD_DEL_QUIT_MEMBERS,
        METHOD_GET_GROUP_QUIT_MEMBER,
        METHOD_LIST_GROUP_QUIT_MEMBER_BY_GROUP_ID,
        METHOD_LIST_GROUP_QUIT_MEMBER_BY_GROUP_ID_INFOS,
        METHOD_GET_GROUP_ID2GROUP_QUIT_MEMBER_MAP,
        METHOD_COUNT_QUIT_GROUP_MEMBER);
  }

}
