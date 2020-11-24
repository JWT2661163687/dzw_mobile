package com.accp.biz.lzj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.MechanicstarMapper;
import com.accp.pojo.Mechanicstar;


@Service("Mechanicstar")
public class MechanicstarBiz {
	@Autowired
	private MechanicstarMapper dao;
	
	/**
	 * 查询技工星级
	 * @return
	 */
	public List<Mechanicstar> queryMechan(){
		return dao.queryMechan();
	}
	
}
