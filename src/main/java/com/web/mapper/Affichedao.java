package com.web.mapper;

import com.web.model.Affiche;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface Affichedao {
    /**
     * 用来查询公告的
     * @return
     * @throws Exception
     */
    List<Affiche> selectaff()throws Exception;

    /**
     * 用于插入公告
     * @param title
     * @param Content
     * @param addtime
     * @param affichetype
     * @param afficheuser
     * @throws Exception
     */
    void insertgg(@Param("title") String title,
                  @Param("Content") String Content,
                  @Param("addtime") String addtime,
                  @Param("affichetype") String affichetype,
                  @Param("afficheuser") String afficheuser)throws Exception;

    /**
     * 用于条件查询公告
     * @param affichetype
     * @return
     */
    List<Affiche> selecttjcx(@Param("affichetype") String affichetype);

    /**
     * 用于删除公告
     * @param title
     * @return
     */
    void deletegg(@Param("title") String title);

    /**
     * 用于查询不同类型的公告
     * @param affichetype
     * @return
     */
    Affiche selecttjgg(@Param("affichetype") String affichetype);
}
