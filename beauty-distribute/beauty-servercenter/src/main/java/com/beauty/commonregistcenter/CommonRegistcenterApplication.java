package com.beauty.commonregistcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yufw
 */
@EnableEurekaServer
@SpringBootApplication
public class CommonRegistcenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonRegistcenterApplication.class, args);
    }

}
