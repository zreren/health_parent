package com.health.pojo;

import java.io.Serializable;
import java.util.Set;

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
    private String sarcopenia;
    //关联属性
    private Set<User> user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_id() { return user_id; }

    public void setUser_id(String user_id) {this.user_id = user_id; }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public String getUser_age() {
        return user_age;
    }

    public void setUser_age(String user_age) {this.user_age = user_age; }

    public float getUser_height() {return user_height; }

    public void setUser_height(float user_height) {
        this.user_height = user_height;
    }

    public String getUser_resistance() {
        return user_resistance;
    }

    public void setUser_resistance(String user_resistance) {
        this.user_resistance = user_resistance;
    }

    public String  getFistgrip() {
        return fistgrip;
    }

    public void setFistgrip(String fistgrip) {
        this.fistgrip = fistgrip;
    }

    public String getSecondgrip() {
        return secondgrip;
    }

    public void setSecondgrip(String secondgrip) {
        this.secondgrip = secondgrip;
    }
    public String getFistwalk() {
        return fistwalk;
    }
    public void setFistwalk(String fistwalk) { this.fistwalk = fistwalk; }

    public String getSecondwalk() {
        return secondwalk;
    }
    public void setSecondwalk(String secondwalk) { this.secondwalk = secondwalk; }

    public String getSarcopenia() {
        return sarcopenia;
    }
    public void setSarcopenia(String sarcopenia) { this.sarcopenia = sarcopenia; }

}

