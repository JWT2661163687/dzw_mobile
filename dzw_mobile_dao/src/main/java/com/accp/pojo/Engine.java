package com.accp.pojo;

public class Engine {
    private Integer engineid;      //发动机编号

    private String enginename;     //发动机名称

    public Integer getEngineid() {
        return engineid;
    }

    public void setEngineid(Integer engineid) {
        this.engineid = engineid;
    }

    public String getEnginename() {
        return enginename;
    }

    public void setEnginename(String enginename) {
        this.enginename = enginename == null ? null : enginename.trim();
    }

	@Override
	public String toString() {
		return "Engine [engineid=" + engineid + ", enginename=" + enginename + "]";
	}

	public Engine(Integer engineid, String enginename) {
		super();
		this.engineid = engineid;
		this.enginename = enginename;
	}

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}