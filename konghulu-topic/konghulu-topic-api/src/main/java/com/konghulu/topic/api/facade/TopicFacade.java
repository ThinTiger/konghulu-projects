package com.konghulu.topic.api.facade;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "konghulu-topic-server")
public interface TopicFacade {

    @RequestMapping("/getTopicUserName")
    String getTopicUserName(Integer id);
}
