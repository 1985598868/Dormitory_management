package com.example.uml_work.bean;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.uml_work.enums.SexEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@TableName("StudentInfo")
public class Student {

//    设置主键并且自增
    @TableId(type = IdType.AUTO)
    private int studentId;
    private String name;
    private String password;
    private SexEnum sex;
    private String grade;
    private String className;
    private String dormitoryId;

    @TableField(exist = false)
    private Dormitory dormitory;
}
