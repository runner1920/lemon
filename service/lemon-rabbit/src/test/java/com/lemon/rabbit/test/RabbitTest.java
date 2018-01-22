package com.lemon.rabbit.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lemon.rabbit.RabbitApplication;
import com.lemon.rabbit.mq.Sender;

/**
 * 
 * @author jiangqk
 * @data 2018年1月18日 下午5:24:06
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RabbitApplication.class)
public class RabbitTest {
	
	@Autowired
    private Sender sender;

    @Test
    public void hello() throws Exception {
        sender.send();
    }
}
