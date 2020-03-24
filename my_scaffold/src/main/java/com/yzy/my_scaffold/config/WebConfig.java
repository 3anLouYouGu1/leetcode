package com.yzy.my_scaffold.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author YangZhenYuan
 * @Date 2020/3/1 17:48
 * @Version 1.0
 * @Describe
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加登录处理拦截器，拦截所有请求，登录请求除外
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(new MyAdapter());
        //排除配置
        interceptorRegistration.excludePathPatterns("/sys/login.json");
        interceptorRegistration.excludePathPatterns("/charts/**");
        interceptorRegistration.excludePathPatterns("/css/**");
        interceptorRegistration.excludePathPatterns("/easyUi/**");
        interceptorRegistration.excludePathPatterns("/flashPlayer/**");
        interceptorRegistration.excludePathPatterns("/font/**");
        interceptorRegistration.excludePathPatterns("/images/**");
        interceptorRegistration.excludePathPatterns("/js/**");
        interceptorRegistration.excludePathPatterns("/pages/**");
        interceptorRegistration.excludePathPatterns("/plugin/**");
        interceptorRegistration.excludePathPatterns("/index.html");
        interceptorRegistration.excludePathPatterns("/show.html");
        //配置拦截策略
        interceptorRegistration.addPathPatterns("/**");

    }


}