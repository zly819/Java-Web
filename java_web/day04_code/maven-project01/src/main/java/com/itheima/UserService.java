package com.itheima;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class UserService {

    /**
     * 给定一个身份证号, 计算出该用户的年龄
     * @param idcard 身份证号
     */
    public Integer getAge(String idcard){
        String birthday = idcard.substring(6, 14);
        LocalDate parse = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("yyyyMMdd"));
        return Period.between(parse, LocalDate.now()).getYears();
    }

    /**
     * 给定一个身份证号, 计算出该用户的性别
     * @param idcard 身份证号
     */
    public String getGender(String idcard){
        return Integer.parseInt(idcard.substring(16,17)) % 2 == 1 ? "男" : "女";
    }

}
