package com.itheima.service;

import com.itheima.dao.DeptDaoImpl;
import com.itheima.entity.Dept;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @author 张立业
 * @version 1.0
 * 业务逻辑处理层
 */
public class DeptServiceImpl {

    private DeptDaoImpl deptDao = new DeptDaoImpl();

    public List<Dept> list(){
        //1.获取原始数据
        List<String> stringList = deptDao.list();

        //2.处理数据--将数据封装成List<Dept>
        List<Dept> depts = stringList.stream().map((str) ->{
            String[] parts = str.split(",");
            Integer id = Integer.valueOf(parts[0]);
            String name = parts[1];
            LocalDateTime updateTime = LocalDateTime.parse(parts[2], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            Dept dept = new Dept(id, name, updateTime);
            return dept;
        }).toList();

        //3.返回封装好的数据
        return depts;
    }
}
