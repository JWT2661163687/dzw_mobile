package com.accp.action.pjw;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.pjw.WeixiuBiz;
import com.accp.pojo.Weixiu;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/weixiu")
public class WeixiuAction {
    @Autowired
    private WeixiuBiz weixiubiz;

    /* 		按维修cid 查询 维修项目信息
     * 	    @param cid
     * 		@return
     */
    @GetMapping("aa/{page1}/{page2}/{cid}/{sousuo}")
    public PageInfo<Weixiu> selectcid(@PathVariable Integer page1, @PathVariable Integer page2, @PathVariable Integer cid, @PathVariable String sousuo) {
        //System.out.println("进来了a:"+page1+"b:"+page2+"c:"+cid);
        return weixiubiz.selectcid(page1, page2, cid, sousuo);
    }

    /*
     * 	修改
     * 	@param  xiugai
     */
    @PutMapping("update")
    public Map<String, String> updateweixiu(@RequestBody Weixiu xiugai) {
        Map<String, String> message = new HashMap<String, String>();
        int gai = weixiubiz.updateweixiu(xiugai);
        if (gai > 0) {
            System.out.println("修改成功");
            message.put("code", "200");
            message.put("msg", "ok");
            return message;
        }
        return message;
    }

    /* 	新增
     * 	@param
     */
    @PostMapping("insert")
    public Map<String, String> insertweixiu(@RequestBody Weixiu zeng) {
        Map<String, String> message = new HashMap<String, String>();
        int a = weixiubiz.insertweixiu(zeng);
        if (a > 0) {
            System.out.println("新增成功");
            message.put("code", "200");
            message.put("msg", "ok");
            return message;
        }
        return message;
    }

    /*
     * 	删除
     * @param  xmid
     */
    @DeleteMapping("d/{xmid}")
    public Map<String, String> deleteweixiu(@PathVariable Integer xmid) {
        Map<String, String> message = new HashMap<String, String>();
        System.out.println("删除");
        int b = weixiubiz.deleteweixiu(xmid);
        if (b > 0) {
            System.out.println("删除成功");
            message.put("code", "200");
            message.put("msg", "ok");
            return message;
        }
        return message;
    }


}
