package com.web.mapper;

import com.web.model.QZKHXX;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 潜在客户信息
 */
public interface QZKHXXdao {
    /**
     * 查询所有潜在客户信息
     * @return
     */
    List<QZKHXX> selectqzkhxx() throws Exception;

    /**
     * 插入潜在客户信息
     * @param khmc
     * @param khlx
     * @param tjrq
     * @param dh
     * @param cz
     * @param fzr
     * @param dq
     * @param hy
     * @param jyxm
     * @param lxr
     * @param qydz
     * @param yx
     * @param qyxz
     */
    void insertqzkhxx(@Param("khmc") String khmc,
                      @Param("khlx") String khlx ,
                      @Param("tjrq") String tjrq ,
                      @Param("dh") String dh ,
                      @Param("cz") String cz ,
                      @Param("fzr") String fzr ,
                      @Param("dq") String dq ,
                      @Param("hy") String hy ,
                      @Param("jyxm") String jyxm ,
                      @Param("lxr") String lxr ,
                      @Param("qydz") String qydz ,
                      @Param("yx") String yx,
                      @Param("qyxz") String qyxz)throws Exception;

    /**
     * 删除潜在客户信息
     * @param khmc
     * @throws Exception
     */
    void deleteqzkhxx(@Param("khmc") String khmc)throws Exception;
}
