package com.web.model;

/**
 * 潜在客户信息
 */
public class QZKHXX {

    private int qzkhxxid;       //主键
    private String khmc;       //客户名称
    private String khlx;        // 客户类型
    private String tjrq;       //添加日期
    private String dh;         //电话
    private String cz;        //传真
    private String fzr;        //负责人
    private String dq;          //地区
    private String hy;         //行业
    private String jyxm;        //经营项目
    private String lxr;         //联系人
    private String qydz;        //企业地址
    private String yx;          //邮箱
    private String qyxz;        //企业性质

    @Override
    public String toString() {
        return "QZKHXX{" +
                "qzkhxxid=" + qzkhxxid +
                ", khmc='" + khmc + '\'' +
                ", khlx='" + khlx + '\'' +
                ", tjrq='" + tjrq + '\'' +
                ", dh='" + dh + '\'' +
                ", cz='" + cz + '\'' +
                ", fzr='" + fzr + '\'' +
                ", dq='" + dq + '\'' +
                ", hy='" + hy + '\'' +
                ", jyxm='" + jyxm + '\'' +
                ", lxr='" + lxr + '\'' +
                ", qydz='" + qydz + '\'' +
                ", yx='" + yx + '\'' +
                ", qyxz='" + qyxz + '\'' +
                '}';
    }

    public int getQzkhxxid() {
        return qzkhxxid;
    }

    public void setQzkhxxid(int qzkhxxid) {
        this.qzkhxxid = qzkhxxid;
    }

    public String getKhmc() {
        return khmc;
    }

    public void setKhmc(String khmc) {
        this.khmc = khmc;
    }

    public String getKhlx() {
        return khlx;
    }

    public void setKhlx(String khlx) {
        this.khlx = khlx;
    }

    public String getTjrq() {
        return tjrq;
    }

    public void setTjrq(String tjrq) {
        this.tjrq = tjrq;
    }

    public String getDh() {
        return dh;
    }

    public void setDh(String dh) {
        this.dh = dh;
    }

    public String getCz() {
        return cz;
    }

    public void setCz(String cz) {
        this.cz = cz;
    }

    public String getFzr() {
        return fzr;
    }

    public void setFzr(String fzr) {
        this.fzr = fzr;
    }

    public String getDq() {
        return dq;
    }

    public void setDq(String dq) {
        this.dq = dq;
    }

    public String getHy() {
        return hy;
    }

    public void setHy(String hy) {
        this.hy = hy;
    }

    public String getJyxm() {
        return jyxm;
    }

    public void setJyxm(String jyxm) {
        this.jyxm = jyxm;
    }

    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr;
    }

    public String getQydz() {
        return qydz;
    }

    public void setQydz(String qydz) {
        this.qydz = qydz;
    }

    public String getYx() {
        return yx;
    }

    public void setYx(String yx) {
        this.yx = yx;
    }

    public String getQyxz() {
        return qyxz;
    }

    public void setQyxz(String qyxz) {
        this.qyxz = qyxz;
    }


}
