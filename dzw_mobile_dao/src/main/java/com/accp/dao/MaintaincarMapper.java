package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.Maintaincar;
/**
 * 接车表
 * @author 蒋文韬
 *
 */
public interface MaintaincarMapper {
    int deleteByPrimaryKey(Integer maintainid);

    int insert(Maintaincar record);
    /**
     * 新增接车表
     * @param record
     * @return
     */
    int insertSelective(Maintaincar record);

    Maintaincar selectByPrimaryKey(Integer maintainid);

    int updateByPrimaryKeySelective(Maintaincar record);

    int updateByPrimaryKey(Maintaincar record);
    /**
     * 状态查询维修接车表
     * @param receiptsid
     * @return
     */
    @Select("SELECT * FROM `maintaincar` WHERE `receiptsid`=#{receiptsid} and inside=#{inside}")
    List<Maintaincar> selectAllReceiptsid(@Param("receiptsid")Integer receiptsid,@Param("inside")Integer inside);
    /**
     * 修改状态
     * @param maintainid
     * @return
     */
    @Update("update maintaincar set receiptsid=#{zhuangtai},accomplishdate=NOW() where maintainid=#{maintainid}")
    int updateMaintaincarreceipts(@Param("maintainid")Integer maintainid,@Param("zhuangtai")Integer zhuangtai);
    /**
     * 查询维修状态完成
     * @return
     */
    @Select("SELECT * FROM `maintaincar` WHERE `receiptsid`=2")
    List<Maintaincar> selectAllReceiptsidload();
    /**
     * 修改维修次数
     * @param maintainling
     * @param maintainid
     * @return
     */
    @Update("update maintaincar set maintainling=#{maintainling},receiptsid=1 where maintainid=#{maintainid}")
    int updateMain(@Param("maintainling")Integer maintainling,@Param("maintainid")Integer maintainid);
    /**
     * 是否返工状态
     * @param licence
     * @return
     */
    @Select("select * from `maintaincar` where licence=#{licence} and `receiptsid`=4")
    Maintaincar selectzhuangtai(@Param("licence")String licence);
    
    
}