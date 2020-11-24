package com.accp.dao;

import com.accp.pojo.Fadongji;

public interface FadongjiMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Fadongji record);

    int insertSelective(Fadongji record);

    Fadongji selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Fadongji record);

    int updateByPrimaryKey(Fadongji record);
}