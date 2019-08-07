package com.web.mapper;

import com.web.model.QXGL;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 权限管理dao
 */
public interface QXGLdao {
    /**
     * 查询用户所有的权限
     * @param username
     * @return
     */
     QXGL selectqxgl(@Param("username") String username);

    /**
     * 用于插入用户权限
     * @param username
     * @param zygl
     * @param tjgg
     * @param scgg
     * @param yhxx
     * @param tjyh
     * @param scyh
     * @param yhqx
     * @param ghc
     * @param tjkh
     * @param sckh
     * @param dcsj
     * @param zykh
     * @param hxkh
     * @param ptkh
     * @param khxx
     * @param qzkhgl
     * @param scqzkh
     * @param fwbg
     * @param scfwbg
     * @param cjwtk
     * @param sccjwtk
     * @param fxfwfs
     * @param scfxfwfs
     * @param yxhd
     * @param scyxhd
     * @param scfx
     * @param scscfx
     * @param khjrjl
     * @param sckhjrjl
     * @param khlxxx
     * @param sckhlxxx
     */
    void insertqxgl(@Param("username") String username,
                    @Param("zygl") String zygl ,
                    @Param("tjgg") String tjgg ,
                    @Param("scgg") String scgg ,
                    @Param("yhxx") String yhxx,
                    @Param("tjyh") String tjyh,
                    @Param("scyh") String scyh,
                    @Param("yhqx") String yhqx ,
                    @Param("ghc") String ghc,
                    @Param("tjkh") String tjkh ,
                    @Param("sckh") String sckh ,
                    @Param("dcsj") String dcsj ,
                    @Param("zykh") String zykh ,
                    @Param("hxkh") String hxkh ,
                    @Param("ptkh") String ptkh ,
                    @Param("khxx") String khxx ,
                    @Param("qzkhgl") String qzkhgl ,
                    @Param("scqzkh") String scqzkh ,
                    @Param("fwbg") String fwbg ,
                    @Param("scfwbg") String scfwbg ,
                    @Param("cjwtk") String cjwtk,
                    @Param("sccjwtk") String sccjwtk ,
                    @Param("fxfwfs") String fxfwfs ,
                    @Param("scfxfwfs") String scfxfwfs ,
                    @Param("yxhd") String yxhd ,
                    @Param("scyxhd") String scyxhd ,
                    @Param("scfx") String scfx ,
                    @Param("scscfx") String scscfx ,
                    @Param("khjrjl") String khjrjl ,
                    @Param("sckhjrjl") String sckhjrjl ,
                    @Param("khlxxx") String khlxxx ,
                    @Param("sckhlxxx") String sckhlxxx);

    /**
     * 用于更新权限管理
     * @param zygl
     * @param tjgg
     * @param scgg
     * @param yhxx
     * @param tjyh
     * @param scyh
     * @param yhqx
     * @param ghc
     * @param tjkh
     * @param sckh
     * @param dcsj
     * @param zykh
     * @param hxkh
     * @param ptkh
     * @param khxx
     * @param qzkhgl
     * @param scqzkh
     * @param fwbg
     * @param scfwbg
     * @param cjwtk
     * @param sccjwtk
     * @param fxfwfs
     * @param scfxfwfs
     * @param yxhd
     * @param scyxhd
     * @param scfx
     * @param scscfx
     * @param khjrjl
     * @param sckhjrjl
     * @param khlxxx
     * @param sckhlxxx
     * @param username
     */
    void updateqxgl(@Param("zygl") String zygl ,
                    @Param("tjgg") String tjgg ,
                    @Param("scgg") String scgg ,
                    @Param("yhxx") String yhxx,
                    @Param("tjyh") String tjyh,
                    @Param("scyh") String scyh,
                    @Param("yhqx") String yhqx ,
                    @Param("ghc") String ghc,
                    @Param("tjkh") String tjkh ,
                    @Param("sckh") String sckh ,
                    @Param("dcsj") String dcsj ,
                    @Param("zykh") String zykh ,
                    @Param("hxkh") String hxkh ,
                    @Param("ptkh") String ptkh ,
                    @Param("khxx") String khxx ,
                    @Param("qzkhgl") String qzkhgl ,
                    @Param("scqzkh") String scqzkh ,
                    @Param("fwbg") String fwbg ,
                    @Param("scfwbg") String scfwbg ,
                    @Param("cjwtk") String cjwtk,
                    @Param("sccjwtk") String sccjwtk ,
                    @Param("fxfwfs") String fxfwfs ,
                    @Param("scfxfwfs") String scfxfwfs ,
                    @Param("yxhd") String yxhd ,
                    @Param("scyxhd") String scyxhd ,
                    @Param("scfx") String scfx ,
                    @Param("scscfx") String scscfx ,
                    @Param("khjrjl") String khjrjl ,
                    @Param("sckhjrjl") String sckhjrjl ,
                    @Param("khlxxx") String khlxxx ,
                    @Param("sckhlxxx") String sckhlxxx,
                    @Param("username") String username);

    void deleteqxgl(String username)throws Exception;
}
