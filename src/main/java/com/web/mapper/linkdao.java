package com.web.mapper;

import com.web.model.link;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用于客户交流记录
 */
public interface linkdao {
    /**
     * 用于查询客户交流记录
     * @param customerid  客户名称
     * @return
     */
    List<link> selectjljl(@Param("customerid") String customerid);

    /**
     * 用于新增客户交流记录
     * @param customerid
     * @param linktext
     * @param addtime
     * @param adduser
     */
    void insertjljl(@Param("customerid") String customerid, @Param("linktext") String linktext, @Param("addtime") String addtime, @Param("adduser") String adduser);
}
