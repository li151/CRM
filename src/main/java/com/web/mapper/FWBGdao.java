package com.web.mapper;

import com.web.model.FWBG;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 服务报告
 */
public interface FWBGdao {
    /**
     * 新增服务报告
     */
    void insertfwbg(@Param("khwt") String khwt,
                    @Param("khmc") String khmc,
                    @Param("fwrxm") String fwrxm,
                    @Param("fwlx") String fwlx,
                    @Param("fwdd") String fwdd,
                    @Param("fwjd") String fwjd,
                    @Param("fwjb") String fwjb,
                    @Param("wtsj") String wtsj,
                    @Param("fwsj") String fwsj,
                    @Param("wtzt") String wtzt,
                    @Param("tjr") String tjr,
                    @Param("tjsj") String tjsj)throws Exception;

    /**
     * 查询所有的服务报告
     * @return
     * @throws Exception
     */
    List<FWBG> selectfwbg() throws Exception;

    /**
     * 删除服务报告
     * @param khwt
     */
    void deletefwbg(@Param("khwt") String khwt);
}
