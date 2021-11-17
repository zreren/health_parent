package com.health.service;

import com.health.entity.PageResult;
import com.health.pojo.*;

public interface SarcopeniaService {
    public PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString);
    public PageResult articlepageQuery(Integer currentPage, Integer pageSize, String queryString);

    public PageResult dispageQuery(Integer currentPage, Integer pageSize, String queryString);
    public PageResult fraipageQuery(Integer currentPage, Integer pageSize, String queryString);
    public PageResult demepageQuery(Integer currentPage, Integer pageSize, String queryString);
    public PageResult fracpageQuery(Integer currentPage, Integer pageSize, String queryString);
    public void add(Sarcopenia sarcopenia);
    public void foodadd(Article article);
    public void delete(String user_id);
    //骨质疏松
    public void fracdelete(String user_id);
    public void fooddeleteById(Integer id);

    public void demedelete(String user_id);
    public void fraidelete(String user_id);
    public void deletearticle(String id);

    public void articleadd(Article article);
    public void fraiadd(Frailty frailty);
    public void edit(Sarcopenia sarcopenia);
    public void fraiedit(Frailty frailty);
    public void fracedit(Patient patient);
    public void demeedit(Dementia dementia);
    public void foodeditById(Article article);

    public Sarcopenia findById(Integer id);
    public Patient fracfindById(String user_id);
    public Frailty fraifindById(String user_id);
    public Dementia demefindById(String user_id);
    public Article articlefindById(Integer id);
    public Sarcopenia safindById(String user_id);
    public Article foodfindById(Integer id);

}