package com.lemon.service.impl;

import org.springframework.stereotype.Service;

import com.lemon.common.service.UserService;

/**
 * 
 * @author jiangqk
 * @data 2017年8月31日 上午11:04:39
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public String testDubbo() {
		return "test success";
	}
	
}
