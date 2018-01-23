package com.rpc.registry.zookeeper;

/**
 * 常量
 *
 * @author beautifulhao
 * @since 1.0.0
 */
public interface Constant {

    //zk 会话超时时间
    int ZK_SESSION_TIMEOUT = 5000;
    //zk 连接超时时间
    int ZK_CONNECTION_TIMEOUT = 1000;
    //zk 根节点地址
    String ZK_REGISTRY_PATH = "/registry";
}