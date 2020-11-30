package com.accp.test.kwt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.kwt.MotorcycleBiz;
import com.accp.pojo.Motorcycle;
import com.github.pagehelper.PageInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-ctx.xml"})
public class MotorcycleTest {
	
	@Autowired
	private MotorcycleBiz biz;
	@Test
	public void SelectAllPage() {
		PageInfo<Motorcycle> lists=biz.SelectPage(1, 2);
		lists.getList().forEach(i->{
			System.err.println(i);
		});
	}
	@Test
	public void insert() {
		Motorcycle m=new Motorcycle();
		m.setMotorcycleid(3);
		m.setEngineid(5);
		m.setMakeid(1256);
		m.setPrice(200000.00);
		m.setMotorcyclename("ss");
		int count=biz.addMotorcycle(m);
	}

}
