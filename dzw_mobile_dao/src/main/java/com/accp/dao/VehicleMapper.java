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
     * ����������ѯ������Ϣ
=======
     * 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷询锟斤拷锟斤拷锟斤拷息
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
     */
    List<Vehicle> queryVehicle(@Param("vid") Integer vid);

    /**
<<<<<<< HEAD
     * ����������ѯ�ó����ĳ�����Ϣ
=======
     * 双锟斤拷锟斤拷锟斤拷锟斤拷息锟斤拷示锟斤拷应锟斤拷锟矫伙拷锟斤拷息
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
     */
    @Select("SELECT * FROM `client` WHERE cId = #{cid}")
    List<Client> queryClient(@Param("cid") Integer cid);

    /**
<<<<<<< HEAD
     * ����������Ϣ
=======
     * 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷息
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
     */
    @Insert("INSERT INTO `vehicle`(`cId`,`vDriver`,`vLicense`,`vBrand`,`vModel`,`vPhone`,`vAffiliation`,`vMileage`,`registeredDate`,`purchaseDate`) VALUES(#{vehicle.cid},#{vehicle.vdriver},#{vehicle.vlicense},#{vehicle.vbrand},#{vehicle.vmodel},#{vehicle.vphone},#{vehicle.vaffiliation},#{vehicle.vmileage},#{vehicle.registereddate},#{vehicle.purchasedate})")
    int insertVehicle(@Param("vehicle") Vehicle vehicle);

    /**
<<<<<<< HEAD
     * �޸ĳ�����Ϣ
=======
     * 锟睫改筹拷锟斤拷锟斤拷息
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
     */
    @Update("UPDATE `vehicle` SET `vDriver` = #{vehicle.vdriver},`vLicense` = #{vehicle.vlicense},`vBrand` = #{vehicle.vbrand},`vModel` = #{vehicle.vmodel},`vPhone` = #{vehicle.vphone},`vAffiliation` = #{vehicle.vaffiliation},`vMileage` = #{vehicle.vmileage},`registeredDate` = #{vehicle.registereddate},`purchaseDate` = #{vehicle.purchasedate} WHERE `vId` = #{vehicle.vid}")
    int updateVehicle(@Param("vehicle") Vehicle vehicle);

    /**
<<<<<<< HEAD
     * ��ѯ����Ʒ��
=======
     * 锟斤拷锟斤拷品锟狡憋拷呕锟斤拷锟狡凤拷锟斤拷锟斤拷撇锟窖凤拷锟斤拷锟较�
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
     */
    List<Make> queryMake(@Param("id") String id);

    /**
<<<<<<< HEAD
     * ��ѯ�����ͺ�
=======
     * 锟斤拷锟捷筹拷锟酵憋拷呕锟斤拷叱锟斤拷锟斤拷锟斤拷撇锟窖拷锟斤拷锟斤拷锟较�
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
     */
    List<Motorcycle> queryMotorcycle(@Param("makeid") Integer makeid, @Param("id") String id);

    /**
<<<<<<< HEAD
     * ��ѯ�����ͺ�
=======
     * 锟斤拷锟狡凤拷频锟绞憋拷锟斤拷询锟斤拷应锟侥筹拷锟斤拷
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
     */
    @Select("SELECT * FROM motorcycle WHERE makeid = #{id}")
    List<Motorcycle> queryMotorcycle1(@Param("id") Integer id);

    /**
<<<<<<< HEAD
     * ɾ��������Ϣ
=======
     * 删锟斤拷锟斤拷锟斤拷锟斤拷息
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
     */
    @Delete("DELETE FROM `vehicle` WHERE vId = #{vid}")
    int deleteVehicle(@Param("vid") Integer vid);

    /**
<<<<<<< HEAD
     * ��ѯ����״̬
=======
     * 锟斤拷询锟斤拷锟斤拷维锟斤拷锟叫的筹拷锟斤拷
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
     *
     * @return
     */
    @Select("select * from `vehicle` ve  where ve.`vId` not in(select `maintainvehicleid` from `maintaincar` ma where ma.`receiptsid` NOT IN(5,4,3));")
    List<Vehicle> selectzhuangtai();
    
    
   
    
    
}