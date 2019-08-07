package com.web.model;

public class link {
    private int linkid;             //交流编号
    private String customerid;      //客户名称
    private String linktext;        //交流内容
    private String addtime;         //添加时间
    private String adduser;         //添加人

    @Override
    public String toString() {
        return "link{" +
                "linkid=" + linkid +
                ", customerid='" + customerid + '\'' +
                ", linktext='" + linktext + '\'' +
                ", addtime='" + addtime + '\'' +
                ", adduser='" + adduser + '\'' +
                '}';
    }

    public int getLinkid() {
        return linkid;
    }

    public void setLinkid(int linkid) {
        this.linkid = linkid;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getLinktext() {
        return linktext;
    }

    public void setLinktext(String linktext) {
        this.linktext = linktext;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public String getAdduser() {
        return adduser;
    }

    public void setAdduser(String adduser) {
        this.adduser = adduser;
    }


}
