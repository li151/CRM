package com.web.model;

/**
 * 这是常见问题库
 */
public class CJWTK {
    private int cjwtid;         //主键
    private String wtms;        //问题描述
    private String jjff;        //解决方法
    private String jjr;         //解决人
    private String wtkssj;      //问题开始时间
    private String wtjjsj;      //问题解决时间
    private String tjr;         //添加人
    private String tjsj;        //添加时间

    @Override
    public String toString() {
        return "CJWTK{" +
                "cjwtid=" + cjwtid +
                ", wtms='" + wtms + '\'' +
                ", jjff='" + jjff + '\'' +
                ", jjr='" + jjr + '\'' +
                ", wtkssj='" + wtkssj + '\'' +
                ", wtjjsj='" + wtjjsj + '\'' +
                ", tjr='" + tjr + '\'' +
                ", tjsj='" + tjsj + '\'' +
                '}';
    }

    public int getCjwtid() {
        return cjwtid;
    }

    public void setCjwtid(int cjwtid) {
        this.cjwtid = cjwtid;
    }

    public String getWtms() {
        return wtms;
    }

    public void setWtms(String wtms) {
        this.wtms = wtms;
    }

    public String getJjff() {
        return jjff;
    }

    public void setJjff(String jjff) {
        this.jjff = jjff;
    }

    public String getJjr() {
        return jjr;
    }

    public void setJjr(String jjr) {
        this.jjr = jjr;
    }

    public String getWtkssj() {
        return wtkssj;
    }

    public void setWtkssj(String wtkssj) {
        this.wtkssj = wtkssj;
    }

    public String getWtjjsj() {
        return wtjjsj;
    }

    public void setWtjjsj(String wtjjsj) {
        this.wtjjsj = wtjjsj;
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
