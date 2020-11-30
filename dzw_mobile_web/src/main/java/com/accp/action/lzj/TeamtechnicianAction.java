package com.accp.action.lzj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lzj.FieldvehiclesBiz;
import com.accp.biz.lzj.TeamtechnicianBiz;
import com.accp.pojo.Fieldvehicles;
import com.accp.pojo.Teamtechnician;

@RestController
@RequestMapping("/api/team")
@CrossOrigin
public class TeamtechnicianAction {
	@Autowired
	private TeamtechnicianBiz biz;
	
	/**
	 * 查询班组技工
	 * @return
	 */
	@GetMapping("query")
	public List<Teamtechnician> queryTeamtechnician() {
		return biz.queryTe();
	}
}
