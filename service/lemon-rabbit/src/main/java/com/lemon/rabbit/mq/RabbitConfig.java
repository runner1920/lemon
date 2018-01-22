package com.lemon.rabbit.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author jiangqk
 * @data 2018年1月18日 下午5:22:20
 */
@Configuration
public class RabbitConfig {
	
	@Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }
	
}
