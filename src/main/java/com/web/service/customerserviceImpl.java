package com.web.service;

import com.web.mapper.customerdao;
import com.web.model.customer;
import org.omg.CORBA.TRANSACTION_MODE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class customerserviceImpl implements customerservice{
    @Autowired
    private customerdao customerdaos;

    /**
     * 查询所有客户信息
     * @return
     * @throws Exception
     */
    @Override
    public List<customer> selectcus() throws Exception {
        try{
            List<customer> customers = customerdaos.selectcustom();

            return customers;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 添加客户信息
     * @param customername
     * @param shortid
     * @param linkid
     * @param addtime
     * @param eproperty
     * @param telephone
     * @param fax
     * @param functionary
     * @param province
     * @param city
     * @param industry
     * @param dealproject
     * @param linkman
     * @param linkphone
     * @param linkaddress
     * @param email
     * @param linktype
     * @return
     */
    @Override
    public String insertcus(String customername, String shortid, String linkid, Date addtime, String eproperty, String telephone, String fax, String functionary, String province, String city, String industry, String dealproject, String linkman, String linkphone, String linkaddress, String email, String linktype) {
        try{
            customerdaos.insertcustom(customername, shortid, linkid, addtime, eproperty, telephone, fax, functionary,
                    province, city, industry, dealproject, linkman, linkphone, linkaddress, email, linktype);

            return "1";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 用于查询不同类型的客户
     * @param shortid
     * @return
     */
    @Override
    public List<customer> selecttjcx(String shortid) {
        try {
            List<customer> customers = customerdaos.selecttjcx(shortid);

            return customers;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 用于删除客户
     * @param customername
     * @return
     */
    @Override
    public String deletekh(String customername) {
        try{
            customerdaos.deletetjsc(customername);
            return "1";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 根据条件查询客户
     * @param shortid
     * @param customername
     * @param city
     * @param functionary
     * @param industry
     * @param linkman
     * @param startTime
     * @param endTime
     * @return
     */

    @Override
    public List<customer> tjcxkh(String shortid, String customername, String city, String functionary, String industry, String linkman, String startTime, String endTime) {
        try {
            List<customer> customers = customerdaos.khtjcx(shortid, customername, city, functionary, industry, linkman, startTime, endTime);
            return customers;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 查询客户信息
     * @param customername
     * @return
     */
    @Override
    public customer selectkhxx(String customername) {
        try {
            customer customers = customerdaos.cxkhxx(customername);

            return customers;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
