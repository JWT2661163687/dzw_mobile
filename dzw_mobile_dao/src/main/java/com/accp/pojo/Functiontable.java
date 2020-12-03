package com.accp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Functiontable {
    @Override
	public String toString() {
		return "Functiontable [fid=" + fid + ", codenumber=" + codenumber + ", fname=" + fname + ", fpid=" + fpid
				+ ", functionlist=" + functionlist + ", createdate=" + createdate + ", functiontable=" + functiontable
				+ ", getFunctionlist()=" + getFunctionlist() + ", getFunctiontable()=" + getFunctiontable()
				+ ", getFid()=" + getFid() + ", getCodenumber()=" + getCodenumber() + ", getFname()=" + getFname()
				+ ", getFpid()=" + getFpid() + ", getCreatedate()=" + getCreatedate() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	private Integer fid;

    private String codenumber;

    private String fname;

    private Integer fpid;
    
    
    private List<Functiontable> functionlist=new ArrayList<Functiontable>();//子集功能集合
    

    public List<Functiontable> getFunctionlist() {
		return functionlist;
	}

	public void setFunctionlist(List<Functiontable> functionlist) {
		this.functionlist = functionlist;
	}

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