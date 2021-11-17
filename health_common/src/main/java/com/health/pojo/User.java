package com.health.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 用户
 */
public class User implements Serializable{
    private Integer id; // 主键
    private String user_gender; // 性别
    private Integer user_age; //
    private String user_name; // 用户名，唯一
    private String password; // 密码
    private String station; // 状态
    private String user_id; // 联系电话
    private String organization; // 機構
    private String role;
    private Set<Role> roles = new HashSet<Role>(0);//对应角色集合

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getUser_age(){return user_age;}

    public void setUser_age(Integer user_age){this.user_age=user_age;}

    public String getOrganization(){return organization;}

    public void setOrganization(String organization){this.organization=organization;}
//
//    public Date getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(Date birthday) {
//        this.birthday = birthday;
//    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
