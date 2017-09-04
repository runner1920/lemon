package com.lemon.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lemon.common.service.LogService;
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
	
	@Autowired
	private LogService logService;
	
	@RequestMapping("/sys")
	public String sys() {
//		UserDO user = new UserDO();
//		user.setUsername("test3");
//		userService.save(user);
		return userService.listUser(1, 10).getTotal()+logService.testDubbo();
	}
}
