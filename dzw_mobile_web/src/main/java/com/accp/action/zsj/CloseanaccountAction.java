package com.accp.action.zsj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zsj.CloseanaccountBiz;
import com.accp.dao.CloseanaccountMapper;
import com.accp.pojo.Closeanaccount;
import com.accp.pojo.Employee;
import com.accp.pojo.Maintaincar;
import com.accp.pojo.Member;

@RestController
@RequestMapping("api/counts")
public class CloseanaccountAction {

	@Autowired
	private CloseanaccountBiz biz;
	
	 /**
     * 查询所有待结算的数据
     * @param mid
     * @param cid
     * @return
     */
	@GetMapping("car/{mId}/{cId}/{date1}")
    public List<Maintaincar> queryCar(@PathVariable Integer mId,@PathVariable Integer cId,@PathVariable Integer date1){
		System.out.println("a "+date1);
    	return biz.queryCar(mId, cId,date1);
    }
    
    /**
     * 查询所有结算的数据
     * @param rid
     * @param cid
     * @return
     */
	@GetMapping("count/{rid}/{cid}")
   public List<Closeanaccount> queryCount(@PathVariable Integer rid,@PathVariable Integer cid){
    	return biz.queryCount(rid, cid);
    }
    
    /**
     * 根据客户id查询该客户是否为本店员工
     * @param cid
     * @return
     */
	@GetMapping("emp/{cid}")
    public Employee queryEmp(@PathVariable Integer cid) {
    	return biz.queryEmp(cid);
    }
    
    /**
     * 根据客户id查询该客户是否为会员
     * @param cid
     * @return
     */
	@GetMapping("member/{cid}")
    public Member queryMember(@PathVariable Integer cid) {
    	return biz.queryMember(cid);
    }
    
    /**
     * 新增结算信息
     * @param count
     * @return
     */
	@PostMapping("count")
    public Map<String, String> insertCount(@RequestBody Closeanaccount count) {
		int count1 = biz.insertCount(count);
		Map<String, String> map = new HashMap<String, String>();
		if(count1>0) {
			map.put("code", "200");
		}
    	return map;
    }
	
	/**
     * 修改会员表余额
     */
	@PostMapping("mem/{cid}/{jine}/{as}/{jin}/{mainid}")
    public Map<String, String> updateMen(@PathVariable Integer cid,@PathVariable Integer jine,@PathVariable Integer as,@PathVariable Integer jin,@PathVariable Integer mainid,@RequestBody Closeanaccount cou) {
		int count = 0;
		int jine1 = 0;
		int jine2 = 0;
		if(as == 1) {
			jine1 = jine;
			jine2 = jine1-jine;
			count = biz.updateMen(cid, jine1);
		}else if(as == 2){
			jine1 = jin;
			jine2 = jin;
			count = biz.updateMen(cid, jine1);
		}
		cou.setCbalance(jine2);
		int count1 = biz.insertCount(cou);
		int count2 = biz.updateCarTeamid(5, mainid);
		Map<String, String> map = new HashMap<String, String>();
		map.put("code", "200");
    	return map;
    }
	
	/**
     * 查询全部待结算的信息
     * 
     */
	@GetMapping("queryCloseAll")
    public List<Maintaincar> queryCloseAll(){
    	return biz.queryCloseAll();
    }
	
	/**
	 * 根据客户id查询该客户是否为会员
	 */
	@GetMapping("mem/{cid}")
	public Member queryMem(@PathVariable Integer cid) {
		return biz.queryMember(cid);
	}
}
