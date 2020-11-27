package com.accp.pojo;
/**
 * 车辆品牌表
 * @author 86181
 *
 */
public class Make {
    private Integer makeid;    //车辆品牌id

    private String makename;   //车辆品牌名称
    
    private String acronym;    //车辆品牌首字母

    public Integer getMakeid() {
        return makeid;
    }

    public void setMakeid(Integer makeid) {
        this.makeid = makeid;
    }

    public String getMakename() {
        return makename;
    }

    public void setMakename(String makename) {
        this.makename = makename == null ? null : makename.trim();
    }

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	@Override
	public String toString() {
		return "Make [makeid=" + makeid + ", makename=" + makename + ", acronym=" + acronym + "]";
	}

	public Make(Integer makeid, String makename, String acronym) {
		super();
		this.makeid = makeid;
		this.makename = makename;
		this.acronym = acronym;
	}

	public Make() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}