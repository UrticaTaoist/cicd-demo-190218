package cn.luutqf.cicd.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: ZhenYang
 * @date: 2019/2/18
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CicdDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(CicdDemoApplication.class, args);
    }
}