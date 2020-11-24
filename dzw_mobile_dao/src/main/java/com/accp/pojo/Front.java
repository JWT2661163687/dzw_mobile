package com.accp.pojo;

import java.util.Date;

public class Front {
    private Integer frontid;

    private Integer carnumber;

    private Integer closeanaccountnumber;

    private Integer carrepairingnumber;

    private Integer repairnumber;

    private Integer instationnumber;

    private Integer outsidenumber;

    private Double generalincome;

    private Double realincome;

    private Double owe;

    private Integer owenumber;

    private Date frontdate;

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

    public Date getFrontdate() {
        return frontdate;
    }

    public void setFrontdate(Date frontdate) {
        this.frontdate = frontdate;
    }
}