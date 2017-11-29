package com.lemon.sys.controller.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lemon.common.model.sys.SysUser;
import com.lemon.sys.controller.AbstractController;
import com.lemon.sys.service.SysUserService;

/**
 * 管理用户
 * @author jiangqk
 * @data 2017年11月29日 下午3:16:53
 */
@RestController
@RequestMapping("/sys/user")
public class SysUserController extends AbstractController {
	
	@Autowired
	private SysUserService sysUserService;
	
	@RequestMapping("/hello")
	public String helloWorld() {
		SysUser user = new SysUser();
		user.setUsername("admin");
		sysUserService.save(user);
		return "成功";
	}
}
