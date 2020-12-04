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
     * ����
     *
     * @param record
     * @return
     */
    int insert(@Param("record") Engine record);

    int insertSelective(Engine record);

    Engine selectByPrimaryKey(Integer engineid);

    int updateByPrimaryKeySelective(Engine record);

    int updateByPrimaryKey(Engine record);

    /**
     * ��ѯ����
     *
     * @return
     */
    @Select("SELECT * FROM `engine`")
    List<Engine> SelectAll();

    /**
     * ģ����ѯ����
     *
     * @param name
     * @return
     */
    @Select("SELECT * FROM `engine` WHERE `enginename` LIKE '%${name}%'")
    List<Engine> SelectByName(@Param("name") String name);

    /**
     * ����idɾ��
     *
     * @param id
     * @return
     */
    @Delete("DELETE FROM `engine` WHERE `engineid`=#{id}")
    int deleteByid(@Param("id") Integer id);
}