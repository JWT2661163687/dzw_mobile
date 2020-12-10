package com.accp.biz.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.FrontMapper;

@Service
public class timetestBiz {
	@Autowired
	private FrontMapper frontMapper;
	/**
	 * 0点创建首页数据表
	 */
	public void time1() {
		//新增
		//int b=frontMapper.insertdate();
		System.out.println("创建成功");
	}
	
}
