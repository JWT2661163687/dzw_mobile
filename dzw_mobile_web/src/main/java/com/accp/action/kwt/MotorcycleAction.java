package com.accp.action.kwt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.kwt.MotorcycleBiz;
import com.accp.pojo.Motorcycle;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/Motorcycles")
public class MotorcycleAction {

	@Autowired
	private MotorcycleBiz biz;
	
	@GetMapping("/Motorcycle")
	public PageInfo<Motorcycle> SelectPageAll(int pageNum,int pageSize){
		return biz.SelectPage(pageNum, pageSize);
	}
}
