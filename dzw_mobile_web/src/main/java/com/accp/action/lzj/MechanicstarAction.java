package com.accp.action.lzj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lzj.MechanicstarBiz;
import com.accp.pojo.Mechanicstar;


@RestController
@RequestMapping("/api/mech")
@CrossOrigin
public class MechanicstarAction {
	@Autowired
	private MechanicstarBiz biz;
	
	/**
	 * 查询全部123123
	 * @return
	 */
	@GetMapping("lzjquery")
	public List<Mechanicstar> queryMechanicstar(){
		return biz.queryMechan();
	}
	
	/**
	 * 新增技工
	 */
	@PostMapping("insert")
	public Map<String, String> insertStudent(@RequestBody Mechanicstar mechanicstar) {
		Map<String, String> message = new HashMap<String, String>();
		biz.insertMechan(mechanicstar);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	/**
	 * 修改技工
	 */
	@PutMapping("update")
	public Map<String, String> updatePersonInfo(@RequestBody Mechanicstar mechanicstar) {
		Map<String, String> message = new HashMap<String, String>();
		biz.updateMechan(mechanicstar);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	/**
	 * 删除技工
	 */
	@DeleteMapping("mechs/{meid}")
	public int deleteMechan(@PathVariable String meid) {
		return biz.deleteMechan(meid);
	}
}
