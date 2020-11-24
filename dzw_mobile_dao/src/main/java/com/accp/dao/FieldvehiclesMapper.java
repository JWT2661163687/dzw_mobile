package com.accp.dao;

import com.accp.pojo.Fieldvehicles;

public interface FieldvehiclesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Fieldvehicles record);

    int insertSelective(Fieldvehicles record);

    Fieldvehicles selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fieldvehicles record);

    int updateByPrimaryKey(Fieldvehicles record);
}