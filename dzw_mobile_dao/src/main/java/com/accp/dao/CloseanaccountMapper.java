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
     * ��ѯ���д����������
     * @param mid
     * @param cid
     * @return
     */
    List<Maintaincar> queryCar(@Param("mId")Integer mid,@Param("cId")Integer cid);
    
    /**
     * ��ѯ���н��������
     * @param rid
     * @param cid
     * @return
     */
    List<Closeanaccount> queryCount(@Param("rid")Integer rid,@Param("cid")Integer cid);
    
    /**
     * ���ݿͻ�id��ѯ�ÿͻ��Ƿ�Ϊ����Ա��
     * @param cid
     * @return
     */
    @Select("SELECT * FROM employee WHERE employeeid = #{cid}")
    Employee queryEmp(@Param("cid")Integer cid);
    
    /**
     * ���ݿͻ�id��ѯ�ÿͻ��Ƿ�Ϊ��Ա
     * @param cid
     * @return
     */
    @Select("SELECT * FROM member WHERE cId = #{cid}")
    Member queryMember(@Param("cid")Integer cid);
    
    /**
     * ����������Ϣ
     * @param count
     * @return
     */
    @Insert("INSERT INTO closeanaccount(`rWay`,`cId`,`cName`,`cBalance`,`rOdd`,`rCashier`,`rDealWith`,`rOutOfPocket`,`rDiscounts`,`remark`,`rCreateDate`) VALUES(#{count.rway},#{count.cid},#{count.cname},#{count.cbalance},#{count.rodd},#{count.rcashier},#{count.rdealwith},#{count.routofpocket},#{count.rdiscounts},#{count.remark},NOW())")
    int insertCount(@Param("count")Closeanaccount count);
    
    /**
     * �޸Ļ�Ա�����
     */
    @Update("UPDATE member SET mBalance = mBalance - #{jine} WHERE cId = #{cid}")
    int updateMen(@Param("cid")Integer cid,@Param("jine")Integer jine);
    
    /**
     * �Ѵ����㶩���޸�Ϊ�ѽ���
     */
    @Update("UPDATE `maintaincar` SET receiptsid = #{teamid} WHERE maintainid = #{carid}")
    int updateCarTeamid(@Param("teamid")Integer teamid,@Param("carid")Integer carid);
}