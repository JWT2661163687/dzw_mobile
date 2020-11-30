package com.accp.pojo;

public class Shangpin {
    private Integer spid;

    private String spbianma;

    private String spmingcheng;

    private String spdalei;

    private String spxiaolei;

    private String spshoujia;
    
    private Integer daid;

	public Integer getDaid() {
		return daid;
	}

	public void setDaid(Integer daid) {
		this.daid = daid;
	}

	public Integer getSpid() {
        return spid;
    }

    public void setSpid(Integer spid) {
        this.spid = spid;
    }

    public String getSpbianma() {
        return spbianma;
    }

    public void setSpbianma(String spbianma) {
        this.spbianma = spbianma == null ? null : spbianma.trim();
    }

    public String getSpmingcheng() {
        return spmingcheng;
    }

    public void setSpmingcheng(String spmingcheng) {
        this.spmingcheng = spmingcheng == null ? null : spmingcheng.trim();
    }

    public String getSpdalei() {
        return spdalei;
    }

    public void setSpdalei(String spdalei) {
        this.spdalei = spdalei == null ? null : spdalei.trim();
    }

    public String getSpxiaolei() {
        return spxiaolei;
    }

    public void setSpxiaolei(String spxiaolei) {
        this.spxiaolei = spxiaolei == null ? null : spxiaolei.trim();
    }

    public String getSpshoujia() {
        return spshoujia;
    }

    public void setSpshoujia(String spshoujia) {
        this.spshoujia = spshoujia == null ? null : spshoujia.trim();
    }

    
}