package com.accp.biz.lzj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.FieldvehiclesMapper;
import com.accp.pojo.Fieldvehicles;
import com.accp.pojo.Team;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("Fieldvehicles")
public class FieldvehiclesBiz {
	@Autowired
	private FieldvehiclesMapper dao;
	
	public List<Fieldvehicles> queryFiel(){
		return dao.queryFiel();
	}
	
	public List<Team> queryTeam(){
		return dao.queryTeam();
	}
}
