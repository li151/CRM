package com.web.service;

import com.web.model.QZKHXX;

import java.util.List;

/**
 * 潜在客户信息
 */
public interface QZKHXXservice {
    /**
     * 查询所有的潜在客户信息
     * @return
     * @throws Exception
     */
    List<QZKHXX> selectqzkhxx()throws Exception;

    /**
     * 插入客户信息
     * @param khmc
     * @param khlx
     * @param tjrq
     * @param dh
     * @param cz
     * @param fzr
     * @param dq
     * @param hy
     * @param jyxm
     * @param lxr
     * @param qydz
     * @param yx
     * @param qyxz
     * @return
     * @throws Exception
     */
    String insertqzkhxx(String khmc, String khlx , String tjrq , String dh , String cz , String fzr , String dq ,
                        String hy , String jyxm , String lxr , String qydz , String yx, String qyxz)throws Exception;

    /**
     * 删除潜在客户信息
     * @param khmc
     * @return
     * @throws Exception
     */
    String deleteqzkh(String khmc)throws Exception;
}
