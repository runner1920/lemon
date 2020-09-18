package com.lemon.member.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author jiangqk
 * @data 2018年1月5日 下午4:07:02
 */
@RestController
@RefreshScope
public class MemberController {

    @Value("${txt:null}")
    private String txt;

    @RequestMapping(value = "/test")
    public String test() {
        System.out.println(txt);
        return txt;
    }
}
