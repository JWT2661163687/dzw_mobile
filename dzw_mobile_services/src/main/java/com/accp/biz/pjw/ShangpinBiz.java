package com.accp.biz.pjw;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.ShangpinMapper;
import com.accp.pojo.Shangpin;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("ShangpinBiz")
public class ShangpinBiz {
		@Autowired
		private ShangpinMapper shangpinmapper;
		/*
	     *  分页查询商品表  信息
	     *  @Param   sousuo  daid
	     */
	   public PageInfo<Shangpin> selectshangpin(Integer page1,Integer page2,String sousuo, Integer daid){
	    	PageHelper.startPage(page1, page2);
	    	List<Shangpin> list=shangpinmapper.selectshangpin(sousuo, daid);
	    	PageInfo<Shangpin> pageinfo=new PageInfo<Shangpin>(list);
	    	return pageinfo;
	    }

}
