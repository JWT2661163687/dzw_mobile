package com.accp.pojo;

public class Maintainreceipts {
    private Integer receiptsid;//Î¬ÐÞ×´Ì¬id

    private String receiptsname;//×´Ì¬Ãû

    public Integer getReceiptsid() {
        return receiptsid;
    }

    public void setReceiptsid(Integer receiptsid) {
        this.receiptsid = receiptsid;
    }

    public String getReceiptsname() {
        return receiptsname;
    }

    public void setReceiptsname(String receiptsname) {
        this.receiptsname = receiptsname == null ? null : receiptsname.trim();
    }
}