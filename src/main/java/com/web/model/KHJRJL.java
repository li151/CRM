package com.web.model;

/**
 * 客户节日记录表
 */
public class KHJRJL {
    private int khjrid;       //主键
    private String khxm;      //客户姓名
    private String zpry;      //指派人员
    private String zysx;      //注意事项
    private String ghsj;      //关怀时间
    private String ghms;      //关怀描述
    private String jrlx;      //节日类型
    private String tjsj;      //添加时间
    private String tjr;       //添加人

    @Override
    public String toString() {
        return "KHJRJL{" +
                "khjrid=" + khjrid +
                ", khxm='" + khxm + '\'' +
                ", zpry='" + zpry + '\'' +
                ", zysx='" + zysx + '\'' +
                ", ghsj='" + ghsj + '\'' +
                ", ghms='" + ghms + '\'' +
                ", jrlx='" + jrlx + '\'' +
                ", tjsj='" + tjsj + '\'' +
                ", tjr='" + tjr + '\'' +
                '}';
    }

    public int getKhjrid() {
        return khjrid;
    }

    public void setKhjrid(int khjrid) {
        this.khjrid = khjrid;
    }

    public String getKhxm() {
        return khxm;
    }

    public void setKhxm(String khxm) {
        this.khxm = khxm;
    }

    public String getZpry() {
        return zpry;
    }

    public void setZpry(String zpry) {
        this.zpry = zpry;
    }

    public String getZysx() {
        return zysx;
    }

    public void setZysx(String zysx) {
        this.zysx = zysx;
    }

    public String getGhsj() {
        return ghsj;
    }

    public void setGhsj(String ghsj) {
        this.ghsj = ghsj;
    }

    public String getGhms() {
        return ghms;
    }

    public void setGhms(String ghms) {
        this.ghms = ghms;
    }

    public String getJrlx() {
        return jrlx;
    }

    public void setJrlx(String jrlx) {
        this.jrlx = jrlx;
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
