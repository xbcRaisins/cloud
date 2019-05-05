package com.xbc.cloud.xbcsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.xbc.cloud.xbcsystem.dao"})
public class XbcSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(XbcSystemApplication.class, args);
    }

}
