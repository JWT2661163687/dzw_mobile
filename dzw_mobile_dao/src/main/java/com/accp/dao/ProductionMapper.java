package com.accp.dao;

import com.accp.pojo.Production;

public interface ProductionMapper {
    int deleteByPrimaryKey(Integer productionid);

    int insert(Production record);

    int insertSelective(Production record);

    Production selectByPrimaryKey(Integer productionid);

    int updateByPrimaryKeySelective(Production record);

    int updateByPrimaryKey(Production record);
}