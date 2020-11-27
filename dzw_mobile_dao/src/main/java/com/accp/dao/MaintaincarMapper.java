package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.Maintaincar;
/**
 * �ӳ���
 * @author �����
 *
 */
public interface MaintaincarMapper {
    int deleteByPrimaryKey(Integer maintainid);

    int insert(Maintaincar record);
    /**
     * �����ӳ���
     * @param record
     * @return
     */
    int insertSelective(Maintaincar record);

    Maintaincar selectByPrimaryKey(Integer maintainid);

    int updateByPrimaryKeySelective(Maintaincar record);

    int updateByPrimaryKey(Maintaincar record);
    /**
     * ״̬��ѯά�޽ӳ���
     * @param receiptsid
     * @return
     */
    @Select("SELECT * FROM `maintaincar` WHERE `receiptsid`=#{receiptsid} and inside=#{inside}")
    List<Maintaincar> selectAllReceiptsid(@Param("receiptsid")Integer receiptsid,@Param("inside")Integer inside);
    /**
     * �޸�״̬
     * @param maintainid
     * @return
     */
    @Update("update maintaincar set receiptsid=2 where maintainid=#{maintainid}")
    int updateMaintaincarreceipts(@Param("maintainid")Integer maintainid);
    /**
     * ��ѯά��״̬���
     * @return
     */
    @Select("SELECT * FROM `maintaincar` WHERE `receiptsid`=2")
    List<Maintaincar> selectAllReceiptsidload();
    
}