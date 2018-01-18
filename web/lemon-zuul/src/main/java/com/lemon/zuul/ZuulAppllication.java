package com.lemon.zuul;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.lemon.zuul.filter.TokenFilter;

/**
 * 
 * @author jiangqk
 * @data 2018年1月18日 下午3:51:43
 */
@EnableZuulProxy
@SpringCloudApplication
public class ZuulAppllication {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(ZuulAppllication.class).web(true).run(args);
	}
	
	@Bean
	public TokenFilter tokenFilter() {
		return new TokenFilter();
	}
}
