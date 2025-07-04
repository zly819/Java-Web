package com.itheima.controller;

import com.itheima.entity.Dept;
import com.itheima.entity.Result;
import com.itheima.service.DeptService;
import com.itheima.service.DeptServiceImpl;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @author 张立业
 * @version 1.0
 */
@RestController
public class DeptController {
    @Autowired //从IOC容器中，自动寻找bean对象，并为该变量赋值
    private DeptService deptService;

    @GetMapping("/depts")  //限制请求方式为Get
    public Result getAll() {
        //1.调用service获取数据
        List<Dept> depts = deptService.list();
        //3.响应数据(json格式)
        return Result.success(depts);
    }
}
