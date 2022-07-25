package com.liuxn.springcloudeureka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("******************************************************************************************");
        System.out.println("******************       注册中心 已启动            *****************************************");
        System.out.println("******************************************************************************************");
    }
}
