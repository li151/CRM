package com.web.mapper;

import com.web.model.SCFX;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 市场分析
 */
public interface SCFXdao {
    /**
     * 新增市场分析
     * @param fxzt
     * @param fxnr
     * @param fxr
     * @param fxsj
     * @param fxfj
     * @throws Exception
     */
    void insertscfx(@Param("fxzt") String fxzt,
                    @Param("fxnr") String fxnr,
                    @Param("fxr") String fxr,
                    @Param("fxsj") String fxsj,
                    @Param("fxfj") String fxfj) throws Exception;

    /**
     * 查询所有的市场分析
     * @return
     * @throws Exception
     */
    List<SCFX> selectscfx() throws Exception;

    /**
     * 分析主题
     * @param fxzt
     */
    void deletescfx(@Param("fxzt") String fxzt);
}
