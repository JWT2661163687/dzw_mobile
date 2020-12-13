package com.accp.biz.kwt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.PostMapper;
import com.accp.pojo.Post;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("PostBiz")
public class PostBiz {

	@Autowired
	private PostMapper postMapper;
	/**
	 * 页面查询
	 * @param id
	 * @return
	 */
	public PageInfo<Post> selectAll(Integer id,int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Post>(postMapper.SelectAll(id));
	}
	/**
	 * 新增岗位表
	 * @param p
	 * @return
	 */
	public int addPost(Post p) {
		return postMapper.insertPot(p);
	}
	/**
	 * 根据id查询
	 * @param postid
	 * @return
	 */
	public List<Post> SelectByid(Integer postid){
		return postMapper.SelectById(postid);
	}
	/**
	 * 根据id删除
	 * @param id
	 * @return
	 */
	public int deleteBypostid(List<Post> Listid) {
		return postMapper.DeleteById(Listid);
	}
	/**
	 * 根据部门id查询岗位表
	 * @param id
	 * @return
	 */
	public List<Post> SelectDepartmentByid(Integer id){
		return postMapper.SelectDepartmentById(id);
	}
}
