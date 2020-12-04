package com.accp.pojo;

import java.util.ArrayList;
import java.util.List;

import com.accp.dao.TeamtechniciantwoMapper;

public class Maintaincar {
    private Integer maintainid;//维锟斤拷id

    private Integer receiptsid;//维锟斤拷状态id

    private Integer teamid;//锟斤拷锟斤拷锟斤拷

    private Integer id;//id

    private String departdate;//锟斤拷锟斤拷锟斤拷锟斤拷时锟斤拷

    private String departaddress;//锟斤拷锟斤拷锟斤拷址

    private String constructiondate;//施锟斤拷时锟斤拷

    private String rescuevehicleaddress;//锟斤拷援时锟斤拷

    private String accomplishdate;//锟斤拷锟绞憋拷锟�

    private Integer maintainvehicleid;//维锟睫筹拷锟斤拷id

    private Integer inside;//站锟斤拷站锟斤拷0/1

    private Integer mileage;//锟斤拷锟斤拷锟�

    private Integer counselorid;//锟斤拷锟斤拷锟斤拷锟絠d

    private String beizhu;//维锟睫憋拷注

    private Double maintainmoney;//维锟睫斤拷锟�

    private String drivername;//锟斤拷驶员

    private String maintainphone;//锟斤拷系锟界话

    private String licence;//锟斤拷锟狡猴拷

    private String vehiclebrand;//锟斤拷锟斤拷品锟斤拷

    private String vehiclemodel;//锟斤拷锟斤拷锟酵猴拷

    private Integer clearingfrom;//锟斤拷锟姐方式0/1

    private String enginename;//锟斤拷锟斤拷锟斤拷品锟斤拷

    private String vin;//锟斤拷锟杰猴拷

    private String enginehao;//锟斤拷锟斤拷锟斤拷锟斤拷

    private String carownername;//锟斤拷锟斤拷锟斤拷

    private Integer carid;//锟斤拷锟斤拷锟酵伙拷锟斤拷锟�

    private String maintaindate;//单据时间
    
    private String receiptsname;	//订单状态
    
    private String tename;			//班组名
    
    public List<Weixiu> weixius=new ArrayList<Weixiu>();//维修项目集合

    private Integer maintainling;//维锟睫达拷锟斤拷

    public Integer getMaintainling() {
        return maintainling;
    }

    public void setMaintainling(Integer maintainling) {
        this.maintainling = maintainling;
    }


    public List<Maintaincarxiangmu> maintaincarxiangmus = new ArrayList<Maintaincarxiangmu>();//维锟斤拷锟斤拷目锟斤拷锟斤拷
    public List<Teamtechniciantwo> teamtechniciantwos = new ArrayList<Teamtechniciantwo>();//维锟睫硷拷锟斤拷锟斤拷锟斤拷

    public List<Teamtechniciantwo> getTeamtechniciantwos() {
        return teamtechniciantwos;
    }

    public void setTeamtechniciantwos(List<Teamtechniciantwo> teamtechniciantwos) {
        this.teamtechniciantwos = teamtechniciantwos;
    }

    public List<Maintaincarxiangmu> getMaintaincarxiangmus() {
        return maintaincarxiangmus;
    }

    public void setMaintaincarxiangmus(List<Maintaincarxiangmu> maintaincarxiangmus) {
        this.maintaincarxiangmus = maintaincarxiangmus;
    }


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

	
	public String getReceiptsname() {
		return receiptsname;
	}

	public void setReceiptsname(String receiptsname) {
		this.receiptsname = receiptsname;
	}

	public String getTename() {
		return tename;
	}

	public void setTename(String tename) {
		this.tename = tename;
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