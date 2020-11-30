package com.accp.biz.zsj;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.ClientMapper;
import com.accp.pojo.Client;
import com.accp.pojo.Vehicle;

@Service("clientBiz")
public class ClientBiz {

	@Autowired
	private ClientMapper dao;
	
	/**
     * 	根据条件查询客户
     */
    public List<Client> queryClient(@Param("cid")Integer cid){
    	return dao.queryClient(cid);
    }
    
    /**
     * 	新增新客户
     */
    public int insertClient(@Param("client")Client client) {
    	return dao.insertClient(client);
    }
    
    /**
     * 	修改客户信息
     */
    public int updateClient(@Param("client")Client client) {
    	return dao.updateClient(client);
    }
    
    /**
     * 	删除客户信息
     */
    public int deleteClient(@Param("cid")Integer cid) {
    	return dao.deleteClient(cid);
    }
    
    /**
     *	 双击客户查询该客户的车辆信息
     */
    public List<Vehicle> queryVehicle(@Param("cid")Integer cid){
    	return dao.queryVehicle(cid);
    }
}
