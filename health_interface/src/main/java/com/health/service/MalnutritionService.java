package com.health.service;

import com.health.entity.PageResult;
import com.health.pojo.Malnutrition;

public interface MalnutritionService {
    public PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString);
    public void add(Malnutrition malnutrition);
    public void delete(String user_id);
    public void edit(Malnutrition malnutrition);
    public Malnutrition findById(String user_id);

}