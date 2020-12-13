package com.accp.test.kwt;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.dao.PostMapper;
import com.accp.pojo.Post;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-ctx.xml"})
public class PostTest {

	@Autowired
	private PostMapper postMapper;
	@Test
	public void SelectAll(){
		List<Post> lists=postMapper.SelectAll(-1);
		lists.forEach(i->{
			System.err.println(i);
		});
	}
	@Test
	public void deleteById() {
		List<Post> lists=new ArrayList<Post>();
		Post p=new Post();
		p.setPostid(14);
		lists.add(p);
		Post p2=new Post();
		p2.setPostid(15);
		lists.add(p2);
		int count=postMapper.DeleteById(lists);
		if(count>0) {
			System.out.println("删除成功！");
		}
	}
}
