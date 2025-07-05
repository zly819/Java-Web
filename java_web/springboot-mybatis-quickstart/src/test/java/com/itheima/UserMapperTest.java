package com.itheima;

import com.itheima.entity.User;
import com.itheima.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author 张立业
 * @version 1.0
 */
@SpringBootTest //作用：会加载Spring环境(IOC容器)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testList(){
        List<User> list = userMapper.list();
        for (User user : list) {
            System.out.println(user);
        }
    }
}
