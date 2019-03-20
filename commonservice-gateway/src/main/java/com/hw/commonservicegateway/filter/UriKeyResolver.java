package com.hw.commonservicegateway.filter;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Description TODO
 * @Author hw
 * @Date 2019/3/20 19:34
 * @Version 1.0
 */
public class UriKeyResolver implements KeyResolver {
//    根据uri去限流，这时KeyResolver代码如下
    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {

        return Mono.just(exchange.getRequest().getURI().getPath());
    }

    @Bean
    public UriKeyResolver uriKeyResolver() {
        return new UriKeyResolver();
    }
}
