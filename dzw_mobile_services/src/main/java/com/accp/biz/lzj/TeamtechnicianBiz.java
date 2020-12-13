package com.accp.biz.lzj;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.MechanicstarMapper;
import com.accp.dao.TeamtechnicianMapper;
import com.accp.pojo.Team;
import com.accp.pojo.Teamtechnician;

@Service("teamtechnician")
public class TeamtechnicianBiz {
    @Autowired
    private TeamtechnicianMapper dao;

    /**
     * 查询班组技工
     *
     * @return
     */
    public List<Teamtechnician> queryTe() {
        return dao.queryTe();
    }

    /**
     * 新增班组
     */
    public int insertTe(Teamtechnician te) {
        return dao.insertSelective(te);
    }
    
   
    /**
     * 根据班组名称查询
     */
    public List<Teamtechnician> queryTename(String tename) {
        return dao.queryTename(tename);
    }
    /**
     * 根据班组名称修改
     */
    public int updateTe(Teamtechnician tea) {
    	return dao.updateTe(tea);
    }
    /**
     * 删除
     */
    public int deleteTe(int technicianno) {
    	return dao.deleteTe(technicianno);
    }
}
