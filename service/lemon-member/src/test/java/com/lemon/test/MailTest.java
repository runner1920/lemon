package com.lemon.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.lemon.member.MemberApplication;

/**
 * 
 * @author jiangqk
 * @data 2018年1月8日 下午5:40:49
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MemberApplication.class)
@WebAppConfiguration
public class MailTest {
	
	@Autowired
	private JavaMailSender mailSender;

	@Test
	public void sendSimpleMail() throws Exception {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("runner1920@163.com");
		message.setTo("671768276@qq.com");
		message.setSubject("主题：简单邮件");
		message.setText("测试邮件内容");

		mailSender.send(message);
	}
}
