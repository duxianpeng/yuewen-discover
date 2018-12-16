package com.yuewen.discover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by peng on 2017/5/26.
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoverApplication {
    public static void main(String[] args){
        SpringApplication.run(DiscoverApplication.class, args);
    }
}
