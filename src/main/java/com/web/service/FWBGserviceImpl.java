package com.web.service;

import com.web.mapper.FWBGdao;
import com.web.model.FWBG;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FWBGserviceImpl implements FWBGservice{
    @Autowired
    private FWBGdao fwbGdao;

    /**
     * 查询服务报告
     * @return
     * @throws Exception
     */
    @Override
    public List<FWBG> selectfw() throws Exception {
        try{
            List<FWBG> fwbgs = fwbGdao.selectfwbg();

            return fwbgs;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 插入服务报告
     * @param khwt
     * @param khmc
     * @param fwrxm
     * @param fwlx
     * @param fwdd
     * @param fwjd
     * @param fwjb
     * @param wtsj
     * @param fwsj
     * @param wtzt
     * @param tjr
     * @param tjsj
     * @return
     */
    @Override
    public String insertfwbg(String khwt, String khmc, String fwrxm, String fwlx, String fwdd, String fwjd, String fwjb, String wtsj, String fwsj, String wtzt, String tjr, String tjsj) {
        try{
            fwbGdao.insertfwbg(khwt,khmc,fwrxm,fwlx,fwdd,fwjd,fwjb,wtsj,fwsj,wtzt,tjr,tjsj);

            return "1";
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }

    /**
     * 删除服务报告
     * @param khwt
     * @return
     */
    @Override
    public String deltefwbg(String khwt) {
        try {
            fwbGdao.deletefwbg(khwt);

            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
