package com.health.service;

import com.health.entity.PageResult;
import com.health.pojo.Patient;
import com.health.pojo.User;

public interface UserfileService {
    public PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString);
    public PageResult pageQuerynoog(Integer currentPage, Integer pageSize, String queryString);
    public PageResult adminpageQuery(Integer currentPage, Integer pageSize, String organization);

    public void add(Patient patient);
    public void delete(String user_id);
    public void edit(Patient patient);
    public void useredit(User user);
    public Patient findById(Integer user_id);
    public User adminfindById(String user_id);
    public long countSa();
    public long countSatrue();
    public long countde();
    public long countdetrue();

    public PageResult adminpageQuerynoog (Integer currentPage, Integer pageSize);
}
