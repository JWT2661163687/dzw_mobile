package com.accp.dao;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Employee;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer employeeid);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer employeeid);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    /**
     * ��¼
     *
     * @param username
     * @param password
     * @return
     */
    Employee selectlogin(@Param("username") String username, @Param("password") String password);


}