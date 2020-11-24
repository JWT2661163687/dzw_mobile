package com.accp.dao;

import com.accp.pojo.Completed;

public interface CompletedMapper {
    int deleteByPrimaryKey(Integer completionid);

    int insert(Completed record);

    int insertSelective(Completed record);

    Completed selectByPrimaryKey(Integer completionid);

    int updateByPrimaryKeySelective(Completed record);

    int updateByPrimaryKey(Completed record);
}