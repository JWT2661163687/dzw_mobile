package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.Maintaincar;

/**
 * 锟接筹拷锟斤拷
 *
 * @author 锟斤拷锟斤拷锟�
 */
public interface MaintaincarMapper {
    int deleteByPrimaryKey(Integer maintainid);

    int insert(Maintaincar record);

    /**
     * 锟斤拷锟斤拷锟接筹拷锟斤拷
     *
     * @param record
     * @return
     */
    int insertSelective(Maintaincar record);

    Maintaincar selectByPrimaryKey(Integer maintainid);



    /**
     * 状态锟斤拷询维锟睫接筹拷锟斤拷
     *
     * @param receiptsid
     * @return
     */
    @Select("SELECT * FROM `maintaincar` WHERE `receiptsid`=#{receiptsid} and inside=#{inside}")
    List<Maintaincar> selectAllReceiptsid(@Param("receiptsid") Integer receiptsid, @Param("inside") Integer inside);

    /**
     * 锟睫革拷状态
     *
     * @param maintainid
     * @return
     */
    @Update("update maintaincar set receiptsid=#{zhuangtai},accomplishdate=NOW() where maintainid=#{maintainid}")
    int updateMaintaincarreceipts(@Param("maintainid") Integer maintainid, @Param("zhuangtai") Integer zhuangtai);

    /**
     * 锟斤拷询维锟斤拷状态锟斤拷锟�
     *
     * @return
     */
    @Select("SELECT * FROM `maintaincar` WHERE `receiptsid`=2")
    List<Maintaincar> selectAllReceiptsidload();

    /**
     * 锟睫革拷维锟睫达拷锟斤拷
     *
     * @param maintainling
     * @param maintainid
     * @return
     */
    @Update("update maintaincar set maintainling=#{maintainling},receiptsid=1 where maintainid=#{maintainid}")
    int updateMain(@Param("maintainling") Integer maintainling, @Param("maintainid") Integer maintainid);

    /**
     * 锟角否返癸拷状态
     *
     * @param licence
     * @return
     */
    @Select("select * from `maintaincar` where licence=#{licence} and `receiptsid`=4")
    Maintaincar selectzhuangtai(@Param("licence") String licence);


}