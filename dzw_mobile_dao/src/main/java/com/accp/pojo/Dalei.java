package com.accp.pojo;

public class Dalei {
    private Integer daid;

    private String damingcheng;

    public Integer getDaid() {
        return daid;
    }

    public void setDaid(Integer daid) {
        this.daid = daid;
    }

    public String getDamingcheng() {
        return damingcheng;
    }

    public void setDamingcheng(String damingcheng) {
        this.damingcheng = damingcheng == null ? null : damingcheng.trim();
    }
}