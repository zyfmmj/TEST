package cn.peppa.service.imp;

import cn.peppa.mapper.UserMapper;
import cn.peppa.pojo.User;
import cn.peppa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zyf
 */

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User login(String userName, String userPassword) {
        return userMapper.findUserByNamePassword(userName, userPassword);
    }
}
