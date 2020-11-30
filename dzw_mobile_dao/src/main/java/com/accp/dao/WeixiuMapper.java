package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
   /**
    * 根据发动机id查询
    * @param fid
    * @return
    */
   @Select("SELECT * FROM `weixiu` WHERE `Fid`=#{fid}")
   List<Weixiu> selectFid(@Param("fid")Integer fid);
   /**
    * 根据车型查询
    * @param cid
    * @return
    */
   @Select("select * from `weixiu` where `cid`=#{cid}")
   List<Weixiu> selectCid(@Param("cid")Integer cid);
   /**
    * 查询其他项目
    * @return
    */
   @Select("SELECT * FROM `weixiu` WHERE `cid` IS NULL AND `Fid` IS NULL")
   List<Weixiu> selectNull();
   
}