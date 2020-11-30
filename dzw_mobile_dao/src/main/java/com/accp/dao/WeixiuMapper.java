package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Weixiu;

public interface WeixiuMapper {
    int deleteByPrimaryKey(Integer xmid);

    int insert(Weixiu record);

    int insertSelective(Weixiu record);

    Weixiu selectByPrimaryKey(Integer xmid);

    int updateByPrimaryKeySelective(Weixiu record);

    int updateByPrimaryKey(Weixiu record);
    
    /* 		按维修cid 查询 维修项目信息
	 * 	    @param cid	 
	 * 		@return
	 */
    List<Weixiu> selectcid(@Param("cid") Integer cid,@Param("sousuo") String sousuo);
    
   /*
    * 	新增
    * 	@param  weixiu
    */
   int insertweixiu(@Param("weixiu") Weixiu weixiu);
   
   /*
    * 	修改
    * 	@param  xiugai
    */
   int updateweixiu(@Param("xiugai") Weixiu xiugai);
   
   /*
    * 	删除
    */ 
   int deleteweixiu(@Param("xmid") Integer xmid);
   
   
   
   
}