package com.accp.biz.jwt;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.EmployeeMapper;
import com.accp.pojo.Employee;

@Service
public class LoginjurisdictionBiz {
    @Autowired
    private EmployeeMapper employeeMapper;


    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
     */
    public Employee selectlogin(String username, String password) {
        return employeeMapper.selectlogin(username, password);
    }

}
