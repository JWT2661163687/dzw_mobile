package com.accp.biz.pjw;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.WeixiuMapper;
import com.accp.pojo.Weixiu;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("WeixiuBiz")
public class WeixiuBiz {
		@Autowired
		private WeixiuMapper weixiumapper;
		
		/* 		按维修cid 查询 维修项目信息
		 * 	    @param cid	 
		 * 		@return
		 */
	   public PageInfo<Weixiu> selectcid(Integer page1,Integer page2,String sousuo){
	    	PageHelper.startPage(page1,page2);
	    	List<Weixiu> list=weixiumapper.selectcid(sousuo );
	    	PageInfo<Weixiu> pageinfo=new PageInfo<Weixiu>(list);
	    	System.out.println("分页"+pageinfo);
	    	return pageinfo;
	    }
	   
	   /*
	    * 	新增
	    * 	@param
	    */
	   public  int insertweixiu(Weixiu weixiu) {
		 return  weixiumapper.insertweixiu(weixiu);
	   }
	   
	   /*
	    * 	修改
	    * 	@param  xiugai
	    */
	 public  int updateweixiu(Weixiu xiugai) {
		   return weixiumapper.updateweixiu(xiugai);
	   }
	 
	   /*
	    * 	删除
	    * @param  xmid
	    */ 
	  public int deleteweixiu(Integer xmid) {
		   return weixiumapper.deleteweixiu(xmid);
	   }
}
