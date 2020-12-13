package com.accp.action.kwt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.kwt.EmployeeBiz;
import com.accp.pojo.Employee;

@RestController
@RequestMapping("/api/Employees")
public class EmployeeAction {

	@Autowired
	private EmployeeBiz biz;
	@GetMapping("/Employee/{id}")
	public List<Employee> SelectEmployee(@PathVariable Integer id){
		return biz.SelectAll(id);
	}
	@PostMapping("/Employee")
	public Map<String, Object> insertEmployee(@RequestBody Employee record){
		Map<String, Object> map=new HashMap<String, Object>();
		int count=biz.addEmployee(record);
		if(count>0) {
			map.put("code", "200");
		}else {
			map.put("code", "500");
		}
		return map;
	}
	@GetMapping("/{name}")
	public List<Employee> SelectByName(@PathVariable String name){
		return biz.SelectByname(name);
	}
}
