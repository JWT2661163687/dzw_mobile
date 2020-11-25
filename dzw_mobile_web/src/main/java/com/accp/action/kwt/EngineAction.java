package com.accp.action.kwt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.kwt.EngineBiz;
import com.accp.pojo.Engine;

@RestController
@RequestMapping("/api/engines")
public class EngineAction {

	@Autowired
	private EngineBiz biz;
	/**
	 * 查询所有
	 * @return
	 */
	@GetMapping("/engine")
	public List<Engine> SelectAll(){
		return biz.SelectPage();
	}
	/**
	 * 新增所有
	 * @param engine
	 * @return
	 */
	@PostMapping("/engine")
	public Map<String, Object> insertEngine(@RequestBody Engine engine){
		Map<String, Object> map=new HashMap<String, Object>();
		int count=biz.addEngine(engine);
		if(count>0) {
			map.put("code", "200");
		}else {
			map.put("code", "500");
		}
		return map;
	}
	/**
	 * 根据名称模糊查询
	 * @param name
	 * @return
	 */
	@GetMapping("/engine/{name}")
	public List<Engine> SelectByName(@PathVariable String name){
		return biz.SelectByname(name);
	}
	/**
	 * 根据id删除
	 * @param id
	 * @return
	 */
	@DeleteMapping("/engine/{id}")
	public Map<String, Object> DeleteById(@PathVariable Integer id){
		Map<String, Object> map=new HashMap<String, Object>();
		int count=biz.deleteById(id);
		if(count>0) {
			map.put("code", "200");
		}else {
			map.put("code", "500");
		}
		return map;
	}
}
