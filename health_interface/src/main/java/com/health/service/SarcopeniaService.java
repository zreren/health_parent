package com.health.service;

import com.health.entity.PageResult;
import com.health.pojo.Sarcopenia;

public interface SarcopeniaService {
    public PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString);
    public PageResult dispageQuery(Integer currentPage, Integer pageSize, String queryString);
    public PageResult fracpageQuery(Integer currentPage, Integer pageSize, String queryString);
    public PageResult fraipageQuery(Integer currentPage, Integer pageSize, String queryString);
    public PageResult demepageQuery(Integer currentPage, Integer pageSize, String queryString);
    public void add(Sarcopenia sarcopenia);
    public void delete(String id);
    public void edit(Sarcopenia sarcopenia);
    public Sarcopenia findById(Integer id);
}