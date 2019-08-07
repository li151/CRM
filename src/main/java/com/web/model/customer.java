package com.web.model;

import java.util.Date;

/**
 * 这里是客户信息
 */
public class customer {
    private int customerid;              //编号主键
    private String customername;       //客户名称
    private String shortid;                //客户类型类别
    private String linkid;               //客户级别   公海池之类的区分
    private Date addtime;         //信息创建时间
    private String eproperty;     //企业性质
    private String telephone;     //电话  手机
    private String fax;           //传真
    private String functionary;   //公司负责人
    private String province;      //所在省份
    private String city;          // 所在市 城市
    private String industry;      //行业
    private String dealproject;    //经营项目
    private String linkman;        //公司联系人
    private String linkphone;      //联系人电话
    private String linkaddress;    //企业地址
    private String email;          //企业邮箱
    private String linktype;       //客户性质

    @Override
    public String toString() {
        return "customer{" +
                "customerid=" + customerid +
                ", customername='" + customername + '\'' +
                ", shortid='" + shortid + '\'' +
                ", linkid='" + linkid + '\'' +
                ", addtime=" + addtime +
                ", eproperty='" + eproperty + '\'' +
                ", telephone='" + telephone + '\'' +
                ", fax='" + fax + '\'' +
                ", functionary='" + functionary + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", industry='" + industry + '\'' +
                ", dealproject='" + dealproject + '\'' +
                ", linkman='" + linkman + '\'' +
                ", linkphone='" + linkphone + '\'' +
                ", linkaddress='" + linkaddress + '\'' +
                ", email='" + email + '\'' +
                ", linktype='" + linktype + '\'' +
                '}';
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getShortid() {
        return shortid;
    }

    public void setShortid(String shortid) {
        this.shortid = shortid;
    }

    public String getLinkid() {
        return linkid;
    }

    public void setLinkid(String linkid) {
        this.linkid = linkid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getEproperty() {
        return eproperty;
    }

    public void setEproperty(String eproperty) {
        this.eproperty = eproperty;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getFunctionary() {
        return functionary;
    }

    public void setFunctionary(String functionary) {
        this.functionary = functionary;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getDealproject() {
        return dealproject;
    }

    public void setDealproject(String dealproject) {
        this.dealproject = dealproject;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getLinkphone() {
        return linkphone;
    }

    public void setLinkphone(String linkphone) {
        this.linkphone = linkphone;
    }

    public String getLinkaddress() {
        return linkaddress;
    }

    public void setLinkaddress(String linkaddress) {
        this.linkaddress = linkaddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinktype() {
        return linktype;
    }

    public void setLinktype(String linktype) {
        this.linktype = linktype;
    }

}
