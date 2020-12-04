package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Teamtechnician;

public interface TeamtechnicianMapper {
    int deleteByPrimaryKey(Integer technicianno);

    int insert(Teamtechnician record);

    int insertSelective(Teamtechnician record);

    Teamtechnician selectByPrimaryKey(Integer technicianno);

    int updateByPrimaryKeySelective(Teamtechnician record);

    int updateByPrimaryKey(Teamtechnician record);

    /**
     * 
     *
     * @param meid
     * @param teamid
     * @return
     */
    @Select("SELECT * FROM `teamtechnician` WHERE meid=#{meid} AND teamid=#{teamid} AND `mename` NOT IN(SELECT te.`mename` FROM `teamtechniciantwo` te INNER JOIN `maintaincar` ma ON te.`maintainid`=ma.`maintainid` WHERE ma.`receiptsid`=1)")
    List<Teamtechnician> selectMeidTeamid(@Param("meid") Integer meid, @Param("teamid") Integer teamid);


    //查询班组技工
    @Select("SELECT * FROM `teamtechnician` n\r\n"
            + "INNER JOIN `team` m\r\n"
            + "WHERE n.teamid=m.teamid")
    public List<Teamtechnician> queryTe();

    //新增班组
    public int insertTe(@Param("te") Teamtechnician te);

    /**
     * 根据班组名称查询
     */
    public List<Teamtechnician> queryTename(@Param("tename") String tename);

    /**
     * 根据班组名称修改
     */
    public int updateTe(@Param("tea") Teamtechnician tea);
    
    /**
     * 删除
     */
    @Delete("DELETE FROM `teamtechnician` WHERE `technicianno` = #{technicianno}")
    public int deleteTe(@Param("technicianno") int technicianno);
}