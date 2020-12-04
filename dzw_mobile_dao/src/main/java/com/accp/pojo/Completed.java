package com.accp.pojo;

import java.util.Date;

public class Completed {
    private Integer completionid;//����id

    private String completiondate;//����ʱ��

    private String completiontdate;//Ԥ���깤ʱ��

    private String inspector;//�ʼ�Ա

    private Double penalty;//�������

    private String rework;//����ԭ��

    private Integer personid;//����id

    private String personname;//������

    private String delaytext;//�⹤ԭ��

    private Integer completiontype;//��������0/1

    private Integer mainid;//ά�ޱ�id
    private String compdate;//����ʱ��
    private Integer maintainling;//ά�޴���

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