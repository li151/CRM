package com.web.service;

import com.web.model.CJWTK;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 常见问题库
 */
@Transactional
public interface CJWTKservice {
    /**
     * 查询常见问题
     * @return
     * @throws Exception
     */
    List<CJWTK> selectcjwt()throws Exception;

    /**
     * 新增常见问题
     * @param wtms
     * @param jjff
     * @param jjr
     * @param wtkssj
     * @param wtjjsj
     * @param tjr
     * @param tjsj
     * @return
     */
    String insertcjwt(String wtms,String jjff,String jjr,String wtkssj,String wtjjsj,String tjr,String tjsj);

    /**
     * 删除常见问题
     * @param wtms
     * @return
     */
    String deletecjwt(String wtms);
}
