package com.accp.pojo;

public class Motorcycle {
    private Integer motorcycleid;      //ï¿½ï¿½ï¿½Í¶ï¿½ï¿½ï¿½id

    private Integer engineid;          //ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Æ·ï¿½Æ±ï¿½ï¿½

    private Integer productionid;      //ï¿½ï¿½ï¿½ï¿½id

    private Integer makeid;            //ï¿½ï¿½ï¿½ï¿½Æ·ï¿½ï¿½id

    private String motorcyclename;     //ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½

    private String makename;           //Æ·ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½

    private String productionname;     //ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½

    private Double price;              //ï¿½Î¿ï¿½ï¿½Û¸ï¿½

    private Double yearprice;          //ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½

    private Double power;              //ï¿½ï¿½ï¿½ï¿½

    private Integer fuellabel;         //È¼ï¿½Í±ï¿½ï¿½

<<<<<<< HEAD
    private Double load;               //ï¿½ï¿½ï¿½ï¿½
=======
    private Double load;               //ÔØÖØ
    
    private String enginename;         //·¢¶¯»úÆ·ÅÆÃû³Æ
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git

    
    
    public String getEnginename() {
		return enginename;
	}

	public void setEnginename(String enginename) {
		this.enginename = enginename;
	}

	public Integer getMotorcycleid() {
        return motorcycleid;
    }

    public void setMotorcycleid(Integer motorcycleid) {
        this.motorcycleid = motorcycleid;
    }

    public Integer getEngineid() {
        return engineid;
    }

    public void setEngineid(Integer engineid) {
        this.engineid = engineid;
    }

    public Integer getProductionid() {
        return productionid;
    }

    public void setProductionid(Integer productionid) {
        this.productionid = productionid;
    }

    public Integer getMakeid() {
        return makeid;
    }

    public void setMakeid(Integer makeid) {
        this.makeid = makeid;
    }

    public String getMotorcyclename() {
        return motorcyclename;
    }

    public void setMotorcyclename(String motorcyclename) {
        this.motorcyclename = motorcyclename == null ? null : motorcyclename.trim();
    }

    public String getMakename() {
        return makename;
    }

    public void setMakename(String makename) {
        this.makename = makename == null ? null : makename.trim();
    }

    public String getProductionname() {
        return productionname;
    }

    public void setProductionname(String productionname) {
        this.productionname = productionname == null ? null : productionname.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getYearprice() {
        return yearprice;
    }

    public void setYearprice(Double yearprice) {
        this.yearprice = yearprice;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public Integer getFuellabel() {
        return fuellabel;
    }

    public void setFuellabel(Integer fuellabel) {
        this.fuellabel = fuellabel;
    }

    public Double getLoad() {
        return load;
    }

    public void setLoad(Double load) {
        this.load = load;
    }

<<<<<<< HEAD
    @Override
    public String toString() {
        return "Motorcycle [motorcycleid=" + motorcycleid + ", engineid=" + engineid + ", productionid=" + productionid
                + ", makeid=" + makeid + ", motorcyclename=" + motorcyclename + ", makename=" + makename
                + ", productionname=" + productionname + ", price=" + price + ", yearprice=" + yearprice + ", power="
                + power + ", fuellabel=" + fuellabel + ", load=" + load + "]";
    }
=======
	@Override
	public String toString() {
		return "Motorcycle [motorcycleid=" + motorcycleid + ", engineid=" + engineid + ", productionid=" + productionid
				+ ", makeid=" + makeid + ", motorcyclename=" + motorcyclename + ", makename=" + makename
				+ ", productionname=" + productionname + ", price=" + price + ", yearprice=" + yearprice + ", power="
				+ power + ", fuellabel=" + fuellabel + ", load=" + load + ", enginename=" + enginename + "]";
	}
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git

    public Motorcycle(Integer motorcycleid, Integer engineid, Integer productionid, Integer makeid,
                      String motorcyclename, String makename, String productionname, Double price, Double yearprice, Double power,
                      Integer fuellabel, Double load) {
        super();
        this.motorcycleid = motorcycleid;
        this.engineid = engineid;
        this.productionid = productionid;
        this.makeid = makeid;
        this.motorcyclename = motorcyclename;
        this.makename = makename;
        this.productionname = productionname;
        this.price = price;
        this.yearprice = yearprice;
        this.power = power;
        this.fuellabel = fuellabel;
        this.load = load;
    }

<<<<<<< HEAD
    public Motorcycle() {
        super();
        // TODO Auto-generated constructor stub
    }

=======
	public Motorcycle(Integer motorcycleid, Integer engineid, Integer productionid, Integer makeid,
			String motorcyclename, String makename, String productionname, Double price, Double yearprice, Double power,
			Integer fuellabel, Double load, String enginename) {
		super();
		this.motorcycleid = motorcycleid;
		this.engineid = engineid;
		this.productionid = productionid;
		this.makeid = makeid;
		this.motorcyclename = motorcyclename;
		this.makename = makename;
		this.productionname = productionname;
		this.price = price;
		this.yearprice = yearprice;
		this.power = power;
		this.fuellabel = fuellabel;
		this.load = load;
		this.enginename = enginename;
	}

	public Motorcycle() {
		super();
		// TODO Auto-generated constructor stub
	}
    
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git
}