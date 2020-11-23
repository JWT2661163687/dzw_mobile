package com.accp.dao;

import com.accp.pojo.House;

public interface HouseMapper {
    int deleteByPrimaryKey(Integer houseid);

    int insert(House record);

    int insertSelective(House record);

    House selectByPrimaryKey(Integer houseid);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);
}