package com.web.service;

import com.web.mapper.notbookdao;
import com.web.model.notbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class notbookserviceImpl implements notbookservice{
    @Autowired
    private notbookdao notbookdaos;

    /**
     * 查询个人记事本
     * @param cjr
     * @return
     * @throws Exception
     */
    @Override
    public List<notbook> selectnk(String cjr) throws Exception {
        try{
            List<notbook> notbooks = notbookdaos.selectgrjsb(cjr);
            return notbooks;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 插入我的个人记事
     * @param jsbt
     * @param createuser
     * @param context
     * @param addtime
     * @return
     */
    @Override
    public String insertnk(String jsbt, String createuser, String context, Date addtime){
        try{
            notbookdaos.insertgrjs(jsbt,createuser,context,addtime);

            return "1";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 用于删除我的记事本
     * @param jsbt
     * @param createuser
     * @return
     */
    @Override
    public String deletegrjs(String jsbt, String createuser) {
        try{
            notbookdaos.deletejsb(jsbt,createuser);

            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
