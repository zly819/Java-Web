package com.itheima.service.impl;

import com.itheima.entity.Dept;
import com.itheima.mapper.DeptMapper;
import com.itheima.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务逻辑处理层
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    public List<Dept> list(){
        //1.调用mapper的方法，获取列表数据并返回
        return deptMapper.list();
    }
}
