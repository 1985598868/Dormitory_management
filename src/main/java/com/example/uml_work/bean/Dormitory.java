package com.example.uml_work.bean;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName("DormitoryInfo")
public class Dormitory {

    @TableId
    private String dormitoryId;
    private String studentA;
    private String studentB;
    private String studentC;
    private String studentD;
}
