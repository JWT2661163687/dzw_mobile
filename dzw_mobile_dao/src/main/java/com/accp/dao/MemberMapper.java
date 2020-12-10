package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
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
     * 根据条件查询会员信息
     *
     * @param KaHao
     * @return
     */
    List<Member> queryMember(@Param("KaHao") String KaHao);

    /**
     * 查询所有普通用户信息
     *
     * @param cId
     * @return
     */
    List<Client> queryClient(@Param("cId") Integer cId);

    /**
     * 把普通用户修改为会员用户
     *
     * @param cId
     * @return
     */
    @Update("UPDATE `client` SET cGrade = 2 WHERE cId = #{cId};")
    int updateClientGrand(@Param("cId") Integer cId);

    /**
     * 新增会员信息
     *
     * @param memBer
     * @return
     */
    @Insert("INSERT INTO member(`mCardNumber`,`mPass`,`cId`,`cName`,`mBalance`) VALUES(#{memBer.mcardnumber},#{memBer.mpass},#{memBer.cid},#{memBer.cname},0);")
    int insertMemberClient(@Param("memBer") Member memBer);

    /**
     * 修改为会员
     *
     * @param mId
     * @param jine
     * @return
     */
    @Update("UPDATE `member` SET mBalance=mBalance+#{jine} WHERE `mId` = #{mId};")
    int updateMember(@Param("mId") Integer mId, @Param("jine") Integer jine);

    /**
     * 删除会员用户
     *
     * @param mId
     * @return
     */
    @Delete("DELETE FROM member WHERE `mId` = #{mId};")
    int deleteMember(@Param("mId") Integer mId);

    /**
     * 把会员用户修改为普通用户
     */
    @Update("UPDATE `client` SET cGrade = 1 WHERE cId = #{cid}")
    int updateMemerGrade(@Param("cid") Integer cid);
    
    /**
     * 查询所有的会员卡号
     */
    @Select("SELECT mCardNumber FROM member")
    List<String> queryAllNumber();
}