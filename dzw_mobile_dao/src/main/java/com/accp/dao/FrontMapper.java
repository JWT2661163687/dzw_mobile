package com.accp.dao;

import com.accp.pojo.Front;

public interface FrontMapper {
    int deleteByPrimaryKey(Integer frontid);

    int insert(Front record);

    int insertSelective(Front record);

    Front selectByPrimaryKey(Integer frontid);

    int updateByPrimaryKeySelective(Front record);

    int updateByPrimaryKey(Front record);
}