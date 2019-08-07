package com.web.service;

import com.web.model.KHJRJL;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 客户节日记录
 */
@Transactional
public interface KHJRJLservice {
    /**
     * 查询客户节日记录
     * @return
     * @throws Exception
     */
    List<KHJRJL> selectKH() throws Exception;

    /**
     * 新增客户节日记录
     * @param khxm
     * @param zpry
     * @param zysx
     * @param ghsj
     * @param ghms
     * @param jrlx
     * @param tjsj
     * @param tjr
     * @return
     */
    String insertkhjr(String khxm,String zpry,String zysx,String ghsj,String ghms,String jrlx,String tjsj,String tjr);

    /**
     * 删除客户节日记录
     * @param khxm
     * @return
     */
    String deletekhjr(String khxm);
}
