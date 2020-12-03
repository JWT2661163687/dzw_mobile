package com.accp.pojo;

import java.util.ArrayList;
import java.util.List;

import com.accp.dao.TeamtechniciantwoMapper;

public class Maintaincar {
    private Integer maintainid;//Î¬ï¿½ï¿½id

    private Integer receiptsid;//Î¬ï¿½ï¿½×´Ì¬id

    private Integer teamid;//ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½

    private Integer id;//id

    private String departdate;//ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ê±ï¿½ï¿½

    private String departaddress;//ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ö·

    private String constructiondate;//Ê©ï¿½ï¿½Ê±ï¿½ï¿½

    private String rescuevehicleaddress;//ï¿½ï¿½Ô®Ê±ï¿½ï¿½

    private String accomplishdate;//ï¿½ï¿½ï¿½Ê±ï¿½ï¿½

    private Integer maintainvehicleid;//Î¬ï¿½Þ³ï¿½ï¿½ï¿½id

    private Integer inside;//Õ¾ï¿½ï¿½Õ¾ï¿½ï¿½0/1

    private Integer mileage;//ï¿½ï¿½ï¿½ï¿½ï¿½

    private Integer counselorid;//ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½id

    private String beizhu;//Î¬ï¿½Þ±ï¿½×¢

    private Double maintainmoney;//Î¬ï¿½Þ½ï¿½ï¿½

    private String drivername;//ï¿½ï¿½Ê»Ô±

    private String maintainphone;//ï¿½ï¿½Ïµï¿½ç»°

    private String licence;//ï¿½ï¿½ï¿½Æºï¿½

    private String vehiclebrand;//ï¿½ï¿½ï¿½ï¿½Æ·ï¿½ï¿½

    private String vehiclemodel;//ï¿½ï¿½ï¿½ï¿½ï¿½Íºï¿½

    private Integer clearingfrom;//ï¿½ï¿½ï¿½ã·½Ê½0/1

    private String enginename;//ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Æ·ï¿½ï¿½

    private String vin;//ï¿½ï¿½ï¿½Üºï¿½

    private String enginehao;//ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½

    private String carownername;//ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½

    private Integer carid;//ï¿½ï¿½ï¿½ï¿½ï¿½Í»ï¿½ï¿½ï¿½ï¿½

<<<<<<< HEAD
    private String maintaindate;//µ¥¾ÝÊ±¼ä
    
    private String receiptsname;	//¶©µ¥×´Ì¬
    
    private String tename;			//°à×éÃû
    
    public List<Weixiu> weixius=new ArrayList<Weixiu>();//Î¬ÐÞÏîÄ¿¼¯ºÏ
=======
    private String maintaindate;//ï¿½ï¿½ï¿½ï¿½Ê±ï¿½ï¿½
    private Integer maintainling;//Î¬ï¿½Þ´ï¿½ï¿½ï¿½

    public Integer getMaintainling() {
        return maintainling;
    }

    public void setMaintainling(Integer maintainling) {
        this.maintainling = maintainling;
    }

    public List<Weixiu> weixius = new ArrayList<Weixiu>();//Î¬ï¿½ï¿½ï¿½ï¿½Ä¿ï¿½ï¿½ï¿½ï¿½

    public List<Maintaincarxiangmu> maintaincarxiangmus = new ArrayList<Maintaincarxiangmu>();//Î¬ï¿½ï¿½ï¿½ï¿½Ä¿ï¿½ï¿½ï¿½ï¿½
    public List<Teamtechniciantwo> teamtechniciantwos = new ArrayList<Teamtechniciantwo>();//Î¬ï¿½Þ¼ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½

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

>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git

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

<<<<<<< HEAD
	
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
=======
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
>>>>>>> branch 'master' of https://github.com/JWT2661163687/dzw_mobile.git


}