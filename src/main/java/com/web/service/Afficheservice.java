package com.web.service;

import com.web.model.Affiche;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Transactional
public interface Afficheservice {
    /**
     * 这里用于查询公告
     * @return
     * @throws Exception
     */
    List<Affiche> selAff()throws Exception;

    /**
     * 用于添加公告
     * @param title
     * @param Content
     * @param addtime
     * @param affichetype
     * @param afficheuser
     * @throws Exception
     */
    void addgg(String title, String Content, String addtime, String affichetype, String afficheuser)throws Exception;

    /**
     * 条件查询
     * @param affichetype
     * @return
     */
    List<Affiche> selecttjcx(String affichetype);

    /**
     * 用于删除公告
     * @param rcmc
     * @return
     */
    String dlgg(String rcmc);

    /**
     * 用于查询不同类型的公告
     * @param affichetype
     * @return
     */
    Affiche selgglx(String affichetype);
}
