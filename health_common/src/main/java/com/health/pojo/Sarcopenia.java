package com.health.pojo;

import java.io.Serializable;

public class Sarcopenia implements Serializable {
    private Integer id;//主键
    private String user_id;//项目编码
    private String user_name;//项目名称
    private String user_gender;//适用性别
    private String user_age;//适用年龄（范围），例如：20-50
    private Float user_height;//价格
    private String user_resistance;//检查项类型，分为检查和检验两种类型
    private String fistgrip;//项目说明
    private String secondgrip;//注意事项
    private String fistwalk;//项目说明
    private String secondwalk;//注意事项
    private String time;//注意事项

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() { return user_id; }

    public void setCode(String user_id) {this.user_id = user_id; }

    public String getName() {
        return user_name;
    }

    public void setName(String user_name) {
        this.user_name = user_name;
    }

    public String getSex() {
        return user_gender;
    }

    public void setSex(String user_gender) {
        this.user_gender = user_gender;
    }

    public String getAge() {
        return user_age;
    }

    public void setAge(String user_age) {this.user_age = user_age;
    }

    public float getRemark() {
        return user_height;
    }

    public void setRemark(float user_height) {
        this.user_height = user_height;
    }

    public String getAttention() {
        return user_resistance;
    }

    public void setAttention(String user_resistance) {
        this.user_resistance = user_resistance;
    }

    public String  getPrice() {
        return fistgrip;
    }

    public void setPrice(String fistgrip) {
        this.fistgrip = fistgrip;
    }

    public String getType() {
        return secondgrip;
    }

    public void setType(String secondgrip) {
        this.secondgrip = secondgrip;
    }
}

