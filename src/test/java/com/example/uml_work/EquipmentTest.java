package com.example.uml_work;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.uml_work.bean.Equipment;
import com.example.uml_work.mapper.EquipmentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EquipmentTest {

    @Autowired
    private EquipmentMapper equipmentMapper;


    @Test
    public void selectAllTest(){
//        System.out.println(equipmentMapper.selectMaps(null));
//        System.out.println(equipmentMapper.selectList(null));
        Page<Equipment> page = new Page<>(1, 2);
        System.out.println(equipmentMapper.selectPageVo(page, 202310));

    }

}
