package com.lemon.rabbit.mq;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author jiangqk
 * @data 2018年1月18日 下午5:20:35
 */
@Component
public class Sender {
	
	 @Autowired
	 private AmqpTemplate rabbitTemplate;
	 
	 public void send() {
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }
}
