package com.web.mapper;

import com.web.model.YXHD;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 营销管理
 */
public interface YXHDdao {
    /**
     * 新增营销管理
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
     * @throws Exception
     */
    void insertyxhd(@Param("hdzt") String hdzt,
                    @Param("jhsj") String jhsj,
                    @Param("hdkzdd") String hdkzdd,
                    @Param("txcp") String txcp,
                    @Param("hdys") String hdys,
                    @Param("jhxse") String jhxse,
                    @Param("phry") String phry,
                    @Param("jhkzts") String jhkzts,
                    @Param("hdbz") String hdbz,
                    @Param("hdfzr") String hdfzr) throws Exception;

    /**
     * 新增营销活动
     * @return
     * @throws Exception
     */
    List<YXHD> selectyxhd() throws Exception;

    /**
     * 删除营销活动
     * @param hdzt
     * @throws Exception
     */
    void deleteyxhd(@Param("hdzt") String hdzt)throws Exception;
}
