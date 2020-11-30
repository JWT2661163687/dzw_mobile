package com.accp.pojo;

import java.util.Date;

public class Completed {
    private Integer completionid;//竣工id

    private String completiondate;//竣工时间

    private String completiontdate;//预计完工时间

    private String inspector;//质检员

    private Double penalty;//处罚金额

    private String rework;//返工原因

    private Integer personid;//责任id

    private String personname;//责任人

    private String delaytext;//吴工原因

    private Integer completiontype;//竣工类型0/1
    
    private Integer mainid;//维修表id
    private String compdate;//创建时间
    private Integer maintainling;//维修次数

    public Integer getMaintainling() {
		return maintainling;
	}

	public void setMaintainling(Integer maintainling) {
		this.maintainling = maintainling;
	}

	public Integer getMainid() {
		return mainid;
	}

	public void setMainid(Integer mainid) {
		this.mainid = mainid;
	}

	public String getCompdate() {
		return compdate;
	}

	public void setCompdate(String compdate) {
		this.compdate = compdate;
	}

	public Integer getCompletionid() {
        return completionid;
    }

    public void setCompletionid(Integer completionid) {
        this.completionid = completionid;
    }

  

    @Override
	public String toString() {
		return "Completed [completionid=" + completionid + ", completiondate=" + completiondate + ", completiontdate="
				+ completiontdate + ", inspector=" + inspector + ", penalty=" + penalty + ", rework=" + rework
				+ ", personid=" + personid + ", personname=" + personname + ", delaytext=" + delaytext
				+ ", completiontype=" + completiontype + "]";
	}

	public String getCompletiondate() {
		return completiondate;
	}

	public void setCompletiondate(String completiondate) {
		this.completiondate = completiondate;
	}

	public String getCompletiontdate() {
		return completiontdate;
	}

	public void setCompletiontdate(String completiontdate) {
		this.completiontdate = completiontdate;
	}

	public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector == null ? null : inspector.trim();
    }

    public Double getPenalty() {
        return penalty;
    }

    public void setPenalty(Double penalty) {
        this.penalty = penalty;
    }

    public String getRework() {
        return rework;
    }

    public void setRework(String rework) {
        this.rework = rework == null ? null : rework.trim();
    }

    public Integer getPersonid() {
        return personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname == null ? null : personname.trim();
    }

    public String getDelaytext() {
        return delaytext;
    }

    public void setDelaytext(String delaytext) {
        this.delaytext = delaytext == null ? null : delaytext.trim();
    }

    public Integer getCompletiontype() {
        return completiontype;
    }

    public void setCompletiontype(Integer completiontype) {
        this.completiontype = completiontype;
    }
}