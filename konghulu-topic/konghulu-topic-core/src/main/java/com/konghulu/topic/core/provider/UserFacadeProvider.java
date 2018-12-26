package com.konghulu.topic.core.provider;

import com.konghulu.user.api.facade.UserFacade;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author: za-lining
 * @date: 2018/12/26
 **/
@FeignClient(value = "konghulu-user-server")
public interface UserFacadeProvider extends UserFacade {
}
