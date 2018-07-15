package com.konghulu.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.POST_TYPE;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.SEND_RESPONSE_FILTER_ORDER;

public class ResponseFilter extends ZuulFilter {

    @Override
    public String filterType() {
	return POST_TYPE;
    }

    @Override
    public int filterOrder() {
	return SEND_RESPONSE_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
	return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("response Filter!~");
	return null;
    }
}
