package cn.peppa.mapper;

import cn.peppa.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author zyf
 */
public interface UserMapper {

    /**
     * 根据用户名和密码查找用户
     * @param userName
     * @param userPassword
     * @return
     */
    User findUserByNamePassword(
            @Param("userName")
            String userName,
            @Param("userPassword")
            String userPassword
    );


}
