package com.gomeplus.service;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gomeplus.grpc.protobuf.UserRpcServices;
import com.gomeplus.grpc.protobuf.UserRpcServices.RequestUser.Builder;
import com.gomeplus.grpc.protobuf.UserRpcServices.ResponseUser;
import com.gomeplus.grpc.protobuf.UserServiceGrpc;
import com.gomeplus.rpc.global.Global;
import com.gomeplus.rpc.router.DispatcherBalanceRouter;

/**
 * Created by wangshikai on 17/1/24.
 */
public class UserService {
	private static Logger logger = LoggerFactory.getLogger(UserService.class);
    /**
     *  获取用户token
     * @param appId
     * @param userId 用户ID
     * @param clientType 客户端类型 ： 1- mobile(IOS、Android) , 2-PC , 3-Web ,4-Pad 默认为1
     * @return
     */
    public static String getUserToken(int appId, long userId,int clientType) {
    	UserServiceGrpc.UserServiceBlockingStub serviceBlockingStub=UserServiceGrpc.newBlockingStub(DispatcherBalanceRouter.getRouterChannel(UserServiceGrpc.class.getSimpleName()))
				.withDeadlineAfter(Global.RPC_TIME_OUT, TimeUnit.SECONDS);
		Builder builder = UserRpcServices.RequestUser.newBuilder();
		long traceId=System.nanoTime();
		logger.info("getUserToken appId:{},userId:{},clientType:{},traceId:{}",appId,userId,clientType,traceId);
		builder.setTraceId(traceId);
		builder.setAppId(String.valueOf(appId));
		builder.setUserId(userId);
		builder.setClientType(clientType);

		ResponseUser responseUser = serviceBlockingStub.getToken(builder.build());
		String token = responseUser.getToken();
		boolean isSuccess = responseUser.getSuccess();
		long rspTraceId = responseUser.getTraceId();
		logger.info("getUserToken appId:{},userId:{},rspTraceId:{},clientType:{},token:{},isSuccess:{}",appId,userId,rspTraceId,clientType,token,isSuccess);
		return token;
    }

    /**
     * 检测用户token是否有效
     * @param appId
     * @param userId
     * @param userToken 用户登录Token
     * @param clientType 客户端类型 ： 1- mobile(IOS、Android) , 2-PC , 3-Web ,4-Pad 默认为1
     * @return
     */
    public static boolean checkUserToken(int appId, long userId, String userToken,int clientType) {
    	UserServiceGrpc.UserServiceBlockingStub serviceBlockingStub=UserServiceGrpc.newBlockingStub(DispatcherBalanceRouter.getRouterChannel(UserServiceGrpc.class.getSimpleName()))
				.withDeadlineAfter(Global.RPC_TIME_OUT, TimeUnit.SECONDS);
		Builder builder = UserRpcServices.RequestUser.newBuilder();
		long traceId = System.nanoTime();
		logger.info("checkUserToken appId:{},userId:{},traceId:{}",appId,userId,traceId);
		builder.setTraceId(traceId);
		builder.setAppId(appId+"");
		builder.setUserId(userId);
		builder.setToken(userToken);
		builder.setClientType(clientType);

		ResponseUser responseUser = serviceBlockingStub.checkUserToken(builder.build());
		String token = responseUser.getToken();
		boolean isSuccess = responseUser.getSuccess();
		long rspTraceId = responseUser.getTraceId();
		boolean isVaild = responseUser.getIsVaild();
		String extra = responseUser.getExtra();
		logger.info("checkUserToken appId:{},userId:{},rspTraceId:{},token:{},isSuccess:{},isVaild:{},extra:{}",appId,userId,rspTraceId,token,isSuccess,isVaild,extra);
        return isVaild;
    }
    
    
    /**
     *得到pushToken
     * @param appId
     * @param userId 用户ID
     * @return
     */
    public static String getPushToken(int appId, long userId) {
    	UserServiceGrpc.UserServiceBlockingStub serviceBlockingStub=UserServiceGrpc.newBlockingStub(DispatcherBalanceRouter.getRouterChannel(UserServiceGrpc.class.getSimpleName()))
    			.withDeadlineAfter(Global.RPC_TIME_OUT, TimeUnit.SECONDS);
    	Builder builder = UserRpcServices.RequestUser.newBuilder();
    	long traceId = System.nanoTime();
    	logger.info("getPushToken appId:{},userId:{},traceId:{}",appId,userId,traceId);
    	builder.setTraceId(traceId);
    	builder.setAppId(appId+"");
    	builder.setUserId(userId);
    	
    	ResponseUser responseUser = serviceBlockingStub.getPushToken(builder.build());
    	String pushToken = responseUser.getToken();
    	
    	boolean isSuccess = responseUser.getSuccess();
    	long rspTraceId = responseUser.getTraceId();
    	String extra = responseUser.getExtra();
    	logger.info("getPushToken appId:{},userId:{},rspTraceId:{},token:{},isSuccess:{},extra:{}",appId,userId,rspTraceId,pushToken,isSuccess,extra);
    	return pushToken;
    }
    
