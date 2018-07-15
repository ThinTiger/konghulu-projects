package com.konghulu.gateway.config;

import com.konghulu.gateway.filter.AuthFilter;
import com.konghulu.gateway.filter.ErrorFitler;
import com.konghulu.gateway.filter.ResponseFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public AuthFilter authFilter() {
	return new AuthFilter();
    }

    @Bean
    public ResponseFilter responseFilter() {
	return new ResponseFilter();
    }

    @Bean
    public ErrorFitler errorFitler(){
        return new ErrorFitler();
    }
}
