package com.web.service;

import com.web.mapper.FXFWFSdao;
import com.web.model.FXFWFS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FXFWFSserviceImpl implements FXFWFSservice{
    @Autowired
    private FXFWFSdao fxfwfSdao;

    /**
     * 查询分享服务报告
     * @return
     * @throws Exception
     */
    @Override
    public List<FXFWFS> selectfxfw() throws Exception {
        try{
            List<FXFWFS> fxfwfs = fxfwfSdao.selectfwfs();

            return fxfwfs;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public String insertfx(String fxfwmc, String fwdx, String fwnr, String khxhd, String tjr, String tjsj) {
        try{
            fxfwfSdao.insertfxfwbg(fxfwmc,fwdx,fwnr,khxhd,tjr,tjsj);

            return "1";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String deletefx(String fxfwmc) {
        try {
            fxfwfSdao.deletefx(fxfwmc);
            return "1";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
