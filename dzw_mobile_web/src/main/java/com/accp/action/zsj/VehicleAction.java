package com.accp.action.zsj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zsj.VehicleBiz;
import com.accp.dao.VehicleMapper;
import com.accp.pojo.Client;
import com.accp.pojo.Make;
import com.accp.pojo.Motorcycle;
import com.accp.pojo.Vehicle;

@RestController
@RequestMapping("api/vehicles")
public class VehicleAction {

    @Autowired
    private VehicleBiz biz;

    /**
     * 根据条件查询车辆信息
     */
    @GetMapping("{vid}")
    public List<Vehicle> queryVehicle(@PathVariable Integer vid) {
        return biz.queryVehicle(vid);
    }

    /**
     * 双击车辆信息显示对应的用户信息
     */
    @GetMapping("client/{cid}")
    public List<Client> queryClient(@PathVariable Integer cid) {
        return biz.queryClient(cid);
    }

    /**
     * 新增车辆信息
     */
    @PostMapping("vehicle")
    public Map<String, String> insertVehicle(@RequestBody Vehicle vehicle) {
        int count = biz.insertVehicle(vehicle);
        Map<String, String> map = new HashMap<String, String>();
        if (count > 0) {
            map.put("code", "200");
        }
        return map;
    }

    /**
     * 修改车辆信息
     */
    @PutMapping("vehicle")
    public Map<String, String> updateVehicle(@RequestBody Vehicle vehicle) {
        int count = biz.updateVehicle(vehicle);
        Map<String, String> map = new HashMap<String, String>();
        if (count > 0) {
            map.put("code", "200");
        }
        return map;
    }

    /**
     * 删除车辆信息
     */
    @DeleteMapping("vehicle/{vid}")
    public Map<String, String> deleteVehicle(@PathVariable Integer vid) {
        int count = biz.deleteVehicle(vid);
        Map<String, String> map = new HashMap<String, String>();
        if (count > 0) {
            map.put("code", "200");
        }
        return map;
    }

    /**
     * 根据品牌编号或者品牌名称查询品牌信息
     */
    @GetMapping("make/{id}")
    public List<Make> queryMake(@PathVariable String id) {
        return biz.queryMake(id);
    }

    /**
     * 根据车型编号或者车型名称查询车辆信息
     */
    @GetMapping("moto/{makeid}/{id}")
    public List<Motorcycle> queryMotorcycle(@PathVariable Integer makeid, @PathVariable String id) {
        return biz.queryMotorcycle(makeid, id);
    }

    /**
     * 点击品牌的时候查询对应的车型
     */
    @GetMapping("moto1/{id}")
    public List<Motorcycle> queryMotorcycle1(@PathVariable("id") Integer id) {
        return biz.queryMotorcycle1(id);
    }
}
