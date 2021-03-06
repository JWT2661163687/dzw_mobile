package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.Client;


import com.accp.pojo.Make;
import com.accp.pojo.Motorcycle;
import com.accp.pojo.Vehicle;

public interface VehicleMapper {
    int deleteByPrimaryKey(Integer vid);

    int insert(Vehicle record);

    int insertSelective(Vehicle record);

    Vehicle selectByPrimaryKey(Integer vid);

    int updateByPrimaryKeySelective(Vehicle record);

    int updateByPrimaryKey(Vehicle record);

    /**
<<<<<<< HEAD
     * 根据条件查询车辆信息
=======
     * 閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷疯閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷锋伅
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
     */
    List<Vehicle> queryVehicle(@Param("vid") Integer vid);

    /**
<<<<<<< HEAD
     * 根据条件查询该车辆的车主信息
=======
     * 鍙岄敓鏂ゆ嫹閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷锋伅閿熸枻鎷风ず閿熸枻鎷峰簲閿熸枻鎷烽敓鐭紮鎷烽敓鏂ゆ嫹鎭�
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
     */
    @Select("SELECT * FROM `client` WHERE cId = #{cid}")
    List<Client> queryClient(@Param("cid") Integer cid);

    /**
<<<<<<< HEAD
     * 新增车辆信息
=======
     * 閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷锋伅
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
     */
    @Insert("INSERT INTO `vehicle`(`cId`,`vDriver`,`vLicense`,`vBrand`,`vModel`,`vPhone`,`vAffiliation`,`vMileage`,`registeredDate`,`purchaseDate`) VALUES(#{vehicle.cid},#{vehicle.vdriver},#{vehicle.vlicense},#{vehicle.vbrand},#{vehicle.vmodel},#{vehicle.vphone},#{vehicle.vaffiliation},#{vehicle.vmileage},#{vehicle.registereddate},#{vehicle.purchasedate})")
    int insertVehicle(@Param("vehicle") Vehicle vehicle);

    /**
<<<<<<< HEAD
     * 修改车辆信息
=======
     * 閿熺潾鏀圭鎷烽敓鏂ゆ嫹閿熸枻鎷锋伅
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
     */
    @Update("UPDATE `vehicle` SET `vDriver` = #{vehicle.vdriver},`vLicense` = #{vehicle.vlicense},`vBrand` = #{vehicle.vbrand},`vModel` = #{vehicle.vmodel},`vPhone` = #{vehicle.vphone},`vAffiliation` = #{vehicle.vaffiliation},`vMileage` = #{vehicle.vmileage},`registeredDate` = #{vehicle.registereddate},`purchaseDate` = #{vehicle.purchasedate} WHERE `vId` = #{vehicle.vid}")
    int updateVehicle(@Param("vehicle") Vehicle vehicle);

    /**
<<<<<<< HEAD
     * 查询车辆品牌
=======
     * 閿熸枻鎷烽敓鏂ゆ嫹鍝侀敓鐙℃唻鎷峰憰閿熸枻鎷烽敓鐙″嚖鎷烽敓鏂ゆ嫹閿熸枻鎷锋拠閿熺獤顕诲嚖鎷烽敓鏂ゆ嫹閿熻緝锟�
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
     */
    List<Make> queryMake(@Param("id") String id);

    /**
<<<<<<< HEAD
     * 查询车辆型号
=======
     * 閿熸枻鎷烽敓鎹风鎷烽敓閰垫唻鎷峰憰閿熸枻鎷峰彵閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷锋拠閿熺獤顖ゆ嫹閿熸枻鎷烽敓鏂ゆ嫹閿熻緝锟�
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
     */
    List<Motorcycle> queryMotorcycle(@Param("makeid") Integer makeid, @Param("id") String id);

    /**
<<<<<<< HEAD
     * 查询车辆型号
=======
     * 閿熸枻鎷烽敓鐙″嚖鎷烽閿熺粸鎲嬫嫹閿熸枻鎷疯閿熸枻鎷峰簲閿熶茎绛规嫹閿熸枻鎷�
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
     */
    @Select("SELECT * FROM motorcycle WHERE makeid = #{id}")
    List<Motorcycle> queryMotorcycle1(@Param("id") Integer id);

    /**
<<<<<<< HEAD
     * 删除车辆信息
=======
     * 鍒犻敓鏂ゆ嫹閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷锋伅
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
     */
    @Delete("DELETE FROM `vehicle` WHERE vId = #{vid}")
    int deleteVehicle(@Param("vid") Integer vid);

    /**
<<<<<<< HEAD
     * 查询车辆状态
=======
     * 閿熸枻鎷疯閿熸枻鎷烽敓鏂ゆ嫹缁撮敓鏂ゆ嫹閿熷彨鐨勭鎷烽敓鏂ゆ嫹
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
     *
     * @return
     */
    @Select("select * from `vehicle` ve  where ve.`vId` not in(select `maintainvehicleid` from `maintaincar` ma where ma.`receiptsid` NOT IN(5,4,3));")
    List<Vehicle> selectzhuangtai();
    
    
   
    
    
}