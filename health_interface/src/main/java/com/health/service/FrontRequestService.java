package com.health.service;


import com.health.entity.PageResult;
import com.health.pojo.Patient;
import com.health.pojo.Sarcopenia;
import com.health.pojo.User;

public interface FrontRequestService {
    public void sarcopeniaadd(Sarcopenia sarcopenia);
    public void addpatient(Patient patient);
    public void sarcopeniasum();
    public PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString);
    public Patient getuser(String user_id);
    public User getuserog(String user_name);
}
