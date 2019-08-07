package com.web.service;

import com.web.model.link;

import java.util.List;

/**
 * 客户交流记录
 */
public interface linkservice {
    /**
     * 查询客户交流记录
     * @param customerid
     * @return
     */
    List<link> seletlink(String customerid);

    /**
     * 新增客户交流记录
     * @param customerid
     * @param linktext
     * @param addtime
     * @param adduser
     * @return
     */
    String insertlink(String customerid, String linktext, String addtime, String adduser);
}
