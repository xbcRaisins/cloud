package com.xbc.cloud.xbceureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class XbcEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(XbcEurekaApplication.class, args);
    }

}
