package com.web.mapper;

import com.web.model.KHJRJL;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 客户节日管理
 */
public interface KHJRJLdao {
    /**
     * 新增客户节日管理
     * @param khxm
     * @param zpry
     * @param zysx
     * @param ghsj
     * @param ghms
     * @param jrlx
     * @param tjsj
     * @param tjr
     */
    void insertkhjrjl(@Param("khxm") String khxm,
                      @Param("zpry") String zpry,
                      @Param("zysx") String zysx,
                      @Param("ghsj") String ghsj,
                      @Param("ghms") String ghms,
                      @Param("jrlx") String jrlx,
                      @Param("tjsj") String tjsj,
                      @Param("tjr") String tjr) throws Exception;

    /**
     * 查询所有的客户节日记录
     * @return
     * @throws Exception
     */
    List<KHJRJL> selectkhjrjl() throws Exception;

    /**
     * 删除客户节日记录
     * @param khxm
     */
    void deletekhjrjl(@Param("khxm") String khxm);
}
