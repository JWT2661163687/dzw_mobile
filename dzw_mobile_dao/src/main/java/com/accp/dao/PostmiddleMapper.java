package com.accp.dao;

import com.accp.pojo.Postmiddle;

public interface PostmiddleMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Postmiddle record);

    int insertSelective(Postmiddle record);

    Postmiddle selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Postmiddle record);

    int updateByPrimaryKey(Postmiddle record);
}