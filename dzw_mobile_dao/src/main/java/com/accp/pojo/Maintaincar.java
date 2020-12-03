package com.accp.pojo;

import java.util.ArrayList;
import java.util.List;

import com.accp.dao.TeamtechniciantwoMapper;

public class Maintaincar {
    private Integer maintainid;//ά��id

    private Integer receiptsid;//ά��״̬id

    private Integer teamid;//������

    private Integer id;//id

    private String departdate;//��������ʱ��

    private String departaddress;//������ַ

    private String constructiondate;//ʩ��ʱ��

    private String rescuevehicleaddress;//��Ԯʱ��

    private String accomplishdate;//���ʱ��

    private Integer maintainvehicleid;//ά�޳���id

    private Integer inside;//վ��վ��0/1

    private Integer mileage;//�����

    private Integer counselorid;//�������id

    private String beizhu;//ά�ޱ�ע

    private Double maintainmoney;//ά�޽��

    private String drivername;//��ʻԱ

    private String maintainphone;//��ϵ�绰

    private String licence;//���ƺ�

    private String vehiclebrand;//����Ʒ��

    private String vehiclemodel;//�����ͺ�

    private Integer clearingfrom;//���㷽ʽ0/1

    private String enginename;//������Ʒ��

    private String vin;//���ܺ�

    private String enginehao;//��������

    private String carownername;//������

    private Integer carid;//�����ͻ����

    private String maintaindate;//����ʱ��
    private Integer maintainling;//ά�޴���

    public Integer getMaintainling() {
        return maintainling;
    }

    public void setMaintainling(Integer maintainling) {
        this.maintainling = maintainling;
    }

    public List<Weixiu> weixius = new ArrayList<Weixiu>();//ά����Ŀ����

    public List<Maintaincarxiangmu> maintaincarxiangmus = new ArrayList<Maintaincarxiangmu>();//ά����Ŀ����
    public List<Teamtechniciantwo> teamtechniciantwos = new ArrayList<Teamtechniciantwo>();//ά�޼�������

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