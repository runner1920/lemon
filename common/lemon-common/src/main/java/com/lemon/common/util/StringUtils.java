package com.lemon.common.util;

/**
 * 字符串工具类
 * @author jiangqk
 * @data 2017年12月7日 下午3:31:59
 */
public class StringUtils {
	
	public static boolean isEmpty(String str) {
		return (str == null || "".equals(str.trim()));
	}
	
	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}
}
