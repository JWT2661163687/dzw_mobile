package com.accp.action.jwt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.jwt.MaintaincarBiz;
import com.accp.pojo.Completed;
import com.accp.pojo.Maintaincar;
import com.accp.pojo.Maintaincarxiangmu;
import com.accp.pojo.Maintainreceipts;

@RestController
@RequestMapping("/api/maintaincars")
public class MaintaincarAuction {

    @Autowired
    private MaintaincarBiz maintaincarBiz;


    /**
     * 状态查询维修接车表
     *
     * @param receiptsid
     * @return
     */
    @GetMapping("/maintaincar/{receiptsid}/{inside}")
    public List<Maintaincar> selectAllReceiptsid(@PathVariable Integer receiptsid, @PathVariable Integer inside) {
        return maintaincarBiz.selectAllReceiptsid(receiptsid, inside);
    }


    /**
     * 接车id查询所有维修项目
     *
     * @param mainno
     * @return
     */
    @GetMapping("/maintaincarxiangmu/{mainno}")
    public List<Maintaincarxiangmu> selectAllid(@PathVariable Integer mainno) {
        return maintaincarBiz.selectAllid(mainno);
    }


    /**
     * 修改状态
     *
     * @param maintainid
     * @return
     */
    @GetMapping("/maintaincarupdate/{maintainid}/{zhuangtai}")
    public Map<String, String> updateMaintaincarreceipts(@PathVariable Integer maintainid, @PathVariable Integer zhuangtai) {
        Map<String, String> map = new HashMap<String, String>();
        if (maintaincarBiz.updateMaintaincarreceipts(maintainid, zhuangtai) > 0) {
            map.put("code", "200");
        } else {
            map.put("code", "400");
        }
        return map;
    }

    /**
     * 查询维修状态完成
     *
     * @return
     */
    @GetMapping("/maintaincar")
    public List<Maintaincar> selectAllReceiptsidload() {
        return maintaincarBiz.selectAllReceiptsidload();
    }

    /**
     * 新增竣工表
     *
     * @param record
     * @return
     */
    @PostMapping("/completed")
    public Map<String, String> insertSelective(@RequestBody Completed record) {
        Map<String, String> map = new HashMap<String, String>();
        if (maintaincarBiz.insertSelective(record) > 0) {
            map.put("code", "200");
        } else {
            map.put("code", "400");
        }
        return map;
    }


    /**
     * 查询状态表
     *
     * @return
     */
    @GetMapping("/maintainreceipts")
    public List<Maintainreceipts> selectAllMaintainreceipts() {
        return maintaincarBiz.selectAllMaintainreceipts();
    }


}
