package com.example.uml_work.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.uml_work.bean.Equipment;
import com.example.uml_work.bean.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository

public interface EquipmentMapper extends BaseMapper<Equipment> {

    Page<Equipment> selectPageVo(@Param("page") Page<Equipment> page, @Param("StudentId") Integer StudentId);
}
