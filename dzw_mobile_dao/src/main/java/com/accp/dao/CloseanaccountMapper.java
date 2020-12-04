package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.Closeanaccount;
import com.accp.pojo.Employee;
import com.accp.pojo.Maintaincar;
import com.accp.pojo.Member;

public interface CloseanaccountMapper {
    int deleteByPrimaryKey(Integer rno);

    int insert(Closeanaccount record);

    int insertSelective(Closeanaccount record);

    Closeanaccount selectByPrimaryKey(Integer rno);

    int updateByPrimaryKeySelective(Closeanaccount record);

    int updateByPrimaryKey(Closeanaccount record);
    
    /**
     * 查询所有待结算的数据
     * @param mid
     * @param cid
     * @return
     */
    List<Maintaincar> queryCar(@Param("mId")Integer mid,@Param("cId")Integer cid);
    
    /**
     * 查询所有结算的数据
     * @param rid
     * @param cid
     * @return
     */
    List<Closeanaccount> queryCount(@Param("rid")Integer rid,@Param("cid")Integer cid);
    
    /**
     * 根据客户id查询该客户是否为本店员工
     * @param cid
     * @return
     */
    @Select("SELECT * FROM employee WHERE employeeid = #{cid}")
    Employee queryEmp(@Param("cid")Integer cid);
    
    /**
     * 根据客户id查询该客户是否为会员
     * @param cid
     * @return
     */
    @Select("SELECT * FROM member WHERE cId = #{cid}")
    Member queryMember(@Param("cid")Integer cid);
    
    /**
     * 新增结算信息
     * @param count
     * @return
     */
    @Insert("INSERT INTO closeanaccount(`rWay`,`cId`,`cName`,`cBalance`,`rOdd`,`rCashier`,`rDealWith`,`rOutOfPocket`,`rDiscounts`,`remark`,`rCreateDate`) VALUES(#{count.rway},#{count.cid},#{count.cname},#{count.cbalance},#{count.rodd},#{count.rcashier},#{count.rdealwith},#{count.routofpocket},#{count.rdiscounts},#{count.remark},NOW())")
    int insertCount(@Param("count")Closeanaccount count);
    
    /**
     * 修改会员表余额
     */
    @Update("UPDATE member SET mBalance = mBalance - #{jine} WHERE cId = #{cid}")
    int updateMen(@Param("cid")Integer cid,@Param("jine")Integer jine);
    
    /**
     * 把待结算订单修改为已结算
     */
    @Update("UPDATE `maintaincar` SET receiptsid = #{teamid} WHERE maintainid = #{carid}")
    int updateCarTeamid(@Param("teamid")Integer teamid,@Param("carid")Integer carid);
}