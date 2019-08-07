package com.web.service;

import com.web.mapper.KHJRJLdao;
import com.web.model.KHJRJL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KHJRJLserviceImpl implements KHJRJLservice{
    @Autowired
    private KHJRJLdao khjrjLdao;

    /**
     * 客户节日记录
     * @return
     * @throws Exception
     */
    @Override
    public List<KHJRJL> selectKH() throws Exception {
        try{
            List<KHJRJL> khjrjls = khjrjLdao.selectkhjrjl();

            return khjrjls;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 添加客户节日记录
     * @param khxm
     * @param zpry
     * @param zysx
     * @param ghsj
     * @param ghms
     * @param jrlx
     * @param tjsj
     * @param tjr
     * @return
     */
    @Override
    public String insertkhjr(String khxm, String zpry, String zysx, String ghsj, String ghms, String jrlx, String tjsj, String tjr) {
        try{
            khjrjLdao.insertkhjrjl(khxm,zpry,zysx,ghsj,ghms,jrlx,tjsj,tjr);

            return "1";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 删除客户节日记录
     * @param khxm
     * @return
     */
    @Override
    public String deletekhjr(String khxm) {
        try {
            khjrjLdao.deletekhjrjl(khxm);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
