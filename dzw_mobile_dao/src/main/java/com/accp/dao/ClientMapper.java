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
     * 鏍规嵁鏉asd′欢鏌ヨ瀹㈡埛淇℃伅
     */
    List<Client> queryClient(@Param("cid") Integer cid);

    /**
     * 鏂板瀹㈡埛淇℃伅
     */
    @Insert("INSERT INTO `client`(`cName`,`cPhone`,`createDate`,`cLimit`,`cIntegral`,`cRemark`,`cGrade`) VALUES(#{client.cname},#{client.cphone},NOW(),#{client.climit},#{client.cintegral},#{client.cremark},1)")
    int insertClient(@Param("client") Client client);

    /**
     * 淇敼瀹㈡埛淇℃伅
     */
    @Update("UPDATE `client` SET `cName` = #{client.cname},`cPhone` = #{client.cphone},`cLimit` = #{client.climit},`cIntegral` = #{client.cintegral},`cRemark` = #{client.cremark} WHERE cId = #{client.cid}")
    int updateClient(@Param("client") Client client);

    /**
     * 鍒犻櫎瀹㈡埛淇℃伅
     */
    @Delete("DELETE FROM `client` WHERE cId = #{cid}")
    int deleteClient(@Param("cid") Integer cid);
    
    /**
     * 删除客户信息时把该客户的车辆也删除
     */
    @Delete("DELETE FROM vehicle WHERE cId = #{cid}")
    int deleteVehicle(@Param("cid")Integer cid);

    /**
     * 鏍规嵁瀹㈡埛id鏌ヨ璇ュ鎴风殑杞﹁締淇℃伅
     */
    @Select("SELECT * FROM `vehicle` WHERE cId = #{cid}")
    List<Vehicle> queryVehicle(@Param("cid") Integer cid);
    
    /**
     * 鏌ヨ鎵�鏈夊鎴蜂俊鎭�
     */
    @Select("SELECT * FROM CLIENT")
    List<Client> queryAllClient();
}