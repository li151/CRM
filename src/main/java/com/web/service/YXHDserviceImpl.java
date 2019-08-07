package com.web.service;


import com.web.mapper.YXHDdao;
import com.web.model.YXHD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;
import java.util.List;
@Service
public class YXHDserviceImpl implements YXHDservice{
    @Autowired
    private YXHDdao yxhDdao;
    @Override
    public List<YXHD> selectyxhd() throws Exception {
        try{
            List<YXHD> yxhds = yxhDdao.selectyxhd();

            return yxhds;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 添加营销管理
     * @param hdzt
     * @param jhsj
     * @param hdkzdd
     * @param txcp
     * @param hdys
     * @param jhxse
     * @param phry
     * @param jhkzts
     * @param hdbz
     * @param hdfzr
     * @return
     */
    @Override
    public String insertyxgl(String hdzt, String jhsj, String hdkzdd, String txcp, String hdys, String jhxse, String phry, String jhkzts, String hdbz, String hdfzr) {
        try{
            yxhDdao.insertyxhd(hdzt,jhsj,hdkzdd,txcp,hdys,jhxse,phry,jhkzts,hdbz,hdfzr);

            return "1";
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }

    @Override
    public String deleteyxhd(String hdzt) {
        try {
            yxhDdao.deleteyxhd(hdzt);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
