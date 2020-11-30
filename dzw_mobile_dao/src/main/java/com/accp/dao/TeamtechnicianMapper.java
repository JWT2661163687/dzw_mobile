package com.accp.dao;

import java.util.List;

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
    @Select("select * from teamtechnician")
    public List<Teamtechnician> queryTe();
    
    //��������
    public int insertTe();
}