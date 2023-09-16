package com.example.uml_work;

import com.example.uml_work.mapper.DormitoryMapper;
import com.example.uml_work.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UmlWorkApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private DormitoryMapper dormitoryMapper;

    @Test
    void contextLoads() {
        System.out.println("输出的信息为"+studentMapper.selectById(202310));
//        studentMapper.exists()
    }


    @Test
    void dormitoryByIdTest(){
        System.out.println("hello");
        System.out.println("输出的信息为"+dormitoryMapper.selectById("西十504B"));
    }

    @Test
    void StudentByIdTest(){
        System.out.println("hello");
        System.out.println("输出的信息为"+studentMapper.selectMyDormitoryAndMyInfo("202310"));
    }

//    @Test
//    void passwordIsTure(){
//        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("Name","jack").eq("password",123456);
//        studentMapper.exists(queryWrapper);
//    }

}
