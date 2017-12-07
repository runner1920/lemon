package com.lemon.app.controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@Autowired
    private DiscoveryClient client;
	
	@RequestMapping("/login")
	public R loginMember() {
//		System.out.println(memberInfoService.registerMemberInfo());
		return R.ok();
	}
	
	 @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer r = a + b;
        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }
}
