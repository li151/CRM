package com.web.service;

import com.web.mapper.QZKHFXdao;
import com.web.model.QZKHFX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 潜在客户分析
 */
@Service
public class QZKHFXserviceImpl implements QZKHFXservice{
    @Autowired
    QZKHFXdao qzkhfXdao;

    /**
     * 查询潜在客户分析
     * @param khmc
     * @return
     */
    @Override
    public List<QZKHFX> selectqzkhfx(String khmc) {
        try {
            List<QZKHFX> qzkhfxes = qzkhfXdao.selectfxjl(khmc);
            return qzkhfxes;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 插入客户分析记录
     * @param khmc
     * @param jljl
     * @param tjsj
     * @param tjr
     * @return
     */
    @Override
    public String insertqzkhfx(String khmc, String jljl, String tjsj, String tjr) {
        try {
            qzkhfXdao.insertfxjl(khmc,jljl,tjsj,tjr);
            return "1";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
