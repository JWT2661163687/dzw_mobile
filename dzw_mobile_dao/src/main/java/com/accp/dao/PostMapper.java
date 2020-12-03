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
     * ��ѯ���и�λ�͹���
     * @return
     */
    List<Post> selectPost();
    
    
}