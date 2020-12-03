package com.accp.biz.lzj;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.TeamMapper;
import com.accp.dao.TeamtechnicianMapper;
import com.accp.pojo.Team;

@Service("team")
public class TeamBiz {
	
	@Autowired
    private TeamMapper dao;
	 /**
     * 新增班组名称
     */
    public int insertTeam(@Param("team")Team team) {
    	return dao.insertTeam(team);
    }
}
