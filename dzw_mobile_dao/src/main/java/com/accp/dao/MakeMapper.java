package com.accp.dao;

import com.accp.pojo.Make;

public interface MakeMapper {
    int deleteByPrimaryKey(Integer makeid);

    int insert(Make record);

    int insertSelective(Make record);

    Make selectByPrimaryKey(Integer makeid);

    int updateByPrimaryKeySelective(Make record);

    int updateByPrimaryKey(Make record);
}