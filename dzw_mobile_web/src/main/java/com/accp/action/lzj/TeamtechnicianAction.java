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
import com.accp.biz.lzj.TeamtechnicianBiz;
import com.accp.pojo.Fieldvehicles;
import com.accp.pojo.Mechanicstar;
import com.accp.pojo.Teamtechnician;

@RestController
@RequestMapping("/api/team")
@CrossOrigin
public class TeamtechnicianAction {
    @Autowired
    private TeamtechnicianBiz biz;

    /**
     * 查询班组技工
     *
     * @return
     */
    @GetMapping("query")
    public List<Teamtechnician> queryTeamtechnician() {
        return biz.queryTe();
    }

    /**
     * 根据班组名称查询
     */
    @GetMapping("querytename/{tename}")
    public List<Teamtechnician> queryTeamtechnician(@PathVariable String tename) {
        return biz.queryTename(tename);
    }

    /**
     * 新增班组
     *
     * @param te
     * @return
     */
    @PostMapping("insert")
    public Map<String, String> insertTeamtechnician(@RequestBody Teamtechnician te) {
    	System.out.println(te.getTeamid());
        Map<String, String> message = new HashMap<String, String>();
        biz.insertTe(te);
        message.put("code", "200");
        message.put("msg", "ok");
        return message;
    }
    /**
     * 根据班组名称修改
     */
    @PutMapping("update")
    public Map<String, String> updateTe(@RequestBody Teamtechnician tea) {
    	System.out.println("idn  "+tea.getTeamid());
    	 Map<String, String> message = new HashMap<String, String>();
        if( biz.updateTe(tea)>0) {
        	 message.put("code", "200");
             message.put("msg", "ok");
        }else {
        	 message.put("code", "300");
             message.put("msg", "no");
        }
         return message;
    }
    
    /**
     * 删除
     */
    @DeleteMapping("dele/{technicianno}")
    public Map<String, String> deleteTe(@PathVariable int technicianno) {
    	Map<String, String> message = new HashMap<String, String>();
    	if(biz.deleteTe(technicianno)>0) {
    		message.put("code", "200");
            message.put("msg", "ok");
    	}else {
    		message.put("code", "300");
            message.put("msg", "no");
    	}
        return message;
    }
}
