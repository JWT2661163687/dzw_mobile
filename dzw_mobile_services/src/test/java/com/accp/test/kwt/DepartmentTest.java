package com.accp.test.kwt;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.kwt.DepartmentBiz;
import com.accp.pojo.Department;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-ctx.xml"})
public class DepartmentTest {

	@Autowired
	private DepartmentBiz biz;
	@Test
	public void Select() {
		List<Department> lists=biz.Departmenttree();
		lists.forEach(i->{
			System.err.println(i);
//			i.getPost().forEach(s->{
//				System.err.println(s);
//			});
		});
	}
}
