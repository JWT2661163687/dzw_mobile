package com.accp.pojo;

public class Maintainreceipts {
    private Integer receiptsid;

    private String receiptsname;

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