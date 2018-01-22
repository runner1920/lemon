package com.lemon.rabbit.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 
 * @author jiangqk
 * @data 2018年1月18日 下午5:21:28
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {
	
	@RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver : " + hello);
    }
}
