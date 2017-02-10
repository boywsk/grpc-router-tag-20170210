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
    comments = "Source: GroupCollectionServices.proto")
public class GroupCollectionServiceGrpc {

  private GroupCollectionServiceGrpc() {}

  public static final String SERVICE_NAME = "com.gomeplus.grpc.protobuf.GroupCollectionService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupCollectionServices.RequestGroupCollection,
      com.gomeplus.grpc.protobuf.GroupCollectionServices.ResponseGroupCollection> METHOD_UPDATE_OR_INSERT_GROUP_COLLECTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupCollectionService", "updateOrInsertGroupCollection"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupCollectionServices.RequestGroupCollection.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupCollectionServices.ResponseGroupCollection.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupCollectionServices.RequestGroupCollection,
      com.gomeplus.grpc.protobuf.GroupCollectionServices.ResponseGroupCollection> METHOD_GET_COLLECT_GROUPS_BY_USER_ID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupCollectionService", "getCollectGroupsByUserId"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupCollectionServices.RequestGroupCollection.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupCollectionServices.ResponseGroupCollection.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupCollectionServiceStub newStub(io.grpc.Channel channel) {
    return new GroupCollectionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupCollectionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GroupCollectionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static GroupCollectionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GroupCollectionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GroupCollectionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *更新或者插入群收藏 
     *请求参数：appId,groupId,userId,isDel
     * </pre>
     */
    public void updateOrInsertGroupCollection(com.gomeplus.grpc.protobuf.GroupCollectionServices.RequestGroupCollection request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupCollectionServices.ResponseGroupCollection> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_OR_INSERT_GROUP_COLLECTION, responseObserver);
    }

    /**
     * <pre>
     *得到默认收藏的群
     *请求参数：appId,userId
     *返回参数：groupCollections
     * </pre>
     */
    public void getCollectGroupsByUserId(com.gomeplus.grpc.protobuf.GroupCollectionServices.RequestGroupCollection request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupCollectionServices.ResponseGroupCollection> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_COLLECT_GROUPS_BY_USER_ID, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_UPDATE_OR_INSERT_GROUP_COLLECTION,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupCollectionServices.RequestGroupCollection,
                com.gomeplus.grpc.protobuf.GroupCollectionServices.ResponseGroupCollection>(
                  this, METHODID_UPDATE_OR_INSERT_GROUP_COLLECTION)))
          .addMethod(
            METHOD_GET_COLLECT_GROUPS_BY_USER_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupCollectionServices.RequestGroupCollection,
                com.gomeplus.grpc.protobuf.GroupCollectionServices.ResponseGroupCollection>(
                  this, METHODID_GET_COLLECT_GROUPS_BY_USER_ID)))
          .build();
    }
  }

  /**
   */
  public static final class GroupCollectionServiceStub extends io.grpc.stub.AbstractStub<GroupCollectionServiceStub> {
    private GroupCollectionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupCollectionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupCollectionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupCollectionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *更新或者插入群收藏 
     *请求参数：appId,groupId,userId,isDel
     * </pre>
     */
    public void updateOrInsertGroupCollection(com.gomeplus.grpc.protobuf.GroupCollectionServices.RequestGroupCollection request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupCollectionServices.ResponseGroupCollection> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_OR_INSERT_GROUP_COLLECTION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *得到默认收藏的群
     *请求参数：appId,userId
     *返回参数：groupCollections
     * </pre>
     */
    public void getCollectGroupsByUserId(com.gomeplus.grpc.protobuf.GroupCollectionServices.RequestGroupCollection request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupCollectionServices.ResponseGroupCollection> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_COLLECT_GROUPS_BY_USER_ID, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GroupCollectionServiceBlockingStub extends io.grpc.stub.AbstractStub<GroupCollectionServiceBlockingStub> {
    private GroupCollectionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupCollectionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupCollectionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupCollectionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *更新或者插入群收藏 
     *请求参数：appId,groupId,userId,isDel
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupCollectionServices.ResponseGroupCollection updateOrInsertGroupCollection(com.gomeplus.grpc.protobuf.GroupCollectionServices.RequestGroupCollection request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_OR_INSERT_GROUP_COLLECTION, getCallOptions(), request);
    }

    /**
     * <pre>
     *得到默认收藏的群
     *请求参数：appId,userId
     *返回参数：groupCollections
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupCollectionServices.ResponseGroupCollection getCollectGroupsByUserId(com.gomeplus.grpc.protobuf.GroupCollectionServices.RequestGroupCollection request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_COLLECT_GROUPS_BY_USER_ID, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GroupCollectionServiceFutureStub extends io.grpc.stub.AbstractStub<GroupCollectionServiceFutureStub> {
    private GroupCollectionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupCollectionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupCollectionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupCollectionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *更新或者插入群收藏 
     *请求参数：appId,groupId,userId,isDel
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupCollectionServices.ResponseGroupCollection> updateOrInsertGroupCollection(
        com.gomeplus.grpc.protobuf.GroupCollectionServices.RequestGroupCollection request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_OR_INSERT_GROUP_COLLECTION, getCallOptions()), request);
    }

    /**
     * <pre>
     *得到默认收藏的群
     *请求参数：appId,userId
     *返回参数：groupCollections
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupCollectionServices.ResponseGroupCollection> getCollectGroupsByUserId(
        com.gomeplus.grpc.protobuf.GroupCollectionServices.RequestGroupCollection request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_COLLECT_GROUPS_BY_USER_ID, getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_OR_INSERT_GROUP_COLLECTION = 0;
  private static final int METHODID_GET_COLLECT_GROUPS_BY_USER_ID = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GroupCollectionServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(GroupCollectionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_OR_INSERT_GROUP_COLLECTION:
          serviceImpl.updateOrInsertGroupCollection((com.gomeplus.grpc.protobuf.GroupCollectionServices.RequestGroupCollection) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupCollectionServices.ResponseGroupCollection>) responseObserver);
          break;
        case METHODID_GET_COLLECT_GROUPS_BY_USER_ID:
          serviceImpl.getCollectGroupsByUserId((com.gomeplus.grpc.protobuf.GroupCollectionServices.RequestGroupCollection) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupCollectionServices.ResponseGroupCollection>) responseObserver);
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
        METHOD_UPDATE_OR_INSERT_GROUP_COLLECTION,
        METHOD_GET_COLLECT_GROUPS_BY_USER_ID);
  }

}
