package com.health.pojo;

import java.io.Serializable;
import java.util.Set;

public class Sarcopenia implements Serializable {
    private String user_id;//项目编码
    private String organization;//项目编码
    private String user_name;//项目名称
    private Integer user_age;//适用年龄（范围），例如：20-50
    private Integer user_height;//价格
    private Integer user_resistance;//检查项类型，分为检查和检验两种类型
    private Integer fistgrip;//项目说明
    private Integer secondgrip;//注意事项
    private Integer fistwalk;//项目说明
    private Integer secondwalk;//注意事项
    private String filetime;//注意事项
    private String sarcopenia;
    //关联属性
    private Set<User> user;


    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getUser_id() { return user_id; }

    public void setFiletime(String filetime) {this.filetime = filetime; }

    public String getFiletime() { return filetime; }

    public void setUser_id(String user_id) {this.user_id = user_id; }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }


    public Integer getUser_age() {
        return user_age;
    }

    public void setUser_age(Integer user_age) {this.user_age = user_age; }

    public Integer getUser_height() {return user_height; }

    public void setUser_height(Integer user_height) {
        this.user_height = user_height;
    }

    public Integer getUser_resistance() {
        return user_resistance;
    }

    public void setUser_resistance(Integer user_resistance) {
        this.user_resistance = user_resistance;
    }

    public Integer  getFistgrip() {
        return fistgrip;
    }

    public void setFistgrip(Integer fistgrip) {
        this.fistgrip = fistgrip;
    }

    public Integer getSecondgrip() {
        return secondgrip;
    }

    public void setSecondgrip(Integer secondgrip) {
        this.secondgrip = secondgrip;
    }

    public Integer getFistwalk() {
        return fistwalk;
    }
    public void setFistwalk(Integer fistwalk) { this.fistwalk = fistwalk; }

    public Integer getSecondwalk() {
        return secondwalk;
    }
    public void setSecondwalk(Integer secondwalk) { this.secondwalk = secondwalk; }

    public String getSarcopenia() {
        return sarcopenia;
    }
    public void setSarcopenia(String sarcopenia) { this.sarcopenia = sarcopenia; }

}

