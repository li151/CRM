package com.web.service;

import com.web.mapper.QZKHFXdao;
import com.web.mapper.QZKHXXdao;
import com.web.model.QZKHXX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 潜在客户信息
 */
@Service
public class QZKHXXserviceimpl implements QZKHXXservice{
    @Autowired
    QZKHXXdao qzkhxXdao;

    /**
     * 查询所有的潜在客户信息
     * @return
     * @throws Exception
     */
    @Override
    public List<QZKHXX> selectqzkhxx() throws Exception {
        try {
            List<QZKHXX> qzkhxxes = qzkhxXdao.selectqzkhxx();
            return qzkhxxes;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

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
     * @return
     * @throws Exception
     */
    @Override
    public String insertqzkhxx(String khmc, String khlx, String tjrq, String dh, String cz, String fzr, String dq, String hy, String jyxm, String lxr, String qydz, String yx, String qyxz) throws Exception {
        try {
            qzkhxXdao.insertqzkhxx(khmc,khlx, tjrq, dh, cz, fzr, dq, hy, jyxm, lxr, qydz, yx, qyxz);

            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 删除潜在客户
     * @param khmc
     * @return
     * @throws Exception
     */
    @Override
    public String deleteqzkh(String khmc) throws Exception {
        try {
            qzkhxXdao.deleteqzkhxx(khmc);

            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
