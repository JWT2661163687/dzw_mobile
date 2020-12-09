package com.accp.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Front;

public interface FrontMapper {
    int deleteByPrimaryKey(Integer frontid);

    int insert(Front record);

    int insertSelective(Front record);

    Front selectByPrimaryKey(Integer frontid);

    int updateByPrimaryKeySelective(Front record);

    int updateByPrimaryKey(Front record);
    /*8
     * 创建今日首页数据表
     */
    @Insert("INSERT INTO `front`VALUES(null,0,0,0,0,0,0,0.0,0.0,0.0,0,NOW())")
    int insertdate();
    @Select("select * from `front` where frontdate=#{date}")
    Front selectAlldate(@Param("date")String date);
    
}