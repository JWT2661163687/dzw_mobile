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
     * ����������ѯ�ͻ�
     */
    List<Client> queryClient(@Param("cid") Integer cid);

    /**
     * �����¿ͻ�
     */
    @Insert("INSERT INTO `client`(`cName`,`cPhone`,`createDate`,`cLimit`,`cIntegral`,`cRemark`,`cGrade`) VALUES(#{client.cname},#{client.cphone},NOW(),#{client.climit},#{client.cintegral},#{client.cremark},1)")
    int insertClient(@Param("client") Client client);

    /**
     * �޸Ŀͻ���Ϣ
     */
    @Update("UPDATE `client` SET `cName` = #{client.cname},`cPhone` = #{client.cphone},`cLimit` = #{client.climit},`cIntegral` = #{client.cintegral},`cRemark` = #{client.cremark} WHERE cId = #{client.cid}")
    int updateClient(@Param("client") Client client);

    /**
     * ɾ���ͻ���Ϣ
     */
    @Delete("DELETE FROM `client` WHERE cId = #{cid}")
    int deleteClient(@Param("cid") Integer cid);

    /**
     * ˫���ͻ���ѯ�ÿͻ��ĳ�����Ϣ
     */
    @Select("SELECT * FROM `vehicle` WHERE cId = #{cid}")
    List<Vehicle> queryVehicle(@Param("cid") Integer cid);
}