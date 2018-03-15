package com.jeff.bootproject.config.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jeff
 * <p>Date 2018/3/15 10:22</p>
 */
@Slf4j
@Component
public class AuthInterceptors extends HandlerInterceptorAdapter{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        log.info("==========拦截实现===============");
        return true;
    }
}
