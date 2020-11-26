package com.accp.dao;

import com.accp.pojo.Maintaincar;

public interface MaintaincarMapper {
    int deleteByPrimaryKey(Integer maintainid);

    int insert(Maintaincar record);

    int insertSelective(Maintaincar record);

    Maintaincar selectByPrimaryKey(Integer maintainid);

    int updateByPrimaryKeySelective(Maintaincar record);

    int updateByPrimaryKey(Maintaincar record);
}