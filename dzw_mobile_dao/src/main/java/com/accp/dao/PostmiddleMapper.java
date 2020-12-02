package com.accp.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Postmiddle;

public interface PostmiddleMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Postmiddle record);
    /**
     * 新增权限
     * @param record
     * @return
     */
    int insertSelective(Postmiddle record);

    Postmiddle selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Postmiddle record);

    int updateByPrimaryKey(Postmiddle record);
    /**
     * 删除所有权限
     * @param rid
     * @return
     */
    @Delete("delete from postmiddle where rid=#{rid}")
    int deletepostmiddrid(@Param("rid")Integer rid);
    /**
     * 
     * @param rid
     * @param fid
     * @return
     */
    @Insert("insert into postmiddle values(null,#{rid},#{fid})")
    int insertMidd(@Param("rid")Integer rid,@Param("fid")Integer fid);
    
    
    
}