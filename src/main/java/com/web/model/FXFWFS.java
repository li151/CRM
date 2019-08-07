package com.web.model;

/**
 * 服务方式分享
 */
public class FXFWFS {

    private int fxfwfsid;       // 主键
    private String fxfwmc;      //分享服务名称
    private String fwdx;        //服务对象
    private String fwnr;        //服务内容
    private String khxhd;       //客户喜欢的服务方式
    private String tjr;         //添加人
    private String tjsj;        //添加时间

    @Override
    public String toString() {
        return "FXFWFS{" +
                "fxfwfsid=" + fxfwfsid +
                ", fxfwmc='" + fxfwmc + '\'' +
                ", fwdx='" + fwdx + '\'' +
                ", fwnr='" + fwnr + '\'' +
                ", khxhd='" + khxhd + '\'' +
                ", tjr='" + tjr + '\'' +
                ", tjsj='" + tjsj + '\'' +
                '}';
    }

    public int getFxfwfsid() {
        return fxfwfsid;
    }

    public void setFxfwfsid(int fxfwfsid) {
        this.fxfwfsid = fxfwfsid;
    }

    public String getFxfwmc() {
        return fxfwmc;
    }

    public void setFxfwmc(String fxfwmc) {
        this.fxfwmc = fxfwmc;
    }

    public String getFwdx() {
        return fwdx;
    }

    public void setFwdx(String fwdx) {
        this.fwdx = fwdx;
    }

    public String getFwnr() {
        return fwnr;
    }

    public void setFwnr(String fwnr) {
        this.fwnr = fwnr;
    }

    public String getKhxhd() {
        return khxhd;
    }

    public void setKhxhd(String khxhd) {
        this.khxhd = khxhd;
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
