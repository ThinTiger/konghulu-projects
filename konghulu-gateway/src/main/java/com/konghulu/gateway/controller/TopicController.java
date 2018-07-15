package com.konghulu.gateway.controller;

import com.konghulu.topic.api.facade.TopicFacade;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TopicController {

    @Resource
    TopicFacade topicFacade;

    @RequestMapping("/getTopicUserName")
    public String getTopicUserName(Integer id) {
	return topicFacade.getTopicUserName(id);
    }
}
