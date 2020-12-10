package com.accp.biz.kwt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.MotorcycleMapper;
import com.accp.pojo.Motorcycle;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("MotorcycleBiz")
public class MotorcycleBiz {

    @Autowired
    private MotorcycleMapper motorcycleMapper;





	/**
	 * 查询车型所有，分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Motorcycle> SelectPage(int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Motorcycle>(motorcycleMapper.SelectAll());
	}
	/**
	 * 新增车型表
	 * @param record
	 * @return
	 */
	public int addMotorcycle(Motorcycle record) {
		return motorcycleMapper.inserts(record);
	}
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public List<Motorcycle> SelectByid(Integer id){
		return motorcycleMapper.SelectById(id);
	}
	/**
	 * 文本框多条件查询
	 * @param name
	 * @return
	 */
	public PageInfo<Motorcycle> SelectByInputs(String name,int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Motorcycle>(motorcycleMapper.SelectByInput(name));
	}
	/**
	 * 根据id删除
	 * @param id
	 * @return
	 */
	public int deleteByid(Integer id) {
		return motorcycleMapper.deleteById(id);
	}
	/**
	 * 根据id修改
	 * @param m
	 * @return
	 */
	public int updateByid(Motorcycle m) {
		return motorcycleMapper.updateById(m);
	}
}
