package com.accp.biz.jwt;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.EmployeeMapper;
import com.accp.dao.FunctiontableMapper;
import com.accp.dao.PostMapper;
import com.accp.dao.PostmiddleMapper;
import com.accp.pojo.Employee;
import com.accp.pojo.Functiontable;
import com.accp.pojo.Post;
import com.accp.pojo.Postmiddle;

@Service
public class LoginjurisdictionBiz {
<<<<<<< HEAD
    @Autowired
    private EmployeeMapper employeeMapper;


    /**
=======
	@Autowired 
	private EmployeeMapper employeeMapper;
	@Autowired
	private FunctiontableMapper functiontableMapper;
	@Autowired
	private PostMapper postMapper;
	@Autowired
	private PostmiddleMapper postmiddleMapper;
	
	 /**
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
     * 登录
     *
     * @param username
     * @param password
     * @return
     */
    public Employee selectlogin(String username, String password) {
        return employeeMapper.selectlogin(username, password);
    }
<<<<<<< HEAD

=======
    
    
    
    /**
     * 查询所有功能
     * @return
     */
    public List<Functiontable> selectAllfunctiontable(){
    	return functiontableMapper.selectAllfunctiontable();
    }
    /**
     * 查询所有岗位和功能
     * @return
     */
    public List<Post> selectPost(){
    	return postMapper.selectPost();
    }
    
    /**
     * 删除所有权限
     * @param rid
     * @return
     */
    public int deletepostmiddrid(Integer rid) {
    	return postmiddleMapper.deletepostmiddrid(rid);
    }
    
    /**
     * 新增权限
     * @param record
     * @return
     */
    public int insertSelective(Postmiddle postmiddle) {
    	
    	return postmiddleMapper.insertSelective(postmiddle);
    }
    
    
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
}
