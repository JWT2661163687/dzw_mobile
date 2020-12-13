package com.accp.biz.lzj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.TeamMapper;
import com.accp.dao.TeamtechnicianMapper;
import com.accp.pojo.Team;
import com.accp.pojo.Teamtechnician;

@Service("team")
public class TeamBiz {
	
	@Autowired
    private TeamMapper dao;
	@Autowired
	private TeamtechnicianMapper teamtechnicianMapper;
	 /**
     * 新增班组名称
     */
    public int insertTeam(@Param("team")Team team) {
    	return dao.insertTeam(team);
    }
    /*8
     * 删除
     */
    public int deleteTeamtechnician(Integer id) {
      return dao.deleteByPrimaryKey(id);
   }
    /**
     * 查询技工表
     * @param id
     * @return
     */
    public List<Teamtechnician> selectAllid(Integer id){
    	return teamtechnicianMapper.queryTename(id.toString());
    }
    
}
