package com.accp.pojo;

public class Member {
    private Integer mid;            //��Ա���

    private String mcardnumber;        //��Ա����

    private String mpass;            //��Ա����

    private Integer cid;            //�ͻ����

    private String cname;            //�ͻ�����

    private Integer mbalance;        //�������

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMcardnumber() {
        return mcardnumber;
    }

    public void setMcardnumber(String mcardnumber) {
        this.mcardnumber = mcardnumber == null ? null : mcardnumber.trim();
    }

    public String getMpass() {
        return mpass;
    }

    public void setMpass(String mpass) {
        this.mpass = mpass == null ? null : mpass.trim();
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

    public Integer getMbalance() {
        return mbalance;
    }

    public void setMbalance(Integer mbalance) {
        this.mbalance = mbalance;
    }

    public Member(Integer mid, String mcardnumber, String mpass, Integer cid, String cname, Integer mbalance) {
        super();
        this.mid = mid;
        this.mcardnumber = mcardnumber;
        this.mpass = mpass;
        this.cid = cid;
        this.cname = cname;
        this.mbalance = mbalance;
    }

    public Member() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Member [mid=" + mid + ", mcardnumber=" + mcardnumber + ", mpass=" + mpass + ", cid=" + cid + ", cname="
                + cname + ", mbalance=" + mbalance + "]";
    }


}