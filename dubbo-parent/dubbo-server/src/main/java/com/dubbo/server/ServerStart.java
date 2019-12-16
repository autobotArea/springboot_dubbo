package com.dubbo.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo-server.xml")
@MapperScan(value = "com.dubbo.mapper")
public class ServerStart {
    public static void main(String[] args) {
        SpringApplication.run(ServerStart.class);
    }
}
