package com.accp.action.kwt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.kwt.MotorcycleBiz;
import com.accp.pojo.Motorcycle;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/Motorcycles")
public class MotorcycleAction {

    @Autowired
    private MotorcycleBiz biz;

    /**
     * 分页查询
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping("/Motorcycle/{pageNum}/{pageSize}")
    public PageInfo<Motorcycle> SelectPageAll(@PathVariable int pageNum, @PathVariable int pageSize) {
        return biz.SelectPage(pageNum, pageSize);
    }

    /**
     * 新增车型表
     *
     * @param record
     * @return
     */
    @PostMapping("/Motorcycle")
    public Map<String, Object> insertMotorcycle(@RequestBody Motorcycle record) {
        Map<String, Object> map = new HashMap<String, Object>();
        int count = biz.addMotorcycle(record);
        if (count > 0) {
            map.put("code", "200");
        } else {
            map.put("code", "500");
        }
        return map;
    }

    /**
     * 查询id是否相同
     *
     * @param id
     * @return
     */
    @GetMapping("/Motorcycle/{id}")
    public List<Motorcycle> SelectById(@PathVariable Integer id) {
        return biz.SelectByid(id);
    }
}
