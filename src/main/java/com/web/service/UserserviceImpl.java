package com.web.service;

import com.web.mapper.Userdao;
import com.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;


@Service
public class UserserviceImpl implements Userservice {

    @Autowired
    private Userdao userdao;

    /**
     * 该方法是用于登陆判断
     * @param username
     * @param password
     * @return
     * @throws Exception
     */
    public User checkLogin(String username, String password) throws Exception {
        User user = userdao.selectUser(username);
        if (user!=null && user.getPassword().equals(password)){
            return user;
        }
        return null;
    }

    /**
     * 该方法是用于遍历所有用户的
     * @return
     * @throws Exception
     */
    @Override
    public List<User> Userall() throws Exception {
        List<User> users = userdao.selectall();
        return users;
    }

    /**
     * 该方法是用于插入用户的
     * @param username
     * @param password
     * @param name
     * @param sex
     * @param role
     * @param ctime
     * @return
     * @throws Exception
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW , isolation = Isolation.READ_COMMITTED)
    public void inuser(String username, String password, String name, String sex, String role, Date ctime) throws Exception {
        userdao.insertuser(username, password, name, sex, role, ctime);
    }

    /**
     * 该语句用于查询用于密码是否正确
     * @param username
     * @param password
     * @return
     * @throws Exception
     */
    @Override
    public User selpwd(String username, String password) throws Exception {
            User user = userdao.selectpwd(username,password);
            if(user!=null && user.getPassword().equals(password)){
                return user;
            }else{
                return null;
            }
    }

    /**
     * 该语句用于修改用户密码
     * @param username
     * @param password
     * @throws Exception
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW , isolation = Isolation.READ_COMMITTED)
    public void updpwd(String username, String password) throws Exception {
        userdao.updateuser(username,password);
    }

    /**
     * 删除用户
     * @param username
     * @throws Exception
     */
    @Override
    public void delyhxx(String username) throws Exception {
        userdao.deleteyhxx(username);
    }
}

