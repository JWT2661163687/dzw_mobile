package com.accp.dao;

import com.accp.pojo.Client;

public interface ClientMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Client record);

    int insertSelective(Client record);

    Client selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKey(Client record);
}