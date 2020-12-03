package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Shangpin;

public interface ShangpinMapper {
    int deleteByPrimaryKey(Integer spid);

    int insert(Shangpin record);

    int insertSelective(Shangpin record);

    Shangpin selectByPrimaryKey(Integer spid);

    int updateByPrimaryKeySelective(Shangpin record);

    int updateByPrimaryKey(Shangpin record);

    /*
     *  ��ҳ��ѯ��Ʒ��  ��Ϣ
     *  @Param   sousuo  daid
     */
    List<Shangpin> selectshangpin(@Param("sousuo") String sousuo, @Param("daid") Integer daid);
}