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
    comments = "Source: GroupMemberServices.proto")
public class GroupMemberSericeGrpc {

  private GroupMemberSericeGrpc() {}

  public static final String SERVICE_NAME = "com.gomeplus.grpc.protobuf.GroupMemberSerice";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_SAVE_GROUP_MEMBER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "saveGroupMember"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_SAVE_BACTH_GROUP_MEMBERS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "saveBacthGroupMembers"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_UPDATE_NICK_NAME =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "updateNickName"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_UPDATE_GROUP_NICKNAME =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "updateGroupNickname"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_UPDATE_IDENTITY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "updateIdentity"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_UPDATE_SHIELD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "updateShield"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_UPDATE_IS_TOP =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "updateIsTop"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_UPDATE_BACTH_STATUS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "updateBacthStatus"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_UPDATE_STATUS_DEL_BY_GROUP_ID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "updateStatusDelByGroupId"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_DEL_GROUP_MEMBER_BY_USER_ID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "delGroupMemberByUserId"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_DEL_BATCH_GROUP_MEMBERS_BY_UIDS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "delBatchGroupMembersByUids"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_DEL_GROUP_ALL_MEMBER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "delGroupAllMember"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_LIST_GROUP_MEMBERS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "listGroupMembers"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_LIST_GROUP_MEMBERS_PAGE_BY_TIME_AND_STATUS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "listGroupMembersPageByTimeAndStatus"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_GET_GROUP_MEMBER_BY_UID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "getGroupMemberByUid"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_GET_GROUP_MEMBER_BY_UID_CONTAIN_STATUS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "getGroupMemberByUidContainStatus"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_GET_GROUP_MEMBER_BY_UIDS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "getGroupMemberByUids"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_LIST_MEMBER_GROUPS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "listMemberGroups"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_LIST_MEMBER_GROUP_IDS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "listMemberGroupIds"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_COUNT_GROUP_MEMBER_BY_GROUP_ID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "countGroupMemberByGroupId"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_COUNT_GROUP_MEMBER_FROM_REDIS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "countGroupMemberFromRedis"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_COUNT_GROUP_MEMBER_BY_GROUP_IDS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "countGroupMemberByGroupIds"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_LIST_MEMBER_MAX_SEQ =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "listMemberMaxSeq"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_LIST_MEMBER_SEQ =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "listMemberSeq"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_UPDATE_GROUP_COLLECTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "updateGroupCollection"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_GET_COLLECTION_GROUPS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "getCollectionGroups"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_LIST_GROUP_MEMBERS_BY_GROUP_IDS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "listGroupMembersByGroupIds"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_GET_GROUP_ID2GROUP_MEMBER_MAP =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "getGroupId2GroupMemberMap"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_GET_ALL_GROUP_COLLECTIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "getAllGroupCollections"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_UPDATE_STICKIE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "updateStickie"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_GET_GROUP_MEMBERS_BY_UID_AND_GROUP_IDS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "getGroupMembersByUidAndGroupIds"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
      com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> METHOD_GET_EARLIEST_ADD_GROUP_MEMBER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gomeplus.grpc.protobuf.GroupMemberSerice", "getEarliestAddGroupMember"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupMemberSericeStub newStub(io.grpc.Channel channel) {
    return new GroupMemberSericeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupMemberSericeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GroupMemberSericeBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static GroupMemberSericeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GroupMemberSericeFutureStub(channel);
  }

  /**
   */
  public static abstract class GroupMemberSericeImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *保存群成员 请求参数：GroupMember,groupCreateId(群主ID),isSaveToRedis(需设置为true)
     * </pre>
     */
    public void saveGroupMember(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAVE_GROUP_MEMBER, responseObserver);
    }

    /**
     * <pre>
     *批量保存群成员信息 请求参数：groupMembers(List&lt;GroupMember&gt;),groupCreateId(群主ID),isSaveToRedis(需设置为true)
     * </pre>
     */
    public void saveBacthGroupMembers(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAVE_BACTH_GROUP_MEMBERS, responseObserver);
    }

    /**
     * <pre>
     *TODO 修改群成员信息的时候，因为0为有意义的，所以不能使用同一的修改方法 liuzhenhuan 20161020
     *修改成员昵称 请求参数：groupId,userId,nickName
     * </pre>
     */
    public void updateNickName(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_NICK_NAME, responseObserver);
    }

    /**
     * <pre>
     *修改群昵称(群名片)请求参数：groupId,userId,groupNickname-群名片
     * </pre>
     */
    public void updateGroupNickname(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_GROUP_NICKNAME, responseObserver);
    }

    /**
     * <pre>
     *修改成员身份 请求参数：groupId,userId,identity-（身份;0:普通成员,1:创建者,2:管理员）
     * </pre>
     */
    public void updateIdentity(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_IDENTITY, responseObserver);
    }

    /**
     * <pre>
     *修改屏蔽群消息状态 请求参数：groupId,userId,isShield-（是否屏蔽群消息 0:否  1:是）
     * </pre>
     */
    public void updateShield(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_SHIELD, responseObserver);
    }

    /**
     * <pre>
     *修改群置顶状态（置顶做到了客户端，可忽略）请求参数：groupId,userId,isTop（是否置顶- 0:否  1:是）
     * </pre>
     */
    public void updateIsTop(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_IS_TOP, responseObserver);
    }

    /**
     * <pre>
     *批量更新群成员状态信息 请求参数：groupId,memberIds(List&lt;Long&gt;)-群成员ID集合,status
     * </pre>
     */
    public void updateBacthStatus(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_BACTH_STATUS, responseObserver);
    }

    /**
     * <pre>
     *更新所有群成员状态为删除状态   请求参数：groupId,memberIds(List&lt;Long&gt;)-群成员ID集合,status
     * </pre>
     */
    public void updateStatusDelByGroupId(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_STATUS_DEL_BY_GROUP_ID, responseObserver);
    }

    /**
     * <pre>
     *根据 UserId删除群成员 请求参数：groupId,userId
     * </pre>
     */
    public void delGroupMemberByUserId(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DEL_GROUP_MEMBER_BY_USER_ID, responseObserver);
    }

    /**
     * <pre>
     *根据 userIds批量删除群成员 请求参数：groupId,memberIds(List&lt;Long&gt;)-群成员ID集合
     * </pre>
     */
    public void delBatchGroupMembersByUids(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DEL_BATCH_GROUP_MEMBERS_BY_UIDS, responseObserver);
    }

    /**
     * <pre>
     *删除所有群组成员 请求参数：groupId
     * </pre>
     */
    public void delGroupAllMember(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DEL_GROUP_ALL_MEMBER, responseObserver);
    }

    /**
     * <pre>
     *获取群内 所有已通过的成员关系 请求参数：groupId 返回参数：groupMembers(List&lt;GroupMember&gt;)-所有群成员集合
     * </pre>
     */
    public void listGroupMembers(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_GROUP_MEMBERS, responseObserver);
    }

    /**
     * <pre>
     *根据入群时间（大于） 和状态 获取群内 的成员集合 进行分页查询 
     *请求参数：groupId,time（入群时间）,status,page,size 返回参数：groupMembers(List&lt;GroupMember&gt;)-所有群成员集合
     * </pre>
     */
    public void listGroupMembersPageByTimeAndStatus(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_GROUP_MEMBERS_PAGE_BY_TIME_AND_STATUS, responseObserver);
    }

    /**
     * <pre>
     *根据UserId得到群成员 请求参数:groupId,userId
     * </pre>
     */
    public void getGroupMemberByUid(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_GROUP_MEMBER_BY_UID, responseObserver);
    }

    /**
     * <pre>
     *根据UserId得到群成员 请求参数:groupId,userId 包含状态
     * </pre>
     */
    public void getGroupMemberByUidContainStatus(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_GROUP_MEMBER_BY_UID_CONTAIN_STATUS, responseObserver);
    }

    /**
     * <pre>
     *根据UserIds得到群成员集合 请求参数：groupId,memberIds(List&lt;Long&gt;)-群成员ID 返回参数：groupMembers(List&lt;GroupMember&gt;)-群成员集合
     * </pre>
     */
    public void getGroupMemberByUids(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_GROUP_MEMBER_BY_UIDS, responseObserver);
    }

    /**
     * <pre>
     *根据用户Id，得到所有加入的群的信息（仅自己在群里的信息）请求参数：userId 返回参数：groupMembers(List&lt;GroupMember&gt;)-群成员集合(仅有自己)
     * </pre>
     */
    public void listMemberGroups(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_MEMBER_GROUPS, responseObserver);
    }

    /**
     * <pre>
     *根据用户Id，得到所有加入的群ID集合（仅自己在群里的信息）
     * </pre>
     */
    public void listMemberGroupIds(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_MEMBER_GROUP_IDS, responseObserver);
    }

    /**
     * <pre>
     *统计群成员数 请求参数：groupId 返回参数：groupMemberCount(群成员数)
     * </pre>
     */
    public void countGroupMemberByGroupId(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COUNT_GROUP_MEMBER_BY_GROUP_ID, responseObserver);
    }

    /**
     * <pre>
     *redis中统计群成员数 请求参数：groupId 返回参数：groupMemberCount(群成员数)
     * </pre>
     */
    public void countGroupMemberFromRedis(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COUNT_GROUP_MEMBER_FROM_REDIS, responseObserver);
    }

    /**
     * <pre>
     *统计群成员数 请求参数：groupId 返回参数：groupMemberCount(群成员数)
     * </pre>
     */
    public void countGroupMemberByGroupIds(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COUNT_GROUP_MEMBER_BY_GROUP_IDS, responseObserver);
    }

    /**
     * <pre>
     *获取用户群组消息最大seqId 请求参数：userId 返回参数：memberMaxSeqMap(Map&lt;String,String&gt; key:groupId-&gt;value:SeqId)
     * </pre>
     */
    public void listMemberMaxSeq(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_MEMBER_MAX_SEQ, responseObserver);
    }

    /**
     * <pre>
     *获取成员所有加入的群组包含readSeqId,initSeqId,receiveSeqId 
     *请求参数：userId,clientId(10:ios/11:android/12:wp/20:pc/21:mac/22:ubuntu/23:linux/24:unix//30:Web/40:pad 默认为 0)
     *返回参数：groupMembers(List&lt;GroupMember&gt;)-群成员集合（仅自己，包含readSeqId,initSeqId,receiveSeqId ）
     * </pre>
     */
    public void listMemberSeq(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_MEMBER_SEQ, responseObserver);
    }

    /**
     * <pre>
     *设置是否群收藏 请求参数：userId,isCollection（是否设置群收藏：0-否，1-是）
     * </pre>
     */
    public void updateGroupCollection(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_GROUP_COLLECTION, responseObserver);
    }

    /**
     * <pre>
     *TODO 得到已经收藏的群 暂时删除-没有实现
     * </pre>
     */
    public void getCollectionGroups(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_COLLECTION_GROUPS, responseObserver);
    }

    /**
     * <pre>
     *批量、增量得到群成员 
     *请求参数：reqBatchGroupIdInfos( List&lt;ReqBatchGroupIdInfo&gt;)-需要（groupId，lastPullTimestamp,reqBatchGroupIdInfo,status）
     *返回参数：groupMemebers (List&lt;GroupMember&gt;)-群成员集合
     * </pre>
     */
    public void listGroupMembersByGroupIds(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_GROUP_MEMBERS_BY_GROUP_IDS, responseObserver);
    }

    /**
     * <pre>
     *批量、增量得到群成员映射Map(groupId-&gt;ResultCollection.groupMembers) 
     *请求参数：reqBatchGroupIdInfos( List&lt;ReqBatchGroupIdInfo&gt;)-需要（groupId，lastPullTimestamp,reqBatchGroupIdInfo,status）
     *返回参数：groupId2GroupMember (Map&lt;String,GroupMemberCollection&gt;-- key:groupId-&gt;GroupMemberCollection(包含的groupQuitMembers) ) 
     * </pre>
     */
    public void getGroupId2GroupMemberMap(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_GROUP_ID2GROUP_MEMBER_MAP, responseObserver);
    }

    /**
     * <pre>
     *得到所有收藏的群，仅用于同步 群收藏到群收藏的分表中
     * </pre>
     */
    public void getAllGroupCollections(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_GROUP_COLLECTIONS, responseObserver);
    }

    /**
     * <pre>
     *更新置顶
     * </pre>
     */
    public void updateStickie(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_STICKIE, responseObserver);
    }

    /**
     * <pre>
     *根据groupId集合得到group群成员列表信息
     * </pre>
     */
    public void getGroupMembersByUidAndGroupIds(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_GROUP_MEMBERS_BY_UID_AND_GROUP_IDS, responseObserver);
    }

    /**
     * <pre>
     *得到最早加入群的用户
     * </pre>
     */
    public void getEarliestAddGroupMember(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_EARLIEST_ADD_GROUP_MEMBER, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SAVE_GROUP_MEMBER,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_SAVE_GROUP_MEMBER)))
          .addMethod(
            METHOD_SAVE_BACTH_GROUP_MEMBERS,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_SAVE_BACTH_GROUP_MEMBERS)))
          .addMethod(
            METHOD_UPDATE_NICK_NAME,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_UPDATE_NICK_NAME)))
          .addMethod(
            METHOD_UPDATE_GROUP_NICKNAME,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_UPDATE_GROUP_NICKNAME)))
          .addMethod(
            METHOD_UPDATE_IDENTITY,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_UPDATE_IDENTITY)))
          .addMethod(
            METHOD_UPDATE_SHIELD,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_UPDATE_SHIELD)))
          .addMethod(
            METHOD_UPDATE_IS_TOP,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_UPDATE_IS_TOP)))
          .addMethod(
            METHOD_UPDATE_BACTH_STATUS,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_UPDATE_BACTH_STATUS)))
          .addMethod(
            METHOD_UPDATE_STATUS_DEL_BY_GROUP_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_UPDATE_STATUS_DEL_BY_GROUP_ID)))
          .addMethod(
            METHOD_DEL_GROUP_MEMBER_BY_USER_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_DEL_GROUP_MEMBER_BY_USER_ID)))
          .addMethod(
            METHOD_DEL_BATCH_GROUP_MEMBERS_BY_UIDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_DEL_BATCH_GROUP_MEMBERS_BY_UIDS)))
          .addMethod(
            METHOD_DEL_GROUP_ALL_MEMBER,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_DEL_GROUP_ALL_MEMBER)))
          .addMethod(
            METHOD_LIST_GROUP_MEMBERS,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_LIST_GROUP_MEMBERS)))
          .addMethod(
            METHOD_LIST_GROUP_MEMBERS_PAGE_BY_TIME_AND_STATUS,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_LIST_GROUP_MEMBERS_PAGE_BY_TIME_AND_STATUS)))
          .addMethod(
            METHOD_GET_GROUP_MEMBER_BY_UID,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_GET_GROUP_MEMBER_BY_UID)))
          .addMethod(
            METHOD_GET_GROUP_MEMBER_BY_UID_CONTAIN_STATUS,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_GET_GROUP_MEMBER_BY_UID_CONTAIN_STATUS)))
          .addMethod(
            METHOD_GET_GROUP_MEMBER_BY_UIDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_GET_GROUP_MEMBER_BY_UIDS)))
          .addMethod(
            METHOD_LIST_MEMBER_GROUPS,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_LIST_MEMBER_GROUPS)))
          .addMethod(
            METHOD_LIST_MEMBER_GROUP_IDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_LIST_MEMBER_GROUP_IDS)))
          .addMethod(
            METHOD_COUNT_GROUP_MEMBER_BY_GROUP_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_COUNT_GROUP_MEMBER_BY_GROUP_ID)))
          .addMethod(
            METHOD_COUNT_GROUP_MEMBER_FROM_REDIS,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_COUNT_GROUP_MEMBER_FROM_REDIS)))
          .addMethod(
            METHOD_COUNT_GROUP_MEMBER_BY_GROUP_IDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_COUNT_GROUP_MEMBER_BY_GROUP_IDS)))
          .addMethod(
            METHOD_LIST_MEMBER_MAX_SEQ,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_LIST_MEMBER_MAX_SEQ)))
          .addMethod(
            METHOD_LIST_MEMBER_SEQ,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_LIST_MEMBER_SEQ)))
          .addMethod(
            METHOD_UPDATE_GROUP_COLLECTION,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_UPDATE_GROUP_COLLECTION)))
          .addMethod(
            METHOD_GET_COLLECTION_GROUPS,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_GET_COLLECTION_GROUPS)))
          .addMethod(
            METHOD_LIST_GROUP_MEMBERS_BY_GROUP_IDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_LIST_GROUP_MEMBERS_BY_GROUP_IDS)))
          .addMethod(
            METHOD_GET_GROUP_ID2GROUP_MEMBER_MAP,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_GET_GROUP_ID2GROUP_MEMBER_MAP)))
          .addMethod(
            METHOD_GET_ALL_GROUP_COLLECTIONS,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_GET_ALL_GROUP_COLLECTIONS)))
          .addMethod(
            METHOD_UPDATE_STICKIE,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_UPDATE_STICKIE)))
          .addMethod(
            METHOD_GET_GROUP_MEMBERS_BY_UID_AND_GROUP_IDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_GET_GROUP_MEMBERS_BY_UID_AND_GROUP_IDS)))
          .addMethod(
            METHOD_GET_EARLIEST_ADD_GROUP_MEMBER,
            asyncUnaryCall(
              new MethodHandlers<
                com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember,
                com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>(
                  this, METHODID_GET_EARLIEST_ADD_GROUP_MEMBER)))
          .build();
    }
  }

  /**
   */
  public static final class GroupMemberSericeStub extends io.grpc.stub.AbstractStub<GroupMemberSericeStub> {
    private GroupMemberSericeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupMemberSericeStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupMemberSericeStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupMemberSericeStub(channel, callOptions);
    }

    /**
     * <pre>
     *保存群成员 请求参数：GroupMember,groupCreateId(群主ID),isSaveToRedis(需设置为true)
     * </pre>
     */
    public void saveGroupMember(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAVE_GROUP_MEMBER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *批量保存群成员信息 请求参数：groupMembers(List&lt;GroupMember&gt;),groupCreateId(群主ID),isSaveToRedis(需设置为true)
     * </pre>
     */
    public void saveBacthGroupMembers(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAVE_BACTH_GROUP_MEMBERS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *TODO 修改群成员信息的时候，因为0为有意义的，所以不能使用同一的修改方法 liuzhenhuan 20161020
     *修改成员昵称 请求参数：groupId,userId,nickName
     * </pre>
     */
    public void updateNickName(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_NICK_NAME, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *修改群昵称(群名片)请求参数：groupId,userId,groupNickname-群名片
     * </pre>
     */
    public void updateGroupNickname(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_GROUP_NICKNAME, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *修改成员身份 请求参数：groupId,userId,identity-（身份;0:普通成员,1:创建者,2:管理员）
     * </pre>
     */
    public void updateIdentity(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_IDENTITY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *修改屏蔽群消息状态 请求参数：groupId,userId,isShield-（是否屏蔽群消息 0:否  1:是）
     * </pre>
     */
    public void updateShield(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SHIELD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *修改群置顶状态（置顶做到了客户端，可忽略）请求参数：groupId,userId,isTop（是否置顶- 0:否  1:是）
     * </pre>
     */
    public void updateIsTop(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_IS_TOP, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *批量更新群成员状态信息 请求参数：groupId,memberIds(List&lt;Long&gt;)-群成员ID集合,status
     * </pre>
     */
    public void updateBacthStatus(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_BACTH_STATUS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *更新所有群成员状态为删除状态   请求参数：groupId,memberIds(List&lt;Long&gt;)-群成员ID集合,status
     * </pre>
     */
    public void updateStatusDelByGroupId(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_STATUS_DEL_BY_GROUP_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据 UserId删除群成员 请求参数：groupId,userId
     * </pre>
     */
    public void delGroupMemberByUserId(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DEL_GROUP_MEMBER_BY_USER_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据 userIds批量删除群成员 请求参数：groupId,memberIds(List&lt;Long&gt;)-群成员ID集合
     * </pre>
     */
    public void delBatchGroupMembersByUids(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DEL_BATCH_GROUP_MEMBERS_BY_UIDS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *删除所有群组成员 请求参数：groupId
     * </pre>
     */
    public void delGroupAllMember(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DEL_GROUP_ALL_MEMBER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取群内 所有已通过的成员关系 请求参数：groupId 返回参数：groupMembers(List&lt;GroupMember&gt;)-所有群成员集合
     * </pre>
     */
    public void listGroupMembers(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_GROUP_MEMBERS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据入群时间（大于） 和状态 获取群内 的成员集合 进行分页查询 
     *请求参数：groupId,time（入群时间）,status,page,size 返回参数：groupMembers(List&lt;GroupMember&gt;)-所有群成员集合
     * </pre>
     */
    public void listGroupMembersPageByTimeAndStatus(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_GROUP_MEMBERS_PAGE_BY_TIME_AND_STATUS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据UserId得到群成员 请求参数:groupId,userId
     * </pre>
     */
    public void getGroupMemberByUid(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_MEMBER_BY_UID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据UserId得到群成员 请求参数:groupId,userId 包含状态
     * </pre>
     */
    public void getGroupMemberByUidContainStatus(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_MEMBER_BY_UID_CONTAIN_STATUS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据UserIds得到群成员集合 请求参数：groupId,memberIds(List&lt;Long&gt;)-群成员ID 返回参数：groupMembers(List&lt;GroupMember&gt;)-群成员集合
     * </pre>
     */
    public void getGroupMemberByUids(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_MEMBER_BY_UIDS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据用户Id，得到所有加入的群的信息（仅自己在群里的信息）请求参数：userId 返回参数：groupMembers(List&lt;GroupMember&gt;)-群成员集合(仅有自己)
     * </pre>
     */
    public void listMemberGroups(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_MEMBER_GROUPS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据用户Id，得到所有加入的群ID集合（仅自己在群里的信息）
     * </pre>
     */
    public void listMemberGroupIds(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_MEMBER_GROUP_IDS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *统计群成员数 请求参数：groupId 返回参数：groupMemberCount(群成员数)
     * </pre>
     */
    public void countGroupMemberByGroupId(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COUNT_GROUP_MEMBER_BY_GROUP_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *redis中统计群成员数 请求参数：groupId 返回参数：groupMemberCount(群成员数)
     * </pre>
     */
    public void countGroupMemberFromRedis(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COUNT_GROUP_MEMBER_FROM_REDIS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *统计群成员数 请求参数：groupId 返回参数：groupMemberCount(群成员数)
     * </pre>
     */
    public void countGroupMemberByGroupIds(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COUNT_GROUP_MEMBER_BY_GROUP_IDS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取用户群组消息最大seqId 请求参数：userId 返回参数：memberMaxSeqMap(Map&lt;String,String&gt; key:groupId-&gt;value:SeqId)
     * </pre>
     */
    public void listMemberMaxSeq(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_MEMBER_MAX_SEQ, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取成员所有加入的群组包含readSeqId,initSeqId,receiveSeqId 
     *请求参数：userId,clientId(10:ios/11:android/12:wp/20:pc/21:mac/22:ubuntu/23:linux/24:unix//30:Web/40:pad 默认为 0)
     *返回参数：groupMembers(List&lt;GroupMember&gt;)-群成员集合（仅自己，包含readSeqId,initSeqId,receiveSeqId ）
     * </pre>
     */
    public void listMemberSeq(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_MEMBER_SEQ, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *设置是否群收藏 请求参数：userId,isCollection（是否设置群收藏：0-否，1-是）
     * </pre>
     */
    public void updateGroupCollection(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_GROUP_COLLECTION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *TODO 得到已经收藏的群 暂时删除-没有实现
     * </pre>
     */
    public void getCollectionGroups(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_COLLECTION_GROUPS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *批量、增量得到群成员 
     *请求参数：reqBatchGroupIdInfos( List&lt;ReqBatchGroupIdInfo&gt;)-需要（groupId，lastPullTimestamp,reqBatchGroupIdInfo,status）
     *返回参数：groupMemebers (List&lt;GroupMember&gt;)-群成员集合
     * </pre>
     */
    public void listGroupMembersByGroupIds(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_GROUP_MEMBERS_BY_GROUP_IDS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *批量、增量得到群成员映射Map(groupId-&gt;ResultCollection.groupMembers) 
     *请求参数：reqBatchGroupIdInfos( List&lt;ReqBatchGroupIdInfo&gt;)-需要（groupId，lastPullTimestamp,reqBatchGroupIdInfo,status）
     *返回参数：groupId2GroupMember (Map&lt;String,GroupMemberCollection&gt;-- key:groupId-&gt;GroupMemberCollection(包含的groupQuitMembers) ) 
     * </pre>
     */
    public void getGroupId2GroupMemberMap(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_ID2GROUP_MEMBER_MAP, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *得到所有收藏的群，仅用于同步 群收藏到群收藏的分表中
     * </pre>
     */
    public void getAllGroupCollections(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_GROUP_COLLECTIONS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *更新置顶
     * </pre>
     */
    public void updateStickie(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_STICKIE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据groupId集合得到group群成员列表信息
     * </pre>
     */
    public void getGroupMembersByUidAndGroupIds(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_MEMBERS_BY_UID_AND_GROUP_IDS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *得到最早加入群的用户
     * </pre>
     */
    public void getEarliestAddGroupMember(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request,
        io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_EARLIEST_ADD_GROUP_MEMBER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GroupMemberSericeBlockingStub extends io.grpc.stub.AbstractStub<GroupMemberSericeBlockingStub> {
    private GroupMemberSericeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupMemberSericeBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupMemberSericeBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupMemberSericeBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *保存群成员 请求参数：GroupMember,groupCreateId(群主ID),isSaveToRedis(需设置为true)
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember saveGroupMember(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAVE_GROUP_MEMBER, getCallOptions(), request);
    }

    /**
     * <pre>
     *批量保存群成员信息 请求参数：groupMembers(List&lt;GroupMember&gt;),groupCreateId(群主ID),isSaveToRedis(需设置为true)
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember saveBacthGroupMembers(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAVE_BACTH_GROUP_MEMBERS, getCallOptions(), request);
    }

    /**
     * <pre>
     *TODO 修改群成员信息的时候，因为0为有意义的，所以不能使用同一的修改方法 liuzhenhuan 20161020
     *修改成员昵称 请求参数：groupId,userId,nickName
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember updateNickName(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_NICK_NAME, getCallOptions(), request);
    }

    /**
     * <pre>
     *修改群昵称(群名片)请求参数：groupId,userId,groupNickname-群名片
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember updateGroupNickname(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_GROUP_NICKNAME, getCallOptions(), request);
    }

    /**
     * <pre>
     *修改成员身份 请求参数：groupId,userId,identity-（身份;0:普通成员,1:创建者,2:管理员）
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember updateIdentity(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_IDENTITY, getCallOptions(), request);
    }

    /**
     * <pre>
     *修改屏蔽群消息状态 请求参数：groupId,userId,isShield-（是否屏蔽群消息 0:否  1:是）
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember updateShield(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_SHIELD, getCallOptions(), request);
    }

    /**
     * <pre>
     *修改群置顶状态（置顶做到了客户端，可忽略）请求参数：groupId,userId,isTop（是否置顶- 0:否  1:是）
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember updateIsTop(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_IS_TOP, getCallOptions(), request);
    }

    /**
     * <pre>
     *批量更新群成员状态信息 请求参数：groupId,memberIds(List&lt;Long&gt;)-群成员ID集合,status
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember updateBacthStatus(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_BACTH_STATUS, getCallOptions(), request);
    }

    /**
     * <pre>
     *更新所有群成员状态为删除状态   请求参数：groupId,memberIds(List&lt;Long&gt;)-群成员ID集合,status
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember updateStatusDelByGroupId(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_STATUS_DEL_BY_GROUP_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据 UserId删除群成员 请求参数：groupId,userId
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember delGroupMemberByUserId(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DEL_GROUP_MEMBER_BY_USER_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据 userIds批量删除群成员 请求参数：groupId,memberIds(List&lt;Long&gt;)-群成员ID集合
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember delBatchGroupMembersByUids(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DEL_BATCH_GROUP_MEMBERS_BY_UIDS, getCallOptions(), request);
    }

    /**
     * <pre>
     *删除所有群组成员 请求参数：groupId
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember delGroupAllMember(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DEL_GROUP_ALL_MEMBER, getCallOptions(), request);
    }

    /**
     * <pre>
     *获取群内 所有已通过的成员关系 请求参数：groupId 返回参数：groupMembers(List&lt;GroupMember&gt;)-所有群成员集合
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember listGroupMembers(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_GROUP_MEMBERS, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据入群时间（大于） 和状态 获取群内 的成员集合 进行分页查询 
     *请求参数：groupId,time（入群时间）,status,page,size 返回参数：groupMembers(List&lt;GroupMember&gt;)-所有群成员集合
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember listGroupMembersPageByTimeAndStatus(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_GROUP_MEMBERS_PAGE_BY_TIME_AND_STATUS, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据UserId得到群成员 请求参数:groupId,userId
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember getGroupMemberByUid(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_GROUP_MEMBER_BY_UID, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据UserId得到群成员 请求参数:groupId,userId 包含状态
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember getGroupMemberByUidContainStatus(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_GROUP_MEMBER_BY_UID_CONTAIN_STATUS, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据UserIds得到群成员集合 请求参数：groupId,memberIds(List&lt;Long&gt;)-群成员ID 返回参数：groupMembers(List&lt;GroupMember&gt;)-群成员集合
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember getGroupMemberByUids(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_GROUP_MEMBER_BY_UIDS, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据用户Id，得到所有加入的群的信息（仅自己在群里的信息）请求参数：userId 返回参数：groupMembers(List&lt;GroupMember&gt;)-群成员集合(仅有自己)
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember listMemberGroups(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_MEMBER_GROUPS, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据用户Id，得到所有加入的群ID集合（仅自己在群里的信息）
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember listMemberGroupIds(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_MEMBER_GROUP_IDS, getCallOptions(), request);
    }

    /**
     * <pre>
     *统计群成员数 请求参数：groupId 返回参数：groupMemberCount(群成员数)
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember countGroupMemberByGroupId(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COUNT_GROUP_MEMBER_BY_GROUP_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     *redis中统计群成员数 请求参数：groupId 返回参数：groupMemberCount(群成员数)
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember countGroupMemberFromRedis(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COUNT_GROUP_MEMBER_FROM_REDIS, getCallOptions(), request);
    }

    /**
     * <pre>
     *统计群成员数 请求参数：groupId 返回参数：groupMemberCount(群成员数)
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember countGroupMemberByGroupIds(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COUNT_GROUP_MEMBER_BY_GROUP_IDS, getCallOptions(), request);
    }

    /**
     * <pre>
     *获取用户群组消息最大seqId 请求参数：userId 返回参数：memberMaxSeqMap(Map&lt;String,String&gt; key:groupId-&gt;value:SeqId)
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember listMemberMaxSeq(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_MEMBER_MAX_SEQ, getCallOptions(), request);
    }

    /**
     * <pre>
     *获取成员所有加入的群组包含readSeqId,initSeqId,receiveSeqId 
     *请求参数：userId,clientId(10:ios/11:android/12:wp/20:pc/21:mac/22:ubuntu/23:linux/24:unix//30:Web/40:pad 默认为 0)
     *返回参数：groupMembers(List&lt;GroupMember&gt;)-群成员集合（仅自己，包含readSeqId,initSeqId,receiveSeqId ）
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember listMemberSeq(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_MEMBER_SEQ, getCallOptions(), request);
    }

    /**
     * <pre>
     *设置是否群收藏 请求参数：userId,isCollection（是否设置群收藏：0-否，1-是）
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember updateGroupCollection(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_GROUP_COLLECTION, getCallOptions(), request);
    }

    /**
     * <pre>
     *TODO 得到已经收藏的群 暂时删除-没有实现
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember getCollectionGroups(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_COLLECTION_GROUPS, getCallOptions(), request);
    }

    /**
     * <pre>
     *批量、增量得到群成员 
     *请求参数：reqBatchGroupIdInfos( List&lt;ReqBatchGroupIdInfo&gt;)-需要（groupId，lastPullTimestamp,reqBatchGroupIdInfo,status）
     *返回参数：groupMemebers (List&lt;GroupMember&gt;)-群成员集合
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember listGroupMembersByGroupIds(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_GROUP_MEMBERS_BY_GROUP_IDS, getCallOptions(), request);
    }

    /**
     * <pre>
     *批量、增量得到群成员映射Map(groupId-&gt;ResultCollection.groupMembers) 
     *请求参数：reqBatchGroupIdInfos( List&lt;ReqBatchGroupIdInfo&gt;)-需要（groupId，lastPullTimestamp,reqBatchGroupIdInfo,status）
     *返回参数：groupId2GroupMember (Map&lt;String,GroupMemberCollection&gt;-- key:groupId-&gt;GroupMemberCollection(包含的groupQuitMembers) ) 
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember getGroupId2GroupMemberMap(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_GROUP_ID2GROUP_MEMBER_MAP, getCallOptions(), request);
    }

    /**
     * <pre>
     *得到所有收藏的群，仅用于同步 群收藏到群收藏的分表中
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember getAllGroupCollections(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_GROUP_COLLECTIONS, getCallOptions(), request);
    }

    /**
     * <pre>
     *更新置顶
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember updateStickie(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_STICKIE, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据groupId集合得到group群成员列表信息
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember getGroupMembersByUidAndGroupIds(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_GROUP_MEMBERS_BY_UID_AND_GROUP_IDS, getCallOptions(), request);
    }

    /**
     * <pre>
     *得到最早加入群的用户
     * </pre>
     */
    public com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember getEarliestAddGroupMember(com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_EARLIEST_ADD_GROUP_MEMBER, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GroupMemberSericeFutureStub extends io.grpc.stub.AbstractStub<GroupMemberSericeFutureStub> {
    private GroupMemberSericeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupMemberSericeFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupMemberSericeFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupMemberSericeFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *保存群成员 请求参数：GroupMember,groupCreateId(群主ID),isSaveToRedis(需设置为true)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> saveGroupMember(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAVE_GROUP_MEMBER, getCallOptions()), request);
    }

    /**
     * <pre>
     *批量保存群成员信息 请求参数：groupMembers(List&lt;GroupMember&gt;),groupCreateId(群主ID),isSaveToRedis(需设置为true)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> saveBacthGroupMembers(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAVE_BACTH_GROUP_MEMBERS, getCallOptions()), request);
    }

    /**
     * <pre>
     *TODO 修改群成员信息的时候，因为0为有意义的，所以不能使用同一的修改方法 liuzhenhuan 20161020
     *修改成员昵称 请求参数：groupId,userId,nickName
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> updateNickName(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_NICK_NAME, getCallOptions()), request);
    }

    /**
     * <pre>
     *修改群昵称(群名片)请求参数：groupId,userId,groupNickname-群名片
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> updateGroupNickname(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_GROUP_NICKNAME, getCallOptions()), request);
    }

    /**
     * <pre>
     *修改成员身份 请求参数：groupId,userId,identity-（身份;0:普通成员,1:创建者,2:管理员）
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> updateIdentity(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_IDENTITY, getCallOptions()), request);
    }

    /**
     * <pre>
     *修改屏蔽群消息状态 请求参数：groupId,userId,isShield-（是否屏蔽群消息 0:否  1:是）
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> updateShield(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SHIELD, getCallOptions()), request);
    }

    /**
     * <pre>
     *修改群置顶状态（置顶做到了客户端，可忽略）请求参数：groupId,userId,isTop（是否置顶- 0:否  1:是）
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> updateIsTop(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_IS_TOP, getCallOptions()), request);
    }

    /**
     * <pre>
     *批量更新群成员状态信息 请求参数：groupId,memberIds(List&lt;Long&gt;)-群成员ID集合,status
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> updateBacthStatus(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_BACTH_STATUS, getCallOptions()), request);
    }

    /**
     * <pre>
     *更新所有群成员状态为删除状态   请求参数：groupId,memberIds(List&lt;Long&gt;)-群成员ID集合,status
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> updateStatusDelByGroupId(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_STATUS_DEL_BY_GROUP_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据 UserId删除群成员 请求参数：groupId,userId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> delGroupMemberByUserId(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DEL_GROUP_MEMBER_BY_USER_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据 userIds批量删除群成员 请求参数：groupId,memberIds(List&lt;Long&gt;)-群成员ID集合
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> delBatchGroupMembersByUids(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DEL_BATCH_GROUP_MEMBERS_BY_UIDS, getCallOptions()), request);
    }

    /**
     * <pre>
     *删除所有群组成员 请求参数：groupId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> delGroupAllMember(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DEL_GROUP_ALL_MEMBER, getCallOptions()), request);
    }

    /**
     * <pre>
     *获取群内 所有已通过的成员关系 请求参数：groupId 返回参数：groupMembers(List&lt;GroupMember&gt;)-所有群成员集合
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> listGroupMembers(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_GROUP_MEMBERS, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据入群时间（大于） 和状态 获取群内 的成员集合 进行分页查询 
     *请求参数：groupId,time（入群时间）,status,page,size 返回参数：groupMembers(List&lt;GroupMember&gt;)-所有群成员集合
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> listGroupMembersPageByTimeAndStatus(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_GROUP_MEMBERS_PAGE_BY_TIME_AND_STATUS, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据UserId得到群成员 请求参数:groupId,userId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> getGroupMemberByUid(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_MEMBER_BY_UID, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据UserId得到群成员 请求参数:groupId,userId 包含状态
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> getGroupMemberByUidContainStatus(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_MEMBER_BY_UID_CONTAIN_STATUS, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据UserIds得到群成员集合 请求参数：groupId,memberIds(List&lt;Long&gt;)-群成员ID 返回参数：groupMembers(List&lt;GroupMember&gt;)-群成员集合
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> getGroupMemberByUids(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_MEMBER_BY_UIDS, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据用户Id，得到所有加入的群的信息（仅自己在群里的信息）请求参数：userId 返回参数：groupMembers(List&lt;GroupMember&gt;)-群成员集合(仅有自己)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> listMemberGroups(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_MEMBER_GROUPS, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据用户Id，得到所有加入的群ID集合（仅自己在群里的信息）
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> listMemberGroupIds(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_MEMBER_GROUP_IDS, getCallOptions()), request);
    }

    /**
     * <pre>
     *统计群成员数 请求参数：groupId 返回参数：groupMemberCount(群成员数)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> countGroupMemberByGroupId(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COUNT_GROUP_MEMBER_BY_GROUP_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     *redis中统计群成员数 请求参数：groupId 返回参数：groupMemberCount(群成员数)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> countGroupMemberFromRedis(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COUNT_GROUP_MEMBER_FROM_REDIS, getCallOptions()), request);
    }

    /**
     * <pre>
     *统计群成员数 请求参数：groupId 返回参数：groupMemberCount(群成员数)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> countGroupMemberByGroupIds(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COUNT_GROUP_MEMBER_BY_GROUP_IDS, getCallOptions()), request);
    }

    /**
     * <pre>
     *获取用户群组消息最大seqId 请求参数：userId 返回参数：memberMaxSeqMap(Map&lt;String,String&gt; key:groupId-&gt;value:SeqId)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> listMemberMaxSeq(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_MEMBER_MAX_SEQ, getCallOptions()), request);
    }

    /**
     * <pre>
     *获取成员所有加入的群组包含readSeqId,initSeqId,receiveSeqId 
     *请求参数：userId,clientId(10:ios/11:android/12:wp/20:pc/21:mac/22:ubuntu/23:linux/24:unix//30:Web/40:pad 默认为 0)
     *返回参数：groupMembers(List&lt;GroupMember&gt;)-群成员集合（仅自己，包含readSeqId,initSeqId,receiveSeqId ）
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> listMemberSeq(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_MEMBER_SEQ, getCallOptions()), request);
    }

    /**
     * <pre>
     *设置是否群收藏 请求参数：userId,isCollection（是否设置群收藏：0-否，1-是）
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> updateGroupCollection(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_GROUP_COLLECTION, getCallOptions()), request);
    }

    /**
     * <pre>
     *TODO 得到已经收藏的群 暂时删除-没有实现
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> getCollectionGroups(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_COLLECTION_GROUPS, getCallOptions()), request);
    }

    /**
     * <pre>
     *批量、增量得到群成员 
     *请求参数：reqBatchGroupIdInfos( List&lt;ReqBatchGroupIdInfo&gt;)-需要（groupId，lastPullTimestamp,reqBatchGroupIdInfo,status）
     *返回参数：groupMemebers (List&lt;GroupMember&gt;)-群成员集合
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> listGroupMembersByGroupIds(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_GROUP_MEMBERS_BY_GROUP_IDS, getCallOptions()), request);
    }

    /**
     * <pre>
     *批量、增量得到群成员映射Map(groupId-&gt;ResultCollection.groupMembers) 
     *请求参数：reqBatchGroupIdInfos( List&lt;ReqBatchGroupIdInfo&gt;)-需要（groupId，lastPullTimestamp,reqBatchGroupIdInfo,status）
     *返回参数：groupId2GroupMember (Map&lt;String,GroupMemberCollection&gt;-- key:groupId-&gt;GroupMemberCollection(包含的groupQuitMembers) ) 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> getGroupId2GroupMemberMap(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_ID2GROUP_MEMBER_MAP, getCallOptions()), request);
    }

    /**
     * <pre>
     *得到所有收藏的群，仅用于同步 群收藏到群收藏的分表中
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> getAllGroupCollections(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_GROUP_COLLECTIONS, getCallOptions()), request);
    }

    /**
     * <pre>
     *更新置顶
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> updateStickie(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_STICKIE, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据groupId集合得到group群成员列表信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> getGroupMembersByUidAndGroupIds(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP_MEMBERS_BY_UID_AND_GROUP_IDS, getCallOptions()), request);
    }

    /**
     * <pre>
     *得到最早加入群的用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember> getEarliestAddGroupMember(
        com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_EARLIEST_ADD_GROUP_MEMBER, getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_GROUP_MEMBER = 0;
  private static final int METHODID_SAVE_BACTH_GROUP_MEMBERS = 1;
  private static final int METHODID_UPDATE_NICK_NAME = 2;
  private static final int METHODID_UPDATE_GROUP_NICKNAME = 3;
  private static final int METHODID_UPDATE_IDENTITY = 4;
  private static final int METHODID_UPDATE_SHIELD = 5;
  private static final int METHODID_UPDATE_IS_TOP = 6;
  private static final int METHODID_UPDATE_BACTH_STATUS = 7;
  private static final int METHODID_UPDATE_STATUS_DEL_BY_GROUP_ID = 8;
  private static final int METHODID_DEL_GROUP_MEMBER_BY_USER_ID = 9;
  private static final int METHODID_DEL_BATCH_GROUP_MEMBERS_BY_UIDS = 10;
  private static final int METHODID_DEL_GROUP_ALL_MEMBER = 11;
  private static final int METHODID_LIST_GROUP_MEMBERS = 12;
  private static final int METHODID_LIST_GROUP_MEMBERS_PAGE_BY_TIME_AND_STATUS = 13;
  private static final int METHODID_GET_GROUP_MEMBER_BY_UID = 14;
  private static final int METHODID_GET_GROUP_MEMBER_BY_UID_CONTAIN_STATUS = 15;
  private static final int METHODID_GET_GROUP_MEMBER_BY_UIDS = 16;
  private static final int METHODID_LIST_MEMBER_GROUPS = 17;
  private static final int METHODID_LIST_MEMBER_GROUP_IDS = 18;
  private static final int METHODID_COUNT_GROUP_MEMBER_BY_GROUP_ID = 19;
  private static final int METHODID_COUNT_GROUP_MEMBER_FROM_REDIS = 20;
  private static final int METHODID_COUNT_GROUP_MEMBER_BY_GROUP_IDS = 21;
  private static final int METHODID_LIST_MEMBER_MAX_SEQ = 22;
  private static final int METHODID_LIST_MEMBER_SEQ = 23;
  private static final int METHODID_UPDATE_GROUP_COLLECTION = 24;
  private static final int METHODID_GET_COLLECTION_GROUPS = 25;
  private static final int METHODID_LIST_GROUP_MEMBERS_BY_GROUP_IDS = 26;
  private static final int METHODID_GET_GROUP_ID2GROUP_MEMBER_MAP = 27;
  private static final int METHODID_GET_ALL_GROUP_COLLECTIONS = 28;
  private static final int METHODID_UPDATE_STICKIE = 29;
  private static final int METHODID_GET_GROUP_MEMBERS_BY_UID_AND_GROUP_IDS = 30;
  private static final int METHODID_GET_EARLIEST_ADD_GROUP_MEMBER = 31;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GroupMemberSericeImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(GroupMemberSericeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_GROUP_MEMBER:
          serviceImpl.saveGroupMember((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_SAVE_BACTH_GROUP_MEMBERS:
          serviceImpl.saveBacthGroupMembers((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_UPDATE_NICK_NAME:
          serviceImpl.updateNickName((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP_NICKNAME:
          serviceImpl.updateGroupNickname((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_UPDATE_IDENTITY:
          serviceImpl.updateIdentity((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_UPDATE_SHIELD:
          serviceImpl.updateShield((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_UPDATE_IS_TOP:
          serviceImpl.updateIsTop((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_UPDATE_BACTH_STATUS:
          serviceImpl.updateBacthStatus((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_UPDATE_STATUS_DEL_BY_GROUP_ID:
          serviceImpl.updateStatusDelByGroupId((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_DEL_GROUP_MEMBER_BY_USER_ID:
          serviceImpl.delGroupMemberByUserId((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_DEL_BATCH_GROUP_MEMBERS_BY_UIDS:
          serviceImpl.delBatchGroupMembersByUids((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_DEL_GROUP_ALL_MEMBER:
          serviceImpl.delGroupAllMember((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_LIST_GROUP_MEMBERS:
          serviceImpl.listGroupMembers((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_LIST_GROUP_MEMBERS_PAGE_BY_TIME_AND_STATUS:
          serviceImpl.listGroupMembersPageByTimeAndStatus((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_GET_GROUP_MEMBER_BY_UID:
          serviceImpl.getGroupMemberByUid((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_GET_GROUP_MEMBER_BY_UID_CONTAIN_STATUS:
          serviceImpl.getGroupMemberByUidContainStatus((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_GET_GROUP_MEMBER_BY_UIDS:
          serviceImpl.getGroupMemberByUids((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_LIST_MEMBER_GROUPS:
          serviceImpl.listMemberGroups((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_LIST_MEMBER_GROUP_IDS:
          serviceImpl.listMemberGroupIds((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_COUNT_GROUP_MEMBER_BY_GROUP_ID:
          serviceImpl.countGroupMemberByGroupId((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_COUNT_GROUP_MEMBER_FROM_REDIS:
          serviceImpl.countGroupMemberFromRedis((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_COUNT_GROUP_MEMBER_BY_GROUP_IDS:
          serviceImpl.countGroupMemberByGroupIds((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_LIST_MEMBER_MAX_SEQ:
          serviceImpl.listMemberMaxSeq((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_LIST_MEMBER_SEQ:
          serviceImpl.listMemberSeq((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP_COLLECTION:
          serviceImpl.updateGroupCollection((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_GET_COLLECTION_GROUPS:
          serviceImpl.getCollectionGroups((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_LIST_GROUP_MEMBERS_BY_GROUP_IDS:
          serviceImpl.listGroupMembersByGroupIds((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_GET_GROUP_ID2GROUP_MEMBER_MAP:
          serviceImpl.getGroupId2GroupMemberMap((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_GET_ALL_GROUP_COLLECTIONS:
          serviceImpl.getAllGroupCollections((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_UPDATE_STICKIE:
          serviceImpl.updateStickie((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_GET_GROUP_MEMBERS_BY_UID_AND_GROUP_IDS:
          serviceImpl.getGroupMembersByUidAndGroupIds((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
          break;
        case METHODID_GET_EARLIEST_ADD_GROUP_MEMBER:
          serviceImpl.getEarliestAddGroupMember((com.gomeplus.grpc.protobuf.GroupMemberServices.RequestGroupMember) request,
              (io.grpc.stub.StreamObserver<com.gomeplus.grpc.protobuf.GroupMemberServices.RespnoseGroupMember>) responseObserver);
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
        METHOD_SAVE_GROUP_MEMBER,
        METHOD_SAVE_BACTH_GROUP_MEMBERS,
        METHOD_UPDATE_NICK_NAME,
        METHOD_UPDATE_GROUP_NICKNAME,
        METHOD_UPDATE_IDENTITY,
        METHOD_UPDATE_SHIELD,
        METHOD_UPDATE_IS_TOP,
        METHOD_UPDATE_BACTH_STATUS,
        METHOD_UPDATE_STATUS_DEL_BY_GROUP_ID,
        METHOD_DEL_GROUP_MEMBER_BY_USER_ID,
        METHOD_DEL_BATCH_GROUP_MEMBERS_BY_UIDS,
        METHOD_DEL_GROUP_ALL_MEMBER,
        METHOD_LIST_GROUP_MEMBERS,
        METHOD_LIST_GROUP_MEMBERS_PAGE_BY_TIME_AND_STATUS,
        METHOD_GET_GROUP_MEMBER_BY_UID,
        METHOD_GET_GROUP_MEMBER_BY_UID_CONTAIN_STATUS,
        METHOD_GET_GROUP_MEMBER_BY_UIDS,
        METHOD_LIST_MEMBER_GROUPS,
        METHOD_LIST_MEMBER_GROUP_IDS,
        METHOD_COUNT_GROUP_MEMBER_BY_GROUP_ID,
        METHOD_COUNT_GROUP_MEMBER_FROM_REDIS,
        METHOD_COUNT_GROUP_MEMBER_BY_GROUP_IDS,
        METHOD_LIST_MEMBER_MAX_SEQ,
        METHOD_LIST_MEMBER_SEQ,
        METHOD_UPDATE_GROUP_COLLECTION,
        METHOD_GET_COLLECTION_GROUPS,
        METHOD_LIST_GROUP_MEMBERS_BY_GROUP_IDS,
        METHOD_GET_GROUP_ID2GROUP_MEMBER_MAP,
        METHOD_GET_ALL_GROUP_COLLECTIONS,
        METHOD_UPDATE_STICKIE,
        METHOD_GET_GROUP_MEMBERS_BY_UID_AND_GROUP_IDS,
        METHOD_GET_EARLIEST_ADD_GROUP_MEMBER);
  }

}
