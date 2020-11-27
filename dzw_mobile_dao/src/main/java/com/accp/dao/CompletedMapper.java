package com.accp.dao;

import com.accp.pojo.Completed;

public interface CompletedMapper {
    int deleteByPrimaryKey(Integer completionid);

    int insert(Completed record);
    /**
     * 新增竣工表
     * @param record
     * @return
     */
    int insertSelective(Completed record);

    Completed selectByPrimaryKey(Integer completionid);

    int updateByPrimaryKeySelective(Completed record);

    int updateByPrimaryKey(Completed record);
}