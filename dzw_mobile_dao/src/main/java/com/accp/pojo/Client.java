package com.accp.pojo;

import java.util.Date;

public class Client {
    private Integer cid;            //�ͻ����

    private Integer vid;            //�������

    private Integer rid;            //���ݱ��

    private Integer rno;            //���㵥�ݱ��

    private Integer mid;            //��Ա���

    private String cname;            //�ͻ�����

    private String cphone;            //�ͻ��ֻ���

    private Date createdate;        //����ʱ��

    private Integer climit;            //���

    private Integer cintegral;        //����

    private String cremark;            //��ע

    private Integer cgrade;            //�ͻ��ȼ�

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getRno() {
        return rno;
    }

    public void setRno(Integer rno) {
        this.rno = rno;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone == null ? null : cphone.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getClimit() {
        return climit;
    }

    public void setClimit(Integer climit) {
        this.climit = climit;
    }

    public Integer getCintegral() {
        return cintegral;
    }

    public void setCintegral(Integer cintegral) {
        this.cintegral = cintegral;
    }

    public String getCremark() {
        return cremark;
    }

    public void setCremark(String cremark) {
        this.cremark = cremark == null ? null : cremark.trim();
    }

    public Integer getCgrade() {
        return cgrade;
    }

    public void setCgrade(Integer cgrade) {
        this.cgrade = cgrade;
    }

    public Client(Integer cid, String cname, String cphone, Date createdate, Integer climit, Integer cintegral,
                  String cremark, Integer cgrade) {
        super();
        this.cid = cid;
        this.cname = cname;
        this.cphone = cphone;
        this.createdate = createdate;
        this.climit = climit;
        this.cintegral = cintegral;
        this.cremark = cremark;
        this.cgrade = cgrade;
    }

    public Client() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Client [cid=" + cid + ", vid=" + vid + ", rid=" + rid + ", rno=" + rno + ", mid=" + mid + ", cname="
                + cname + ", cphone=" + cphone + ", createdate=" + createdate + ", climit=" + climit + ", cintegral="
                + cintegral + ", cremark=" + cremark + ", cgrade=" + cgrade + "]";
    }

}