package cn.peppa.mapper;

import cn.peppa.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserMapperTest {

    @Autowired
    UserMapper mapper;

    @Test
    public void findUserByNamePassword() {
        User user = new User();
        user = mapper.findUserByNamePassword("admin","admin");
        user.toString();
    }
}