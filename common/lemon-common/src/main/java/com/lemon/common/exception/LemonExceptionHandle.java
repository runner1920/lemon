package com.lemon.common.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.lemon.common.util.R;

/**
 * 异常处理器
 * @author jiangqk
 * @data 2018年1月16日 下午4:18:33
 */
@RestControllerAdvice
public class LemonExceptionHandle {
	
	private static final Logger logger = LoggerFactory.getLogger(LemonExceptionHandle.class);
	
	/**
	 * 处理自定义异常
	 */
	@ExceptionHandler(LemonException.class)
	public R handleRRException(LemonException e){
		return R.error(e.getCode(), e.getMessage());
	}
	
	/**
	 * 处理未知异常
	 * @param e
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	public R handleException(Exception e){
		logger.error(e.getMessage(), e);
		return R.error();
	}
}
