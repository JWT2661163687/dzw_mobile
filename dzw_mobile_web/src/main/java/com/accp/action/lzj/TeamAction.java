package com.accp.action.lzj;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lzj.TeamBiz;
import com.accp.biz.lzj.TeamtechnicianBiz;
import com.accp.pojo.Team;
import com.accp.pojo.Teamtechnician;

@RestController
@RequestMapping("/api/ttt")
@CrossOrigin
public class TeamAction {
	 @Autowired
	    private TeamBiz biz;
	
	@PostMapping("insert")
    public Map<String, String> insertTeamtechnician(@RequestBody Team team) {
        Map<String, String> message = new HashMap<String, String>();
        if( biz.insertTeam(team)>0) {
        	message.put("code", "200");
            message.put("msg", "ok");
       }else {
    	    message.put("code", "300");
            message.put("msg", "no");
       }
        return message;
   }
}
