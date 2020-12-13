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
     * ��¼
     *
     * @param username
     * @param password
     * @return
     */
    /**
     * �������ֲ�ѯ
     * @param name
     * @return
     */
    List<Employee> Selectemployee(@Param("id")Integer id);
    
    
    Employee selectlogin(@Param("username") String username, @Param("password") String password);
    
    /*
     * 	��ѯ��ְԱ������Ϣ     Ƥ
     */
    
    List<Employee> selectyuangong(@Param("employeeid") Integer employeeid);
    
    /*
     * 	��ְԱ��  Ƥ
     */
    List<Employee> selectlizhi();

    /*
     * 	�޸ĳ���ְԱ��
     */
    int updateyuangong(@Param("emplogenid") String emplogenid,@Param("yuanyin") String yuanyin);
}