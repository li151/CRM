package com.web.model;

import java.util.Date;

/**
 * 个人记事本
 */
public class notbook {

    private int bookid;           //主键编号
    private String createuser;      //创建人
    private String context;          //记事内容
    private Date addtime;        //创建时间
    private String jsbt;        //记事标题

    @Override
    public String toString() {
        return "notbook{" +
                "bookid=" + bookid +
                ", createuser='" + createuser + '\'' +
                ", context='" + context + '\'' +
                ", addtime=" + addtime +
                ", jsbt='" + jsbt + '\'' +
                '}';
    }

    public String getJsbt() {
        return jsbt;
    }

    public void setJsbt(String jsbt) {
        this.jsbt = jsbt;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }


}
