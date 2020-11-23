package com.accp.pojo;

public class House {
    private Integer houseid;

    private String houser;

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public String getHouser() {
        return houser;
    }

    public void setHouser(String houser) {
        this.houser = houser == null ? null : houser.trim();
    }
}