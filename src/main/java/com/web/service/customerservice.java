package com.web.service;

import com.web.model.customer;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * 客户信息管理
 */
@Transactional
public interface customerservice {
    /**
     * 查询所有的客户
     * @return
     * @throws Exception
     */
    List<customer> selectcus()throws Exception;

    /**
     * 用于插入客户信息
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
    String insertcus(String customername,
                     String shortid,
                     String linkid,
                     Date addtime,
                     String eproperty,
                     String telephone,
                     String fax,
                     String functionary,
                     String province,
                     String city,
                     String industry,
                     String dealproject,
                     String linkman,
                     String linkphone,
                     String linkaddress,
                     String email,
                     String linktype);

    /**
     * 用于查询客户类型
     * @param shortid
     * @return
     */
    List<customer> selecttjcx(String shortid);

    /**
     * 用于删除客户
     * @param customername
     * @return
     */
    String deletekh(String customername);

    /**
     * 根据条件查询,客户
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
    List<customer> tjcxkh(String shortid, String customername, String city, String functionary, String industry,
                          String linkman, String startTime, String endTime );

    /**
     * 查询客户信息
     * @param customername
     * @return
     */
    customer selectkhxx(String customername);
}
