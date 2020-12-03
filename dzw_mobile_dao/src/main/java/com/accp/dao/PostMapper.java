package com.accp.dao;

import java.util.List;

import com.accp.pojo.Post;

public interface PostMapper {
    int deleteByPrimaryKey(Integer postid);

    int insert(Post record);

    int insertSelective(Post record);

    Post selectByPrimaryKey(Integer postid);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);
    
    /**
     * 查询所有岗位和功能
     * @return
     */
    List<Post> selectPost();
    
    
}