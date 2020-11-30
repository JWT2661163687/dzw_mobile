package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Teamtechnician;

public interface TeamtechnicianMapper {
    int deleteByPrimaryKey(Integer technicianno);

    int insert(Teamtechnician record);

    int insertSelective(Teamtechnician record);

    Teamtechnician selectByPrimaryKey(Integer technicianno);

    int updateByPrimaryKeySelective(Teamtechnician record);

    int updateByPrimaryKey(Teamtechnician record);
    
    //��ѯ����
    @Select("SELECT * FROM `teamtechnician` n\r\n"
    		+ "INNER JOIN `team` m\r\n"
    		+ "WHERE n.teamid=m.teamid")
    public List<Teamtechnician> queryTe();
    
    //��������
    public int insertTe(@Param("te") Teamtechnician te);
}