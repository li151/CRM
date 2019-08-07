package com.web.mapper;

import com.web.model.notbook;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * 记事本
 */
public interface notbookdao {
    /**
     * 新增记事
     * @param jsbt
     * @param createuser
     * @param context
     * @param addtime
     * @throws Exception
     */
   void insertgrjs(@Param("jsbt") String jsbt,
                   @Param("createuser") String createuser,
                   @Param("context") String context,
                   @Param("addtime") Date addtime)throws Exception;

    /**
     * 查询所有的个人记事本
     * @param createuser  --人员入参
     * @return
     * @throws Exception
     */
   List<notbook> selectgrjsb(@Param("createuser") String createuser) throws Exception;

    /**
     * 删除个人记事
     * @param jsbt
     * @param createuser
     */
   void deletejsb(@Param("jsbt") String jsbt,@Param("createuser") String createuser);
}
