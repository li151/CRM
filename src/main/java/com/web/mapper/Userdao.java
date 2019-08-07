package com.web.mapper;

import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;
import com.web.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface Userdao {
    /**
     *用来查询用户进行验证并且登陆
     * @param username
     * @return
     * @throws Exception
     */
    User selectUser(@Param("username") String username)throws Exception;

    /**
     * 该条语句用于遍历出所有的用户
     * @return
     * @throws Exception
     */
    List<User> selectall()throws Exception;

    /**
     * 插入用户
     * @param username
     * @param password
     * @param name
     * @param sex
     * @param role
     * @param ctime
     * @throws Exception
     */
    void insertuser(@Param("username") String username,
                    @Param("password") String password,
                    @Param("name") String name,
                    @Param("sex") String sex,
                    @Param("role") String role,
                    @Param("ctime") Date ctime)throws Exception;

    /**
     * 该语句用于查询用户密码是否输入正确
     * @param username
     * @param password
     * @return
     * @throws Exception
     */
    User selectpwd(@Param("username") String username,@Param("password") String password)throws Exception;

    /**
     * 该语句用于修改用户密码
     * @param username
     * @param password
     * @throws Exception
     */
    void updateuser(@Param("username") String username,@Param("password") String password)throws Exception;

    /**
     * 用于删除用户
     * @throws Exception
     * @param username
     */
    void deleteyhxx(String username)throws Exception;
}
