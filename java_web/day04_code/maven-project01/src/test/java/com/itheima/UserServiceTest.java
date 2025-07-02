package com.itheima;

import org.junit.jupiter.api.Test;

/**
 * @author 张立业
 * @version 1.0
 * 测试类，测试userService业务方法
 */
public class UserServiceTest {
    @Test
    public void testGetAge(){
        UserService userService = new UserService();
        Integer age = userService.getAge("411325200208190710");
        System.out.println("年龄为:" + age);
    }
    @Test
    public void testGetGender(){
        UserService userService = new UserService();
        String gender = userService.getGender("411325200208190710");
        System.out.println("性别:" + gender);
    }
}
