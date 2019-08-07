package com.web.model;

public class YXHD {

    private int yxhdid;        //主键
    private String hdzt;       //活动主题
    private String jhsj;       //计划时间
    private String hdkzdd;     //活动开展地点
    private String txcp;       //推销的所有产品
    private String hdys;       //活动经费的预算
    private String jhxse;      //计划销售额
    private String phry;       //计划配合人员
    private String jhkzts;     //计划开展天数
    private String hdbz;       //活动备注
    private String hdfzr;      //活动负责人

    @Override
    public String toString() {
        return "YXHD{" +
                "yxhdid=" + yxhdid +
                ", hdzt='" + hdzt + '\'' +
                ", jhsj='" + jhsj + '\'' +
                ", hdkzdd='" + hdkzdd + '\'' +
                ", txcp='" + txcp + '\'' +
                ", hdys='" + hdys + '\'' +
                ", jhxse='" + jhxse + '\'' +
                ", phry='" + phry + '\'' +
                ", jhkzts='" + jhkzts + '\'' +
                ", hdbz='" + hdbz + '\'' +
                ", hdfzr='" + hdfzr + '\'' +
                '}';
    }

    public int getYxhdid() {
        return yxhdid;
    }

    public void setYxhdid(int yxhdid) {
        this.yxhdid = yxhdid;
    }

    public String getHdzt() {
        return hdzt;
    }

    public void setHdzt(String hdzt) {
        this.hdzt = hdzt;
    }

    public String getJhsj() {
        return jhsj;
    }

    public void setJhsj(String jhsj) {
        this.jhsj = jhsj;
    }

    public String getHdkzdd() {
        return hdkzdd;
    }

    public void setHdkzdd(String hdkzdd) {
        this.hdkzdd = hdkzdd;
    }

    public String getTxcp() {
        return txcp;
    }

    public void setTxcp(String txcp) {
        this.txcp = txcp;
    }

    public String getHdys() {
        return hdys;
    }

    public void setHdys(String hdys) {
        this.hdys = hdys;
    }

    public String getJhxse() {
        return jhxse;
    }

    public void setJhxse(String jhxse) {
        this.jhxse = jhxse;
    }

    public String getPhry() {
        return phry;
    }

    public void setPhry(String phry) {
        this.phry = phry;
    }

    public String getJhkzts() {
        return jhkzts;
    }

    public void setJhkzts(String jhkzts) {
        this.jhkzts = jhkzts;
    }

    public String getHdbz() {
        return hdbz;
    }

    public void setHdbz(String hdbz) {
        this.hdbz = hdbz;
    }

    public String getHdfzr() {
        return hdfzr;
    }

    public void setHdfzr(String hdfzr) {
        this.hdfzr = hdfzr;
    }


}
