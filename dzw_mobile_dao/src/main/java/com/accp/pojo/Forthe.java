package com.accp.pojo;

import java.util.Date;

public class Forthe {
    private Integer rid;

    private Integer rtype;

    private Integer rstate;

    private Integer cid;

    private String cname;

    private String vlicense;

    private String rphone;

    private Date rcreatedate;

    private Date renddate;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getRtype() {
        return rtype;
    }

    public void setRtype(Integer rtype) {
        this.rtype = rtype;
    }

    public Integer getRstate() {
        return rstate;
    }

    public void setRstate(Integer rstate) {
        this.rstate = rstate;
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

    public String getVlicense() {
        return vlicense;
    }

    public void setVlicense(String vlicense) {
        this.vlicense = vlicense == null ? null : vlicense.trim();
    }

    public String getRphone() {
        return rphone;
    }

    public void setRphone(String rphone) {
        this.rphone = rphone == null ? null : rphone.trim();
    }

    public Date getRcreatedate() {
        return rcreatedate;
    }

    public void setRcreatedate(Date rcreatedate) {
        this.rcreatedate = rcreatedate;
    }

    public Date getRenddate() {
        return renddate;
    }

    public void setRenddate(Date renddate) {
        this.renddate = renddate;
    }
}