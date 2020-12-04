package com.accp.pojo;

public class Closeanaccount {
    private Integer rno;				//单据编号

    private Integer rway;				//支付方式

    private Integer cid;				//客户编号

    private String cname;				//客户名
    
    private Integer cbalance;			//客户余额

    private String rodd;				//维修单号

    private String rcashier;			//收银员

    private Integer rdealwith;			//应收金额

    private Integer routofpocket;		//实付金额

    private Integer rdiscounts;			//优惠金额

    private String remark;				//备注
    
    private String rCreateDate;			//结算时间

    public String getrCreateDate() {
		return rCreateDate;
	}

	public void setrCreateDate(String rCreateDate) {
		this.rCreateDate = rCreateDate;
	}

	public Integer getRno() {
        return rno;
    }

    public void setRno(Integer rno) {
        this.rno = rno;
    }

    public Integer getRway() {
        return rway;
    }

    public void setRway(Integer rway) {
        this.rway = rway;
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

    public Integer getCbalance() {
        return cbalance;
    }

    public void setCbalance(Integer cbalance) {
        this.cbalance = cbalance;
    }

    public String getRodd() {
        return rodd;
    }

    public void setRodd(String rodd) {
        this.rodd = rodd == null ? null : rodd.trim();
    }

    public String getRcashier() {
        return rcashier;
    }

    public void setRcashier(String rcashier) {
        this.rcashier = rcashier == null ? null : rcashier.trim();
    }

    public Integer getRdealwith() {
        return rdealwith;
    }

    public void setRdealwith(Integer rdealwith) {
        this.rdealwith = rdealwith;
    }

    public Integer getRoutofpocket() {
        return routofpocket;
    }

    public void setRoutofpocket(Integer routofpocket) {
        this.routofpocket = routofpocket;
    }

    public Integer getRdiscounts() {
        return rdiscounts;
    }

    public void setRdiscounts(Integer rdiscounts) {
        this.rdiscounts = rdiscounts;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}