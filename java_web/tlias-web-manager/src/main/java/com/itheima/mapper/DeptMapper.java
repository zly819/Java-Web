package com.itheima.mapper;

import com.itheima.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {
    /**
     * 查询部门列表
     * @return
     */
    // 数据封装方式一：手动结果映射
    // @Results({
    //         @Result(column = "create_time", property = "createTime"),
    //         @Result(column = "update_time", property = "updateTime")
    // })

    // 数据封装方式二：起别名
    // @Select("select id, name, create_time createTime, update_time updateTime from dept")

    // 数据封装方式三：全局配置，开启驼峰命名规则映射
    @Select("select * from dept")
    public List<Dept> list();
}
