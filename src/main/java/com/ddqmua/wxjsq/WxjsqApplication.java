package com.ddqmua.wxjsq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.ddqmua.wxjsq.mapper")
@SpringBootApplication
public class WxjsqApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxjsqApplication.class, args);
    }

}
