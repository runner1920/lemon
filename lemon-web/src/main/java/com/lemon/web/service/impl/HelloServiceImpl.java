package com.lemon.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lemon.common.service.UserService;
import com.lemon.web.service.HelloService;

/**
 * 
 * @author jiangqk
 * @data 2017年8月30日 下午6:13:06
 */
@Service
public class HelloServiceImpl implements HelloService {
	
	@Autowired
	public UserService userService;

	@Override
	public String sysHello() {
		if (userService==null) {
			System.out.println("注入失败");
			return "注入失败";
		}
		return userService.testDubbo();
	}
	
}
