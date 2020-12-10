package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Team;

public interface TeamMapper {
    int deleteByPrimaryKey(Integer teamid);

    int insert(Team record);

    int insertSelective(Team record);

    Team selectByPrimaryKey(Integer teamid);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);

    /**
     * ��ѯ����
     *
     * @return
     */
    @Select("select * from team")
    List<Team> selectJwtAll();
    
    /**
     * ��������
     */
    @Insert("INSERT INTO `team` VALUES(null,#{team.tename})")
    public int insertTeam(@Param("team")Team team);
    
}