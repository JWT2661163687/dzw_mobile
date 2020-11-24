package com.accp.pojo;

public class Xiaolei {
    private Integer xiaoid;

    private String xiaomingcheng;

    private Integer daid;

    public Integer getXiaoid() {
        return xiaoid;
    }

    public void setXiaoid(Integer xiaoid) {
        this.xiaoid = xiaoid;
    }

    public String getXiaomingcheng() {
        return xiaomingcheng;
    }

    public void setXiaomingcheng(String xiaomingcheng) {
        this.xiaomingcheng = xiaomingcheng == null ? null : xiaomingcheng.trim();
    }

    public Integer getDaid() {
        return daid;
    }

    public void setDaid(Integer daid) {
        this.daid = daid;
    }
}