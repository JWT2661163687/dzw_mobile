package com.accp.dao;

import com.accp.pojo.Dalei;

public interface DaleiMapper {
    int deleteByPrimaryKey(Integer daid);

    int insert(Dalei record);

    int insertSelective(Dalei record);

    Dalei selectByPrimaryKey(Integer daid);

    int updateByPrimaryKeySelective(Dalei record);

    int updateByPrimaryKey(Dalei record);
}