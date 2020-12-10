package com.accp.biz.pjw;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.EmployeeMapper;
import com.accp.pojo.Employee;

@Service("YuangongBiz")
public class YuangongBiz {
	@Autowired
	private EmployeeMapper employeemapper;

    /*
     * 查询在职员工的信息     皮
     */
    
  public  List<Employee> selectyuangong( Integer employeeid){
    return	employeemapper.selectyuangong(employeeid);
    
    }
  
  /*
   * 	离职员工  皮
   */
  public List<Employee> selectlizhi(){
	  return employeemapper.selectlizhi();
  }
  
  /*
   * 	修改成离职员工
   */
 public int updateyuangong( String emplogenid, String yuanyin) {
	  return employeemapper.updateyuangong(emplogenid, yuanyin);
  }
}
