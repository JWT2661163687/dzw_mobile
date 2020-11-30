package com.accp.dao;

import java.util.List;

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
     * ²éÑ¯ËùÓÐ
     * @return
     */
    @Select("select * from team")
    List<Team> selectJwtAll();
    
}