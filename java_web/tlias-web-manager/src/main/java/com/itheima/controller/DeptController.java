package com.itheima.controller;

import com.itheima.entity.Dept;
import com.itheima.entity.Result;
import org.apache.commons.io.IOUtils;
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

    /**
     * 部门列表查询
     * @return
     */
//    @RequestMapping(value = "/depts",method = RequestMethod.GET)       --->等价于下一行
    @GetMapping("/depts")  //限制请求方式为Get
    public Result getAll(){
        //1.加载并读取dept.txt文件
        //通过类加载器，可以获取到类路径下的所有资源
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("dept.txt");
        List<String> strings = IOUtils.readLines(input, "UTF-8");

        //2.解析文本中的数据，并将其封装成集合
        List<Dept> depts = strings.stream().map((str) ->{
            String[] parts = str.split(",");
            Integer id = Integer.valueOf(parts[0]);
            String name = parts[1];
            LocalDateTime updateTime = LocalDateTime.parse(parts[2], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            Dept dept = new Dept(id, name, updateTime);
            return dept;
        }).toList();

        //3.响应数据(json格式)
        return Result.success(depts);
    }
}
