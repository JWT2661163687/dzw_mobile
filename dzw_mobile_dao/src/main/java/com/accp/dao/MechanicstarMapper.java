package com.accp.dao;

import com.accp.pojo.Mechanicstar;

public interface MechanicstarMapper {
    int deleteByPrimaryKey(Integer meid);

    int insert(Mechanicstar record);

    int insertSelective(Mechanicstar record);

    Mechanicstar selectByPrimaryKey(Integer meid);

    int updateByPrimaryKeySelective(Mechanicstar record);

    int updateByPrimaryKey(Mechanicstar record);
}