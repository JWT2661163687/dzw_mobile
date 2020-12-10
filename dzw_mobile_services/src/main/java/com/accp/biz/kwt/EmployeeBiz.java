package com.accp.biz.kwt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.EmployeeMapper;
import com.accp.pojo.Employee;

@Service
public class EmployeeBiz {
	@Autowired
	private EmployeeMapper employeeMapper;
	/**
	 * 根据部门查询
	 * @param id
	 * @return
	 */
	public List<Employee> SelectAll(Integer id){
		return employeeMapper.Selectemployee(id);
	}
}
