package com.health.pojo;

import java.io.Serializable;
import java.util.Set;

public class Frailty implements Serializable {
    private String user_id;//项目编码
    private String education;
    private String organization;
    private int score;
    private String frailty;
    private String user_name;//项目名称
    private Integer user_gender;//适用性别
    private Integer user_age;//适用年龄（范围），例如：20-50
    private Integer user_height;//价格
    private Set<User> user;
    private String filetime;//注意事项

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getUser_Id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getEducation() {
        return education;
    }
    public void setEducation(String education) {
        this.education = education;
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public String getFrailty() {
        return frailty;
    }
    public void setFrailty(String frailty) {
        this.frailty = frailty;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(Integer user_gender) {
        this.user_gender = user_gender;
    }

    public Integer getUser_age() {
        return user_age;
    }

    public void setUser_age(Integer user_age) {this.user_age = user_age; }

    public Integer getUser_height() {return user_height; }

    public void setUser_height(Integer user_height) {
        this.user_height = user_height;
    }

    public void setFiletime(String filetime) {this.filetime = filetime; }

    public String getFiletime() { return filetime; }

}
