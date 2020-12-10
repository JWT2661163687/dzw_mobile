package com.accp.action.kwt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.kwt.EmployeeBiz;
import com.accp.pojo.Employee;

@RestController
@RequestMapping("/api/Employees")
public class EmployeeAction {

	@Autowired
	private EmployeeBiz biz;
	@GetMapping("Employee/{id}")
	public List<Employee> SelectEmployee(@PathVariable Integer id){
		return biz.SelectAll(id);
	}
}
