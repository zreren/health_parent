package com.health.service;

import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.pojo.CheckItem;
import com.health.pojo.Sarcopenia;

public interface SarcopeniaService {
    public PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString);
    public void add(Sarcopenia sarcopenia);
    public void delete(Integer id);
    public void edit(Sarcopenia sarcopenia);
    public Sarcopenia findById(Integer id);
}
