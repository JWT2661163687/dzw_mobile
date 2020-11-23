package com.accp.dao;

import com.accp.pojo.Housingdetails;

public interface HousingdetailsMapper {
    int deleteByPrimaryKey(Integer hid);

    int insert(Housingdetails record);

    int insertSelective(Housingdetails record);

    Housingdetails selectByPrimaryKey(Integer hid);

    int updateByPrimaryKeySelective(Housingdetails record);

    int updateByPrimaryKey(Housingdetails record);
}