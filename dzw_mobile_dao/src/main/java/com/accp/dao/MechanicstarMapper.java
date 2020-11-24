package com.accp.dao;

import java.util.List;

import com.accp.pojo.Mechanicstar;

public interface MechanicstarMapper {
    int deleteByPrimaryKey(Integer meid);

    int insert(Mechanicstar record);

    int insertSelective(Mechanicstar record);

    Mechanicstar selectByPrimaryKey(Integer meid);

    int updateByPrimaryKeySelective(Mechanicstar record);

    int updateByPrimaryKey(Mechanicstar record);
    
    //查询技工星级
    public List<Mechanicstar> queryMechan();
}