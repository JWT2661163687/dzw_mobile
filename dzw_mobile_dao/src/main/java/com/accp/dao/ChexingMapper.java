package com.accp.dao;

import com.accp.pojo.Chexing;

public interface ChexingMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Chexing record);

    int insertSelective(Chexing record);

    Chexing selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Chexing record);

    int updateByPrimaryKey(Chexing record);
}