package com.accp.pojo;

public class Motorcycle {
    private Integer motorcycleid;      //锟斤拷锟酵讹拷锟斤拷id

    private Integer engineid;          //锟斤拷锟斤拷锟斤拷品锟狡憋拷锟�

    private Integer productionid;      //锟斤拷锟斤拷id

    private Integer makeid;            //锟斤拷锟斤拷品锟斤拷id

    private String motorcyclename;     //锟斤拷锟斤拷锟斤拷锟斤拷

    private String makename;           //品锟斤拷锟斤拷锟斤拷

    private String productionname;     //锟斤拷锟斤拷锟斤拷锟斤拷

    private Double price;              //锟轿匡拷锟桔革拷

    private Double yearprice;          //锟斤拷锟斤拷锟斤拷锟�

    private Double power;              //锟斤拷锟斤拷

    private Integer fuellabel;         //燃锟酵憋拷锟�


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
                + power + ", fuellabel=" + fuellabel + ", load=" + load + "]";
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

    public Motorcycle() {
        super();
        // TODO Auto-generated constructor stub
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
}