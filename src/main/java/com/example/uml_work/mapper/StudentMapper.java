package com.example.uml_work.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.uml_work.bean.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository

public interface StudentMapper extends BaseMapper<Student> {

    List<Student> selectMyDormitoryAndMyInfo(@Param("StudentId") String StudentId);
}
