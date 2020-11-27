package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Motorcycle;

public interface MotorcycleMapper {
    int deleteByPrimaryKey(Integer motorcycleid);

    int insert(Motorcycle record);

    int insertSelective(Motorcycle record);

    Motorcycle selectByPrimaryKey(Integer motorcycleid);

    int updateByPrimaryKeySelective(Motorcycle record);

    int updateByPrimaryKey(Motorcycle record);
    
    /**
     * ²éÑ¯ËùÓÐ
     * @return
     */
    @Select("SELECT * FROM motorcycle")
    List<Motorcycle> SelectAll();
}