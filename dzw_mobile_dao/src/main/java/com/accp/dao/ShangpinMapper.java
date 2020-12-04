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
     *  	  ·ÖÒ³²éÑ¯ÉÌÆ·±í  ÐÅÏ¢
     *  ï¿½ï¿½Ò³ï¿½ï¿½Ñ¯ï¿½ï¿½Æ·ï¿½ï¿½  ï¿½ï¿½Ï¢
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
     *  @Param   sousuo  daid
     */
    List<Shangpin> selectshangpin(@Param("sousuo") String sousuo);

    /*
     *  	ÐÞ¸Ä
     *  	@param xiugai  spid
     */
    int updateshangpin(@Param("xiugai") Shangpin xiugai);
    
    /*
     * ÐÂÔö
     * @param zeng
     */
    int insertshangpin(@Param("zeng") Shangpin zeng);
    
    /*
     * É¾³ý
     * @param spid
     */
    int deleteshangpin(@Param("spid") Integer spid);

    List<Shangpin> selectshangpin(@Param("sousuo") String sousuo, @Param("daid") Integer daid);
}