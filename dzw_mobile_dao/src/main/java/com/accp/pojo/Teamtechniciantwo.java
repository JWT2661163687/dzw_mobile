package com.accp.pojo;

import java.util.Date;

public class Teamtechniciantwo {
    private Integer technicianno;

    private String tename;

    private Integer teamid;

    private Integer meid;

    private String mename;

    private String mesex;

    private String mephone;

    private String meaddress;

    private Date mebirthday;

    private Integer groupleader;

    private String menumber;

    private String accountaddress;

    private String openbank;

    private String bankaccount;

    private String starrating;

    private String repairwork;

    private String repairbrand;

    private Integer maintainid;
    
    private Integer maintainling;//Î¬ĞŞ´ÎÊı

    public Integer getMaintainling() {
		return maintainling;
	}

	public void setMaintainling(Integer maintainling) {
		this.maintainling = maintainling;
	}

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

    public Integer getMaintainid() {
        return maintainid;
    }

    public void setMaintainid(Integer maintainid) {
        this.maintainid = maintainid;
    }
}