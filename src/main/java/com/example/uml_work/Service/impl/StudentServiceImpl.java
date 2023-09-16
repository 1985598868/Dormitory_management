package com.example.uml_work.Service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.uml_work.Service.StudentService;
import com.example.uml_work.bean.Student;
import com.example.uml_work.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService{

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public boolean studentLogin(String username, String password) {

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("student_id",username).eq("password",password);
        return studentMapper.exists(queryWrapper);

    }
}
