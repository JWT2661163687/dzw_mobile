package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Maintainreceipts;

public interface MaintainreceiptsMapper {
    int deleteByPrimaryKey(Integer receiptsid);

    int insert(Maintainreceipts record);

    int insertSelective(Maintainreceipts record);

    Maintainreceipts selectByPrimaryKey(Integer receiptsid);

    int updateByPrimaryKeySelective(Maintainreceipts record);

    int updateByPrimaryKey(Maintainreceipts record);

    /**
     * ��ѯ״̬��
     *
     * @return
     */
    @Select("select * from maintainreceipts")
    List<Maintainreceipts> selectAllMaintainreceipts();


}