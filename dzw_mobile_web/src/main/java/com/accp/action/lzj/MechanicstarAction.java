package com.accp.action.lzj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lzj.MechanicstarBiz;
import com.accp.pojo.Mechanicstar;


@RestController
@RequestMapping("/api/mech")
public class MechanicstarAction {
	@Autowired
	private MechanicstarBiz biz;
	
	/**
	 * 查询全部
	 * @return
	 */
	@GetMapping("lzjquery")
	public List<Mechanicstar> queryMechanicstar(){
		return biz.queryMechan();
	}
}
