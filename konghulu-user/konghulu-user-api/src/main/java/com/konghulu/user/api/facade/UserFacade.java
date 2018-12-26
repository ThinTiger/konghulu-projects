package com.konghulu.user.api.facade;

import com.konghulu.user.api.dto.UserRes;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public interface UserFacade {

    @RequestMapping("/getById")
    UserRes getById(@RequestParam("id") Integer id);

    @RequestMapping("/test")
    String test();
}
