package com.accp.pojo;

public class Fadongji {
    private Integer fid;

    private String fleixing;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFleixing() {
        return fleixing;
    }

    public void setFleixing(String fleixing) {
        this.fleixing = fleixing == null ? null : fleixing.trim();
    }
}