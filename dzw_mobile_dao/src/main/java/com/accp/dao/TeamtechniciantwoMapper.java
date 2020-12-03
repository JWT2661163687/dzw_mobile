package com.accp.dao;

import com.accp.pojo.Teamtechniciantwo;

public interface TeamtechniciantwoMapper {
    int deleteByPrimaryKey(Integer technicianno);

    int insert(Teamtechniciantwo record);

    int insertSelective(Teamtechniciantwo record);

    Teamtechniciantwo selectByPrimaryKey(Integer technicianno);

    int updateByPrimaryKeySelective(Teamtechniciantwo record);

    int updateByPrimaryKey(Teamtechniciantwo record);
}