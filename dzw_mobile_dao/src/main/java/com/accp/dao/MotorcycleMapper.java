package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Motorcycle;

public interface MotorcycleMapper {
    int deleteByPrimaryKey(Integer motorcycleid);

    /**
     * �������ͱ�
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
     * @return
     */
    @Select("SELECT m.`motorcycleid`,m.`engineid`,m.`motorcyclename`,m.`price`,a.`makename`  FROM `motorcycle` m INNER JOIN `make` a ON m.`makeid`=a.`makeid`")
    List<Motorcycle> SelectAll();
    /**
     * ��ѯid�Ƿ���ͬ
     * @param id
     * @return
     */
    @Select("SELECT * FROM `motorcycle` WHERE `motorcycleid`=#{id}")
    List<Motorcycle> SelectById(@Param("id")Integer id);
}