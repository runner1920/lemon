package com.lemon.sys.test.mq;

import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lemon.sys.mq.Producer;

/**
 * 
 * @author jiangqk
 * @data 2017年9月1日 下午5:04:45
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MqTest {
	@Autowired  
    private Producer producer;  
      
    @Test  
    public void contextLoads() throws InterruptedException {  
        Destination destination = new ActiveMQQueue("service.queue");  
          
        for(int i=0; i<100; i++){  
            producer.sendMessage(destination, "myname is chhliu!!!");  
        }  
    }  
}
