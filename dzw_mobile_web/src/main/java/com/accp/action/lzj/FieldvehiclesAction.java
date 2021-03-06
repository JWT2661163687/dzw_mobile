package com.accp.action.lzj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lzj.FieldvehiclesBiz;
import com.accp.pojo.Fieldvehicles;
import com.accp.pojo.Mechanicstar;
import com.accp.pojo.Team;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/fiel")
@CrossOrigin
public class FieldvehiclesAction {
    @Autowired
    private FieldvehiclesBiz biz;
    
    /**
     * 修改状态
     * @return
     */
    @GetMapping("updatezhuangtai/{id}")
    public Map<String, String> updateFielzhuangtai(@PathVariable Integer id) {
        Map<String, String> message = new HashMap<String, String>();
        biz.updateFielzhuangtai(id);
        message.put("code", "200");
        message.put("msg", "ok");
        return message;
    }

    /**
     * 查询外勤车辆
     *
     * @return
     */
    @GetMapping("query/{zhuangtai}")
    public List<Fieldvehicles> getfielListByPage(@PathVariable String zhuangtai) {
        return biz.queryFiel(zhuangtai);
    }

    /**
     * 查询班组
     *
     * @return
     */
    @GetMapping("queryteam")
    public List<Team> queryTeam() {
        return biz.queryTeam();
    }

    /**
     * 新增技工
     */
    @PostMapping("insert")
    public Map<String, String> insertFiel(@RequestBody Fieldvehicles fiel) {
        Map<String, String> message = new HashMap<String, String>();
        biz.insertFiel(fiel);
        message.put("code", "200");
        message.put("msg", "ok");
        return message;
    }

    /**
     * 修改车辆
     */
    @PutMapping("update")
    public Map<String, String> updateFiel(@RequestBody Fieldvehicles ff) {
        System.out.println(ff.getId());
        Map<String, String> message = new HashMap<String, String>();
        biz.updateFiel(ff);
        message.put("code", "200");
        message.put("msg", "ok");
        return message;
    }

    /**
     * 删除技工
     */
    @DeleteMapping("fiels/{id}")
    public Map<String, String> deleteFiel(@PathVariable int id) {
        Map<String, String> message = new HashMap<String, String>();
        biz.deleteFiel(id);
        message.put("code", "200");
        message.put("msg", "ok");
        return message;
    }

}
