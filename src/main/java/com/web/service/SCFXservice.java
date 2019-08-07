package com.web.service;

import com.web.model.SCFX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 市场分析
 */
@Transactional
public interface SCFXservice {
    /**
     * 市场分析
     * @return
     * @throws Exception
     */
    List<SCFX> selectsc()throws Exception;

    /**
     * 插入市场分析
     * @param fxzt
     * @param fxnr
     * @param fxr
     * @param fxsj
     * @param fxfj
     * @return
     */
    String insertscfx(String fxzt,String fxnr,String fxr,String fxsj,String fxfj);

    /**
     * 删除市场分析
     * @param fxzt
     * @return
     */
    String deletescfx(String fxzt);
}
