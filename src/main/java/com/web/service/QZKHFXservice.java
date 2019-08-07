package com.web.service;

import com.web.model.QZKHFX;

import java.util.List;

/**
 * 潜在客户分析
 */
public interface QZKHFXservice {
    /**
     * 查询潜在客户分析记录
     * @param khmc
     * @return
     */
    List<QZKHFX> selectqzkhfx(String khmc);

    /**
     * 插入潜在客户分析
     * @param khmc
     * @param jljl
     * @param tjsj
     * @param tjr
     * @return
     */
    String insertqzkhfx(String khmc, String jljl, String tjsj, String tjr);
}
