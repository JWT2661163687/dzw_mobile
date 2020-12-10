package com.accp.action.pjw;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.pjw.ShangpinBiz;
import com.accp.pojo.Shangpin;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/shangpin")
public class ShangpinAction {
		@Autowired 
		private ShangpinBiz shangpinbiz;
		
		/*
	     * 	 分页查询商品表  信息
	     *  @Param   sousuo  fid
	     */
		@GetMapping("select/{page1}/{page2}/{sousuo}")
		 public PageInfo<Shangpin> selectshangpin(@PathVariable Integer page1,@PathVariable Integer page2,@PathVariable String sousuo){	    

			shangpinbiz.selectshangpin(page1,page2,sousuo).getList().forEach(temp->{
				System.out.println("a "+temp);
			});
			return shangpinbiz.selectshangpin(page1,page2,sousuo);   	   	
	    }
		
		/*
	     *  	修改
	     *  	@param xiugai  spid
	     */
		@PutMapping("update")
	   public Map<String,String> updateshangpin(@RequestBody Shangpin xiugai) {
			//System.out.println("进来了");
			//System.out.println("aa："+xiugai.getSpshoujia());
			Map<String,String> message=new HashMap<String,String>();
			int gai=shangpinbiz.updateshangpin(xiugai);
			if(gai>0) {
				System.out.println("修改成功");
 				message.put("code", "200");
 				message.put("msg", "ok");
 				return message;
			}
			return message;	
	    }
		
		 /*
	     * 新增
	     * @param zeng
	     */
		@PostMapping("insert")
	   public Map<String,String> insertshangpin(@RequestBody Shangpin zeng) {
			System.out.println("进来了");
			//System.out.println("aa："+xiugai.getSpshoujia());
			Map<String,String> message=new HashMap<String,String>();
			int a=shangpinbiz.insertshangpin(zeng);
			if(a>0) {
				System.out.println("新增成功");
 				message.put("code", "200");
 				message.put("msg", "ok");
 				return message;
			}
			return message;	
	    }
		
		/*
	     * 删除
	     * @param spid
	     */
		@DeleteMapping("shanchu/{spid}")
		 public Map<String,String> deleteshangpin(@PathVariable Integer spid) {
			Map<String,String> message=new HashMap<String,String>();
			int b=shangpinbiz.deleteshangpin(spid);
			if(b>0) {
				System.out.println("删除成功");
 				message.put("code", "200");
 				message.put("msg", "ok");
 				return message;
			}
			return message;	
		    }
		

    /*
     *  分页查询商品表  信息
     *  @Param   sousuo  fid
     */
    @GetMapping("select/{page1}/{page2}/{sousuo}/{daid}")
    public PageInfo<Shangpin> selectshangpin(@PathVariable Integer page1, @PathVariable Integer page2, @PathVariable String sousuo, @PathVariable Integer daid) {
        System.out.println("进来了");
        shangpinbiz.selectshangpin(page1, page2, sousuo, daid).getList().forEach(temp -> {
            System.out.println("a " + temp);
        });
        return shangpinbiz.selectshangpin(page1, page2, sousuo, daid);
    }

}
