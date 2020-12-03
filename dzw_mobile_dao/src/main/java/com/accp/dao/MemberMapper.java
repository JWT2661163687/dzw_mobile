package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.Client;
import com.accp.pojo.Member;

public interface MemberMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);


    /**
     * ����������ѯ��Ա
     *
     * @param KaHao
     * @return
     */
    List<Member> queryMember(@Param("KaHao") String KaHao);

    /**
     * ����������ѯ���ǻ�Ա�Ŀͻ�
     *
     * @param cId
     * @return
     */
    List<Client> queryClient(@Param("cId") Integer cId);

    /**
     * �޸Ŀͻ��ĵȼ�
     *
     * @param cId
     * @return
     */
    @Update("UPDATE `client` SET cGrade = 2 WHERE cId = #{cId};")
    int updateClientGrand(@Param("cId") Integer cId);

    /**
     * ������Ա�ͻ�
     *
     * @param memBer
     * @return
     */
    @Insert("INSERT INTO member(`mCardNumber`,`mPass`,`cId`,`cName`,`mBalance`) VALUES(#{memBer.mcardnumber},#{memBer.mpass},#{memBer.cid},#{memBer.cname},0);")
    int insertMemberClient(@Param("memBer") Member memBer);

    /**
     * ��Ա��ֵ���(�޸Ļ�Ա���)
     *
     * @param mId
     * @param jine
     * @return
     */
    @Update("UPDATE `member` SET mBalance=mBalance+#{jine} WHERE `mId` = #{mId};")
    int updateMember(@Param("mId") Integer mId, @Param("jine") Integer jine);

    /**
     * ɾ����Ա
     *
     * @param mId
     * @return
     */
    @Delete("DELETE FROM member WHERE `mId` = #{mId};")
    int deleteMember(@Param("mId") Integer mId);

    /**
     * �ѻ�Ա�޸�Ϊ��ͨ�û�
     */
    @Update("UPDATE `client` SET cGrade = 1 WHERE cId = #{cid}")
    int updateMemerGrade(@Param("cid") Integer cid);
}