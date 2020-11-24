package com.accp.dao;

import com.accp.pojo.Weixiu;

public interface WeixiuMapper {
    int deleteByPrimaryKey(Integer xmid);

    int insert(Weixiu record);

    int insertSelective(Weixiu record);

    Weixiu selectByPrimaryKey(Integer xmid);

    int updateByPrimaryKeySelective(Weixiu record);

    int updateByPrimaryKey(Weixiu record);
}