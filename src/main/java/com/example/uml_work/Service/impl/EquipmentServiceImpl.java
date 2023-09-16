package com.example.uml_work.Service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.uml_work.Service.EquipmentService;
import com.example.uml_work.bean.Equipment;
import com.example.uml_work.mapper.EquipmentMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class EquipmentServiceImpl extends ServiceImpl<EquipmentMapper, Equipment> implements EquipmentService {


}
