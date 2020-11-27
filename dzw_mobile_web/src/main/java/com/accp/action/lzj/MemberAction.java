package com.accp.action.lzj;

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

import com.accp.biz.lzj.MemBerBiz;
import com.accp.pojo.Client;
import com.accp.pojo.Member;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/members")
public class MemberAction {

	@Autowired
	private MemBerBiz biz;
	
	/**
	 * 根据条件查询会员
	 * @param kahao
	 * @return
	 */
	@GetMapping("{kahao}/{p}/{s}")
	public PageInfo<Member> queryMember(@PathVariable String kahao,@PathVariable Integer p,@PathVariable Integer s){
		return biz.queryMember(kahao, p, s);
	}
	
	/**
     * 	根据条件查询不是会员的客户
     * @param cId
     * @return
     */
	@GetMapping("{cId}")
	public List<Client> queryClient(@PathVariable Integer cId){
		return biz.queryClient(cId);
	}
	
	/**
	 * 新增会员用户
	 */
	@PostMapping("member")
	public Map<String, String> insertMemberClient(@RequestBody Member member) {
		biz.updateClientGrand(member.getCid());
		int count = biz.insertMemberClient(member);
		Map<String, String> map = new HashMap<String,String>();
		if(count>0) {
			map.put("code", "200");
		}
		return map;
	}
	
	 /**
     * 	会员充值金额(修改会员余额)
     * @param mId
     * @param jine
     * @return
     */
	@GetMapping("member1/{jine}/{mid}")
    public Map<String, String> updateMember(@PathVariable Integer mid,@PathVariable Integer jine) {
		int count = biz.updateMember(mid, jine);
		Map<String, String> map = new HashMap<String, String>();
		if(count>0) {
			map.put("code", "200");
		}
		return map;
	}
	
	 /**
     *	 删除会员
     * @param mId
     * @return
     */
	@DeleteMapping("member/{mid}/{cid}")
    public Map<String, String> deleteMember(@PathVariable Integer mid,@PathVariable Integer cid) {
    	biz.deleteMember(mid);
    	int count = biz.updateMemerGrade(cid);
    	Map<String, String> map = new HashMap<String, String>();
    	if(count>0) {
    		map.put("code", "200");
    	}
    	return map;
    }
	
}
