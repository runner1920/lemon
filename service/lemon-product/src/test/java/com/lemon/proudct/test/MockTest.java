package com.lemon.proudct.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.alibaba.fastjson.JSON;
import com.lemon.product.ProductApplication;

/**
 * 
 * @author jiangqk
 * @data 2018年1月16日 下午5:23:41
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = ProductApplication.class)
public class MockTest {
	
	@Autowired
    private WebApplicationContext context;
    
	private MockMvc mockMvc;
	
	@Before
	public void setUp() {
		//单个类,项目拦截器无效
//		mvc = MockMvcBuilders.standaloneSetup(new ProductController()).build();
		//项目拦截器有效
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void execute() throws  Exception {
		//调用接口，传入添加的用户参数
		RequestBuilder request = MockMvcRequestBuilders.post("/product/ec")
                .contentType(MediaType.APPLICATION_JSON_UTF8)  
                .content(JSON.toJSONString(null));
		
		 MvcResult mvcResult = mockMvc.perform(request).andReturn() ;
		 int status = mvcResult.getResponse().getStatus();  
		 String content = mvcResult.getResponse().getContentAsString();
		 Assert.assertTrue("正确", status == 200);  
		 Assert.assertFalse("错误", status != 200);  
		 System.out.println("返回结果："+status);
		 System.out.println(content);
	}
}
