package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
    /**
     * ��ѯ���и�λ
     * @param id
     * @return
     */
    List<Post> SelectAll(@Param("id")Integer id);
    /**
     * ������λ��
     * @param p
     * @return
     */
    @Insert("INSERT INTO `post` VALUES(#{p.postid},#{p.departmentid},#{p.postname},NULL,NULL,NULL,NULL)")
    int insertPot(@Param("p")Post p);
    /**
     * ����id��ѯ�Ƿ���ͬ
     * @param postid
     * @return
     */
    @Select("SELECT * FROM `post` WHERE postid=#{id}")
    List<Post> SelectById(@Param("id")Integer postid);
    /**
     * ����idɾ��
     * @param id
     * @return
     */
    int DeleteById(@Param("Listid")List<Post> Listid);
    
}