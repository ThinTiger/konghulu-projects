package com.konghulu.gateway.controller;

import com.konghulu.user.api.dto.UserRes;
import com.konghulu.user.api.facade.UserFacade;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    UserFacade userFacade;

    @RequestMapping("/getUser")
    public UserRes getUser(Integer id) {
	return userFacade.getById(id);
    }
}
