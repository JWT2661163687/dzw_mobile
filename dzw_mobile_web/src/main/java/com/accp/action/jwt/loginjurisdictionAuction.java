package com.accp.action.jwt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.jwt.LoginjurisdictionBiz;
import com.accp.pojo.Employee;
import com.accp.pojo.Functiontable;

@RestController()
@RequestMapping("/api/loginjurisdictions")
public class loginjurisdictionAuction {
	@Autowired
	private LoginjurisdictionBiz loginjurisdictionBiz;
	/**
	 * 登录
	 * @param username
	 * @param password
	 * @param session
	 * @return
	 */
	@GetMapping("/loginjurisdiction/{username}/{password}")
	public Map<String, Object> login(@PathVariable String username,@PathVariable String password,HttpSession session){
		Employee employee=loginjurisdictionBiz.selectlogin(username, password);
		Map<String, Object> map = new HashMap<String, Object>();
		if (employee != null) {
			session.setAttribute("employee", employee);// 服务器保存
			map.put("code", "200");
			map.put("msg", "ok");
			map.put("employee", employee);// 客户端保存
		} else {
			map.put("code", "300");
			map.put("msg", "login_error");
		}

		return map;
	}
	
	/**
	 * 注销
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/loginjurisdiction/loginOut")
	public Map<String, Object> loginOut(HttpSession session) throws Exception {
		Map<String, Object> message = new HashMap<String, Object>();
		session.removeAttribute("USER");
		session.invalidate();// 立即失效
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	/**
	 * 获得sesston
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/loginjurisdiction/getSessionUser")
	public Employee getUserInfo(HttpSession session) throws Exception {
		Employee employee = (Employee) session.getAttribute("employee");
		return employee;
	}
	/**
	 * 获得树
	 * @param session
	 * @return
	 */
	@GetMapping("/loginjurisdiction/getFunTree")
	public List getUserFunTree(HttpSession session) {
		// 从session获得用户，以便得到权限
		Employee employee = (Employee) session.getAttribute("employee");
		List tree = new ArrayList();
		Set<String> menuNames = new TreeSet<String>();// 剔除重复值，保存一级菜单名称
		for (Functiontable fun : employee.getPost().getFunctiontables()) {
			menuNames.add(fun.getFunctiontable().getFname());
		}
		// 遍历一级菜单名称，生成二级菜单项
		for (String name : menuNames) {
			// 节点【初始化】
			Map<String, Object> node = new HashMap<String, Object>();
			node.put("id", 0);// 0:根级菜单
			node.put("text", name);
			List nodeChild = new ArrayList();
			for (Functiontable fun : employee.getPost().getFunctiontables()) {
				// 匹配是否是当前菜单的子项
				if (name.equals(fun.getFunctiontable().getFname())) {
					Map<String, Object> n = new HashMap<String, Object>();
					n.put("id", fun.getCodenumber());
					n.put("text", fun.getFname());
					nodeChild.add(n);
				}
			}
			node.put("children", nodeChild);
			tree.add(node);
		}
		return tree;
	}
	
	
	
	
}
