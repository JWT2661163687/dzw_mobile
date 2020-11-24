package com.accp.pojo;

import java.util.Date;

public class Completed {
    private Integer completionid;

    private Date completiondate;

    private Date completiontdate;

    private String inspector;

    private Double penalty;

    private String rework;

    private Integer personid;

    private String personname;

    private String delaytext;

    private Integer completiontype;

    public Integer getCompletionid() {
        return completionid;
    }

    public void setCompletionid(Integer completionid) {
        this.completionid = completionid;
    }

    public Date getCompletiondate() {
        return completiondate;
    }

    public void setCompletiondate(Date completiondate) {
        this.completiondate = completiondate;
    }

    public Date getCompletiontdate() {
        return completiontdate;
    }

    public void setCompletiontdate(Date completiontdate) {
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