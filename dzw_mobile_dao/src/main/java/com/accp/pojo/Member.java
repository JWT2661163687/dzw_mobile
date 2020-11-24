package com.accp.pojo;

public class Member {
    private Integer mid;

    private String mcardnumber;

    private String mpass;

    private Integer cid;

    private String cname;

    private Integer mbalance;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMcardnumber() {
        return mcardnumber;
    }

    public void setMcardnumber(String mcardnumber) {
        this.mcardnumber = mcardnumber == null ? null : mcardnumber.trim();
    }

    public String getMpass() {
        return mpass;
    }

    public void setMpass(String mpass) {
        this.mpass = mpass == null ? null : mpass.trim();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Integer getMbalance() {
        return mbalance;
    }

    public void setMbalance(Integer mbalance) {
        this.mbalance = mbalance;
    }
}