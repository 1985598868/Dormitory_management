package com.example.uml_work.enums;;


import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum SexEnum{

    MALE(1,"男"),

    FEMALE(0,"女");


    // enumValue 为面向 数据库检测的值
    @EnumValue
    private Integer sex;
//    自动转换成这个 进行输出

    @JsonValue
    private String sexName;


    SexEnum(Integer sex, String sexName) {
        this.sex = sex;
        this.sexName = sexName;
    }

    public Integer getSex() {
        return sex;
    }

    public String getSexName() {
        return sexName;
    }
}
