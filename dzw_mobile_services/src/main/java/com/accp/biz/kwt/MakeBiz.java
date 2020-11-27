package com.accp.biz.kwt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.MakeMapper;
import com.accp.pojo.Make;

@Service("makeBiz")
public class MakeBiz {

	@Autowired
	private MakeMapper makeMapper;
	/**
	 * 查询所有车辆品牌表
	 * @return
	 */
	public List<Make> SelectAll(){
		return makeMapper.SelectMake();
	}
	/**
	 * 新增
	 * @param make
	 * @return
	 */
	public int addMake(Make make) {
		return makeMapper.inserts(make);
	}
	/**
	 * 根据id删除
	 * @param id
	 * @return
	 */
	public int deleteByid(Integer id) {
		return makeMapper.deletaById(id);
	}
	/**
	 * 查询id是否相同
	 * @param id
	 * @return
	 */
	public List<Make> SelectByid(Integer id){
		return makeMapper.SelectById(id);
	}
	/**
	 * 输入框查询
	 * @param name
	 * @return
	 */
	public List<Make> selectByAll(String name){
		return makeMapper.SelectByAll(name);
	}
	/**
	 * 根据id修改
	 * @param make
	 * @return
	 */
	public int updateByid(Make make) {
		return makeMapper.updateById(make);
	}
}
