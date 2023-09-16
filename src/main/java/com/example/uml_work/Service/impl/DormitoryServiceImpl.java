package com.example.uml_work.Service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.uml_work.Service.DormitoryService;
import com.example.uml_work.bean.Dormitory;
import com.example.uml_work.mapper.DormitoryMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class DormitoryServiceImpl extends ServiceImpl<DormitoryMapper, Dormitory> implements DormitoryService {


}
