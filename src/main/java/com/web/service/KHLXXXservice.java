package com.web.service;

import com.web.model.KHLXXX;

import java.util.List;

/**
 * 客户联系信息
 */
public interface KHLXXXservice {
    /**
     * 查询客户联系人
     * @return
     * @throws Exception
     */
    List<KHLXXX> selectKHLXXX()throws Exception;

    /**
     * 新增客户联系人
     * @param khxm
     * @param xb
     * @param jg
     * @param gsbm
     * @param drzw
     * @param yddh
     * @param bgdh
     * @param khyx
     * @param cggzd
     * @param xg
     * @param yxl
     * @param zt
     * @return
     */
    String insertlxxx(String khxm,String xb,String jg,String gsbm,String drzw,String yddh,String bgdh,String khyx,String cggzd,String xg,String yxl,String zt);

    /**
     * 用于删除客户联系人
     * @param khxm
     * @return
     */
    String deletelxx(String khxm);
}
