package com.accp.dao;

import com.accp.pojo.Maintainreceipts;

public interface MaintainreceiptsMapper {
    int deleteByPrimaryKey(Integer receiptsid);

    int insert(Maintainreceipts record);

    int insertSelective(Maintainreceipts record);

    Maintainreceipts selectByPrimaryKey(Integer receiptsid);

    int updateByPrimaryKeySelective(Maintainreceipts record);

    int updateByPrimaryKey(Maintainreceipts record);
}