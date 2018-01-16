package com.lemon.common.enums;

/**
 * 返回值
 * @author jiangqk
 * @data 2018年1月16日 下午4:39:31
 */
public enum RetEnum {
	
	RETURN_0 (0, "ok"),
	
	
	RETURN_500 (500, "未知异常");
	
	/**
	 * 返回代码
	 */
	private int code;
	
	/**
	 * 返回描述
	 */
	private String msg;
	
	RetEnum(int code,String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
