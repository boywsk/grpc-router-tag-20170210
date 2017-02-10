package com.gomeplus.rpc.router;

import io.grpc.ManagedChannel;

/**
 * Created by wangshikai on 2016/11/14.
 */
public class Demo {
    public static void main(String[] args) {
        //DispatcherBalanceRouter 初始化
        DispatcherBalanceRouter.init("10.125.3.31:2181", "/im-dispatcher");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ManagedChannel channel = DispatcherBalanceRouter.getRouterChannel("GetUserTestServiceGrpc");
        if(channel == null){
            System.out.println("failed");
        }else{
            System.out.println("success");
        }
    }
}
