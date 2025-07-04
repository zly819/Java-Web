package com.itheima.dao;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.List;

/**
 * @author 张立业
 * @version 1.0
 * 数据访问层
 */
@Component  //程序启动时，会自动创建该类对象，并交由IOC容器管理
public class DeptDaoImpl implements DeptDao {

    public List<String> list(){
        //1.加载并读取dept.txt文件
        //通过类加载器，可以获取到类路径下的所有资源
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("dept.txt");
        List<String> strings = IOUtils.readLines(input, "UTF-8");
        return strings;
    }

}
