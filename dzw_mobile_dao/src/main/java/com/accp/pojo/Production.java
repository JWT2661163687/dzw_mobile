package com.accp.pojo;

public class Production {
    private Integer productionid;

    private String productionname;

    public Integer getProductionid() {
        return productionid;
    }

    public void setProductionid(Integer productionid) {
        this.productionid = productionid;
    }

    public String getProductionname() {
        return productionname;
    }

    public void setProductionname(String productionname) {
        this.productionname = productionname == null ? null : productionname.trim();
    }
}