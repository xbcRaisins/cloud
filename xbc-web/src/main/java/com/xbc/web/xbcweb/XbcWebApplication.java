package com.xbc.web.xbcweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class XbcWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(XbcWebApplication.class, args);
    }

}
