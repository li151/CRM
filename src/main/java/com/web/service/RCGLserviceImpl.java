package com.web.service;

import com.web.mapper.RCGLdao;
import com.web.model.RCGL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RCGLserviceImpl implements RCGLservice {
    @Autowired
    private RCGLdao rcgLdao;

    /**
     * 查询个人日程
     * @param cjr
     * @return
     * @throws Exception
     */
    @Override
    public List<RCGL> selectrc(String cjr) throws Exception {
        try{
            System.out.println("你好");
            List<RCGL> rcgls = rcgLdao.selectrcgl(cjr);
            System.out.println("你好1111111");
            return rcgls;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("你好1111111");
            return null;
        }

    }

    /**
     * 用于添加个人日程
     * @param rcmc
     * @param kssj
     * @param jssj
     * @param rcnr
     * @param qtgz
     * @param qwdd
     * @param cjr
     * @return
     */
    @Override
    public String tjrc(String rcmc, String kssj, String jssj, String rcnr, String qtgz, String qwdd, String cjr) {
        try{
            rcgLdao.insertrcgl(rcmc,kssj,jssj,rcnr,qtgz,qwdd,cjr);

            return "1";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 删除个人日程
     * @param rcmc
     * @param cjr
     * @return
     */
    @Override
    public String rcsc(String rcmc, String cjr) {
        try{
            rcgLdao.deletercgl(rcmc,cjr);
            return "1";
        }catch (Exception e){
            e.printStackTrace();

            return null;
        }
    }
}
