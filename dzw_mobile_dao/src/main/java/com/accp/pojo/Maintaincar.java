package com.accp.pojo;

import java.util.ArrayList;
import java.util.List;

public class Maintaincar {
    private Integer maintainid;//维修id

    private Integer receiptsid;//维修状态id

    private Integer teamid;//班组编号

    private Integer id;//id

    private String departdate;//开单出发时间

    private String departaddress;//出发地址

    private String constructiondate;//施工时间

    private String rescuevehicleaddress;//救援时间

    private String accomplishdate;//完成时间

    private Integer maintainvehicleid;//维修车辆id

    private Integer inside;//站内站外0/1

    private Integer mileage;//总里程

    private Integer counselorid;//服务顾问id

    private String beizhu;//维修备注

    private Double maintainmoney;//维修金额

    private String drivername;//驾驶员

    private String maintainphone;//联系电话

    private String licence;//车牌号

    private String vehiclebrand;//车辆品牌

    private String vehiclemodel;//车辆型号

    private Integer clearingfrom;//结算方式0/1

    private String enginename;//发动机品牌

    private String vin;//车架号

    private String enginehao;//发动机号

    private String carownername;//车主名

    private Integer carid;//车主客户编号

    private String maintaindate;//单据时间
    
    public List<Weixiu> weixius=new ArrayList<Weixiu>();//维修项目集合

    public List<Weixiu> getWeixius() {
		return weixius;
	}

	public void setWeixius(List<Weixiu> weixius) {
		this.weixius = weixius;
	}

	public Integer getMaintainid() {
        return maintainid;
    }

    public void setMaintainid(Integer maintainid) {
        this.maintainid = maintainid;
    }

    public Integer getReceiptsid() {
        return receiptsid;
    }

    public void setReceiptsid(Integer receiptsid) {
        this.receiptsid = receiptsid;
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getDepartaddress() {
        return departaddress;
    }

    public void setDepartaddress(String departaddress) {
        this.departaddress = departaddress == null ? null : departaddress.trim();
    }



    public String getRescuevehicleaddress() {
        return rescuevehicleaddress;
    }

    public void setRescuevehicleaddress(String rescuevehicleaddress) {
        this.rescuevehicleaddress = rescuevehicleaddress == null ? null : rescuevehicleaddress.trim();
    }



    public Integer getMaintainvehicleid() {
        return maintainvehicleid;
    }

    public void setMaintainvehicleid(Integer maintainvehicleid) {
        this.maintainvehicleid = maintainvehicleid;
    }

    public Integer getInside() {
        return inside;
    }

    public void setInside(Integer inside) {
        this.inside = inside;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getCounselorid() {
        return counselorid;
    }

    public void setCounselorid(Integer counselorid) {
        this.counselorid = counselorid;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public Double getMaintainmoney() {
        return maintainmoney;
    }

    public void setMaintainmoney(Double maintainmoney) {
        this.maintainmoney = maintainmoney;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername == null ? null : drivername.trim();
    }

    public String getMaintainphone() {
        return maintainphone;
    }

    public void setMaintainphone(String maintainphone) {
        this.maintainphone = maintainphone == null ? null : maintainphone.trim();
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence == null ? null : licence.trim();
    }

    public String getVehiclebrand() {
        return vehiclebrand;
    }

    public void setVehiclebrand(String vehiclebrand) {
        this.vehiclebrand = vehiclebrand == null ? null : vehiclebrand.trim();
    }

    public String getVehiclemodel() {
        return vehiclemodel;
    }

    public void setVehiclemodel(String vehiclemodel) {
        this.vehiclemodel = vehiclemodel == null ? null : vehiclemodel.trim();
    }

    public Integer getClearingfrom() {
        return clearingfrom;
    }

    public void setClearingfrom(Integer clearingfrom) {
        this.clearingfrom = clearingfrom;
    }

    public String getEnginename() {
        return enginename;
    }

    public void setEnginename(String enginename) {
        this.enginename = enginename == null ? null : enginename.trim();
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    public String getEnginehao() {
        return enginehao;
    }

    public void setEnginehao(String enginehao) {
        this.enginehao = enginehao == null ? null : enginehao.trim();
    }

    public String getCarownername() {
        return carownername;
    }

    public void setCarownername(String carownername) {
        this.carownername = carownername == null ? null : carownername.trim();
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

	public String getDepartdate() {
		return departdate;
	}

	public void setDepartdate(String departdate) {
		this.departdate = departdate;
	}

	public String getConstructiondate() {
		return constructiondate;
	}

	public void setConstructiondate(String constructiondate) {
		this.constructiondate = constructiondate;
	}

	public String getAccomplishdate() {
		return accomplishdate;
	}

	public void setAccomplishdate(String accomplishdate) {
		this.accomplishdate = accomplishdate;
	}

	public String getMaintaindate() {
		return maintaindate;
	}

	public void setMaintaindate(String maintaindate) {
		this.maintaindate = maintaindate;
	}

	@Override
	public String toString() {
		return "Maintaincar [maintainid=" + maintainid + ", receiptsid=" + receiptsid + ", teamid=" + teamid + ", id="
				+ id + ", departdate=" + departdate + ", departaddress=" + departaddress + ", constructiondate="
				+ constructiondate + ", rescuevehicleaddress=" + rescuevehicleaddress + ", accomplishdate="
				+ accomplishdate + ", maintainvehicleid=" + maintainvehicleid + ", inside=" + inside + ", mileage="
				+ mileage + ", counselorid=" + counselorid + ", beizhu=" + beizhu + ", maintainmoney=" + maintainmoney
				+ ", drivername=" + drivername + ", maintainphone=" + maintainphone + ", licence=" + licence
				+ ", vehiclebrand=" + vehiclebrand + ", vehiclemodel=" + vehiclemodel + ", clearingfrom=" + clearingfrom
				+ ", enginename=" + enginename + ", vin=" + vin + ", enginehao=" + enginehao + ", carownername="
				+ carownername + ", carid=" + carid + ", maintaindate=" + maintaindate + "]";
	}

  
}