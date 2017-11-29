package com.lemon.task.service;

import org.joda.time.DateTime;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 
 * @author jiangqk
 * @data 2017年9月4日 上午11:25:41
 */
@Component
public class TaskDemo {
	
	@Scheduled(fixedRate = 1000*60)
	public void printCurrentTime() {
		System.out.println("当前时间："+DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
	}
}
