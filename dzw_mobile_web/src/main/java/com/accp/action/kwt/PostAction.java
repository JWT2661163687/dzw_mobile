package com.accp.action.kwt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.kwt.PostBiz;
import com.accp.pojo.Post;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/Posts")
public class PostAction {

	@Autowired
	private PostBiz biz;
	/**
	 * 根据部门id查询
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}/{pageNum}/{pageSize}")
	public PageInfo<Post> SelectAll(@PathVariable Integer id,@PathVariable int pageNum,@PathVariable int pageSize){
		return biz.selectAll(id, pageNum, pageSize);
	}
	/**
	 * 查询岗位表所有
	 * @return
	 */
	@GetMapping("/Post/{pageNum}/{pageSize}")
	public PageInfo<Post> Select(@PathVariable int pageNum,@PathVariable int pageSize){
		return biz.selectAll(null, pageNum, pageSize);
	}
	/**
	 * 新增
	 * @param p
	 * @return
	 */
	@PostMapping("/Post")
	public Map<String, Object> AddPost(@RequestBody Post p) {
		Map<String, Object> map=new HashMap<String, Object>();
		int count=biz.addPost(p);
		if(count>0) {
			map.put("code", "200");
		}else {
			map.put("code", "500");
		}
		return map;
	}
	/**
	 * 查询id是否相同
	 * @param postid
	 * @return
	 */
	@GetMapping("/Post/{postid}")
	public List<Post> SelectById(@PathVariable Integer postid){
		return biz.SelectByid(postid);
	}
	/**
	 * 根据id删除
	 * @param id
	 * @return
	 */
	@PostMapping("/delete")
	public Map<String, Object> DeleteByPostId(@RequestBody List<Post> Listid){
		Map<String, Object> map=new HashMap<String, Object>();
		int count=biz.deleteBypostid(Listid);
		if(count>0) {
			map.put("code", "200");
		}else {
			map.put("code", "500");
		}
		return map;
	}
}
