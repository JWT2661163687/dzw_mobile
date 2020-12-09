package com.accp.biz.jwt;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.CompletedMapper;
import com.accp.dao.EngineMapper;
import com.accp.dao.FieldvehiclesMapper;
import com.accp.dao.MaintaincarMapper;
import com.accp.dao.MaintaincarxiangmuMapper;
import com.accp.dao.MechanicstarMapper;
import com.accp.dao.MotorcycleMapper;
import com.accp.dao.TeamMapper;
import com.accp.dao.TeamtechnicianMapper;
import com.accp.dao.TeamtechniciantwoMapper;
import com.accp.dao.VehicleMapper;
import com.accp.dao.WeixiuMapper;
import com.accp.pojo.Completed;
import com.accp.pojo.Engine;
import com.accp.pojo.Fieldvehicles;
import com.accp.pojo.Maintaincar;
import com.accp.pojo.Maintaincarxiangmu;
import com.accp.pojo.Mechanicstar;
import com.accp.pojo.Motorcycle;
import com.accp.pojo.Team;
import com.accp.pojo.Teamtechnician;
import com.accp.pojo.Teamtechniciantwo;
import com.accp.pojo.Vehicle;
import com.accp.pojo.Weixiu;

@Service
public class FlowBiz {

    @Autowired
    private TeamMapper teamMapper;
    @Autowired
    private MechanicstarMapper mechanicstarMapper;
    @Autowired
    private TeamtechnicianMapper teamtechnicianMapper;
    @Autowired
    private MotorcycleMapper motorcycleMapper;
    @Autowired
    private EngineMapper engineMapper;
    @Autowired
    private WeixiuMapper weixiuMapper;
    @Autowired
    private VehicleMapper vehicleMapper;
    @Autowired
    private CompletedMapper completedMapper;
    @Autowired
    private MaintaincarMapper maintaincarMapper;
    @Autowired
    private TeamtechniciantwoMapper teamtechniciantwoMapper;
    @Autowired
    private MaintaincarxiangmuMapper maintaincarxiangmuMapper;
    @Autowired
    private FieldvehiclesMapper fieldvehiclesMapper;
    
    
    /**
     * 根据车辆id查询维修历史
     * @param maintainvehicleid
     * @return
     */
    public List<Maintaincar> selectMaintainvehicleid(Integer maintainvehicleid){
    	return maintaincarMapper.selectMaintainvehicleid(maintainvehicleid);
    }
    
    /**
     * 查询可以派车的救援车辆
     * @return
     */
    public List<Fieldvehicles> selectAlling(){
    	return fieldvehiclesMapper.selectAlling();
    }

    /**
     * 查询所有班组表
     *
     * @return
     */
    public List<Team> selectJwtAll() {
        return teamMapper.selectJwtAll();
    }

    /**
     * 查询所有星级
     *
     * @return
     */
    public List<Mechanicstar> selectAll() {
        return mechanicstarMapper.queryMechan();
    }


    /**
     * 根据班组id和星级id查询技工
     *
     * @param meid
     * @param teamid
     * @return
     */
    public List<Teamtechnician> selectMeidTeamid(Integer meid, Integer teamid) {
        return teamtechnicianMapper.selectMeidTeamid(meid, teamid);
    }

    /**
     * 查询所有品牌
     *
     * @return
     */
    public List<Motorcycle> SelectAllmoto() {
        return motorcycleMapper.selectAlls();
    }

    /**
     * 查询所有发动机
     *
     * @return
     */
    public List<Engine> SelectAlleng() {
        return engineMapper.SelectAll();
    }


    /**
     * 根据发动机id查询
     *
     * @param fid
     * @return
     */
    public List<Weixiu> selectFid(Integer fid) {
        return weixiuMapper.selectFid(fid);
    }

    /**
     * 根据车型查询
     *
     * @param cid
     * @return
     */
    public List<Weixiu> selectCid(Integer cid) {
        return weixiuMapper.selectCid(cid);
    }

    /**
     * 查询其他项目
     *
     * @return
     */
    public List<Weixiu> selectNull() {
        return weixiuMapper.selectNull();
    }

    /**
     * 查询不在维修中的车辆
     *
     * @return
     */
    public List<Vehicle> selectzhuangtai() {
        return vehicleMapper.selectzhuangtai();
    }

    /**
     * 新增竣工表
     *
     * @param record
     * @return
     */
    public int insertSelective(Completed record) {
        //修改状态表
        if (record.getRework() == null || "".equals(record.getRework().trim())) {

            maintaincarMapper.updateMaintaincarreceipts(record.getMainid(), 3);
        } else {
            record.setCompletiondate(null);
            maintaincarMapper.updateMaintaincarreceipts(record.getMainid(), 4);
        }
        //新增
        return completedMapper.insertSelective(record);
    }

    /**
     * 返工数据
     *
     * @return
     */
    public int insertupdatemaintainling(Maintaincar maintaincar) {
        int co = maintaincarMapper.updateMain(maintaincar.getMaintainling(), maintaincar.getMaintainid(),maintaincar.getMaintainmoney());
        for (Teamtechniciantwo item : maintaincar.getTeamtechniciantwos()) {
            item.setMaintainid(maintaincar.getMaintainid());
            item.setMaintainling(maintaincar.getMaintainling());
            item.setTeamid(null);
            co = teamtechniciantwoMapper.insertSelective(item);
        }
        for (Maintaincarxiangmu item : maintaincar.getMaintaincarxiangmus()) {
            item.setMainno(maintaincar.getMaintainid());
            item.setMaintainling(maintaincar.getMaintainling());
            item.setXmid(null);
            co = maintaincarxiangmuMapper.insertSelective(item);
        }
        return co;
    }

    /**
     * 是否返工状态
     *
     * @param licence
     * @return
     */
    public Maintaincar selectzhuangtai(String licence) {
        return maintaincarMapper.selectzhuangtai(licence);
    }

}
