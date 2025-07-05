package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 */
@SpringBootApplication
// @ComponentScan({"com.itheima","com.itbaima"})    //作用：扫描组件，默认扫描当前包及其子包
public class TliasWebManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TliasWebManagerApplication.class, args);
    }

}
