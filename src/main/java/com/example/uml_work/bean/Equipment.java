package com.example.uml_work.bean;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName("studentequipments")
public class Equipment {

    @TableId
    private String id;
    private String studentId;

    @TableField("equipment")
    private String equipmentName;
    private int isDamage;
    private int isGuarantee;

}
