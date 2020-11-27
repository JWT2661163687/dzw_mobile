package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.Make;

public interface MakeMapper {
    int deleteByPrimaryKey(Integer makeid);

    /**
     * 新增品牌表
     * @param make
     * @return
     */
    @Insert("INSERT INTO `make` VALUES(#{make.makeid},#{make.makename},#{make.acronym})")
    int inserts(@Param("make")Make make);

    int insertSelective(Make record);

    Make selectByPrimaryKey(Integer makeid);

    int updateByPrimaryKeySelective(Make record);

    int updateByPrimaryKey(Make record);
    /**
     * 查询所有
     * @return
     */
    @Select("SELECT * FROM make ")
    List<Make> SelectMake();
    /**
     * 根据id删除
     * @param id
     * @return
     */
    @Delete("DELETE FROM `make` WHERE `makeid`=#{id}")
    int deletaById(@Param("id")Integer id);
    /**
     * 根据id查询是否有相同的值
     * @param id
     * @return
     */
    @Select("SELECT * FROM `make` WHERE `makeid`=#{id}")
    List<Make> SelectById(@Param("id")Integer id);
    /**
     * 输入框查询
     * @param name
     * @return
     */
    @Select("SELECT * FROM `make` WHERE `makeid` LIKE '%${name}%' OR `makename` LIKE '%${name}%' OR `acronym` LIKE '%${name}%'")
    List<Make> SelectByAll(@Param("name")String name);
    /**
     * 修改
     * @param make
     * @return
     */
    @Update("UPDATE `make` SET `makename`=#{make.makename},`acronym`=#{make.acronym} WHERE `makeid`=#{make.makeid}")
    int updateById(@Param("make")Make make);
}