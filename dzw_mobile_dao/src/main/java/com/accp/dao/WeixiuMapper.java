package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Weixiu;

public interface WeixiuMapper {
    int deleteByPrimaryKey(Integer xmid);

    int insert(Weixiu record);

    int insertSelective(Weixiu record);

    Weixiu selectByPrimaryKey(Integer xmid);

    int updateByPrimaryKeySelective(Weixiu record);

    int updateByPrimaryKey(Weixiu record);

    /* 		��ά��cid ��ѯ ά����Ŀ��Ϣ
     * 	    @param cid
     * 		@return
     */
    List<Weixiu> selectcid(@Param("cid") Integer cid, @Param("sousuo") String sousuo);

    /*
     * 	����
     * 	@param  weixiu
     */
    int insertweixiu(@Param("weixiu") Weixiu weixiu);

    /*
     * 	�޸�
     * 	@param  xiugai
     */
    int updateweixiu(@Param("xiugai") Weixiu xiugai);

    /*
     * 	ɾ��
     */
    int deleteweixiu(@Param("xmid") Integer xmid);

    /**
     * ���ݷ�����id��ѯ
     *
     * @param fid
     * @return
     */
    @Select("SELECT * FROM `weixiu` WHERE `Fid`=#{fid}")
    List<Weixiu> selectFid(@Param("fid") Integer fid);

    /**
     * ���ݳ��Ͳ�ѯ
     *
     * @param cid
     * @return
     */
    @Select("select * from `weixiu` where `cid`=#{cid}")
    List<Weixiu> selectCid(@Param("cid") Integer cid);

    /**
     * ��ѯ������Ŀ
     *
     * @return
     */
    @Select("SELECT * FROM `weixiu` WHERE `cid` IS NULL AND `Fid` IS NULL")
    List<Weixiu> selectNull();

}