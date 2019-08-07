package com.web.model;

/**
 * 客户联系信息表
 */
public class KHLXXX {

    private int khlxid;     //主键
    private String khxm;    //客户姓名
    private String xb;      //性别
    private String jg;      //籍贯
    private String gsbm;    //所在公司部门
    private String drzw;    //担任职务
    private String yddh;    //移动电话
    private String bgdh;    //办公电话
    private String khyx;    //客户邮箱
    private String cggzd;   //采购关注点
    private String xg;      //性格
    private String yxl;     //在企业的影响力
    private String zt;      //状态

    @Override
    public String toString() {
        return "KHLXXX{" +
                "khlxid=" + khlxid +
                ", khxm='" + khxm + '\'' +
                ", xb='" + xb + '\'' +
                ", jg='" + jg + '\'' +
                ", gsbm='" + gsbm + '\'' +
                ", drzw='" + drzw + '\'' +
                ", yddh='" + yddh + '\'' +
                ", bgdh='" + bgdh + '\'' +
                ", khyx='" + khyx + '\'' +
                ", cggzd='" + cggzd + '\'' +
                ", xg='" + xg + '\'' +
                ", yxl='" + yxl + '\'' +
                ", zt='" + zt + '\'' +
                '}';
    }

    public int getKhlxid() {
        return khlxid;
    }

    public void setKhlxid(int khlxid) {
        this.khlxid = khlxid;
    }

    public String getKhxm() {
        return khxm;
    }

    public void setKhxm(String khxm) {
        this.khxm = khxm;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public String getJg() {
        return jg;
    }

    public void setJg(String jg) {
        this.jg = jg;
    }

    public String getGsbm() {
        return gsbm;
    }

    public void setGsbm(String gsbm) {
        this.gsbm = gsbm;
    }

    public String getDrzw() {
        return drzw;
    }

    public void setDrzw(String drzw) {
        this.drzw = drzw;
    }

    public String getYddh() {
        return yddh;
    }

    public void setYddh(String yddh) {
        this.yddh = yddh;
    }

    public String getBgdh() {
        return bgdh;
    }

    public void setBgdh(String bgdh) {
        this.bgdh = bgdh;
    }

    public String getKhyx() {
        return khyx;
    }

    public void setKhyx(String khyx) {
        this.khyx = khyx;
    }

    public String getCggzd() {
        return cggzd;
    }

    public void setCggzd(String cggzd) {
        this.cggzd = cggzd;
    }

    public String getXg() {
        return xg;
    }

    public void setXg(String xg) {
        this.xg = xg;
    }

    public String getYxl() {
        return yxl;
    }

    public void setYxl(String yxl) {
        this.yxl = yxl;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }


}
