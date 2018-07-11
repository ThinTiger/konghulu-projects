package com.konghulu.user.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.konghulu.**.facade"})
@ComponentScan("com.konghulu.**")
public class KonghuluUserApplication {

    public static void main(String[] args){
	SpringApplication.run(KonghuluUserApplication.class, args);
    }
}
