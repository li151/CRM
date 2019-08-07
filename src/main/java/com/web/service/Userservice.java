package com.web.service;

import com.web.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Transactional
public interface Userservice {
    /**
     * 这里用于验证用户是否在数据库里面
     * @param username
     * @param password
     * @return
     * @throws Exception
     */
    User checkLogin(String username,String password) throws Exception;

    /**
     * 这里面是用于遍历所有的用户
     * @return
     * @throws Exception
     */
    List<User> Userall()throws Exception;

    /**
     * 该方法是用于插入用户
     * @param username
     * @param password
     * @param name
     * @param sex
     * @param role
     * @param ctime
     * @return
     * @throws Exception
     */
    void inuser(String username, String password, String name, String sex, String role, Date ctime)throws Exception;

    /**
     * 这个是用于查询密码是否正确
     * @param username
     * @param password
     * @return
     * @throws Exception
     */
    User selpwd(String username, String password)throws Exception;

    /**
     * 该语句用于修改用户密码
     * @param username
     * @param password
     * @throws Exception
     */
    void updpwd(String username, String password)throws Exception;

    /**
     * 用于删除用户
     * @param username
     * @throws Exception
     */
    void delyhxx(String username)throws Exception;
}
