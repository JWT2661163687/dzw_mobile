package com.accp.biz.kwt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.EngineMapper;
import com.accp.pojo.Engine;
/**
 *发动机表业务层
 * @author 86181
 *
 */
@Service("EngineBiz")
public class EngineBiz {

	@Autowired
	private EngineMapper engineMapper;
	
	/**
	 * 查询所有
	 * @return
	 */
	public List<Engine> SelectPage(){
		return engineMapper.SelectAll();
	}
	/**
	 * 新增
	 * @param engine
	 * @return
	 */
	public int addEngine(Engine engine) {
		return engineMapper.insert(engine);
	}
	/**
	 * 模糊查询名称
	 * @param name
	 * @return
	 */
	public List<Engine> SelectByname(String name){
		return engineMapper.SelectByName(name);
	}
	/**
	 * 根据id删除
	 * @param id
	 * @return
	 */
	public int deleteById(Integer id) {
		return engineMapper.deleteByid(id);
	}
}
