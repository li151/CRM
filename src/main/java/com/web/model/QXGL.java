package com.web.model;

/**
 * 权限管理
 */
public class QXGL {

    private int qxglid;        //主键
    private String username;              //用户名
    private String zygl;                   //主页管理
    private String tjgg;                   //添加公告
    private String scgg;                   //删除公告
    private String yhxx;                    //用户信息
    private String tjyh;                   //添加用户
    private String scyh;                  //删除用户
    private String yhqx;                 //用户权限管理
    private String ghc;                   //公海池
    private String tjkh;                  //添加客户
    private String sckh;                  //删除客户
    private String dcsj;                 //导出数据
    private String zykh;               //重要客户
    private String hxkh;                //核心客户
    private String ptkh;                //普通客户
    private String khxx;                //客户信息
    private String qzkhgl;               //潜在客户管理
    private String scqzkh;                //删除潜在客户
    private String fwbg;                 //服务报告
    private String scfwbg;               //删除服务报告
    private String cjwtk;                 //常见问题库
    private String sccjwtk;             //删除常见问题库
    private String fxfwfs;             //分享服务方式
    private String scfxfwfs;            //删除分享服务方式
    private String yxhd;               //营销活动
    private String scyxhd;            //删除营销活动
    private String scfx;                  //市场分析
    private String scscfx;               //删除市场分析
    private String khjrjl;             //客户节日管理
    private String sckhjrjl;            //删除客户节日记录
    private String khlxxx;               //客户联系方式
    private String sckhlxxx;             //删除客户联系信息

    @Override
    public String toString() {
        return "QXGL{" +
                "qxglid=" + qxglid +
                ", username='" + username + '\'' +
                ", zygl='" + zygl + '\'' +
                ", tjgg='" + tjgg + '\'' +
                ", scgg='" + scgg + '\'' +
                ", yhxx='" + yhxx + '\'' +
                ", tjyh='" + tjyh + '\'' +
                ", scyh='" + scyh + '\'' +
                ", yhqx='" + yhqx + '\'' +
                ", ghc='" + ghc + '\'' +
                ", tjkh='" + tjkh + '\'' +
                ", sckh='" + sckh + '\'' +
                ", dcsj='" + dcsj + '\'' +
                ", zykh='" + zykh + '\'' +
                ", hxkh='" + hxkh + '\'' +
                ", ptkh='" + ptkh + '\'' +
                ", khxx='" + khxx + '\'' +
                ", qzkhgl='" + qzkhgl + '\'' +
                ", scqzkh='" + scqzkh + '\'' +
                ", fwbg='" + fwbg + '\'' +
                ", scfwbg='" + scfwbg + '\'' +
                ", cjwtk='" + cjwtk + '\'' +
                ", sccjwtk='" + sccjwtk + '\'' +
                ", fxfwfs='" + fxfwfs + '\'' +
                ", scfxfwfs='" + scfxfwfs + '\'' +
                ", yxhd='" + yxhd + '\'' +
                ", scyxhd='" + scyxhd + '\'' +
                ", scfx='" + scfx + '\'' +
                ", scscfx='" + scscfx + '\'' +
                ", khjrjl='" + khjrjl + '\'' +
                ", sckhjrjl='" + sckhjrjl + '\'' +
                ", khlxxx='" + khlxxx + '\'' +
                ", sckhlxxx='" + sckhlxxx + '\'' +
                '}';
    }

    public int getQxglid() {
        return qxglid;
    }

