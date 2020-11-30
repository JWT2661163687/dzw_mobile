package com.accp.pojo;

import java.util.Date;

public class Functiontable {
    private Integer fid;

    private String codenumber;

    private String fname;

    private Integer fpid;

    private Date createdate;
    private Functiontable functiontable;

    public Functiontable getFunctiontable() {
		return functiontable;
	}

	public void setFunctiontable(Functiontable functiontable) {
		this.functiontable = functiontable;
	}

	public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getCodenumber() {
        return codenumber;
    }

    public void setCodenumber(String codenumber) {
        this.codenumber = codenumber == null ? null : codenumber.trim();
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public Integer getFpid() {
        return fpid;
    }

    public void setFpid(Integer fpid) {
        this.fpid = fpid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}