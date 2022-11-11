package com.hnlx.gatewayserver.config;

/**
 * description : 路由类配置
 * @author : Pikachudy
 * @date : 2022/11/10 19:46
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    public static final long DEFAULT_TIMEOUT = 30000;

    public static String NACOS_SERVER_ADDR;

    public static String NACOS_NAMESPACE;

    public static String NACOS_ROUTE_DATA_ID;

    public static String NACOS_ROUTE_GROUP;

    @Value("${spring.cloud.nacos.discovery.server-addr}")
    public void setNacosServerAddr(String nacosServerAddr){
        NACOS_SERVER_ADDR = nacosServerAddr;
    }

    @Value("${spring.cloud.nacos.config.namespace}")
    public void setNacosNamespace(String nacosNamespace){
        NACOS_NAMESPACE = nacosNamespace;
    }

    @Value("${spring.cloud.nacos.config.name}")
    public void setNacosRouteDataId(String nacosRouteDataId){
        NACOS_ROUTE_DATA_ID = nacosRouteDataId;
    }

    @Value("${spring.cloud.nacos.config.group}")
    public void setNacosRouteGroup(String nacosRouteGroup){
        NACOS_ROUTE_GROUP = nacosRouteGroup;
    }

}
