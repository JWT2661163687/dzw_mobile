package com.accp.dao;

import com.accp.pojo.Chexing;

public interface ChexingMapper {
    int deleteByPrimaryKey(Integer cid);

    /**
     * addrdrdfdfdf
     *
     * @param record
     * @return
     */

    int insert(Chexing record);

    int insertSelective(Chexing record);

    Chexing selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Chexing record);

    int updateByPrimaryKey(Chexing record);
}