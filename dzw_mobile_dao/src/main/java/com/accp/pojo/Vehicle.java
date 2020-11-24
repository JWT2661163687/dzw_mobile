package com.accp.pojo;

import java.util.Date;

public class Vehicle {
    private Integer vid;

    private Integer cid;

    private String vdriver;

    private String vlicense;

    private String vbrand;

    private String vmodel;

    private String vphone;

    private String vaffiliation;

    private Integer vmileage;

    private Date registereddate;

    private Date purchasedate;

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getVdriver() {
        return vdriver;
    }

    public void setVdriver(String vdriver) {
        this.vdriver = vdriver == null ? null : vdriver.trim();
    }

    public String getVlicense() {
        return vlicense;
    }

    public void setVlicense(String vlicense) {
        this.vlicense = vlicense == null ? null : vlicense.trim();
    }

    public String getVbrand() {
        return vbrand;
    }

    public void setVbrand(String vbrand) {
        this.vbrand = vbrand == null ? null : vbrand.trim();
    }

    public String getVmodel() {
        return vmodel;
    }

    public void setVmodel(String vmodel) {
        this.vmodel = vmodel == null ? null : vmodel.trim();
    }

    public String getVphone() {
        return vphone;
    }

    public void setVphone(String vphone) {
        this.vphone = vphone == null ? null : vphone.trim();
    }

    public String getVaffiliation() {
        return vaffiliation;
    }

    public void setVaffiliation(String vaffiliation) {
        this.vaffiliation = vaffiliation == null ? null : vaffiliation.trim();
    }

    public Integer getVmileage() {
        return vmileage;
    }

    public void setVmileage(Integer vmileage) {
        this.vmileage = vmileage;
    }

    public Date getRegistereddate() {
        return registereddate;
    }

    public void setRegistereddate(Date registereddate) {
        this.registereddate = registereddate;
    }

    public Date getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }
}