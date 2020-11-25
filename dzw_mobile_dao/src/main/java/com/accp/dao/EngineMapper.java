package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Engine;

public interface EngineMapper {
    int deleteByPrimaryKey(Integer engineid);

    /**
     * 新增
     * @param record
     * @return
     */
    int insert(@Param("record")Engine record);

    int insertSelective(Engine record);

    Engine selectByPrimaryKey(Integer engineid);

    int updateByPrimaryKeySelective(Engine record);

    int updateByPrimaryKey(Engine record);
    /**
     * 查询所有
     * @return
     */
    @Select("SELECT * FROM `engine`")
    List<Engine> SelectAll();
    /**
     * 模糊查询名称
     * @param name
     * @return
     */
    @Select("SELECT * FROM `engine` WHERE `enginename` LIKE '%${name}%'")
    List<Engine> SelectByName(@Param("name")String name);
    /**
     * 根据id删除
     * @param id
     * @return
     */
    @Delete("DELETE FROM `engine` WHERE `engineid`=#{id}")
    int deleteByid(@Param("id")Integer id);
}