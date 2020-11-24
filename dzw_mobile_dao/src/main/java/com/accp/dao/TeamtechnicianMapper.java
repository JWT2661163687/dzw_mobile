package com.accp.dao;

import com.accp.pojo.Teamtechnician;

public interface TeamtechnicianMapper {
    int deleteByPrimaryKey(Integer technicianno);

    int insert(Teamtechnician record);

    int insertSelective(Teamtechnician record);

    Teamtechnician selectByPrimaryKey(Integer technicianno);

    int updateByPrimaryKeySelective(Teamtechnician record);

    int updateByPrimaryKey(Teamtechnician record);
}