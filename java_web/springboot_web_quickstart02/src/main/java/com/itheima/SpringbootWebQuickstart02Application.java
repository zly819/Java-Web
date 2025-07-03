package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * SpringBootWeb入门，应用创建方式二（基于Maven创建）
 *      1.创建一个Maven项目
 *      2.pom文件中，继承springboot父工程，添加web依赖
 *      3.创建启动类。类上加上注解@SpringBootApplication,定义main方法，里面运行SpringApplication.run(Xxx.class, args);
 *      4.定义请求处理类，定义方法。需要在类上加注解@RestController, 方法加注解@RequestMapping("url")
 *      5.运行启动类，测试
 */

/**
 * 启动类
 */
@SpringBootApplication
public class SpringbootWebQuickstart02Application {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(SpringbootWebQuickstart02Application.class, args);
    }
}