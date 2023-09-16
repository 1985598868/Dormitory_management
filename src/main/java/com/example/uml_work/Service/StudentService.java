package com.example.uml_work.Service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.uml_work.bean.Student;

public interface StudentService extends IService<Student> {

    boolean studentLogin(String username, String password);


}
