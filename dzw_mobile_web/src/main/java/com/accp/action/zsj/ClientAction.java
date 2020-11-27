package com.accp.action.zsj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zsj.ClientBiz;
import com.accp.dao.ClientMapper;
import com.accp.pojo.Client;
import com.accp.pojo.Vehicle;

@RestController
@RequestMapping("api/clients")
public class ClientAction {

	@Autowired
	private ClientBiz biz;
	
	/**
     * 	根据条件查询客户
     */
	@GetMapping("{cid}")
    public List<Client> queryClient(@PathVariable Integer cid){
    	return biz.queryClient(cid);
    }
    
    /**
     * 	新增新客户
     */
	@PostMapping("client")
    public Map<String, String> insertClient(@RequestBody Client client) {
		int count = biz.insertClient(client);
		Map<String, String> map = new HashMap<String, String>();
		if(count>0) {
			map.put("code", "200");
		}
    	return map;
    }
    
    /**
     * 	修改客户信息
     */
	@PutMapping("client")
    public Map<String, String> updateClient(@RequestBody Client client) {
		int count = biz.updateClient(client);
		Map<String, String> map = new HashMap<String, String>();
		if(count>0) {
			map.put("code", "200");
		}
    	return map;
    }
    
    /**
     * 	删除客户信息
     */
	@DeleteMapping("client/{cid}")
    public Map<String, String> deleteClient(@PathVariable Integer cid) {
		int count = biz.deleteClient(cid);
		Map<String, String> map = new HashMap<String, String>();
		if(count>0) {
			map.put("code", "200");
		}
    	return map;
    }
    
    /**
     *	 双击客户查询该客户的车辆信息
     */
	@GetMapping("client1/{cid}")
    public List<Vehicle> queryVehicle(@PathVariable Integer cid){
		System.out.println("c  "+cid);
		biz.queryVehicle(cid).forEach(temp->{
			System.out.println("a "+temp);
		});
    	return biz.queryVehicle(cid);
    }
}
