package com.gomeplus.rpc.global;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by wangshikai on 2016/7/18.
 */
public class Global {
    private static Logger LOG = LoggerFactory.getLogger(Global.class);

    public static String ZK_IP_PORT;

    public static String ZK_PATH;

    //rpc channel 连接池大小
    public static int CHANNEL_POOL_SIZE = 8;
    /** RPC调用超时时间 */
	public static final int RPC_TIME_OUT=30;

    static {
        int poolSize = 0;
        try {
            String confFile = "rpc.properties";
            Properties conf = loadProperties(confFile);
            if(conf == null){
                conf = loadProperties("/"+confFile);
            }
            ZK_IP_PORT = conf.getProperty("zkIpPort");
            ZK_PATH = conf.getProperty("zkPath");
            poolSize = Integer.parseInt(conf.getProperty("poolSize"));
        } catch (Exception e) {
            //e.printStackTrace();
            LOG.error("error:{},conf not found!",e);
        }
        if(poolSize <= 0 || poolSize > 16){
            poolSize = 8;
        }
        CHANNEL_POOL_SIZE = poolSize;
    }

    /**
     * 请求类型
     */
    public static enum REQUEST_TYPE {

        REPORT(1),          // 汇报IM服务资源
        GET_RESOURCES(2),   // 获取IM服务资源

        RPC_REPORT(3),      //汇报RPC服务资源
        RPC_PULL(4);        //拉取RPC服务资源

        public int value;
        private REQUEST_TYPE(int value) {
            this.value = value;
        }
    }


    /**
     * 汇报的服务器类型
     */
    public static enum SERVER_TYPE {

        GATEWAY(1), // 接入
        LOGIC(2), // 逻辑
        API(3), // api
        FILE(4), // 文件
        ALL(5),  //全部
        RPC(6);  //RPC服务类型

        public int value;

        private SERVER_TYPE(int value) {
            this.value = value;
        }
    }

    public static Properties loadProperties(String fileName) {
        Properties properties = new Properties();
        try {
            InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
            properties.load(in); //载入文件
            in.close();
            return properties;
        } catch (IOException e) {
            //e.printStackTrace();
            LOG.error("error:{}",e);
            return null;
        }
    }

}
