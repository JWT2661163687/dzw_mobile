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
     *  	  ��ҳ��ѯ��Ʒ��  ��Ϣ
     *  ��ҳ��ѯ��Ʒ��  ��Ϣ
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
     *  @Param   sousuo  daid
     */
    List<Shangpin> selectshangpin(@Param("sousuo") String sousuo);

    /*
     *  	�޸�
     *  	@param xiugai  spid
     */
    int updateshangpin(@Param("xiugai") Shangpin xiugai);
    
    /*
     * ����
     * @param zeng
     */
    int insertshangpin(@Param("zeng") Shangpin zeng);
    
    /*
     * ɾ��
     * @param spid
     */
    int deleteshangpin(@Param("spid") Integer spid);

    List<Shangpin> selectshangpin(@Param("sousuo") String sousuo, @Param("daid") Integer daid);
}