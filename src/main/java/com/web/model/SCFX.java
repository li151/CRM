package com.web.model;

public class SCFX {
    private int scfxid;        //主键
    private String fxzt;       //分析主题
    private String fxnr;       //分析内容
    private String fxr;        //分析人
    private String fxsj;       //分析时间
    private String fxfj;       //分析附件

    @Override
    public String toString() {
        return "SCFX{" +
                "scfxid=" + scfxid +
                ", fxzt='" + fxzt + '\'' +
                ", fxnr='" + fxnr + '\'' +
                ", fxr='" + fxr + '\'' +
                ", fxsj='" + fxsj + '\'' +
                ", fxfj='" + fxfj + '\'' +
                '}';
    }

    public int getScfxid() {
        return scfxid;
    }

    public void setScfxid(int scfxid) {
        this.scfxid = scfxid;
    }

    public String getFxzt() {
        return fxzt;
    }

    public void setFxzt(String fxzt) {
        this.fxzt = fxzt;
    }

    public String getFxnr() {
        return fxnr;
    }

    public void setFxnr(String fxnr) {
        this.fxnr = fxnr;
    }

    public String getFxr() {
        return fxr;
    }

    public void setFxr(String fxr) {
        this.fxr = fxr;
    }

    public String getFxsj() {
        return fxsj;
    }

    public void setFxsj(String fxsj) {
        this.fxsj = fxsj;
    }

    public String getFxfj() {
        return fxfj;
    }

    public void setFxfj(String fxfj) {
        this.fxfj = fxfj;
    }


}
