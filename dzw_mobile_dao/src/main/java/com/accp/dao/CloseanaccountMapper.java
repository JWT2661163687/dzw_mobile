package com.accp.dao;

import com.accp.pojo.Closeanaccount;

public interface CloseanaccountMapper {
    int deleteByPrimaryKey(Integer rno);

    int insert(Closeanaccount record);

    int insertSelective(Closeanaccount record);

    Closeanaccount selectByPrimaryKey(Integer rno);

    int updateByPrimaryKeySelective(Closeanaccount record);

    int updateByPrimaryKey(Closeanaccount record);
}