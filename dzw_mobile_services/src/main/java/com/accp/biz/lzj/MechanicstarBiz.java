package com.accp.biz.lzj;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.MechanicstarMapper;
import com.accp.pojo.Mechanicstar;


@Service("Mechanicstar")
public class MechanicstarBiz {
    @Autowired
    private MechanicstarMapper dao;

    /**
     * 查询技工星级
     *
     * @return
     */
    public List<Mechanicstar> queryMechan() {
        return dao.queryMechan();
    }

    /**
     * 新增技工
     */
    public int insertMechan(Mechanicstar mechanicstar) {
        return dao.insertMechan(mechanicstar);
    }

    /**
     * 修改技工
     */
    public int updateMechan(Mechanicstar mechanicstar) {
        return dao.updateMechan(mechanicstar);
    }

    /**
     * 删除技工
     */
    public int deleteMechan(String meid) {
        return dao.deleteMechan(meid);
    }
}
