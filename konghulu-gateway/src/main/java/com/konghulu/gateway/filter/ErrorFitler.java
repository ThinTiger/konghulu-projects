package com.konghulu.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.ERROR_TYPE;

public class ErrorFitler extends ZuulFilter {

    @Override
    public String filterType() {
	return ERROR_TYPE;
    }

    @Override
    public int filterOrder() {
	return 0;
    }

    @Override
    public boolean shouldFilter() {
	return false;
    }

    @Override
    public Object run() throws ZuulException {
	RequestContext ctx = RequestContext.getCurrentContext();
	System.out.println("body:" + ctx.getResponseBody());
	return null;
    }
}
