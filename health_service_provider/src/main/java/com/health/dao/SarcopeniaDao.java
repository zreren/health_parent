package com.health.dao;

import com.github.pagehelper.Page;
import com.health.pojo.*;

public interface SarcopeniaDao {
    public Page<Sarcopenia> selectByCondition(String queryString);
    public Page<Article> articleselectByCondition(String queryString);

    public Page<Dementia> demeselectByCondition(String queryString);
    public Page<Patient> fracselectByCondition(String queryString);
    public void add(Sarcopenia sarcopenia);
    public void fraiadd(Frailty frailty);
    public void articleadd(Article article);
    public void foodadd(Article article);
    public void deleteById(String user_id);
    public void fraideleteById(String user_id);
    public void fracdeleteById(String user_id);
    public void demedeleteById(String user_id);
    public void fooddeleteById(Integer id);
    public void deletearticle(String id);

    public void edit(Sarcopenia sarcopenia);
    public void fraiedit(Frailty frailty);
    public void fracedit(Patient patient);
    public void demeedit(Dementia dementia);
    public void foodeditById(Article article);
    public Sarcopenia findById(Integer id);
    public Article articlefindById(Integer id);
    public Article foodfindById(Integer id);
    public Patient fracfindById(String user_id);
    public Dementia demefindById(String user_id);
    public Sarcopenia safindById(String user_id);
}