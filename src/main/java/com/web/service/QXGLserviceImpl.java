package com.web.service;

import com.web.mapper.QXGLdao;
import com.web.model.QXGL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 权限管理
 */
@Service
public class QXGLserviceImpl implements QXGLservice{
    @Autowired
    QXGLdao qxgLdao;

    /**
     * 查询用户权限
     * @param username
     * @return
     */
    @Override
    public QXGL selectqx(String username) {
        try {
            QXGL qxgls = qxgLdao.selectqxgl(username);
            return qxgls;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

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
    @Override
    public String insertqx(String username, String zygl, String tjgg, String scgg, String yhxx, String tjyh, String scyh, String yhqx, String ghc, String tjkh, String sckh, String dcsj, String zykh, String hxkh, String ptkh, String khxx, String qzkhgl, String scqzkh, String fwbg, String scfwbg, String cjwtk, String sccjwtk, String fxfwfs, String scfxfwfs, String yxhd, String scyxhd, String scfx, String scscfx, String khjrjl, String sckhjrjl, String khlxxx, String sckhlxxx) {
        try {
            qxgLdao.insertqxgl( username,  zygl,  tjgg,  scgg,  yhxx,  tjyh,  scyh,  yhqx,  ghc,  tjkh,  sckh,  dcsj,  zykh,  hxkh,  ptkh, khxx, qzkhgl, scqzkh, fwbg, scfwbg, cjwtk, sccjwtk, fxfwfs, scfxfwfs, yxhd,scyxhd, scfx, scscfx, khjrjl, sckhjrjl, khlxxx, sckhlxxx);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

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
    @Override
    public String updateqx(String zygl, String tjgg, String scgg, String yhxx, String tjyh, String scyh, String yhqx, String ghc, String tjkh, String sckh, String dcsj, String zykh, String hxkh, String ptkh, String khxx, String qzkhgl, String scqzkh, String fwbg, String scfwbg, String cjwtk, String sccjwtk, String fxfwfs, String scfxfwfs, String yxhd, String scyxhd, String scfx, String scscfx, String khjrjl, String sckhjrjl, String khlxxx, String sckhlxxx, String username) {
       try {
           qxgLdao.updateqxgl(zygl,  tjgg,  scgg,  yhxx,  tjyh,  scyh,  yhqx,  ghc,  tjkh,  sckh,  dcsj,  zykh,  hxkh,  ptkh, khxx, qzkhgl, scqzkh, fwbg, scfwbg, cjwtk, sccjwtk, fxfwfs, scfxfwfs, yxhd,scyxhd, scfx, scscfx, khjrjl, sckhjrjl, khlxxx, sckhlxxx,username);
           return "1";
       }catch (Exception e){
           e.printStackTrace();
           return null;
       }
    }

    /**
     * 删除权限
     * @param username
     * @throws Exception
     */
    @Override
    public void delqxgl(String username) throws Exception {
            qxgLdao.deleteqxgl(username);
    }
}
