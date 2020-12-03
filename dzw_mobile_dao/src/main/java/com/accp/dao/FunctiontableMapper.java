package com.accp.dao;

import java.util.List;

import com.accp.pojo.Functiontable;

public interface FunctiontableMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Functiontable record);

    int insertSelective(Functiontable record);

    Functiontable selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Functiontable record);

    int updateByPrimaryKey(Functiontable record);
    
    /**
     * 查询所有功能
     * @return
     */
    List<Functiontable> selectAllfunctiontable();
    
}