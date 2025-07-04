package com.itheima.dao;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.InputStream;
import java.util.List;

/**
 * @author 张立业
 * @version 1.0
 * 数据访问层
 */
@Repository  //用来标识当前类是一个数据访问层类--效果等价于@Component
public class DeptDaoImpl implements DeptDao {

    public List<String> list(){
        //1.加载并读取dept.txt文件
        //通过类加载器，可以获取到类路径下的所有资源
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("dept.txt");
        List<String> strings = IOUtils.readLines(input, "UTF-8");
        return strings;
    }

}
