package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.Fieldvehicles;
import com.accp.pojo.Team;

public interface FieldvehiclesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Fieldvehicles record);

    int insertSelective(Fieldvehicles record);

    Fieldvehicles selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fieldvehicles record);

    int updateByPrimaryKey(Fieldvehicles record);
    /**
     * ÐÞ¸Ä×´Ì¬
     * @param id
     * @return
     */
    @Update("update fieldvehicles set zhuangtai=1 where id=#{id}")
    public int updateFielzhuangtai(@Param("id")Integer id);

    //ï¿½ï¿½Ñ¯ï¿½ï¿½ï¿½Ú³ï¿½ï¿½ï¿½
    @Select("SELECT * FROM `fieldvehicles` f INNER JOIN `team` t WHERE f.`teamid`=t.`teamid` and zhuangtai=#{zhuangtai}")
    public List<Fieldvehicles> queryFiel(@Param("zhuangtai")String zhuangtai);

    //ï¿½ï¿½Ñ¯ï¿½ï¿½ï¿½ï¿½
    @Select("select * from team")
    public List<Team> queryTeam();

    //ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½
    public int insertFiel(@Param("fiel") Fieldvehicles fiel);

    //ï¿½Þ¸Ä³ï¿½ï¿½ï¿½
    public int updateFiel(@Param("ff") Fieldvehicles ff);

    //É¾ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½
    public int deleteFiel(@Param("id") int id);
    /**
     * ²éÑ¯¿ÉÒÔÅÉ³µµÄ¾ÈÔ®³µÁ¾
     * @return
     */
    @Select("SELECT * FROM `fieldvehicles` WHERE zhuangtai=1 ")
    List<Fieldvehicles> selectAlling();
    
    
}