package org.lemon.common.test;

import org.junit.Test;

import com.lemon.common.util.http.HttpUtil;

/**
 * 
 * @author jiangqk
 * @data 2017年12月7日 下午3:47:40
 */
public class HttpUtilTest {
	
	@Test
	public void execute() {
		System.out.println(HttpUtil.httpRequest("https://kyfw.12306.cn/", "GET", null));
	}
	
	@Test
	public void execute2() {
		System.out.println(HttpUtil.httpsRequest("https://kyfw.12306.cn/", "GET", null));
	}
}
