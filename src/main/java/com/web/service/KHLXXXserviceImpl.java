package com.web.service;

import com.web.mapper.KHLXXXdao;
import com.web.model.KHLXXX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KHLXXXserviceImpl implements KHLXXXservice{
    @Autowired
    private KHLXXXdao khlxxXdao;

    /**
     * 查询客户联系信息
     * @return
     * @throws Exception
     */
    @Override
    public List<KHLXXX> selectKHLXXX() throws Exception {
        try{
            List<KHLXXX> khlxxxes = khlxxXdao.selectkhlxxx();

            return khlxxxes;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 添加联系人信息
     * @param khxm
     * @param xb
     * @param jg
     * @param gsbm
     * @param drzw
     * @param yddh
     * @param bgdh
     * @param khyx
     * @param cggzd
     * @param xg
     * @param yxl
     * @param zt
     * @return
     */
    @Override
    public String insertlxxx(String khxm, String xb, String jg, String gsbm, String drzw, String yddh, String bgdh, String khyx, String cggzd, String xg, String yxl, String zt) {
        try{
            khlxxXdao.insertkhlxxx(khxm,xb,jg,gsbm,drzw,yddh,bgdh,khyx,cggzd,xg,yxl,zt);
            return "1";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 删除客户联系人
     * @param khxm
     * @return
     */
    @Override
    public String deletelxx(String khxm) {
        try {
            khlxxXdao.deletelxrxx(khxm);

            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
