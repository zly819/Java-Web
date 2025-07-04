package com.itheima.service;

import com.itheima.dao.DeptDao;
import com.itheima.dao.DeptDaoImpl;
import com.itheima.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @author 张立业
 * @version 1.0
 * 业务逻辑处理层
 */
@Component  //程序启动时，会自动创建该类对象，并交由IOC容器管理
public class DeptServiceImpl implements DeptService {
    @Autowired //从IOC容器中，自动寻找bean对象，并为该变量赋值
    private DeptDao deptDao;

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
