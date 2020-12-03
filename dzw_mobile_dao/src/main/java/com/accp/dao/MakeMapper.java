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
     * ����Ʒ�Ʊ�
     *
     * @param make
     * @return
     */
    @Insert("INSERT INTO `make` VALUES(#{make.makeid},#{make.makename},#{make.acronym})")
    int inserts(@Param("make") Make make);

    int insertSelective(Make record);

    Make selectByPrimaryKey(Integer makeid);

    int updateByPrimaryKeySelective(Make record);

    int updateByPrimaryKey(Make record);

    /**
     * ��ѯ����
     *
     * @return
     */
    @Select("SELECT * FROM make ")
    List<Make> SelectMake();

    /**
     * ����idɾ��
     *
     * @param id
     * @return
     */
    @Delete("DELETE FROM `make` WHERE `makeid`=#{id}")
    int deletaById(@Param("id") Integer id);

    /**
     * ����id��ѯ�Ƿ�����ͬ��ֵ
     *
     * @param id
     * @return
     */
    @Select("SELECT * FROM `make` WHERE `makeid`=#{id}")
    List<Make> SelectById(@Param("id") Integer id);

    /**
     * ������ѯ
     *
     * @param name
     * @return
     */
    @Select("SELECT * FROM `make` WHERE `makeid` LIKE '%${name}%' OR `makename` LIKE '%${name}%' OR `acronym` LIKE '%${name}%'")
    List<Make> SelectByAll(@Param("name") String name);

    /**
     * �޸�
     *
     * @param make
     * @return
     */
    @Update("UPDATE `make` SET `makename`=#{make.makename},`acronym`=#{make.acronym} WHERE `makeid`=#{make.makeid}")
    int updateById(@Param("make") Make make);
}