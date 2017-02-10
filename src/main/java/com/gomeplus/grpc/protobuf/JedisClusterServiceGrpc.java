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
 * <pre>
 *Redis 服务接口
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: JedisClusterServices.proto")
public class JedisClusterServiceGrpc {

  private JedisClusterServiceGrpc() {}

  public static final String SERVICE_NAME = "com.gomeplus.grpc.protobuf.JedisClusterService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
      com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> METHOD_IS_EXIST_KEY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.JedisClusterService", "isExistKey"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
      com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> METHOD_GET_VALUE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.JedisClusterService", "getValue"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
      com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> METHOD_GET_ALL_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.JedisClusterService", "getAllList"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
      com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> METHOD_GET_ALL_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.JedisClusterService", "getAllSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
      com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> METHOD_GET_ALL_MAP =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.JedisClusterService", "getAllMap"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
      com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> METHOD_GET_VALUE_IN_MAP_BY_FIELD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.JedisClusterService", "getValueInMapByField"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
      com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> METHOD_SET_VALUE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.JedisClusterService", "setValue"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
      com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> METHOD_SET_EX_VALUE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.JedisClusterService", "setExValue"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
      com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> METHOD_SET_NX_VALUE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.JedisClusterService", "setNxValue"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
      com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> METHOD_APPEND_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.JedisClusterService", "appendList"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
      com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> METHOD_ADD_TO_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.JedisClusterService", "addToSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
      com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> METHOD_PUT_TO_MAP =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.JedisClusterService", "putToMap"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
      com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> METHOD_DELETE_BY_KEY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.JedisClusterService", "deleteByKey"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
      com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> METHOD_DELETE_VALUE_IN_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.JedisClusterService", "deleteValueInSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
      com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> METHOD_DELETE_FIELD_IN_MAP =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.JedisClusterService", "deleteFieldInMap"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
      com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> METHOD_GET_NOW_NICK_NAME =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.JedisClusterService", "getNowNickName"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
      com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> METHOD_GET_ID2NICK_NAME_MAP_BY_USER_ID_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.JedisClusterService", "getId2NickNameMapByUserIdList"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JedisClusterServiceStub newStub(io.grpc.Channel channel) {
    return new JedisClusterServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JedisClusterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new JedisClusterServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static JedisClusterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new JedisClusterServiceFutureStub(channel);
  }

  /**
   * <pre>
   *Redis 服务接口
   * </pre>
   */
  public static abstract class JedisClusterServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Key值是否存在 请求参数：key(string) 返回参数：isExist(bool)
     * </pre>
     */
    public void isExistKey(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_IS_EXIST_KEY, responseObserver);
    }

    /**
     * <pre>
     *获取单个值-string  请求参数：key(string) 返回参数：value(string)
     * </pre>
     */
    public void getValue(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_VALUE, responseObserver);
    }

    /**
     * <pre>
     *获取list中所有的值  请求参数：key(string) 返回参数：values(list&lt;string&gt;)-list集合
     * </pre>
     */
    public void getAllList(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_LIST, responseObserver);
    }

    /**
     * <pre>
     *获取set中所有的值 请求参数：key(string) 返回参数：values(list&lt;string&gt;)-list集合
     * </pre>
     */
    public void getAllSet(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_SET, responseObserver);
    }

    /**
     * <pre>
     *获取map中所有的值 请求参数：key(string) 返回参数：resultMap(Map&lt;String, String&gt;)-map集合
     * </pre>
     */
    public void getAllMap(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_MAP, responseObserver);
    }

    /**
     * <pre>
     *根据field得到map中的value 请求参数：key(string),field（map集合中的key） 返回参数：value-map中key(field)对应的值
     * </pre>
     */
    public void getValueInMapByField(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_VALUE_IN_MAP_BY_FIELD, responseObserver);
    }

    /**
     * <pre>
     *设置某个值-string 请求参数：key(string),value(string)
     * </pre>
     */
    public void setValue(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_VALUE, responseObserver);
    }

    /**
     * <pre>
     *设置某个值-string(有效时间(秒)) 请求参数：key(string),value(string),seconds-有效时间(秒)
     * </pre>
     */
    public void setExValue(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_EX_VALUE, responseObserver);
    }

    /**
     * <pre>
     *设置分布式锁 请求参数：key(string),value(string) 返回参数 lockCode-分布式锁的值 1-成功，0失败
     * </pre>
     */
    public void setNxValue(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_NX_VALUE, responseObserver);
    }

    /**
     * <pre>
     *向List增加值  请求参数:key(string),value(string)
     * </pre>
     */
    public void appendList(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_APPEND_LIST, responseObserver);
    }

    /**
     * <pre>
     *向Set增加值 key(string),value(string)
     * </pre>
     */
    public void addToSet(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_TO_SET, responseObserver);
    }

    /**
     * <pre>
     *向Map设置值 key(string),value(string),field(string)-(map中的key)
     * </pre>
     */
    public void putToMap(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PUT_TO_MAP, responseObserver);
    }

    /**
     * <pre>
     *根据Key删除redis中的数据  请求参数：key
     * </pre>
     */
    public void deleteByKey(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_BY_KEY, responseObserver);
    }

    /**
     * <pre>
     *根据value删除Set中指定的数据  请求参数:key(string),value(string)
     * </pre>
     */
    public void deleteValueInSet(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_VALUE_IN_SET, responseObserver);
    }

    /**
     * <pre>
     *根据删除Map的指定Field的数据  key(string),field(string)-(map中的key)
     * </pre>
     */
    public void deleteFieldInMap(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_FIELD_IN_MAP, responseObserver);
    }

    /**
     * <pre>
     *得到最新昵称-和业务相关
     *请求参数：appId(string),userId(long),nickName(string)-昵称
     *返回参数：nickName(string)-最新昵称
     * </pre>
     */
    public void getNowNickName(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_NOW_NICK_NAME, responseObserver);
    }

    /**
     * <pre>
     *根据用户ID集合得到昵称Map
     *请求参数：usrIds
     *返回参数：idNickNameMap
     * </pre>
     */
    public void getId2NickNameMapByUserIdList(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ID2NICK_NAME_MAP_BY_USER_ID_LIST, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_IS_EXIST_KEY,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
                com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>(
                  this, METHODID_IS_EXIST_KEY)))
          .addMethod(
            METHOD_GET_VALUE,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
                com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>(
                  this, METHODID_GET_VALUE)))
          .addMethod(
            METHOD_GET_ALL_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
                com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>(
                  this, METHODID_GET_ALL_LIST)))
          .addMethod(
            METHOD_GET_ALL_SET,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
                com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>(
                  this, METHODID_GET_ALL_SET)))
          .addMethod(
            METHOD_GET_ALL_MAP,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
                com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>(
                  this, METHODID_GET_ALL_MAP)))
          .addMethod(
            METHOD_GET_VALUE_IN_MAP_BY_FIELD,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
                com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>(
                  this, METHODID_GET_VALUE_IN_MAP_BY_FIELD)))
          .addMethod(
            METHOD_SET_VALUE,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
                com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>(
                  this, METHODID_SET_VALUE)))
          .addMethod(
            METHOD_SET_EX_VALUE,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
                com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>(
                  this, METHODID_SET_EX_VALUE)))
          .addMethod(
            METHOD_SET_NX_VALUE,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
                com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>(
                  this, METHODID_SET_NX_VALUE)))
          .addMethod(
            METHOD_APPEND_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
                com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>(
                  this, METHODID_APPEND_LIST)))
          .addMethod(
            METHOD_ADD_TO_SET,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
                com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>(
                  this, METHODID_ADD_TO_SET)))
          .addMethod(
            METHOD_PUT_TO_MAP,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
                com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>(
                  this, METHODID_PUT_TO_MAP)))
          .addMethod(
            METHOD_DELETE_BY_KEY,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
                com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>(
                  this, METHODID_DELETE_BY_KEY)))
          .addMethod(
            METHOD_DELETE_VALUE_IN_SET,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
                com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>(
                  this, METHODID_DELETE_VALUE_IN_SET)))
          .addMethod(
            METHOD_DELETE_FIELD_IN_MAP,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
                com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>(
                  this, METHODID_DELETE_FIELD_IN_MAP)))
          .addMethod(
            METHOD_GET_NOW_NICK_NAME,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
                com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>(
                  this, METHODID_GET_NOW_NICK_NAME)))
          .addMethod(
            METHOD_GET_ID2NICK_NAME_MAP_BY_USER_ID_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster,
                com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>(
                  this, METHODID_GET_ID2NICK_NAME_MAP_BY_USER_ID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   *Redis 服务接口
   * </pre>
   */
  public static final class JedisClusterServiceStub extends io.grpc.stub.AbstractStub<JedisClusterServiceStub> {
    private JedisClusterServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JedisClusterServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JedisClusterServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JedisClusterServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Key值是否存在 请求参数：key(string) 返回参数：isExist(bool)
     * </pre>
     */
    public void isExistKey(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_IS_EXIST_KEY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取单个值-string  请求参数：key(string) 返回参数：value(string)
     * </pre>
     */
    public void getValue(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_VALUE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取list中所有的值  请求参数：key(string) 返回参数：values(list&lt;string&gt;)-list集合
     * </pre>
     */
    public void getAllList(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取set中所有的值 请求参数：key(string) 返回参数：values(list&lt;string&gt;)-list集合
     * </pre>
     */
    public void getAllSet(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_SET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取map中所有的值 请求参数：key(string) 返回参数：resultMap(Map&lt;String, String&gt;)-map集合
     * </pre>
     */
    public void getAllMap(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_MAP, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据field得到map中的value 请求参数：key(string),field（map集合中的key） 返回参数：value-map中key(field)对应的值
     * </pre>
     */
    public void getValueInMapByField(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_VALUE_IN_MAP_BY_FIELD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *设置某个值-string 请求参数：key(string),value(string)
     * </pre>
     */
    public void setValue(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_VALUE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *设置某个值-string(有效时间(秒)) 请求参数：key(string),value(string),seconds-有效时间(秒)
     * </pre>
     */
    public void setExValue(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_EX_VALUE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *设置分布式锁 请求参数：key(string),value(string) 返回参数 lockCode-分布式锁的值 1-成功，0失败
     * </pre>
     */
    public void setNxValue(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_NX_VALUE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *向List增加值  请求参数:key(string),value(string)
     * </pre>
     */
    public void appendList(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_APPEND_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *向Set增加值 key(string),value(string)
     * </pre>
     */
    public void addToSet(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_TO_SET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *向Map设置值 key(string),value(string),field(string)-(map中的key)
     * </pre>
     */
    public void putToMap(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PUT_TO_MAP, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据Key删除redis中的数据  请求参数：key
     * </pre>
     */
    public void deleteByKey(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_BY_KEY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据value删除Set中指定的数据  请求参数:key(string),value(string)
     * </pre>
     */
    public void deleteValueInSet(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_VALUE_IN_SET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据删除Map的指定Field的数据  key(string),field(string)-(map中的key)
     * </pre>
     */
    public void deleteFieldInMap(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_FIELD_IN_MAP, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *得到最新昵称-和业务相关
     *请求参数：appId(string),userId(long),nickName(string)-昵称
     *返回参数：nickName(string)-最新昵称
     * </pre>
     */
    public void getNowNickName(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_NOW_NICK_NAME, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据用户ID集合得到昵称Map
     *请求参数：usrIds
     *返回参数：idNickNameMap
     * </pre>
     */
    public void getId2NickNameMapByUserIdList(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ID2NICK_NAME_MAP_BY_USER_ID_LIST, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Redis 服务接口
   * </pre>
   */
  public static final class JedisClusterServiceBlockingStub extends io.grpc.stub.AbstractStub<JedisClusterServiceBlockingStub> {
    private JedisClusterServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JedisClusterServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JedisClusterServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JedisClusterServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Key值是否存在 请求参数：key(string) 返回参数：isExist(bool)
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster isExistKey(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return blockingUnaryCall(
          getChannel(), METHOD_IS_EXIST_KEY, getCallOptions(), request);
    }

    /**
     * <pre>
     *获取单个值-string  请求参数：key(string) 返回参数：value(string)
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster getValue(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_VALUE, getCallOptions(), request);
    }

    /**
     * <pre>
     *获取list中所有的值  请求参数：key(string) 返回参数：values(list&lt;string&gt;)-list集合
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster getAllList(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_LIST, getCallOptions(), request);
    }

    /**
     * <pre>
     *获取set中所有的值 请求参数：key(string) 返回参数：values(list&lt;string&gt;)-list集合
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster getAllSet(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_SET, getCallOptions(), request);
    }

    /**
     * <pre>
     *获取map中所有的值 请求参数：key(string) 返回参数：resultMap(Map&lt;String, String&gt;)-map集合
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster getAllMap(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_MAP, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据field得到map中的value 请求参数：key(string),field（map集合中的key） 返回参数：value-map中key(field)对应的值
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster getValueInMapByField(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_VALUE_IN_MAP_BY_FIELD, getCallOptions(), request);
    }

    /**
     * <pre>
     *设置某个值-string 请求参数：key(string),value(string)
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster setValue(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_VALUE, getCallOptions(), request);
    }

    /**
     * <pre>
     *设置某个值-string(有效时间(秒)) 请求参数：key(string),value(string),seconds-有效时间(秒)
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster setExValue(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_EX_VALUE, getCallOptions(), request);
    }

    /**
     * <pre>
     *设置分布式锁 请求参数：key(string),value(string) 返回参数 lockCode-分布式锁的值 1-成功，0失败
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster setNxValue(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_NX_VALUE, getCallOptions(), request);
    }

    /**
     * <pre>
     *向List增加值  请求参数:key(string),value(string)
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster appendList(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return blockingUnaryCall(
          getChannel(), METHOD_APPEND_LIST, getCallOptions(), request);
    }

    /**
     * <pre>
     *向Set增加值 key(string),value(string)
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster addToSet(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_TO_SET, getCallOptions(), request);
    }

    /**
     * <pre>
     *向Map设置值 key(string),value(string),field(string)-(map中的key)
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster putToMap(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PUT_TO_MAP, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据Key删除redis中的数据  请求参数：key
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster deleteByKey(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_BY_KEY, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据value删除Set中指定的数据  请求参数:key(string),value(string)
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster deleteValueInSet(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_VALUE_IN_SET, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据删除Map的指定Field的数据  key(string),field(string)-(map中的key)
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster deleteFieldInMap(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_FIELD_IN_MAP, getCallOptions(), request);
    }

    /**
     * <pre>
     *得到最新昵称-和业务相关
     *请求参数：appId(string),userId(long),nickName(string)-昵称
     *返回参数：nickName(string)-最新昵称
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster getNowNickName(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_NOW_NICK_NAME, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据用户ID集合得到昵称Map
     *请求参数：usrIds
     *返回参数：idNickNameMap
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster getId2NickNameMapByUserIdList(com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ID2NICK_NAME_MAP_BY_USER_ID_LIST, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Redis 服务接口
   * </pre>
   */
  public static final class JedisClusterServiceFutureStub extends io.grpc.stub.AbstractStub<JedisClusterServiceFutureStub> {
    private JedisClusterServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JedisClusterServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JedisClusterServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JedisClusterServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Key值是否存在 请求参数：key(string) 返回参数：isExist(bool)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> isExistKey(
        com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_IS_EXIST_KEY, getCallOptions()), request);
    }

    /**
     * <pre>
     *获取单个值-string  请求参数：key(string) 返回参数：value(string)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> getValue(
        com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_VALUE, getCallOptions()), request);
    }

    /**
     * <pre>
     *获取list中所有的值  请求参数：key(string) 返回参数：values(list&lt;string&gt;)-list集合
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> getAllList(
        com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_LIST, getCallOptions()), request);
    }

    /**
     * <pre>
     *获取set中所有的值 请求参数：key(string) 返回参数：values(list&lt;string&gt;)-list集合
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> getAllSet(
        com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_SET, getCallOptions()), request);
    }

    /**
     * <pre>
     *获取map中所有的值 请求参数：key(string) 返回参数：resultMap(Map&lt;String, String&gt;)-map集合
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> getAllMap(
        com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_MAP, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据field得到map中的value 请求参数：key(string),field（map集合中的key） 返回参数：value-map中key(field)对应的值
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> getValueInMapByField(
        com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_VALUE_IN_MAP_BY_FIELD, getCallOptions()), request);
    }

    /**
     * <pre>
     *设置某个值-string 请求参数：key(string),value(string)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> setValue(
        com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_VALUE, getCallOptions()), request);
    }

    /**
     * <pre>
     *设置某个值-string(有效时间(秒)) 请求参数：key(string),value(string),seconds-有效时间(秒)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> setExValue(
        com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_EX_VALUE, getCallOptions()), request);
    }

    /**
     * <pre>
     *设置分布式锁 请求参数：key(string),value(string) 返回参数 lockCode-分布式锁的值 1-成功，0失败
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> setNxValue(
        com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_NX_VALUE, getCallOptions()), request);
    }

    /**
     * <pre>
     *向List增加值  请求参数:key(string),value(string)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> appendList(
        com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_APPEND_LIST, getCallOptions()), request);
    }

    /**
     * <pre>
     *向Set增加值 key(string),value(string)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> addToSet(
        com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_TO_SET, getCallOptions()), request);
    }

    /**
     * <pre>
     *向Map设置值 key(string),value(string),field(string)-(map中的key)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> putToMap(
        com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PUT_TO_MAP, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据Key删除redis中的数据  请求参数：key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> deleteByKey(
        com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_BY_KEY, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据value删除Set中指定的数据  请求参数:key(string),value(string)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> deleteValueInSet(
        com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_VALUE_IN_SET, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据删除Map的指定Field的数据  key(string),field(string)-(map中的key)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> deleteFieldInMap(
        com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_FIELD_IN_MAP, getCallOptions()), request);
    }

    /**
     * <pre>
     *得到最新昵称-和业务相关
     *请求参数：appId(string),userId(long),nickName(string)-昵称
     *返回参数：nickName(string)-最新昵称
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> getNowNickName(
        com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_NOW_NICK_NAME, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据用户ID集合得到昵称Map
     *请求参数：usrIds
     *返回参数：idNickNameMap
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster> getId2NickNameMapByUserIdList(
        com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ID2NICK_NAME_MAP_BY_USER_ID_LIST, getCallOptions()), request);
    }
  }

  private static final int METHODID_IS_EXIST_KEY = 0;
  private static final int METHODID_GET_VALUE = 1;
  private static final int METHODID_GET_ALL_LIST = 2;
  private static final int METHODID_GET_ALL_SET = 3;
  private static final int METHODID_GET_ALL_MAP = 4;
  private static final int METHODID_GET_VALUE_IN_MAP_BY_FIELD = 5;
  private static final int METHODID_SET_VALUE = 6;
  private static final int METHODID_SET_EX_VALUE = 7;
  private static final int METHODID_SET_NX_VALUE = 8;
  private static final int METHODID_APPEND_LIST = 9;
  private static final int METHODID_ADD_TO_SET = 10;
  private static final int METHODID_PUT_TO_MAP = 11;
  private static final int METHODID_DELETE_BY_KEY = 12;
  private static final int METHODID_DELETE_VALUE_IN_SET = 13;
  private static final int METHODID_DELETE_FIELD_IN_MAP = 14;
  private static final int METHODID_GET_NOW_NICK_NAME = 15;
  private static final int METHODID_GET_ID2NICK_NAME_MAP_BY_USER_ID_LIST = 16;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JedisClusterServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(JedisClusterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_IS_EXIST_KEY:
          serviceImpl.isExistKey((com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>) responseObserver);
          break;
        case METHODID_GET_VALUE:
          serviceImpl.getValue((com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>) responseObserver);
          break;
        case METHODID_GET_ALL_LIST:
          serviceImpl.getAllList((com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>) responseObserver);
          break;
        case METHODID_GET_ALL_SET:
          serviceImpl.getAllSet((com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>) responseObserver);
          break;
        case METHODID_GET_ALL_MAP:
          serviceImpl.getAllMap((com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>) responseObserver);
          break;
        case METHODID_GET_VALUE_IN_MAP_BY_FIELD:
          serviceImpl.getValueInMapByField((com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>) responseObserver);
          break;
        case METHODID_SET_VALUE:
          serviceImpl.setValue((com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>) responseObserver);
          break;
        case METHODID_SET_EX_VALUE:
          serviceImpl.setExValue((com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>) responseObserver);
          break;
        case METHODID_SET_NX_VALUE:
          serviceImpl.setNxValue((com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>) responseObserver);
          break;
        case METHODID_APPEND_LIST:
          serviceImpl.appendList((com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>) responseObserver);
          break;
        case METHODID_ADD_TO_SET:
          serviceImpl.addToSet((com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>) responseObserver);
          break;
        case METHODID_PUT_TO_MAP:
          serviceImpl.putToMap((com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>) responseObserver);
          break;
        case METHODID_DELETE_BY_KEY:
          serviceImpl.deleteByKey((com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>) responseObserver);
          break;
        case METHODID_DELETE_VALUE_IN_SET:
          serviceImpl.deleteValueInSet((com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>) responseObserver);
          break;
        case METHODID_DELETE_FIELD_IN_MAP:
          serviceImpl.deleteFieldInMap((com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>) responseObserver);
          break;
        case METHODID_GET_NOW_NICK_NAME:
          serviceImpl.getNowNickName((com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>) responseObserver);
          break;
        case METHODID_GET_ID2NICK_NAME_MAP_BY_USER_ID_LIST:
          serviceImpl.getId2NickNameMapByUserIdList((com.gomeplus.grpc.protobuf.JedisClusterServices.ReqJedisCulster) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.JedisClusterServices.RspJedisCluster>) responseObserver);
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
        METHOD_IS_EXIST_KEY,
        METHOD_GET_VALUE,
        METHOD_GET_ALL_LIST,
        METHOD_GET_ALL_SET,
        METHOD_GET_ALL_MAP,
        METHOD_GET_VALUE_IN_MAP_BY_FIELD,
        METHOD_SET_VALUE,
        METHOD_SET_EX_VALUE,
        METHOD_SET_NX_VALUE,
        METHOD_APPEND_LIST,
        METHOD_ADD_TO_SET,
        METHOD_PUT_TO_MAP,
        METHOD_DELETE_BY_KEY,
        METHOD_DELETE_VALUE_IN_SET,
        METHOD_DELETE_FIELD_IN_MAP,
        METHOD_GET_NOW_NICK_NAME,
        METHOD_GET_ID2NICK_NAME_MAP_BY_USER_ID_LIST);
  }

}
