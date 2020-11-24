package com.accp.dao;

import com.accp.pojo.Chexing;

public interface ChexingMapper {
    int deleteByPrimaryKey(Integer cid);
<<<<<<< HEAD

=======
/**
 * ad
 * @param record
 * @return
 */
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
    int insert(Chexing record);

    int insertSelective(Chexing record);

    Chexing selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Chexing record);

    int updateByPrimaryKey(Chexing record);
}