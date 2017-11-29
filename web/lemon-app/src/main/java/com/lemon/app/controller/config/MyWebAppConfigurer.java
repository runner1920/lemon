package com.lemon.app.controller.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.lemon.app.controller.handler.AppAuthorizationHandler;

/**
 * 添加拦截器
 * @author jiangqk
 * @data 2017年11月29日 下午4:19:25
 */
@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new AppAuthorizationHandler()).addPathPatterns("/**");
		super.addInterceptors(registry);
		
	}
}