    public void setQxglid(int qxglid) {
        this.qxglid = qxglid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getZygl() {
        return zygl;
    }

    public void setZygl(String zygl) {
        this.zygl = zygl;
    }

    public String getTjgg() {
        return tjgg;
    }

    public void setTjgg(String tjgg) {
        this.tjgg = tjgg;
    }

    public String getScgg() {
        return scgg;
    }

    public void setScgg(String scgg) {
        this.scgg = scgg;
    }

    public String getYhxx() {
        return yhxx;
    }

    public void setYhxx(String yhxx) {
        this.yhxx = yhxx;
    }

    public String getTjyh() {
        return tjyh;
    }

    public void setTjyh(String tjyh) {
        this.tjyh = tjyh;
    }

    public String getScyh() {
        return scyh;
    }

    public void setScyh(String scyh) {
        this.scyh = scyh;
    }

    public String getYhqx() {
        return yhqx;
    }

    public void setYhqx(String yhqx) {
        this.yhqx = yhqx;
    }

    public String getGhc() {
        return ghc;
    }

    public void setGhc(String ghc) {
        this.ghc = ghc;
    }

    public String getTjkh() {
        return tjkh;
    }

    public void setTjkh(String tjkh) {
        this.tjkh = tjkh;
    }

    public String getSckh() {
        return sckh;
    }

    public void setSckh(String sckh) {
        this.sckh = sckh;
    }

    public String getDcsj() {
        return dcsj;
    }

    public void setDcsj(String dcsj) {
        this.dcsj = dcsj;
    }

    public String getZykh() {
        return zykh;
    }

    public void setZykh(String zykh) {
        this.zykh = zykh;
    }

    public String getHxkh() {
        return hxkh;
    }

    public void setHxkh(String hxkh) {
        this.hxkh = hxkh;
    }

    public String getPtkh() {
        return ptkh;
    }

    public void setPtkh(String ptkh) {
        this.ptkh = ptkh;
    }

    public String getKhxx() {
        return khxx;
    }

    public void setKhxx(String khxx) {
        this.khxx = khxx;
    }

    public String getQzkhgl() {
        return qzkhgl;
    }

    public void setQzkhgl(String qzkhgl) {
        this.qzkhgl = qzkhgl;
    }

    public String getScqzkh() {
        return scqzkh;
    }

    public void setScqzkh(String scqzkh) {
        this.scqzkh = scqzkh;
    }

    public String getFwbg() {
        return fwbg;
    }

    public void setFwbg(String fwbg) {
        this.fwbg = fwbg;
    }

    public String getScfwbg() {
        return scfwbg;
    }

    public void setScfwbg(String scfwbg) {
        this.scfwbg = scfwbg;
    }

    public String getCjwtk() {
        return cjwtk;
    }

    public void setCjwtk(String cjwtk) {
        this.cjwtk = cjwtk;
    }

    public String getSccjwtk() {
        return sccjwtk;
    }

    public void setSccjwtk(String sccjwtk) {
        this.sccjwtk = sccjwtk;
    }

    public String getFxfwfs() {
        return fxfwfs;
    }

    public void setFxfwfs(String fxfwfs) {
        this.fxfwfs = fxfwfs;
    }

    public String getScfxfwfs() {
        return scfxfwfs;
    }

    public void setScfxfwfs(String scfxfwfs) {
        this.scfxfwfs = scfxfwfs;
    }

    public String getYxhd() {
        return yxhd;
    }

    public void setYxhd(String yxhd) {
        this.yxhd = yxhd;
    }

    public String getScyxhd() {
        return scyxhd;
    }

    public void setScyxhd(String scyxhd) {
        this.scyxhd = scyxhd;
    }

    public String getScfx() {
        return scfx;
    }

    public void setScfx(String scfx) {
        this.scfx = scfx;
    }

    public String getScscfx() {
        return scscfx;
    }

    public void setScscfx(String scscfx) {
        this.scscfx = scscfx;
    }

    public String getKhjrjl() {
        return khjrjl;
    }

    public void setKhjrjl(String khjrjl) {
        this.khjrjl = khjrjl;
    }

    public String getSckhjrjl() {
        return sckhjrjl;
    }

    public void setSckhjrjl(String sckhjrjl) {
        this.sckhjrjl = sckhjrjl;
    }

    public String getKhlxxx() {
        return khlxxx;
    }

    public void setKhlxxx(String khlxxx) {
        this.khlxxx = khlxxx;
    }

    public String getSckhlxxx() {
        return sckhlxxx;
    }

    public void setSckhlxxx(String sckhlxxx) {
        this.sckhlxxx = sckhlxxx;
    }


}
