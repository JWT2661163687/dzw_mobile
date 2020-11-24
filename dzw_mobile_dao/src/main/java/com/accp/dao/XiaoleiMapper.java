package com.accp.dao;

import com.accp.pojo.Xiaolei;

public interface XiaoleiMapper {
    int deleteByPrimaryKey(Integer xiaoid);

    int insert(Xiaolei record);

    int insertSelective(Xiaolei record);

    Xiaolei selectByPrimaryKey(Integer xiaoid);

    int updateByPrimaryKeySelective(Xiaolei record);

    int updateByPrimaryKey(Xiaolei record);
}