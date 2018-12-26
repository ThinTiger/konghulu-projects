package com.konghulu.topic.core.facade;

import com.konghulu.topic.api.facade.TopicFacade;
import com.konghulu.topic.core.provider.UserFacadeProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TopicDefaultFacade implements TopicFacade {

    @Autowired
    UserFacadeProvider userFacade;

    @Override
    public String getTopicUserName(Integer id) {
        return userFacade.getById(id).getName();
    }
}
