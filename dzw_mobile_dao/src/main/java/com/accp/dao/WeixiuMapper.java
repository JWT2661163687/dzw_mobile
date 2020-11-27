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
    
    /* 		��ά��cid ��ѯ ά����Ŀ��Ϣ
	 * 	    @param cid	 
	 * 		@return
	 */
    List<Weixiu> selectcid(@Param("cid") Integer cid,@Param("sousuo") String sousuo);
    
   /*
    * 	����
    * 	@param  weixiu
    */
   int insertweixiu(@Param("weixiu") Weixiu weixiu);
   
   /*
    * 	�޸�
    * 	@param  xiugai
    */
   int updateweixiu(@Param("xiugai") Weixiu xiugai);
   
   /*
    * 	ɾ��
    */ 
   int deleteweixiu(@Param("xmid") Integer xmid);
   
   
   
   
}