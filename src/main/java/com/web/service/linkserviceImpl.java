package com.web.service;

import com.web.mapper.linkdao;
import com.web.model.link;
import org.apache.taglibs.standard.util.EscapeXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class linkserviceImpl implements linkservice{
    @Autowired
    linkdao linkdaos;

    /**
     * 用于查询客户交流记录
     * @param customerid
     * @return
     */
    @Override
    public List<link> seletlink(String customerid) {
        try{
            List<link> links = linkdaos.selectjljl(customerid);

            return links;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 用于插入客户交流记录
     * @param customerid
     * @param linktext
     * @param addtime
     * @param adduser
     * @return
     */
    @Override
    public String insertlink(String customerid, String linktext, String addtime, String adduser) {
        try{
            linkdaos.insertjljl(customerid,linktext,addtime,adduser);

            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
