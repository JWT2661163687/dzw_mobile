package com.accp.pojo;

public class Chexing {
    private Integer cid;

    private String cleixing;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCleixing() {
        return cleixing;
    }

    public void setCleixing(String cleixing) {
        this.cleixing = cleixing == null ? null : cleixing.trim();
    }
}