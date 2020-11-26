package com.accp.pojo;

import java.util.Date;

public class Front {
    private Integer frontid;//id

    private Integer carnumber;//接车数量

    private Integer closeanaccountnumber;//结算数量

    private Integer carrepairingnumber;//再修数量

    private Integer repairnumber;//返修数量

    private Integer instationnumber;//站内维修数量

    private Integer outsidenumber;//站外维修数量

    private Double generalincome;//总收入

    private Double realincome;//是收入

    private Double owe;//挂账金额

    private Integer owenumber;//挂账人数

    private String frontdate;//今日时间

    public Integer getFrontid() {
        return frontid;
    }

    public void setFrontid(Integer frontid) {
        this.frontid = frontid;
    }

    public Integer getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(Integer carnumber) {
        this.carnumber = carnumber;
    }

    public Integer getCloseanaccountnumber() {
        return closeanaccountnumber;
    }

    public void setCloseanaccountnumber(Integer closeanaccountnumber) {
        this.closeanaccountnumber = closeanaccountnumber;
    }

    public Integer getCarrepairingnumber() {
        return carrepairingnumber;
    }

    public void setCarrepairingnumber(Integer carrepairingnumber) {
        this.carrepairingnumber = carrepairingnumber;
    }

    public Integer getRepairnumber() {
        return repairnumber;
    }

    public void setRepairnumber(Integer repairnumber) {
        this.repairnumber = repairnumber;
    }

    public Integer getInstationnumber() {
        return instationnumber;
    }

    public void setInstationnumber(Integer instationnumber) {
        this.instationnumber = instationnumber;
    }

    public Integer getOutsidenumber() {
        return outsidenumber;
    }

    public void setOutsidenumber(Integer outsidenumber) {
        this.outsidenumber = outsidenumber;
    }

    public Double getGeneralincome() {
        return generalincome;
    }

    public void setGeneralincome(Double generalincome) {
        this.generalincome = generalincome;
    }

    public Double getRealincome() {
        return realincome;
    }

    public void setRealincome(Double realincome) {
        this.realincome = realincome;
    }

    public Double getOwe() {
        return owe;
    }

    public void setOwe(Double owe) {
        this.owe = owe;
    }

    public Integer getOwenumber() {
        return owenumber;
    }

    public void setOwenumber(Integer owenumber) {
        this.owenumber = owenumber;
    }

	public String getFrontdate() {
		return frontdate;
	}

	public void setFrontdate(String frontdate) {
		this.frontdate = frontdate;
	}

	@Override
	public String toString() {
		return "Front [frontid=" + frontid + ", carnumber=" + carnumber + ", closeanaccountnumber="
				+ closeanaccountnumber + ", carrepairingnumber=" + carrepairingnumber + ", repairnumber=" + repairnumber
				+ ", instationnumber=" + instationnumber + ", outsidenumber=" + outsidenumber + ", generalincome="
				+ generalincome + ", realincome=" + realincome + ", owe=" + owe + ", owenumber=" + owenumber
				+ ", frontdate=" + frontdate + "]";
	}

   
}