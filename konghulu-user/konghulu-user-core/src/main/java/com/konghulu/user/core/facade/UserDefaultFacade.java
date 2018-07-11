package com.konghulu.user.core.facade;

import com.konghulu.user.api.dto.UserRes;
import com.konghulu.user.api.facade.UserFacade;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDefaultFacade implements UserFacade {

    @Override
    public UserRes getById(Integer id) {
        System.out.println("process in!~");
	UserRes userRes = new UserRes();
	userRes.setId(1);
	userRes.setName("test one!~");
	return userRes;
    }

    @Override
    public String test() {
	return "123!~";
    }
}
