package com.web.mapper;

import com.web.model.customer;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * 客户信息
 */
public interface customerdao {
    /**
     * 新增客户信息
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
     */
    void insertcustom(@Param("customername") String customername,
                      @Param("shortid") String shortid,
                      @Param("linkid") String linkid,
                      @Param("addtime") Date addtime,
                      @Param("eproperty") String eproperty,
                      @Param("telephone") String telephone,
                      @Param("fax") String fax,
                      @Param("functionary") String functionary,
                      @Param("province") String province,
                      @Param("city") String city,
                      @Param("industry") String industry,
                      @Param("dealproject") String dealproject,
                      @Param("linkman") String linkman,
                      @Param("linkphone") String linkphone,
                      @Param("linkaddress") String linkaddress,
                      @Param("email") String email,
                      @Param("linktype") String linktype) throws Exception;

    /**
     * 查询所有的客户信息
     * @return
     * @throws Exception
     */
    List<customer>  selectcustom() throws Exception;

    /**
     * 用于条件查询,查找客户类型
     * @param shortid
     * @return
     * @throws Exception
     */
    List<customer> selecttjcx(@Param("shortid") String shortid)throws Exception;

    /**
     * 用于删除客户
     * @param customername
     * @throws Exception
     */
    void deletetjsc(@Param("customername") String customername) throws Exception;


    /**
     * 一定的条件查询客户结果
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
    List<customer> khtjcx(@Param("shortid") String shortid,
                          @Param("customername") String customername,
                          @Param("city") String city,
                          @Param("functionary") String functionary,
                          @Param("industry") String industry,
                          @Param("linkman") String linkman,
                          @Param("startTime") String startTime,
                          @Param("endTime") String endTime );

    /**
     * 查询客户信息
     * @param customername
     * @return
     */
    customer cxkhxx(@Param("customername") String customername);

}
