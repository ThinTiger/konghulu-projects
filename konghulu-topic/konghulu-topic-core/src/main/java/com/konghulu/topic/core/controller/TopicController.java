package com.konghulu.topic.core.controller;

import com.konghulu.user.api.dto.UserRes;
import com.konghulu.user.api.facade.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("topic")
public class TopicController {

    @Autowired
    private UserFacade userFacade;

    @RequestMapping("/getTopicUserName")
    public String getTopicUserName(Integer id){
        UserRes userRes = userFacade.getById(1);

        return userRes.getName();
    }
}
