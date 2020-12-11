package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.Client;
import com.accp.pojo.Vehicle;

public interface ClientMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Client record);

    int insertSelective(Client record);

    Client selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKey(Client record);

    /**
     * 根据条件查询客户信息
     */
    List<Client> queryClient(@Param("cid") Integer cid);

    /**
     * 新增客户信息
     */
    @Insert("INSERT INTO `client`(`cName`,`cPhone`,`createDate`,`cLimit`,`cIntegral`,`cRemark`,`cGrade`) VALUES(#{client.cname},#{client.cphone},NOW(),#{client.climit},#{client.cintegral},#{client.cremark},1)")
    int insertClient(@Param("client") Client client);

    /**
     * 修改客户信息
     */
    @Update("UPDATE `client` SET `cName` = #{client.cname},`cPhone` = #{client.cphone},`cLimit` = #{client.climit},`cIntegral` = #{client.cintegral},`cRemark` = #{client.cremark} WHERE cId = #{client.cid}")
    int updateClient(@Param("client") Client client);

    /**
     * 删除客户信息
     */
    @Delete("DELETE FROM `client` WHERE cId = #{cid}")
    int deleteClient(@Param("cid") Integer cid);
    
    /**
     * 删除客户信息时把该客户的车辆也删除
     */
    @Delete("DELETE FROM vehicle WHERE cId = #{cid}")
    int deleteVehicle(@Param("cid")Integer cid);

    /**
     * 根据客户id查询该客户的车辆信息
     */
    @Select("SELECT * FROM `vehicle` WHERE cId = #{cid}")
    List<Vehicle> queryVehicle(@Param("cid") Integer cid);
    
    /**
     * 查询所有客户信息
     */
    @Select("SELECT * FROM CLIENT")
    List<Client> queryAllClient();
}