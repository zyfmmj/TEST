package cn.peppa.service;

import cn.peppa.pojo.User;

/**
 * @author zyf
 */
public interface UserService {
    /**
     * 用户登陆
     * @param userName
     * @param userPassword
     * @return
     */
    User login(String userName, String userPassword);
}
