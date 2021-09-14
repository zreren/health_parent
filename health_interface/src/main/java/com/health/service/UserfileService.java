package com.health.service;

import com.health.entity.PageResult;
import com.health.pojo.Patient;
import com.health.pojo.User;

public interface UserfileService {
    public PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString);

    public PageResult adminpageQuery(Integer currentPage, Integer pageSize, String queryString);
    public void add(Patient patient);
    public void delete(String user_id);
    public void edit(Patient patient);
    public Patient findById(Integer id);
    public long countSa();
    public long countSatrue();
}
