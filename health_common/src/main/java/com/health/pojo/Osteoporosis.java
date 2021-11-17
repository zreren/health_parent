package com.health.pojo;

import com.health.pojo.User;

import java.io.Serializable;
import java.util.Set;

public class Osteoporosis implements Serializable {
    private String user_id;//项目编码
    private String osteoporosis;
    private String user_name;//项目名称
    private Integer user_weight;//适用性别
    private Integer user_height;//价格
    private Set<User> user;
    private String filetime;//注意事项


    public String getUser_Id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }


    public String getOsteoporosis() {
        return osteoporosis;
    }
    public void setOsteoporosis(String osteoporosis) {
        this.osteoporosis = osteoporosis;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getUser_gender() {
        return user_weight;
    }

    public void setUser_gender(Integer user_weight) {
        this.user_weight = user_weight;
    }


    public Integer getUser_height() {return user_height; }

    public void setUser_height(Integer user_height) {
        this.user_height = user_height;
    }

    public void setFiletime(String filetime) {this.filetime = filetime; }

    public String getFiletime() { return filetime; }

}