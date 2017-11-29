package com.lemon.service.mq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

/**
 * 
 * @author jiangqk
 * @data 2017年9月1日 下午5:27:01
 */
@Service
public class Consumer {
	
	@JmsListener(destination = "service.queue")
	@SendTo("out.queue")
    public String receiveQueue(String text) {
        System.out.println("service收到的报文为:"+text);
        return "success";
    }
	
	
}

