package com.konghulu.topic.core.facade;

import com.konghulu.topic.api.facade.TopicFacade;
import com.konghulu.user.api.facade.UserFacade;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TopicDefaultFacade implements TopicFacade {

    @Resource
    UserFacade userFacade;

    @Override
    public String getTopicUserName(Integer id) {
	return userFacade.getById(id).getName();
    }
}
