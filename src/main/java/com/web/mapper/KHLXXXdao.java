package com.web.mapper;

import com.web.model.KHLXXX;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 客户联系信息
 */
public interface KHLXXXdao {
    /**
     * 新增客户联系信息
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
     */
    void insertkhlxxx(@Param("khxm") String khxm,
                      @Param("xb") String xb,
                      @Param("jg") String jg,
                      @Param("gsbm") String gsbm,
                      @Param("drzw") String drzw,
                      @Param("yddh") String yddh,
                      @Param("bgdh") String bgdh,
                      @Param("khyx") String khyx,
                      @Param("cggzd") String cggzd,
                      @Param("xg") String xg,
                      @Param("yxl") String yxl,
                      @Param("zt") String zt) throws Exception;

    /**
     * 查询所有的客户联系信息
     * @return
     * @throws Exception
     */
    List<KHLXXX> selectkhlxxx() throws Exception;

    /**
     * 删除客户联系人
     * @param khxm
     */
    void deletelxrxx(@Param("khxm") String khxm);
}
