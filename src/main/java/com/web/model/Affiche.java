package com.web.model;

import java.util.Date;

/**
 * 这里是公告管理
 */
public class Affiche {
    private int afficheID; //编号
    private String title;  //--标题
    private String content;  //内容
    private String addtime;  //添加时间
    private String affichetype;  //公告类型
    private String afficheuser;  //创建人

    @Override
    public String toString() {
        return "Affiche{" +
                "afficheID=" + afficheID +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", addtime='" + addtime + '\'' +
                ", affichetype='" + affichetype + '\'' +
                ", afficheuser='" + afficheuser + '\'' +
                '}';
    }

    public int getAfficheID() {
        return afficheID;
    }

    public void setAfficheID(int afficheID) {
        this.afficheID = afficheID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public String getAffichetype() {
        return affichetype;
    }

    public void setAffichetype(String affichetype) {
        this.affichetype = affichetype;
    }

    public String getAfficheuser() {
        return afficheuser;
    }

    public void setAfficheuser(String afficheuser) {
        this.afficheuser = afficheuser;
    }





}
