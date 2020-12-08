package com.accp.action.jwt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.jwt.FlowBiz;
import com.accp.biz.jwt.MaintaincarBiz;
import com.accp.pojo.Completed;
import com.accp.pojo.Engine;
import com.accp.pojo.Fieldvehicles;
import com.accp.pojo.Maintaincar;
import com.accp.pojo.Mechanicstar;
import com.accp.pojo.Motorcycle;
import com.accp.pojo.Team;
import com.accp.pojo.Teamtechnician;
import com.accp.pojo.Vehicle;
import com.accp.pojo.Weixiu;
import com.alibaba.fastjson.JSON;

@RestController
@RequestMapping("/api/flows")
public class FlowAuction {
    @Autowired
    private FlowBiz flowBiz;
    @Autowired
    private MaintaincarBiz maintaincarBiz;
    
    
    
    
    /**
     * 根据车辆id查询维修历史
     * @param maintainvehicleid
     * @return
     */
    @GetMapping("/flow/maintainvehicleid/{maintainvehicleid}")
    public List<Maintaincar> selectMaintainvehicleid(@PathVariable Integer maintainvehicleid){
    	return flowBiz.selectMaintainvehicleid(maintainvehicleid);
    }
    /**
     * 查询可以派车的救援车辆
     * @return
     */
    @GetMapping("/flow/fieldvehicles")
    public List<Fieldvehicles> selectAlling(){
    	return flowBiz.selectAlling();
    }

    /**
     * 获得树
     *
     * @return
     */
    @GetMapping("/flow/gettree")
    public List getTree() {
        System.out.println("进");
        List<Team> teamlist = flowBiz.selectJwtAll();
        List<Mechanicstar> mechanicstarlist = flowBiz.selectAll();
        List tree = new ArrayList();//树
        //获得一级菜单

        // 遍历一级菜单名称，生成二级菜单项
        for (Team name : teamlist) {
            // 节点【初始化】
            Map<String, Object> node = new HashMap<String, Object>();
            node.put("id", 0);// 0:根级菜单
            node.put("text", name.getTename());
            node.put("team", name);
            List nodeChild = new ArrayList();
            for (Mechanicstar item2 : mechanicstarlist) {
                // 匹配是否是当前菜单的子项
                Map<String, Object> n = new HashMap<String, Object>();
                n.put("id", item2.getMeid());
                n.put("text", item2.getStarrating());
                n.put("mechanicstar", item2);
                nodeChild.add(n);
            }
            node.put("children", nodeChild);
            tree.add(node);
        }
        return tree;
    }


    /**
     * 根据班组id和星级id查询技工
     *
     * @param meid
     * @param teamid
     * @return
     */
    @GetMapping("/flow/{teamid}/{meid}")
    public List<Teamtechnician> selectMeidTeamid(@PathVariable Integer teamid, @PathVariable Integer meid) {
        return flowBiz.selectMeidTeamid(meid, teamid);
    }


    /**
     * 查询所有品牌
     *
     * @return
     */
    @GetMapping("/flow/motorcycle")
    public List<Motorcycle> SelectAllmoto() {
        return flowBiz.SelectAllmoto();
    }

    /**
     * 查询所有发动机
     *
     * @return
     */
    @GetMapping("/flow/engine")
    public List<Engine> SelectAlleng() {
        return flowBiz.SelectAlleng();
    }


    /**
     * 根据发动机id查询
     *
     * @param fid
     * @return
     */
    @GetMapping("/flow/weixiufid/{fid}")
    public List<Weixiu> selectFid(@PathVariable Integer fid) {
        return flowBiz.selectFid(fid);
    }

    /**
     * 根据车型查询
     *
     * @param cid
     * @return
     */
    @GetMapping("/flow/weixiucid/{cid}")
    public List<Weixiu> selectCid(@PathVariable Integer cid) {
        return flowBiz.selectCid(cid);
    }

    /**
     * 查询其他项目
     *
     * @return
     */
    @GetMapping("/flow/weixiunull")
    public List<Weixiu> selectNull() {
        return flowBiz.selectNull();
    }


    /**
     * 查询不在维修中的车辆
     *
     * @return
     */
    @GetMapping("/flow/vehicle")
    public List<Vehicle> selectzhuangtai() {
        return flowBiz.selectzhuangtai();
    }

    /**
     * 新增接车表
     *
     * @param maintaincar
     * @return
     */
    @PostMapping("/flow")
    public Map<String, String> insertmaintaincar(@RequestBody Maintaincar maintaincar) {
        Map<String, String> map = new HashMap<String, String>();
        if (maintaincarBiz.insertSelective(maintaincar) > 0) {
            map.put("code", "200");
        } else {
            map.put("code", "400");
        }
        return map;
    }


    /**
     * 新增竣工表
     *
     * @param record
     * @return
     */
    @PostMapping("/flow/completed")
    public Map<String, String> insertSelective(@RequestBody Completed completed) {
        Map<String, String> map = new HashMap<String, String>();
        if (flowBiz.insertSelective(completed) > 0) {
            map.put("code", "200");
        } else {
            map.put("code", "400");
        }
        return map;
    }

    /**
     * 返工数据更新
     *
     * @param maintaincar
     * @return
     */
    @PostMapping("/flow/maintainling")
    public Map<String, String> updateaddmaintainling(@RequestBody Maintaincar maintaincar) {
        Map<String, String> map = new HashMap<String, String>();
        if (flowBiz.insertupdatemaintainling(maintaincar) > 0) {
            map.put("code", "200");
        } else {
            map.put("code", "400");
        }
        return map;
    }

    /**
     * 是否返工状态
     *
     * @param licence
     * @return
     */
    @GetMapping("/flow/maintainling/{licence}")
    public Maintaincar selectzhuangtai(@PathVariable String licence) {
        return flowBiz.selectzhuangtai(licence);
    }


}
