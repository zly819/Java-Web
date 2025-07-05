package com.itheima.controller;

import com.itheima.entity.Dept;
import com.itheima.entity.Result;
import com.itheima.service.DeptService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 请求处理类
 */
@RestController     //等价于@Controller+@ResponseBody
public class DeptController {

    @Resource(name = "deptServiceImpl")
    private DeptService deptService;

    /**
     * 获取部门列表
     * @return
     */
    @GetMapping("/depts")
    public Result list(){
        //1.调用service，获取数据
        List<Dept> depts = deptService.list();

        //3.响应数据（json格式）
        return Result.success(depts);
    }
}
