package com.itheima;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * @author 张立业
 * @version 1.0
 * 测试类，测试userService业务方法
 */
@DisplayName("测试用户信息类")
public class UserService2Test {
    @DisplayName("测试年龄")
    @ParameterizedTest //参数化测试
    @ValueSource(strings = {"411325200208190710","411325200308190720","411325200408190710"})
    public void testGetAge(String id){
        UserService userService = new UserService();
        Integer age = userService.getAge(id);
        System.out.println("年龄为:" + age);
    }
    @DisplayName("测试性别")
    @ParameterizedTest
    @ValueSource(strings = {"411325200208190710","411325200308190720","411325200408190710"})
    public void testGetGender(String id){
        UserService userService = new UserService();
        String gender = userService.getGender(id);
        System.out.println("性别:" + gender);
    }
}
