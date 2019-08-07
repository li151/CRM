package com.web.service;

import com.web.model.FXFWFS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 分享服务方式
 */
@Transactional
public interface FXFWFSservice{
    /**
     * 查询分享服务名称
     * @return
     * @throws Exception
     */
    List<FXFWFS> selectfxfw()throws Exception;

    /**
     * 插入分享服务
     * @param fxfwmc
     * @param fwdx
     * @param fwnr
     * @param khxhd
     * @param tjr
     * @param tjsj
     * @return
     */
    String insertfx(String fxfwmc,String fwdx,String fwnr,String khxhd,String tjr,String tjsj);

    /**
     * 删除分享服务方式
     * @param fxfwmc
     * @return
     */
    String deletefx(String fxfwmc);
}
