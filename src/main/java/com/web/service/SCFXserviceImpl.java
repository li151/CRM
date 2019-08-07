package com.web.service;

import com.web.mapper.SCFXdao;
import com.web.model.SCFX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SCFXserviceImpl implements SCFXservice{
    @Autowired
    private SCFXdao scfXdao;

    /**
     * 查询市场分析
     * @return
     * @throws Exception
     */
    @Override
    public List<SCFX> selectsc() throws Exception {
        try{
            List<SCFX> scfxes = scfXdao.selectscfx();

            return scfxes;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 添加市场分析
     * @param fxzt
     * @param fxnr
     * @param fxr
     * @param fxsj
     * @param fxfj
     * @return
     */
    @Override
    public String insertscfx(String fxzt, String fxnr, String fxr, String fxsj, String fxfj) {
        try{
            scfXdao.insertscfx(fxzt,fxnr,fxr,fxsj,fxfj);

            return "1";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String deletescfx(String fxzt) {
        try {
            scfXdao.deletescfx(fxzt);

            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
