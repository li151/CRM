package com.web.model;

/**
 * 潜在客户分析
 */
public class QZKHFX {

    private int qzkhfxid;            //主键
    private String khmc;             //客户名称
    private String jljl;             //交流记录
    private String tjsj;             //添加时间
    private String tjr;              //添加人

    @Override
    public String toString() {
        return "QZKHFX{" +
                "qzkhfxid=" + qzkhfxid +
                ", khmc='" + khmc + '\'' +
                ", jljl='" + jljl + '\'' +
                ", tjsj='" + tjsj + '\'' +
                ", tjr='" + tjr + '\'' +
                '}';
    }

    public int getQzkhfxid() {
        return qzkhfxid;
    }

    public void setQzkhfxid(int qzkhfxid) {
        this.qzkhfxid = qzkhfxid;
    }

    public String getKhmc() {
        return khmc;
    }

    public void setKhmc(String khmc) {
        this.khmc = khmc;
    }

    public String getJljl() {
        return jljl;
    }

    public void setJljl(String jljl) {
        this.jljl = jljl;
    }

    public String getTjsj() {
        return tjsj;
    }

    public void setTjsj(String tjsj) {
        this.tjsj = tjsj;
    }

    public String getTjr() {
        return tjr;
    }

    public void setTjr(String tjr) {
        this.tjr = tjr;
    }


}
