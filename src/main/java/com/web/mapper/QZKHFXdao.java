package com.web.mapper;

import com.web.model.QZKHFX;
import org.apache.ibatis.annotations.Param;

import javax.print.DocFlavor;
import java.util.List;

/**
 * 潜在客户分析记录
 */
public interface QZKHFXdao {
    /**
     * 查询所有的客户名称
     * @param khmc
     * @return
     */
    List<QZKHFX> selectfxjl(@Param("khmc") String khmc)throws Exception;

    /**
     * 插入客户分析信息
     * @param khmc
     * @param jljl
     * @param tjsj
     * @param tjr
     * @throws Exception
     */
    void insertfxjl(@Param("khmc") String khmc,
                    @Param("jljl") String jljl,
                    @Param("tjsj") String tjsj,
                    @Param("tjr") String tjr)throws Exception;
}
