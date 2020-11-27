package com.accp.action.lzj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lzj.FieldvehiclesBiz;
import com.accp.pojo.Fieldvehicles;
import com.accp.pojo.Team;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/fiel")
@CrossOrigin
public class FieldvehiclesAction {
	@Autowired
	private FieldvehiclesBiz biz;
	
	/**
	 * 查询外勤车辆
	 * @return
	 */
	@GetMapping("query")
	public List<Fieldvehicles> getfielListByPage() {
		return biz.queryFiel();
	}
	/**
	 * 查询班组
	 * @return
	 */
	@GetMapping("queryteam")
	public List<Team> queryTeam() {
		return biz.queryTeam();
	}
}
