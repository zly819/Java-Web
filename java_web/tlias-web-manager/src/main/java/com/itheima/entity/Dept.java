package com.itheima.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author 张立业
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    private Integer id;
    private String name;
    private LocalDateTime updateTime;
}
