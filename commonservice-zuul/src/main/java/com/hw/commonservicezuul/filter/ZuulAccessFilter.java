package com.hw.commonservicezuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Description ZUUL 服务过滤 安全认证
 * @Author hw
 * @Date 2019/3/19 14:29
 * @Version 1.0
 */
@Component
@Slf4j
public class ZuulAccessFilter extends ZuulFilter {


    @Override
    public String filterType() {
        /**
         * 返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
         *     pre：路由之前
         *     routing：路由之时
         *     post： 路由之后
         *     error：发送错误调用
         */
        return "pre";
    }

    @Override
    public int filterOrder() {
        /**
         * 过滤的顺序
         */
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        /**
         * 这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
         */
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        /**
         * 过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
         */
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        String token = request.getParameter("token");
        if (token == null) {
            log.warn("token is empty!");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty!");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        log.info("Token verification success");
        return null;
    }
}
