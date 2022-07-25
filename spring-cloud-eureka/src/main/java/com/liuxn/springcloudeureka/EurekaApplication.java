package com.liuxn.springcloudeureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@Slf4j
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        log.info("******************************************************************************************");
        log.info("******************       注册中心 已启动            ****************************************");
        log.info("******************************************************************************************");
    }
}
