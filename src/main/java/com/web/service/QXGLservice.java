package com.web.service;

import com.web.model.QXGL;

import java.util.List;

/**
 * 权限管理
 */
public interface QXGLservice {
    /**
     * 查询用户的权限
     * @param username
     * @return
     * @throws Exception
     */
    QXGL selectqx(String username);

    /**
     * 插入用户权限
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
     * @return
     */
    String insertqx(String username, String zygl , String tjgg , String scgg , String yhxx,
                  String tjyh, String scyh, String yhqx , String ghc, String tjkh , String sckh ,
                  String dcsj , String zykh , String hxkh , String ptkh , String khxx , String qzkhgl ,
                  String scqzkh , String fwbg , String scfwbg , String cjwtk, String sccjwtk ,
                  String fxfwfs ,String scfxfwfs , String yxhd , String scyxhd , String scfx ,
                  String scscfx , String khjrjl , String sckhjrjl , String khlxxx , String sckhlxxx);

    /**
     * 更新用户权限
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
     * @return
     */
    String updateqx(String zygl , String tjgg , String scgg , String yhxx,
                    String tjyh, String scyh, String yhqx , String ghc, String tjkh , String sckh ,
                    String dcsj , String zykh , String hxkh , String ptkh , String khxx , String qzkhgl ,
                    String scqzkh , String fwbg , String scfwbg , String cjwtk, String sccjwtk ,
                    String fxfwfs ,String scfxfwfs , String yxhd , String scyxhd , String scfx ,
                    String scscfx , String khjrjl , String sckhjrjl , String khlxxx , String sckhlxxx,String username);
    void delqxgl(String username)throws Exception;
}
