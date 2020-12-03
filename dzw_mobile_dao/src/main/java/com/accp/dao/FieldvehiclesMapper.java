package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Fieldvehicles;
import com.accp.pojo.Team;

public interface FieldvehiclesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Fieldvehicles record);

    int insertSelective(Fieldvehicles record);

    Fieldvehicles selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fieldvehicles record);

    int updateByPrimaryKey(Fieldvehicles record);

    //��ѯ���ڳ���
    @Select("SELECT * FROM `fieldvehicles` f INNER JOIN `team` t WHERE f.`teamid`=t.`teamid`")
    public List<Fieldvehicles> queryFiel();

    //��ѯ����
    @Select("select * from team")
    public List<Team> queryTeam();

    //��������
    public int insertFiel(@Param("fiel") Fieldvehicles fiel);

    //�޸ĳ���
    public int updateFiel(@Param("ff") Fieldvehicles ff);

    //ɾ������
    public int deleteFiel(@Param("id") int id);

}