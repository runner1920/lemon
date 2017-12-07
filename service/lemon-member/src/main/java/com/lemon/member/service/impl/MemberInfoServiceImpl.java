package com.lemon.member.service.impl;

import org.springframework.stereotype.Service;

import com.lemon.api.member.MemberInfoService;

/**
 * 
 * @author jiangqk
 * @data 2017年11月29日 下午4:26:57
 */
@Service
public class MemberInfoServiceImpl implements MemberInfoService {

	@Override
	public String registerMemberInfo() {
		return "终于成功了";
	}
	
}
