package com.accp.biz.pjw;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.EngineMapper;
import com.accp.dao.MotorcycleMapper;
import com.accp.dao.WeixiuMapper;
import com.accp.pojo.Engine;
import com.accp.pojo.Motorcycle;
import com.accp.pojo.Weixiu;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("WeixiuBiz")
public class WeixiuBiz {
		@Autowired
		private WeixiuMapper weixiumapper;
		
		@Autowired
		private MotorcycleMapper motorcyclemapper;		
		
		@Autowired
		private EngineMapper enginemapper;
		
		
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
	    * 	修改
	    * 	@param  xiugai
	    */
	 public  int updateweixiu(Weixiu xiugai) {
		   return weixiumapper.updateweixiu(xiugai);
	   }
	 
	 


    /* 		按维修cid 查询 维修项目信息
     * 	    @param cid
     * 		@return
     */
    public PageInfo<Weixiu> selectcid(Integer page1, Integer page2, Integer cid, String sousuo) {
        PageHelper.startPage(page1, page2);
        List<Weixiu> list = weixiumapper.selectcid(cid, sousuo);
        PageInfo<Weixiu> pageinfo = new PageInfo<Weixiu>(list);
        System.out.println("分页" + pageinfo);
        return pageinfo;
    }

    /*
     * 	新增
     * 	@param
     */
    public int insertweixiu(Weixiu weixiu) {
        return weixiumapper.insertweixiu(weixiu);
    }

    

    /*
     * 	删除
     * @param  xmid
     */
    public int deleteweixiu(Integer xmid) {
        return weixiumapper.deleteweixiu(xmid);
    }
    
    /*
     * 	康少的dao方法   
     */
    public List<Motorcycle> selectAlls(){
    		return motorcyclemapper.selectAlls();
    }
    
    /*
     * 	康少
     */
    
    public List<Engine> SelectAll(){
    	return enginemapper.SelectAll();    
    }
    
}
