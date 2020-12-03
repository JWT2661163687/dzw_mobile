package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.Motorcycle;

public interface MotorcycleMapper {
    int deleteByPrimaryKey(Integer motorcycleid);

    /**
     * �������ͱ�
     *
     * @param record
     * @return
     */
    @Insert("INSERT INTO motorcycle VALUES(#{m.motorcycleid},#{m.engineid},NULL,#{m.makeid},#{m.motorcyclename},null,NULL,#{m.price},null,null,null,null)")
    int inserts(@Param("m") Motorcycle record);

    int insertSelective(Motorcycle record);

    Motorcycle selectByPrimaryKey(Integer motorcycleid);

    int updateByPrimaryKeySelective(Motorcycle record);

    int updateByPrimaryKey(Motorcycle record);

    /**
     * ��ѯ����
     *
     * @return
     */
    @Select("SELECT m.`motorcycleid`,e.`engineid`,e.`enginename`,m.`motorcyclename`,m.`price`,a.`makeid`,a.`makename`  FROM `motorcycle` m INNER JOIN `make` a ON m.`makeid`=a.`makeid` INNER JOIN  `engine` e ON m.`engineid`=e.`engineid`")
    List<Motorcycle> SelectAll();

    /**
     * ��ѯid�Ƿ���ͬ
     *
     * @param id
     * @return
     */
    @Select("SELECT * FROM `motorcycle` WHERE `motorcycleid`=#{id}")
<<<<<<< HEAD
    List<Motorcycle> SelectById(@Param("id") Integer id);
=======
    List<Motorcycle> SelectById(@Param("id")Integer id);
    /**
     * �ı����ѯ
     * @param name
     * @return
     */
    @Select("SELECT m.`motorcycleid`,e.`engineid`,e.`enginename`,m.`motorcyclename`,m.`price`,a.`makeid`,a.`makename`  FROM `motorcycle` m INNER JOIN `make` a ON m.`makeid`=a.`makeid` INNER JOIN  `engine` e ON m.`engineid`=e.`engineid` WHERE m.`motorcycleid` LIKE '%${name}%' OR m.`motorcyclename` LIKE '%${name}%'")
    List<Motorcycle> SelectByInput(@Param("name")String name);
    /**
     * ����idɾ��
     * @param id
     * @return
     */
    @Delete("DELETE FROM `motorcycle` WHERE `motorcycleid`=#{id}")
    int deleteById(@Param("id")Integer id);
    /**
     * ����id�޸�
     * @param m
     * @return
     */
    @Update("UPDATE `motorcycle` SET `engineid`=#{m.engineid},`makeid`=#{m.makeid},`motorcyclename`=#{m.motorcyclename},`price`=#{m.price} WHERE `motorcycleid`=#{m.motorcycleid}")
    public int updateById(@Param("m")Motorcycle m);
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
}