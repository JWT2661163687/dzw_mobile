package com.accp.biz.jwt;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.CompletedMapper;
import com.accp.dao.MaintaincarMapper;
import com.accp.dao.MaintaincarxiangmuMapper;
import com.accp.dao.MaintainreceiptsMapper;
import com.accp.pojo.Completed;
import com.accp.pojo.Maintaincar;
import com.accp.pojo.Maintaincarxiangmu;
import com.accp.pojo.Maintainreceipts;
@Service
public class MaintaincarBiz {
	@Autowired
	private MaintaincarMapper maintaincarMapper;
	@Autowired
	private MaintaincarxiangmuMapper maintaincarxiangmuMapper;
	@Autowired
	private CompletedMapper completedMapper;
	@Autowired 
	private MaintainreceiptsMapper maintainreceiptsMapper;
	
	 /**
     * 状态查询维修接车表
     * @param receiptsid
     * @return
     */

    public List<Maintaincar> selectAllReceiptsid(Integer receiptsid,Integer inside){
    	return maintaincarMapper.selectAllReceiptsid(receiptsid,inside);
    }
    
    /**
     * 新增接车表
     * @param record
     * @return
     */
    public int insertSelective(Maintaincar record) {
    	//新增主表
    	int co= maintaincarMapper.insertSelective(record);
    	//新增循环从表
    	return co;
    }
    
    
    /**
     * 接车id查询所有维修项目
     * @param mainno
     * @return
     */
    public List<Maintaincarxiangmu> selectAllid(Integer mainno){
    	return maintaincarxiangmuMapper.selectAllid(mainno);
    }
    
    
    /**
     * 修改状态
     * @param maintainid
     * @return
     */
    public int updateMaintaincarreceipts(Integer maintainid) {
    	return maintaincarMapper.updateMaintaincarreceipts(maintainid);
    }
    
	
    /**
     * 查询维修状态完成
     * @return
     */
    public List<Maintaincar> selectAllReceiptsidload(){
    	return maintaincarMapper.selectAllReceiptsidload();
    }
    
    
    /**
     * 新增竣工表
     * @param record
     * @return
     */
    public int insertSelective(Completed record) {
    	return completedMapper.insertSelective(record);
    }
    
    /**
     * 查询状态表
     * @return
     */
    public List<Maintainreceipts> selectAllMaintainreceipts(){
    	return maintainreceiptsMapper.selectAllMaintainreceipts();
    }
    
}
