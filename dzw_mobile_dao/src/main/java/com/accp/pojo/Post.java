package com.accp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Integer postid;

    private Integer departmentid;

    private String postname;

    private String rcode;

    private Integer rstatus;

    private Date createdate;

    private String createby;
    
    public List<Functiontable> functiontables=new ArrayList<Functiontable>();
    

    public List<Functiontable> getFunctiontables() {
		return functiontables;
	}

	public void setFunctiontables(List<Functiontable> functiontables) {
		this.functiontables = functiontables;
	}

	public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname == null ? null : postname.trim();
    }

    public String getRcode() {
        return rcode;
    }

    public void setRcode(String rcode) {
        this.rcode = rcode == null ? null : rcode.trim();
    }

    public Integer getRstatus() {
        return rstatus;
    }

    public void setRstatus(Integer rstatus) {
        this.rstatus = rstatus;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }
}