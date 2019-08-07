package com.web.service;

import com.web.mapper.Affichedao;
import com.web.model.Affiche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class AfficheserviceImpl implements Afficheservice {
    @Autowired
    private Affichedao affichedao;

    /**
     * 遍历所有的公告
     * @return
     */
    @Override
    public List<Affiche> selAff(){
        try{
            List<Affiche> affiches = affichedao.selectaff();
            return affiches;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 用于插入公告
     * @param title
     * @param Content
     * @param addtime
     * @param affichetype
     * @param afficheuser
     * @throws Exception
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW , isolation = Isolation.READ_COMMITTED)
    public void addgg(String title, String Content, String addtime, String affichetype, String afficheuser) throws Exception {
        affichedao.insertgg(title,Content,addtime,affichetype,afficheuser);
    }

    @Override
    public List<Affiche> selecttjcx(String affichetype) {
        return null;
    }

    @Override
    public String dlgg(String rcmc) {
        try {
            affichedao.deletegg(rcmc);

            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 用于查询不同类型的公告
     * @param affichetype
     * @return
     */
    @Override
    public Affiche selgglx(String affichetype) {
        try {
            Affiche affiche =  affichedao.selecttjgg(affichetype);

            return affiche;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


}
