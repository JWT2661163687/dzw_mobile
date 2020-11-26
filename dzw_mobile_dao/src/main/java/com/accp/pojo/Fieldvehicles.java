package com.accp.pojo;

public class Fieldvehicles {
    private Integer id;

    private Integer teamid;

    private String carnumber;

    private String fbrand;

    private String fmodel;

    private String currentmileage;

    private String tename;

    public String getTename() {
		return tename;
	}

	public void setTename(String tename) {
		this.tename = tename;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber == null ? null : carnumber.trim();
    }

    public String getFbrand() {
        return fbrand;
    }

    public void setFbrand(String fbrand) {
        this.fbrand = fbrand == null ? null : fbrand.trim();
    }

    public String getFmodel() {
        return fmodel;
    }

    public void setFmodel(String fmodel) {
        this.fmodel = fmodel == null ? null : fmodel.trim();
    }

    public String getCurrentmileage() {
        return currentmileage;
    }

    public void setCurrentmileage(String currentmileage) {
        this.currentmileage = currentmileage == null ? null : currentmileage.trim();
    }

   
}