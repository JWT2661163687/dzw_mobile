package com.accp.biz.zsj;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.VehicleMapper;
import com.accp.pojo.Client;
import com.accp.pojo.Make;
import com.accp.pojo.Motorcycle;
import com.accp.pojo.Vehicle;

@Service("vehicleBiz")
public class VehicleBiz {

	@Autowired
	private VehicleMapper dao;
	
	/**
     * 根据条件查询车辆信息
     */
    public List<Vehicle> queryVehicle(@Param("vid")Integer vid){
    	return dao.queryVehicle(vid);
    }
    
    /**
     * 双击车辆信息显示对应的用户信息
     */
    public List<Client> queryClient(@Param("cid")Integer cid){
    	return dao.queryClient(cid);
    }
    
    /**
     * 新增车辆信息
     */
    public int insertVehicle(@Param("vehicle")Vehicle vehicle) {
    	return dao.insertVehicle(vehicle);
    }
    
    /**
     * 修改车辆信息
     */
    public int updateVehicle(@Param("vehicle")Vehicle vehicle) {
    	return dao.updateVehicle(vehicle);
    }
    
    /**
     * 删除车辆信息
     */
    public int deleteVehicle(@Param("vid")Integer vid) {
    	return dao.deleteVehicle(vid);
    }
    
    /**
     *	 根据品牌编号或者品牌名称查询品牌信息
     */
    public List<Make> queryMake(@Param("id")String id){
    	return dao.queryMake(id);
    }
    
    /**
     * 	根据车型编号或者车型名称查询车辆信息
     */
    public List<Motorcycle> queryMotorcycle(@Param("makeid") Integer makeid,@Param("id")String id){
    	return dao.queryMotorcycle(makeid,id);
    }
    
    /**
     * 	点击品牌的时候查询对应的车型
     */
    public List<Motorcycle> queryMotorcycle1(@Param("id")Integer id){
    	return dao.queryMotorcycle1(id);
    }
}
