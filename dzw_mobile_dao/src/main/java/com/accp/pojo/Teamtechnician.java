package com.accp.pojo;

import java.util.Date;

public class Teamtechnician {
    private Integer technicianno;//技工编号

    private String tename;//班组名称

    private Integer teamid;//班组编号

    private Integer meid;//技工编码

    private String mename;//技工姓名

    private String mesex;//性别

    private String mephone;//手机

    private String meaddress;//地址

    private Date mebirthday;//出生日期

    private Integer groupleader;//组长

    private String menumber;//身份证号

    private String accountaddress;//户口地址

    private String openbank;//开户银行

    private String bankaccount;//银行账号

    private String starrating;//星级

    private String repairwork;//维修工种

    private String repairbrand;//维修品牌

    public Integer getTechnicianno() {
        return technicianno;
    }

    public void setTechnicianno(Integer technicianno) {
        this.technicianno = technicianno;
    }

    public String getTename() {
        return tename;
    }

    public void setTename(String tename) {
        this.tename = tename == null ? null : tename.trim();
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public Integer getMeid() {
        return meid;
    }

    public void setMeid(Integer meid) {
        this.meid = meid;
    }

    public String getMename() {
        return mename;
    }

    public void setMename(String mename) {
        this.mename = mename == null ? null : mename.trim();
    }

    public String getMesex() {
        return mesex;
    }

    public void setMesex(String mesex) {
        this.mesex = mesex == null ? null : mesex.trim();
    }

    public String getMephone() {
        return mephone;
    }

    public void setMephone(String mephone) {
        this.mephone = mephone == null ? null : mephone.trim();
    }

    public String getMeaddress() {
        return meaddress;
    }

    public void setMeaddress(String meaddress) {
        this.meaddress = meaddress == null ? null : meaddress.trim();
    }

    public Date getMebirthday() {
        return mebirthday;
    }

    public void setMebirthday(Date mebirthday) {
        this.mebirthday = mebirthday;
    }

    public Integer getGroupleader() {
        return groupleader;
    }

    public void setGroupleader(Integer groupleader) {
        this.groupleader = groupleader;
    }

    public String getMenumber() {
        return menumber;
    }

    public void setMenumber(String menumber) {
        this.menumber = menumber == null ? null : menumber.trim();
    }

    public String getAccountaddress() {
        return accountaddress;
    }

    public void setAccountaddress(String accountaddress) {
        this.accountaddress = accountaddress == null ? null : accountaddress.trim();
    }

    public String getOpenbank() {
        return openbank;
    }

    public void setOpenbank(String openbank) {
        this.openbank = openbank == null ? null : openbank.trim();
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount == null ? null : bankaccount.trim();
    }

    public String getStarrating() {
        return starrating;
    }

    public void setStarrating(String starrating) {
        this.starrating = starrating == null ? null : starrating.trim();
    }

    public String getRepairwork() {
        return repairwork;
    }

    public void setRepairwork(String repairwork) {
        this.repairwork = repairwork == null ? null : repairwork.trim();
    }

    public String getRepairbrand() {
        return repairbrand;
    }

    public void setRepairbrand(String repairbrand) {
        this.repairbrand = repairbrand == null ? null : repairbrand.trim();
    }
}