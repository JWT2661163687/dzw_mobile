package com.accp.test.jwt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.jwt.LoginjurisdictionBiz;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-ctx.xml"})
public class logintest {
    @Autowired
    private LoginjurisdictionBiz loginjurisdictionBiz;

    @Test
    public void aaa() {
        System.out.println(loginjurisdictionBiz.selectlogin("张三", "123"));
    }
}
