package com.lemon.product.test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.lemon.order.OrderApplication;

/**
 * 
 * @author jiangqk
 * @data 2018年1月16日 下午5:20:29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = OrderApplication.class)
@WebAppConfiguration
public class MockTest {

}
