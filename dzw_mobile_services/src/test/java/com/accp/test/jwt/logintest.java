package com.accp.test.jwt;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.jwt.LoginjurisdictionBiz;
import com.accp.pojo.Functiontable;
import com.accp.pojo.Post;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-ctx.xml"})
public class logintest {
    @Autowired
    private LoginjurisdictionBiz loginjurisdictionBiz;

    @Test
    public void aaa() {
        System.out.println(loginjurisdictionBiz.selectlogin("张三", "123"));
    }
	

	@Test
	public void bbb() {
		List<Functiontable> list=loginjurisdictionBiz.selectAllfunctiontable();
		for (Functiontable item : list) {
			System.out.println(item);
		}
	}
	@Test
	public void ccc() {
		List<Post> list=loginjurisdictionBiz.selectPost();
		for (Post item : list) {
			System.out.println(item);
		}
	}
	
	
	
}
