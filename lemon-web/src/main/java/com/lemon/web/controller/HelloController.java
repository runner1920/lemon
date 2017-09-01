package com.lemon.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lemon.common.service.UserService;

/**
 * 
 * @author jiangqk
 * @data 2017年8月30日 下午5:15:36
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/sys")
	public String sys() {
		return userService.testDubbo();
	}
}
