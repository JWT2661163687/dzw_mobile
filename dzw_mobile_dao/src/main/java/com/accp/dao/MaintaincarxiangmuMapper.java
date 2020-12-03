package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Maintaincarxiangmu;

public interface MaintaincarxiangmuMapper {
    int deleteByPrimaryKey(Integer xmid);

    int insert(Maintaincarxiangmu record);

    int insertSelective(Maintaincarxiangmu record);

    Maintaincarxiangmu selectByPrimaryKey(Integer xmid);

    int updateByPrimaryKeySelective(Maintaincarxiangmu record);

    int updateByPrimaryKey(Maintaincarxiangmu record);


    /**
     * �ӳ�id��ѯ����ά����Ŀ
     *
     * @param mainno
     * @return
     */
    @Select("select * from maintaincarxiangmu where mainno=#{mainno}")
    List<Maintaincarxiangmu> selectAllid(@Param("mainno") Integer mainno);


}