package com.web.model;

public class RCGL {
    private int rcglid;          //主键
    private String rcmc;         //日程名称
    private String kssj;         //开始时间
    private String jssj;         //结束时间
    private String rcnr;         //日程内容
    private String qtgz;         //是否全天工作
    private String qwdd;         //去往地点
    private String cjr;          //创建人

    @Override
    public String toString() {
        return "RCGL{" +
                "rcglid=" + rcglid +
                ", rcmc='" + rcmc + '\'' +
                ", kssj='" + kssj + '\'' +
                ", jssj='" + jssj + '\'' +
                ", rcnr='" + rcnr + '\'' +
                ", qtgz='" + qtgz + '\'' +
                ", qwdd='" + qwdd + '\'' +
                ", cjr='" + cjr + '\'' +
                '}';
    }

    public int getRcglid() {
        return rcglid;
    }

    public void setRcglid(int rcglid) {
        this.rcglid = rcglid;
    }

    public String getRcmc() {
        return rcmc;
    }

    public void setRcmc(String rcmc) {
        this.rcmc = rcmc;
    }

    public String getKssj() {
        return kssj;
    }

    public void setKssj(String kssj) {
        this.kssj = kssj;
    }

    public String getJssj() {
        return jssj;
    }

    public void setJssj(String jssj) {
        this.jssj = jssj;
    }

    public String getRcnr() {
        return rcnr;
    }

    public void setRcnr(String rcnr) {
        this.rcnr = rcnr;
    }

    public String getQtgz() {
        return qtgz;
    }

    public void setQtgz(String qtgz) {
        this.qtgz = qtgz;
    }

    public String getQwdd() {
        return qwdd;
    }

    public void setQwdd(String qwdd) {
        this.qwdd = qwdd;
    }

    public String getCjr() {
        return cjr;
    }

    public void setCjr(String cjr) {
        this.cjr = cjr;
    }


}
