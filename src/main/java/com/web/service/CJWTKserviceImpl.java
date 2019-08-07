package com.web.service;

import com.web.mapper.CJWTKdao;
import com.web.model.CJWTK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CJWTKserviceImpl implements CJWTKservice{
    @Autowired
    private CJWTKdao cjwtKdao;

    /**
     * 查询常见问题库
     * @return
     * @throws Exception
     */
    @Override
    public List<CJWTK> selectcjwt() throws Exception {
        try{
            List<CJWTK> cjwtks = cjwtKdao.selectcjwt();

            return cjwtks;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 添加常见问题库
     * @param wtms
     * @param jjff
     * @param jjr
     * @param wtkssj
     * @param wtjjsj
     * @param tjr
     * @param tjsj
     * @return
     */
    @Override
    public String insertcjwt(String wtms, String jjff, String jjr, String wtkssj, String wtjjsj, String tjr, String tjsj) {
        try{
            cjwtKdao.insertcjwt(wtms,jjff,jjr,wtkssj,wtjjsj,tjr,tjsj);

            return "1";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 删除常见问题
     * @param wtms
     * @return
     */
    @Override
    public String deletecjwt(String wtms) {
        try {
            cjwtKdao.deletewtk(wtms);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
