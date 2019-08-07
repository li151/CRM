package com.web.mapper;

import com.web.model.RCGL;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 日程管理
 */
public interface RCGLdao {
    /**
     * 新增日程管理
     * @param rcmc
     * @param kssj
     * @param jssj
     * @param rcnr
     * @param qtgz
     * @param qwdd
     * @param cjr
     * @throws Exception
     */
    void insertrcgl(@Param("rcmc") String rcmc,
                    @Param("kssj") String kssj,
                    @Param("jssj") String jssj,
                    @Param("rcnr") String rcnr,
                    @Param("qtgz") String qtgz,
                    @Param("qwdd") String qwdd,
                    @Param("cjr") String cjr) throws Exception;

    /**
     * 查询所有的日程管理
     * @param cjr  --当前用户的
     * @return
     * @throws Exception
     */
    List<RCGL> selectrcgl(@Param("cjr") String cjr) throws Exception;

    /**
     * 用于删除日程
     * @param rcmc
     * @param cjr
     */
    void deletercgl(@Param("rcmc") String rcmc,@Param("cjr") String cjr);
}
