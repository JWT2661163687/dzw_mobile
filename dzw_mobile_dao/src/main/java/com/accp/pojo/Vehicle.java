package com.accp.pojo;

import java.util.Date;

public class Vehicle {
    private Integer vid;			//车辆编号

    private Integer cid;			//客户编号

    private String vdriver;			//驾驶员

    private String vlicense;		//车辆号码

    private String vbrand;			//车辆品牌

    private String vmodel;			//车辆型号

    private String vphone;			//联系电话

    private String vaffiliation;	//车辆归属

    private Integer vmileage;		//里程

    private Date registereddate;	//上牌日期

    private Date purchasedate;		//购买日期

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