package cn.luutqf.cicd.gateway;

import cn.luutqf.cicd.common.gateway.annotation.EnableDynamicRoute;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @Author: ZhenYang
 * @date: 2019/2/18
 * @description:
 */
@SpringCloudApplication
@EnableDynamicRoute
public class CicdGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(CicdGatewayApplication.class, args);
    }
}