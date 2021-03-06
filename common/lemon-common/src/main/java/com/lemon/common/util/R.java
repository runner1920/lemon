package com.lemon.common.util;

import java.util.HashMap;
import java.util.Map;

import com.lemon.common.enums.RetEnum;

/**
 * 
 * @author jiangqk
 * @data 2017年11月29日 下午3:47:17
 */
public class R extends HashMap<String, Object> {
	
	private static final long serialVersionUID = 1L;
	
	public R() {
		put("code", RetEnum.RETURN_0.getCode());
		put("msg", RetEnum.RETURN_0.getMsg());
	}
	
	public static R error() {
		return error(RetEnum.RETURN_500.getCode(), RetEnum.RETURN_500.getMsg());
	}
	
	public static R error(String msg) {
		return error(500, msg);
	}
	
	public static R error(int code, String msg) {
		R r = new R();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

	public static R ok(String msg) {
		R r = new R();
		r.put("msg", msg);
		return r;
	}
	
	public static R ok(Map<String, Object> map) {
		R r = new R();
		r.putAll(map);
		return r;
	}
	
	public static R ok() {
		return new R();
	}

	public R put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
