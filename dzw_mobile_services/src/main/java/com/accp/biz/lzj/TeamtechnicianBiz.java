package com.accp.biz.lzj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.MechanicstarMapper;
import com.accp.dao.TeamtechnicianMapper;
import com.accp.pojo.Teamtechnician;

@Service("teamtechnician")
public class TeamtechnicianBiz {
	@Autowired
	private TeamtechnicianMapper dao;
	
	/**
	 * 查询班组技工
	 * @return
	 */
	public List<Teamtechnician> queryTe(){
		return dao.queryTe();
	}
}
