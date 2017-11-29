package com.lemon.app.controller.member;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lemon.common.controller.BaseController;
import com.lemon.common.util.R;

/**
 * 
 * @author jiangqk
 * @data 2017年11月29日 下午4:02:34
 */
@RequestMapping("/member")
@RestController
public class MemberController extends BaseController {
	
	
	@RequestMapping("/login")
	public R loginMember() {
		return R.ok();
	}
}
