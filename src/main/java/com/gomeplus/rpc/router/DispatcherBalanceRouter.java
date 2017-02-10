package com.gomeplus.rpc.router;

import com.gomeplus.rpc.dispatcher.DispatcherService;
import com.gomeplus.rpc.global.Global;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by wangshikai on 2016/11/14.
 */
public class DispatcherBalanceRouter {
    private static Logger LOG = LoggerFactory.getLogger(DispatcherBalanceRouter.class);

    /**
     * map<cmd,treemap<权重区间值,serverIpPort>>
     */
    public static ConcurrentHashMap<String, TreeMap<Double, String>> SERVER_MAP = new ConcurrentHashMap<>();

    /**
     * map<serverIpPort,channel>
     */
    public static ConcurrentHashMap<String, ConcurrentHashMap<Integer, ManagedChannel>> CHANNEL_MAP = new ConcurrentHashMap<>();

    private DispatcherBalanceRouter() {
    }

    /**
     *
     * @param zkIpPort  zk地址
     * @param zkPath    zk路径
     */
    public static void init(final String zkIpPort, final String zkPath) {
        Executors.newSingleThreadExecutor().execute(new Runnable() {
            @Override
            public void run() {
                DispatcherService.INSTANCE.init(zkIpPort, zkPath);
            }
        });
    }

    public static void init() {
        Executors.newSingleThreadExecutor().execute(new Runnable() {
            @Override
            public void run() {
                DispatcherService.INSTANCE.init(Global.ZK_IP_PORT, Global.ZK_PATH);
            }
        });
    }

    public static ManagedChannel getRouterChannel(String rpcServerCmd) {
        TreeMap<Double, String> treeMap = SERVER_MAP.get(rpcServerCmd);
        double bingo = router(treeMap);
        String ipPort = treeMap.get(bingo);
        LOG.info("bingo:{},ipPort:{}", bingo, ipPort);
        ConcurrentHashMap<Integer, ManagedChannel> channelMap = CHANNEL_MAP.get(ipPort);
        int seed = getSeed(channelMap);
        ManagedChannel channel = channelMap.get(seed);
        if (channel == null || channel.isShutdown() || channel.isTerminated()) {
            try {
                channel = ManagedChannelBuilder.forAddress(ipPort.split(":")[0], Integer.parseInt(ipPort.split(":")[1])).usePlaintext(true).build();
                channelMap.put(seed, channel);
            } catch (Exception e) {
                channelMap.remove(seed);
                LOG.error("create channel error:{}", e);
            }
        }
        return channel;
    }

    private static int getSeed(ConcurrentHashMap<Integer, ManagedChannel> channelMap) {
        Random random = new Random();
        int size = channelMap.size();
        return random.nextInt(size);
    }

    private static double router(TreeMap<Double, String> treeMap) {
        double seed = treeMap.lastKey() * Math.random();
        double bingo = treeMap.tailMap(seed, false).firstKey();
        return bingo;
    }

    public void shutdown(ManagedChannel channel, int timeoutSecs) {
        if (channel == null) {
            LOG.error("channel is null");
            return;
        }
        try {
            channel.shutdown().awaitTermination(timeoutSecs, TimeUnit.SECONDS);
        } catch (Exception e) {
            LOG.error("channel shutdown error exception", e);
        }
    }


}
