package com.accp.action.kwt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.kwt.MakeBiz;
import com.accp.pojo.Make;

@RestController
@RequestMapping("/api/Makes")
public class MakeAction {

	@Autowired
	private MakeBiz biz;
	/**
	 * 查询所有
	 * @return
	 */
	@GetMapping("/make")
	public List<Make> SelectMake(){
		return biz.SelectAll();
	}
	/**
	 * 新增
	 * @param make
	 * @return
	 */
	@PostMapping("/make")
	public Map<String, Object> insertMake(@RequestBody Make make){
		Map<String, Object> map=new HashMap<String, Object>();
		int count=biz.addMake(make);
		if(count>0) {
			map.put("code", "200");
		}else {
			map.put("code", "500");
		}
		return map;
	}
	/**
	 * 根据id删除
	 * @param id
	 * @return
	 */
	@DeleteMapping("/make/{id}")
	public Map<String, Object> removeById(@PathVariable Integer id){
		Map<String, Object> map=new HashMap<String, Object>();
		int count=biz.deleteByid(id);
		if(count>0) {
			map.put("code", "200");
		}else {
			map.put("code", "500");
		}
		return map;
	}
	/**
	 * 查询id是否相同
	 * @param id
	 * @return
	 */
	@GetMapping("/make/{id}")
	public List<Make> SelectById(@PathVariable Integer id){
		return biz.SelectByid(id);
	}
	/**
	 * 输入框查询
	 * @param name
	 * @return
	 */
	@GetMapping("/action/make/{name}")
	public List<Make> SelectByAll(@PathVariable String name){
		return biz.selectByAll(name);
	}
	/**
	 * 根据id修改
	 * @param make
	 * @return
	 */
	@PutMapping("/make")
	public Map<String, Object> uodateById(@RequestBody Make make){
		Map<String, Object> map=new HashMap<String, Object>();
		int count=biz.updateByid(make);
		if(count>0) {
			map.put("code", "200");
		}else {
			map.put("code", "500");
		}
		return map;
	}
}
