package com.health.pojo;

import java.io.Serializable;
import java.util.Set;

public class Patient implements Serializable {
    private String user_id;
    private String user_name;
    private int user_age;
    private int user_gender;
    private String user_address;
    private String organization;

    private Set<Patient> patients;


    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) { this.user_id = user_id;}

    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getOrganization() {
        return organization;
    }
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public int getUser_age() { return user_age; }
    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }

    public String getUser_address() {
        return user_address;
    }
    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public int getUser_gender() {
        return user_gender;
    }
    public void setUser_gender(int user_gender) {
        this.user_gender= user_gender;
    }


}
