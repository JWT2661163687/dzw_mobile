package com.accp.pojo;

public class Mechanicstar {
    private Integer meid;

    private String starrating;

    private String grade;

    private String weight;

    public Integer getMeid() {
        return meid;
    }

    public void setMeid(Integer meid) {
        this.meid = meid;
    }

    public String getStarrating() {
        return starrating;
    }

    public void setStarrating(String starrating) {
        this.starrating = starrating == null ? null : starrating.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }
}