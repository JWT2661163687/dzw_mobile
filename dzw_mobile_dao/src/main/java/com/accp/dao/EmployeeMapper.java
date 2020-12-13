package com.accp.dao;

import java.util.List;

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
     * 锟斤拷录
     *
     * @param username
     * @param password
     * @return
     */
    /**
     * 根据名字查询
     * @param name
     * @return
     */
    List<Employee> Selectemployee(@Param("id")Integer id);
    
    
    Employee selectlogin(@Param("username") String username, @Param("password") String password);
    
    /*
     * 	查询在职员工的信息     皮
     */
    
    List<Employee> selectyuangong(@Param("employeeid") Integer employeeid);
    
    /*
     * 	离职员工  皮
     */
    List<Employee> selectlizhi();

    /*
     * 	修改成离职员工
     */
    int updateyuangong(@Param("emplogenid") String emplogenid,@Param("yuanyin") String yuanyin);
}