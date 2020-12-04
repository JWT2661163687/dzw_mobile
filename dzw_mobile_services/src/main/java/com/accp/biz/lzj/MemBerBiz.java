package com.accp.biz.lzj;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.MemberMapper;
import com.accp.pojo.Client;
import com.accp.pojo.Member;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("memberBiz")
public class MemBerBiz {

    @Autowired
    private MemberMapper dao;

    /**
     * 根据条件查询会员
     *
     * @param KaHao
     * @return
     */
    public PageInfo<Member> queryMember(@Param("KaHao") String KaHao, Integer p, Integer s) {
        PageHelper.startPage(p, s);
        return new PageInfo<Member>(dao.queryMember(KaHao));
    }

    /**
     * 根据条件查询不是会员的客户
     *
     * @param cId
     * @return
     */
    public List<Client> queryClient(@Param("cId") Integer cId) {
        return dao.queryClient(cId);
    }

    /**
     * 修改客户的等级
     *
     * @param cId
     * @return
     */
    public int updateClientGrand(@Param("cId") Integer cId) {
        return dao.updateClientGrand(cId);
    }

    /**
     * 新增会员客户
     *
     * @param memBer
     * @return
     */
    public int insertMemberClient(@Param("memBer") Member memBer) {
        return dao.insertMemberClient(memBer);
    }

    /**
     * 会员充值金额(修改会员余额)
     *
     * @param mId
     * @param jine
     * @return
     */
    public int updateMember(@Param("mId") Integer mId, @Param("jine") Integer jine) {
        return dao.updateMember(mId, jine);
    }

    /**
     * 删除会员
     *
     * @param mId
     * @return
     */
    public int deleteMember(@Param("mId") Integer mId) {
        return dao.deleteMember(mId);
    }

    /**
     * 把会员修改为普通用户
     */
    public int updateMemerGrade(@Param("cid") Integer cid) {
        return dao.updateMemerGrade(cid);
    }
}
