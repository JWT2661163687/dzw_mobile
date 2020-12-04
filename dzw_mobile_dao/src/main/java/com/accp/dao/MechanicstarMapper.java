package com.accp.dao;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.Mechanicstar;

public interface MechanicstarMapper {
    int deleteByPrimaryKey(Integer meid);

    int insert(Mechanicstar record);

    int insertSelective(Mechanicstar record);

    Mechanicstar selectByPrimaryKey(Integer meid);

    int updateByPrimaryKeySelective(Mechanicstar record);

    int updateByPrimaryKey(Mechanicstar record);

    //��ѯ�����Ǽ�
    @Select("select * from mechanicstar")
    public List<Mechanicstar> queryMechan();

    //��������
    @Insert("INSERT INTO `mechanicstar` VALUES(#{mechanicstar.meid},#{mechanicstar.starrating},#{mechanicstar.grade},#{mechanicstar.weight})")
    public int insertMechan(@Param("mechanicstar") Mechanicstar mechanicstar);

    //�޸ļ���
    @Update("UPDATE `mechanicstar` SET `starrating`= #{mechanicstar.starrating},`grade`= #{mechanicstar.grade},`weight`= #{mechanicstar.weight} \r\n"
            + "WHERE `meid`=#{mechanicstar.meid}")
    public int updateMechan(@Param("mechanicstar") Mechanicstar mechanicstar);

    //ɾ������
    @Delete("DELETE FROM `mechanicstar` WHERE `meid` =#{meid}")
    public int deleteMechan(@Param("meid") String meid);

}