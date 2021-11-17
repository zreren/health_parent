package com.health.service;


import com.health.entity.PageResult;
import com.health.pojo.*;

public interface FrontRequestService {
    public void sarcopeniaadd(Sarcopenia sarcopenia);
    public void dementiaadd(Dementia dementia);
    public void fraiadd(Frailty frailty);
    public void osteoporosisadd(Patient patient);
    public void malnutritionadd(Malnutrition malnutrition);
    public void addpatient(Patient patient);
    public void sarcopeniasum();
    public void articleeditById(Article article);

    public PageResult foodpageQuery(Integer currentPage, Integer pageSize, String queryString);
    public PageResult articlefind(Integer currentPage, Integer pageSize, String queryString);
    public PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString);
    public PageResult depageQuery(Integer currentPage, Integer pageSize, String queryString);
    public PageResult ospageQuery(Integer currentPage, Integer pageSize, String queryString);
    public Patient getuser(String user_id);
    public Patient getanything(String user_id);
    public User getuserog(String user_name);
}
