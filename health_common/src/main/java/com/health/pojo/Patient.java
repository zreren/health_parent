package com.health.pojo;

import java.io.Serializable;
import java.util.Set;

public class Patient implements Serializable {
    private String user_id;
    private String user_name;
    private int user_age;
    private Integer user_gender;
    private int user_height;
    private int user_weight;
    private String osteoporosis;
    private String user_address;
    private String organization;
    private String filetime;//注意事项
    private Integer user_resistance;//检查项类型，分为检查和检验两种类型
    private Integer fistgrip;//项目说明
    private Integer secondgrip;//注意事项
    private Integer fistwalk;//项目说明
    private Integer secondwalk;//注意事项
    private String sarcopenia;
    private int score;
    private String malnutrition;
    private String education;
    private String frailty;
    private String dementia;

    public String getMalnutrition() {
        return malnutrition;
    }
    public void setMalnutrition(String malnutrition) { this.malnutrition = malnutrition;}

    public String getEducation() {
        return education;
    }
    public void setEducation(String education) { this.education = education;}
    public String getFrailty() {
        return frailty;
    }
    public void setFrailty(String frailty) { this.frailty = frailty;}
    public String getDementia() {
        return dementia;
    }
    public void setDementia(String dementia) { this.dementia = dementia;}

    public void setFiletime(String filetime) {this.filetime = filetime; }
    public String getFiletime() { return filetime; }

    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) { this.user_id = user_id;}

    public int getUser_height() {
        return user_height;
    }
    public void setUser_height(int user_height) { this.user_height = user_height;}
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String getOsteoporosis() {
        return osteoporosis;
    }
    public void setOsteoporosis(String osteoporosis) { this.osteoporosis = osteoporosis;}

    public int getUser_weight() {
        return user_weight;
    }
    public void setUser_weight(int user_weight) { this.user_weight = user_weight;}

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

    public Integer getUser_gender() {
        return user_gender;
    }
    public void setUser_gender(Integer user_gender) {
        this.user_gender= user_gender;
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
