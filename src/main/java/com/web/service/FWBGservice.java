package com.web.service;

import com.web.model.FWBG;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 服务报告
 */
@Transactional
public interface FWBGservice {
    /**
     * 查询服务报告
     * @return
     * @throws Exception
     */
    List<FWBG> selectfw()throws Exception;

    /**
     * 添加服务报告
     * @param khwt
     * @param khmc
     * @param fwrxm
     * @param fwlx
     * @param fwdd
     * @param fwjd
     * @param fwjb
     * @param wtsj
     * @param fwsj
     * @param wtzt
     * @param tjr
     * @param tjsj
     * @return
     */
    String insertfwbg(String khwt,String khmc,String fwrxm,String fwlx,String fwdd,String fwjd,String fwjb,String wtsj,String fwsj,String wtzt,String tjr,String tjsj);

    /**
     * 删除服务报告
     * @param khwt
     * @return
     */
    String deltefwbg(String khwt);
}

