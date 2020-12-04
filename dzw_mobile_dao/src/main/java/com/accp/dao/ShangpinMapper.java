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
     *  	  分页查询商品表  信息
     *  @Param   sousuo  daid
     */
    List<Shangpin> selectshangpin(@Param("sousuo") String sousuo);

    /*
     *  	修改
     *  	@param xiugai  spid
     */
    int updateshangpin(@Param("xiugai") Shangpin xiugai);
    
    /*
     * 新增
     * @param zeng
     */
    int insertshangpin(@Param("zeng") Shangpin zeng);
    
    /*
     * 删除
     * @param spid
     */
    int deleteshangpin(@Param("spid") Integer spid);

}