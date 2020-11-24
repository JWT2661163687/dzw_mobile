package com.accp.pojo;

public class Team {
    private Integer teamid;

    private String tename;

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public String getTename() {
        return tename;
    }

    public void setTename(String tename) {
        this.tename = tename == null ? null : tename.trim();
    }
}