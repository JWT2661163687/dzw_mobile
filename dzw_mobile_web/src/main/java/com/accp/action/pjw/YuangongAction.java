package com.accp.action.pjw;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.pjw.YuangongBiz;
import com.accp.pojo.Employee;

@RestController
@RequestMapping("/api/yuangong")
public class YuangongAction {
		@Autowired
		private YuangongBiz biz;
		
		@GetMapping("select/{employeeid}")
		public List<Employee> selectyuangong(@PathVariable Integer employeeid){
			System.out.println("进来了");
		    return	biz.selectyuangong(employeeid);		    
	    }
		
		 /*
		   * 	离职员工  皮
		   */
		@GetMapping("lizhi")
		  public List<Employee> selectlizhi(){
			  return biz.selectlizhi();
		  }
		
		  /*
		   * 	修改成离职员工
		   */
		@PutMapping("update/{emplogenid}/{yuanyin}")
		 public Map<String,String> updateyuangong(@PathVariable String emplogenid,@PathVariable String yuanyin) {
			Map<String,String> message=new HashMap<String, String>();
			int gai= biz.updateyuangong(emplogenid, yuanyin);
			 if (gai > 0) {
		            System.out.println("修改成功");
		            message.put("code", "200");
		            message.put("msg", "ok");
		            return message;
		        }
		        return message;
		  }
}
