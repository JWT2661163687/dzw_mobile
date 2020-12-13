package com.accp.biz.kwt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.DepartmentMapper;
import com.accp.pojo.Department;

@Service
public class DepartmentBiz {

	@Autowired
	private DepartmentMapper departmentMapper;
	/**
	 * 查询所有部门
	 * @return
	 */
	public List<Department> Departmenttree(){
		return departmentMapper.loadDepartment();
	}
	
	public List<Department> SelectAlls(){
		return departmentMapper.SelectAll();
	}
}
