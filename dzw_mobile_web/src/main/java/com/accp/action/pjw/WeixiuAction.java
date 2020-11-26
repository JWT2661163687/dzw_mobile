package com.accp.action.pjw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.pjw.WeixiuBiz;
import com.accp.pojo.Weixiu;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/weixiu")
public class WeixiuAction {
		@Autowired
		private WeixiuBiz weixiubiz;
		
		/* 		按维修cid 查询 维修项目信息
		 * 	    @param cid	 
		 * 		@return
		 */
		@GetMapping("/select")
	   public PageInfo<Weixiu> selectcid(@PathVariable Integer page1,@PathVariable Integer page2,@PathVariable Integer cid){
			return weixiubiz.selectcid(page1, page2, cid);	    	
	    }
		
}
