package com.health.dao;

import com.github.pagehelper.Page;
import com.health.pojo.*;

public interface FrontRequestDao {
    public Page<Sarcopenia> selectByCondition(String queryString);
    public Page<Dementia> deselectByCondition(String queryString);
    public Page<Patient> osselectByCondition(String queryString);
    public Page<Article> articleselectByCondition(String queryString);
    public Page<Article> foodselectByCondition(String queryString);
    public void sarcopeniaadd(Sarcopenia sarcopenia);
    public void malnutritionadd(Malnutrition malnutrition);
    public void dementiaadd(Dementia dementia);
    public void fraiadd(Frailty frailty);
    public void articleadd(Article article);
    public void articleeditById(Article article);
    public void osteoporosisadd(Patient patient);
    public void addpatient(Patient patient);
    public void sarcopeniasum();
    public Patient getuser(String user_id);
    public Patient getanything(String user_id);
    public User getuserog(String user_name);
    public User getexit(String user_id);

}
