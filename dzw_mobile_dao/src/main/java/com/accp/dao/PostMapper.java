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
     * 查询所有岗位和功能
     * @return
     */
    List<Post> selectPost();
    /**
     * 查询所有岗位
     * @param id
     * @return
     */
    List<Post> SelectAll(@Param("id")Integer id);
    /**
     * 新增岗位表
     * @param p
     * @return
     */
    @Insert("INSERT INTO `post` VALUES(#{p.postid},#{p.departmentid},#{p.postname},NULL,NULL,NULL,NULL)")
    int insertPot(@Param("p")Post p);
    /**
     * 根据id查询是否相同
     * @param postid
     * @return
     */
    @Select("SELECT * FROM `post` WHERE postid=#{id}")
    List<Post> SelectById(@Param("id")Integer postid);
    /**
     * 根据id删除
     * @param id
     * @return
     */
    int DeleteById(@Param("Listid")List<Post> Listid);
    
}