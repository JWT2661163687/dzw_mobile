package com.accp.action.kwt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.kwt.DepartmentBiz;
import com.accp.pojo.Department;

@RestController
@RequestMapping("/api/Departments")
public class DepartmentAction {

	@Autowired
	private DepartmentBiz biz;
	
	@GetMapping("/Department")
	public List<Department> SelectTree(){
		return biz.Departmenttree();
	}
}
