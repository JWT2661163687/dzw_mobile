package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Motorcycle;

public interface MotorcycleMapper {
    int deleteByPrimaryKey(Integer motorcycleid);

    /**
     * 新增车型表
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
     * 查询所有
     * @return
     */
    @Select("SELECT m.`motorcycleid`,m.`engineid`,m.`motorcyclename`,m.`price`,a.`makename`  FROM `motorcycle` m INNER JOIN `make` a ON m.`makeid`=a.`makeid`")
    List<Motorcycle> SelectAll();
    /**
     * 查询id是否相同
     * @param id
     * @return
     */
    @Select("SELECT * FROM `motorcycle` WHERE `motorcycleid`=#{id}")
    List<Motorcycle> SelectById(@Param("id")Integer id);
}