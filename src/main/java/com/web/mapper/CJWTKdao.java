package com.web.mapper;

import com.web.model.CJWTK;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 常见问题报告
 */
public interface CJWTKdao {
    /**
     * 添加常见问题报告
     * @param wtms
     * @param jjff
     * @param jjr
     * @param wtkssj
     * @param wtjjsj
     * @param tjr
     * @param tjsj
     */
    void insertcjwt(@Param("wtms") String wtms,
                    @Param("jjff") String jjff,
                    @Param("jjr") String jjr,
                    @Param("wtkssj") String wtkssj,
                    @Param("wtjjsj") String wtjjsj,
                    @Param("tjr") String tjr,
                    @Param("tjsj") String tjsj) throws Exception;

    /**
     * 查询所有问题库
     * @return
     * @throws Exception
     */
    List<CJWTK> selectcjwt()throws Exception;

    void deletewtk(@Param("wtms") String wtms);

}
