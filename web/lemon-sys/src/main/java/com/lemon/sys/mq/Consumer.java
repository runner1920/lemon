package com.lemon.sys.mq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * 
 * @author jiangqk
 * @data 2017年9月1日 下午5:03:27
 */
@Service
public class Consumer {
	
	@JmsListener(destination = "mytest.queue")
    public void receiveQueue(String text) {
        System.out.println("Consumer收到的报文为:"+text);  
    }
	
	
}
