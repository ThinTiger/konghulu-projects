package com.konghulu.gateway.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableZuulProxy
@EnableFeignClients("com.konghulu.**.facade")
@ComponentScan({"com.konghulu.**"})
public class KonghuluGatewayApplication {

    public static void main(String[] args){
        SpringApplication.run(KonghuluGatewayApplication.class);
    }
}
