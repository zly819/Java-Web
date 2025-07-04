package com.itheima.dao;

import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.util.List;

/**
 * @author 张立业
 * @version 1.0
 * 数据访问层
 */
public class DeptDaoImpl {

    public List<String> list(){
        //1.加载并读取dept.txt文件
        //通过类加载器，可以获取到类路径下的所有资源
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("dept.txt");
        List<String> strings = IOUtils.readLines(input, "UTF-8");
        return strings;
    }

}