    /**
     *设置pushToken
     * @param appId
     * @param userId 用户ID
     * @param pushToken 
     * @return
     */
    public static String setPushToken(int appId, long userId,String pushToken,int manufacture) {
    	UserServiceGrpc.UserServiceBlockingStub serviceBlockingStub=UserServiceGrpc.newBlockingStub(DispatcherBalanceRouter.getRouterChannel(UserServiceGrpc.class.getSimpleName()))
    			.withDeadlineAfter(Global.RPC_TIME_OUT, TimeUnit.SECONDS);
    	Builder builder = UserRpcServices.RequestUser.newBuilder();
    	long traceId = System.nanoTime();
    	logger.info("setPushToken appId:{},userId:{},pushToken:{},traceId:{},manufacture:{}",appId,userId,pushToken,traceId,manufacture);
    	builder.setTraceId(traceId);
    	builder.setAppId(appId+"");
    	builder.setUserId(userId);
    	builder.setToken(pushToken);
    	builder.setManufacture(manufacture);
    	
    	ResponseUser responseUser = serviceBlockingStub.setPushToken(builder.build());
    	
    	boolean isSuccess = responseUser.getSuccess();
    	long rspTraceId = responseUser.getTraceId();
    	String extra = responseUser.getExtra();
    	logger.info("setPushToken appId:{},userId:{},pushToken:{},rspTraceId:{},isSuccess:{},extar:{},manufacture:{}",appId,userId,pushToken,rspTraceId,isSuccess,extra,manufacture);
    	return pushToken;
    }
    
    /**
     *是否开启消息免打扰
     * @param appId
     * @param userId 用户ID
     * @param groupId 群ID 
     * @return
     */
    public static boolean getIsMsgBlocked(int appId, long userId,String groupId) {
    	UserServiceGrpc.UserServiceBlockingStub serviceBlockingStub=UserServiceGrpc.newBlockingStub(DispatcherBalanceRouter.getRouterChannel(UserServiceGrpc.class.getSimpleName()))
    			.withDeadlineAfter(Global.RPC_TIME_OUT, TimeUnit.SECONDS);
    	Builder builder = UserRpcServices.RequestUser.newBuilder();
    	long traceId = System.nanoTime();
    	logger.info("getIsMsgBlocked appId:{},userId:{},groupId:{},traceId:{}",appId,userId,groupId,traceId);
    	builder.setTraceId(traceId);
    	builder.setAppId(appId+"");
    	builder.setUserId(userId);
    	builder.setGroupId(groupId);
    	
    	ResponseUser responseUser = serviceBlockingStub.getIsMsgBlocked(builder.build());
    	boolean isMsgBlocked = responseUser.getIsMsgBlocked();
    	boolean isSuccess = responseUser.getSuccess();
    	long rspTraceId = responseUser.getTraceId();
    	String extra = responseUser.getExtra();
    	logger.info("getIsMsgBlocked appId:{},userId:{},groupId:{},traceId:{},isMsgBlocked:{},isSuccess:{},extra:{}",appId,userId,groupId,rspTraceId,isMsgBlocked,isSuccess,extra);
    	return isMsgBlocked;
    }
    
    /**
     * push计数加1
     * @param appId
     * @param userId 用户ID
     * @param pushToken
     * @return
     */
    public static long incPushCount(int appId, long userId,String pushToken) {
    	UserServiceGrpc.UserServiceBlockingStub serviceBlockingStub=UserServiceGrpc.newBlockingStub(DispatcherBalanceRouter.getRouterChannel(UserServiceGrpc.class.getSimpleName()))
    			.withDeadlineAfter(Global.RPC_TIME_OUT, TimeUnit.SECONDS);
    	Builder builder = UserRpcServices.RequestUser.newBuilder();
    	long traceId = System.nanoTime();
    	logger.info("incPushCount appId:{},userId:{},pushToken:{},traceId:{}",appId,userId,pushToken,traceId);
    	builder.setTraceId(traceId);
    	builder.setAppId(appId+"");
    	builder.setUserId(userId);
    	builder.setToken(pushToken);
    	
    	ResponseUser responseUser = serviceBlockingStub.incPushCount(builder.build());
    	long pushCount = responseUser.getPushCount();
    	boolean isSuccess = responseUser.getSuccess();
    	long rspTraceId = responseUser.getTraceId();
    	
    	String extra = responseUser.getExtra();
    	logger.info("incPushCount appId:{},userId:{},pushToken:{},rspTraceId:{},pushCount:{},isSuccess:{},extra:{}",appId,userId,pushToken,rspTraceId,pushCount,isSuccess,extra);
    	return pushCount;
    }
    /**
     *清除push计数
     * @param appId
     * @param userId 用户ID
     * @param pushToken
     * @return
     */
    public static long cleanPushCount(int appId, long userId,String pushToken) {
    	UserServiceGrpc.UserServiceBlockingStub serviceBlockingStub=UserServiceGrpc.newBlockingStub(DispatcherBalanceRouter.getRouterChannel(UserServiceGrpc.class.getSimpleName()))
    			.withDeadlineAfter(Global.RPC_TIME_OUT, TimeUnit.SECONDS);
    	Builder builder = UserRpcServices.RequestUser.newBuilder();
    	long traceId = System.nanoTime();
    	logger.info("cleanPushCount appId:{},userId:{},pushToken:{},traceId:{}",appId,userId,pushToken,traceId);
    	builder.setTraceId(traceId);
    	builder.setAppId(appId+"");
    	builder.setUserId(userId);
    	builder.setToken(pushToken);
    	
    	ResponseUser responseUser = serviceBlockingStub.cleanPushCount(builder.build());
    	long pushCount = responseUser.getPushCount();
    	boolean isSuccess = responseUser.getSuccess();
    	long rspTraceId = responseUser.getTraceId();
    	
    	String extra = responseUser.getExtra();
    	logger.info("cleanPushCount appId:{},userId:{},pushToken:{},rspTraceId:{},pushCount:{},isSuccess:{},extra:{}",appId,userId,pushToken,rspTraceId,pushCount,isSuccess,extra);
    	return pushCount;
    }
    
    
    
    
}






































