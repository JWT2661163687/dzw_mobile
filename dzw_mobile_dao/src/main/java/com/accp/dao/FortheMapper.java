package com.accp.dao;

import com.accp.pojo.Forthe;

public interface FortheMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Forthe record);

    int insertSelective(Forthe record);

    Forthe selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Forthe record);

    int updateByPrimaryKey(Forthe record);
}