package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.Client;
import com.accp.pojo.Vehicle;

public interface VehicleMapper {
    int deleteByPrimaryKey(Integer vid);

    int insert(Vehicle record);

    int insertSelective(Vehicle record);

    Vehicle selectByPrimaryKey(Integer vid);

    int updateByPrimaryKeySelective(Vehicle record);

    int updateByPrimaryKey(Vehicle record);
    
    /**
     * ����������ѯ������Ϣ
     */
    List<Vehicle> queryVehicle(@Param("vid")Integer vid);
    
    /**
     * ˫��������Ϣ��ʾ��Ӧ���û���Ϣ
     */
    @Select("SELECT * FROM `client` WHERE cId = #{cid}")
    List<Client> queryClient(@Param("cid")Integer cid);
    
    /**
     * ����������Ϣ
     */
    @Insert("INSERT INTO `vehicle`(`cId`,`vDriver`,`vLicense`,`vBrand`,`vModel`,`vPhone`,`vAffiliation`,`vMileage`,`registeredDate`,`purchaseDate`) VALUES(#{vehicle.cid},#{vehicle.vdriver},#{vehicle.vlicense},#{vehicle.vbrand},#{vehicle.vmodel},#{vehicle.vphone},#{vehicle.vaffiliation},#{vehicle.vmileage},#{vehicle.registereddate},#{vehicle.purchasedate})")
    int insertVehicle(@Param("vehicle")Vehicle vehicle);
    
    /**
     * �޸ĳ�����Ϣ
     */
    @Update("UPDATE `vehicle` SET `vDriver` = #{vehicle.vdriver},`vLicense` = #{vehicle.vlicense},`vBrand` = #{vehicle.vbrand},`vModel` = #{vehicle.vmodel},`vPhone` = #{vehicle.vphone},`vAffiliation` = #{vehicle.vaffiliation},`vMileage` = #{vehicle.vmileage},`registeredDate` = #{vehicle.registereddate},`purchaseDate` = #{vehicle.purchasedate} WHERE `vId` = #{vehicle.vid}")
    int updateVehicle(@Param("vehicle")Vehicle vehicle);
    
    /**
     * ɾ��������Ϣ
     */
    @Delete("DELETE FROM `vehicle` WHERE vId = #{vid}")
    int deleteVehicle(@Param("vid")Integer vid);
}