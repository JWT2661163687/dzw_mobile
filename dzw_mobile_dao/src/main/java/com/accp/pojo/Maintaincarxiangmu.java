package com.accp.pojo;

public class Maintaincarxiangmu {
    private Integer xmid;//项目id

    private Integer fid;//发动机id

    private Integer cid;//车型id

    private String xmleixing;//项目类别

    private String xmbianma;//项目编码

    private String xmmingcheng;//项目名称

    private String xmshoujia;//售价类型

    private String xmzhonglei;//收入种类

    private Integer xmbiaozhun;//标准价

    private Integer xmhuiyuan;//会员价

    private Integer mainno;//维修接车id
    private Integer maintainling;//维修次数

    public Integer getMaintainling() {
		return maintainling;
	}

	public void setMaintainling(Integer maintainling) {
		this.maintainling = maintainling;
	}

	public Integer getXmid() {
        return xmid;
    }

    public void setXmid(Integer xmid) {
        this.xmid = xmid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getXmleixing() {
        return xmleixing;
    }

    public void setXmleixing(String xmleixing) {
        this.xmleixing = xmleixing == null ? null : xmleixing.trim();
    }

    public String getXmbianma() {
        return xmbianma;
    }

    public void setXmbianma(String xmbianma) {
        this.xmbianma = xmbianma == null ? null : xmbianma.trim();
    }

    public String getXmmingcheng() {
        return xmmingcheng;
    }

    public void setXmmingcheng(String xmmingcheng) {
        this.xmmingcheng = xmmingcheng == null ? null : xmmingcheng.trim();
    }

    public String getXmshoujia() {
        return xmshoujia;
    }

    public void setXmshoujia(String xmshoujia) {
        this.xmshoujia = xmshoujia == null ? null : xmshoujia.trim();
    }

    public String getXmzhonglei() {
        return xmzhonglei;
    }

    public void setXmzhonglei(String xmzhonglei) {
        this.xmzhonglei = xmzhonglei == null ? null : xmzhonglei.trim();
    }

    public Integer getXmbiaozhun() {
        return xmbiaozhun;
    }

    public void setXmbiaozhun(Integer xmbiaozhun) {
        this.xmbiaozhun = xmbiaozhun;
    }

    public Integer getXmhuiyuan() {
        return xmhuiyuan;
    }

    public void setXmhuiyuan(Integer xmhuiyuan) {
        this.xmhuiyuan = xmhuiyuan;
    }

    public Integer getMainno() {
        return mainno;
    }

    public void setMainno(Integer mainno) {
        this.mainno = mainno;
    }
}