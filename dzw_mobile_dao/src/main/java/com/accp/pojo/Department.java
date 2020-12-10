package com.accp.pojo;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private Integer departmentid;

    private String depnames;
    
    private List<Post> post=new ArrayList<Post>();
    

    public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(Integer departmentid, String depnames, List<Post> post) {
		super();
		this.departmentid = departmentid;
		this.depnames = depnames;
		this.post = post;
	}

	@Override
	public String toString() {
		return "Department [departmentid=" + departmentid + ", depnames=" + depnames + ", post=" + post + "]";
	}

	public List<Post> getPost() {
		return post;
	}

	public void setPost(List<Post> post) {
		this.post = post;
	}

	public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepnames() {
        return depnames;
    }

    public void setDepnames(String depnames) {
        this.depnames = depnames == null ? null : depnames.trim();
    }
}