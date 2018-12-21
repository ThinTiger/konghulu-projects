package com.konghulu.registry.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: za-lining
 * @date: 2018/12/21
 **/
@RestController
public class Home {

    @Value("${konghulu.helloStr}")
    private String helloStr;

    @RequestMapping("/home/configLoad")
    public String configLoad(){

        return helloStr;
    }
}
