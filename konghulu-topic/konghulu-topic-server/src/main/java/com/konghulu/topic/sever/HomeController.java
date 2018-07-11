package com.konghulu.topic.sever;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class HomeController {

    @RequestMapping("index")
    public String Index(){
        return "123!~";
    }
}
