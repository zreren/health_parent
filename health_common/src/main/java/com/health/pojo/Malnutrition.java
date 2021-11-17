package com.health.pojo;

import java.io.Serializable;
import java.util.Set;

public class Malnutrition implements Serializable {
    private String user_id;//项目编码
    private String organization;
    private int score;
    private String malnutrition;
    private String user_name;//项目名称
    private String user_address;
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

    public String getUser_address() {
        return user_address;
    }
    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public String getMalnutrition() {
        return malnutrition;
    }
    public void setMalnutrition(String malnutrition) {
        this.malnutrition = malnutrition;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }


    public void setFiletime(String filetime) {this.filetime = filetime; }

    public String getFiletime() { return filetime; }

}
