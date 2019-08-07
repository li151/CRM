package com.web.mapper;

import com.web.model.FXFWFS;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 分享服务方式
 */
public interface FXFWFSdao {
    /**
     *新增分享服务方式
     * @throws Exception
     * @param fxfwmc
     * @param fwdx
     * @param fwnr
     * @param khxhd
     * @param tjr
     * @param tjsj
     */
    void insertfxfwbg(@Param("fxfwmc") String fxfwmc,
                      @Param("fwdx") String fwdx,
                      @Param("fwnr") String fwnr,
                      @Param("khxhd") String khxhd,
                      @Param("tjr") String tjr,
                      @Param("tjsj") String tjsj) throws Exception;

    /**
     * 查询所有分享的服务方式
     * @return
     * @throws Exception
     */
    List<FXFWFS> selectfwfs() throws Exception;


    void deletefx(@Param("fxfwmc") String fxfwmc)throws Exception;
}
