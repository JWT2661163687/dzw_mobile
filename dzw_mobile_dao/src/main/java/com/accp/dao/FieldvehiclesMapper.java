package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Fieldvehicles;
import com.accp.pojo.Team;

public interface FieldvehiclesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Fieldvehicles record);

    int insertSelective(Fieldvehicles record);

    Fieldvehicles selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fieldvehicles record);

    int updateByPrimaryKey(Fieldvehicles record);
    
    //查询外勤车辆
    @Select("SELECT * FROM `fieldvehicles` f INNER JOIN `team` t WHERE f.`teamid`=t.`teamid`")
    public List<Fieldvehicles> queryFiel();
    
    //查询班组
    @Select("select * from team")
    public List<Team> queryTeam();
    
    //新增车辆
    public int insertFiel(@Param("fiel")Fieldvehicles fiel);
    
    //修改车辆
    public int updateFiel(@Param("ff")Fieldvehicles ff);
    
    //删除车辆
    public int deleteFiel(@Param("id")int id);
    
}