package com.jeff.bootproject.config;

import com.jeff.bootproject.config.interceptor.AuthInterceptors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author jeff
 * <p>Date 2018/3/15 9:52</p>
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    private AuthInterceptors authInterceptors;

    @Autowired
    public WebConfig(AuthInterceptors authInterceptors) {
        this.authInterceptors = authInterceptors;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authInterceptors).addPathPatterns("/**");
    }


}
