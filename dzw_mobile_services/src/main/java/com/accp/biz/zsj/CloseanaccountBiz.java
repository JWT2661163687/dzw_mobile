package com.accp.biz.zsj;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.CloseanaccountMapper;
import com.accp.pojo.Closeanaccount;
import com.accp.pojo.Employee;
import com.accp.pojo.Maintaincar;
import com.accp.pojo.Member;

@Service("closeanaccountBiz")
public class CloseanaccountBiz {

	@Autowired
	private CloseanaccountMapper dao;
	
	 /**
     * 查询所有待结算的数据
     * @param mid
     * @param cid
     * @return
     */
    public List<Maintaincar> queryCar(@Param("mId")Integer mid,@Param("cId")Integer cid){
    	return dao.queryCar(mid, cid);
    }
    
    /**
     * 查询所有结算的数据
     * @param rid
     * @param cid
     * @return
     */
   public List<Closeanaccount> queryCount(@Param("rid")Integer rid,@Param("cid")Integer cid){
    	return dao.queryCount(rid, cid);
    }
    
    /**
     * 根据客户id查询该客户是否为本店员工
     * @param cid
     * @return
     */
    public Employee queryEmp(@Param("cid")Integer cid) {
    	return dao.queryEmp(cid);
    }
    
    /**
     * 根据客户id查询该客户是否为会员
     * @param cid
     * @return
     */
    public Member queryMember(@Param("cid")Integer cid) {
    	return dao.queryMember(cid);
    }
    
    /**
     * 新增结算信息
     * @param count
     * @return
     */
    public int insertCount(@Param("count")Closeanaccount count) {
    	return dao.insertCount(count);
    }
    
    /**
     * 修改会员表余额
     */
    public int updateMen(@Param("cid")Integer cid,@Param("jine")Integer jine) {
    	return dao.updateMen(cid, jine);
    }
    
    /**
     * 把待结算订单修改为已结算
     */
    public int updateCarTeamid(@Param("teamid")Integer teamid,@Param("carid")Integer carid) {
    	return dao.updateCarTeamid(teamid,carid);
    }
}
