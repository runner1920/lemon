package com.lemon.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lemon.member.client.OrderClient;
import com.lemon.member.service.impl.MemberServiceImpl;

/**
 * 
 * @author jiangqk
 * @data 2018年1月5日 下午4:07:02
 */
@RestController
public class MemberController {
	
	@Autowired
	private OrderClient orderClient;
	
	@Autowired
	private MemberServiceImpl memberServiceImpl;
	
	@GetMapping("/dc")
	public String execute() {
		return orderClient.consumer();
	}
	
	@GetMapping("/dc2")
	public String execute2() {
		return memberServiceImpl.consumer();
	}
	
	@GetMapping("/member")
	public String execute3() {
		return "member success";
	}
}
