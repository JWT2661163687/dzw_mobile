package com.accp.pojo;

public class Motorcycle {
    private Integer motorcycleid;      //车型定义id

    private Integer engineid;          //发动机品牌编号

    private Integer productionid;      //产地id

    private Integer makeid;            //汽车品牌id

    private String motorcyclename;     //车型名称

    private String makename;           //品牌名称

    private String productionname;     //产地名称

    private Double price;              //参考价格

    private Double yearprice;          //车辆年款

    private Double power;              //功率

    private Integer fuellabel;         //燃油标号

    private Double load;               //载重
    
    private String enginename;         //发动机品牌名称

    
    
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

	@Override
	public String toString() {
		return "Motorcycle [motorcycleid=" + motorcycleid + ", engineid=" + engineid + ", productionid=" + productionid
				+ ", makeid=" + makeid + ", motorcyclename=" + motorcyclename + ", makename=" + makename
				+ ", productionname=" + productionname + ", price=" + price + ", yearprice=" + yearprice + ", power="
				+ power + ", fuellabel=" + fuellabel + ", load=" + load + ", enginename=" + enginename + "]";
	}

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
    
}