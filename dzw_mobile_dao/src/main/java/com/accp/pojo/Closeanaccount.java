package com.accp.pojo;

public class Closeanaccount {
    private Integer rno;				//���ݱ��

    private Integer rway;				//֧����ʽ

    private Integer cid;				//�ͻ����

    private String cname;				//�ͻ���
    
    private Integer cbalance;			//�ͻ����

    private String rodd;				//ά�޵���

    private String rcashier;			//����Ա

    private Integer rdealwith;			//Ӧ�ս��

    private Integer routofpocket;		//ʵ�����

    private Integer rdiscounts;			//�Żݽ��

    private String remark;				//��ע
    
    private String rCreateDate;			//����ʱ��

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