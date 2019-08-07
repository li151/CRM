package com.web.service;

import com.web.model.YXHD;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 营销活动管理
 */
@Transactional
public interface YXHDservice {
    /**
     * 查询营销活动
     * @return
     * @throws Exception
     */
    List<YXHD> selectyxhd() throws Exception;

    /**
     * 插入营销活动
     * @param hdzt
     * @param jhsj
     * @param hdkzdd
     * @param txcp
     * @param hdys
     * @param jhxse
     * @param phry
     * @param jhkzts
     * @param hdbz
     * @param hdfzr
     * @return
     */
    String insertyxgl(String hdzt,String jhsj,String hdkzdd,String txcp,String hdys,String jhxse,String phry,String jhkzts,String hdbz,String hdfzr);

    String deleteyxhd(String hdzt);
}
