package com.accp.biz.lzj;

import java.util.List;

import org.apache.ibatis.annotations.Param;
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
	
	/**
	 * 查询外勤车辆
	 * @return
	 */
	public List<Fieldvehicles> queryFiel(){
		return dao.queryFiel();
	}
	/**
	 * 查询班组
	 * @return
	 */
	public List<Team> queryTeam(){
		return dao.queryTeam();
	}
	/**
	 * 新增车辆
	 */
	public int insertFiel(Fieldvehicles fiel) {
		return dao.insertFiel(fiel);
	}
	
	/**
	 * 修改车辆
	 */
	public int updateFiel(Fieldvehicles ff) {
		return dao.updateFiel(ff);
	}
	
	/**
	 * 删除车辆
	 */
	public int deleteFiel(int id) {
		return dao.deleteFiel(id);
	}
}
