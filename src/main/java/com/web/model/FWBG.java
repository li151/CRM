package com.web.model;

public class FWBG {
    private int fwbgid;               //主键
    private String khwt;              //客户问题
    private String khmc;              //客户名称
    private String fwrxm;             //服务人姓名
    private String fwlx;              //服务类型
    private String fwdd;              //服务地点
    private String fwjd;              //服务阶段
    private String fwjb;              //服务级别
    private String wtsj;              //问题时间
    private String fwsj;              //服务时间
    private String wtzt;              //问题状态
    private String tjr;               //添加人
    private String tjsj;              //添加时间

    @Override
    public String toString() {
        return "FWBG{" +
                "fwbgid=" + fwbgid +
                ", khwt='" + khwt + '\'' +
                ", khmc='" + khmc + '\'' +
                ", fwrxm='" + fwrxm + '\'' +
                ", fwlx='" + fwlx + '\'' +
                ", fwdd='" + fwdd + '\'' +
                ", fwjd='" + fwjd + '\'' +
                ", fwjb='" + fwjb + '\'' +
                ", wtsj='" + wtsj + '\'' +
                ", fwsj='" + fwsj + '\'' +
                ", wtzt='" + wtzt + '\'' +
                ", tjr='" + tjr + '\'' +
                ", tjsj='" + tjsj + '\'' +
                '}';
    }

    public int getFwbgid() {
        return fwbgid;
    }

    public void setFwbgid(int fwbgid) {
        this.fwbgid = fwbgid;
    }

    public String getKhwt() {
        return khwt;
    }

    public void setKhwt(String khwt) {
        this.khwt = khwt;
    }

    public String getKhmc() {
        return khmc;
    }

    public void setKhmc(String khmc) {
        this.khmc = khmc;
    }

    public String getFwrxm() {
        return fwrxm;
    }

    public void setFwrxm(String fwrxm) {
        this.fwrxm = fwrxm;
    }

    public String getFwlx() {
        return fwlx;
    }

    public void setFwlx(String fwlx) {
        this.fwlx = fwlx;
    }

    public String getFwdd() {
        return fwdd;
    }

    public void setFwdd(String fwdd) {
        this.fwdd = fwdd;
    }

    public String getFwjd() {
        return fwjd;
    }

    public void setFwjd(String fwjd) {
        this.fwjd = fwjd;
    }

    public String getFwjb() {
        return fwjb;
    }

    public void setFwjb(String fwjb) {
        this.fwjb = fwjb;
    }

    public String getWtsj() {
        return wtsj;
    }

    public void setWtsj(String wtsj) {
        this.wtsj = wtsj;
    }

    public String getFwsj() {
        return fwsj;
    }

    public void setFwsj(String fwsj) {
        this.fwsj = fwsj;
    }

    public String getWtzt() {
        return wtzt;
    }

    public void setWtzt(String wtzt) {
        this.wtzt = wtzt;
    }

    public String getTjr() {
        return tjr;
    }

    public void setTjr(String tjr) {
        this.tjr = tjr;
    }

    public String getTjsj() {
        return tjsj;
    }

    public void setTjsj(String tjsj) {
        this.tjsj = tjsj;
    }

}
