package com.health.dao;

import com.github.pagehelper.Page;
import com.health.pojo.CheckItem;
import com.health.pojo.Sarcopenia;
import com.health.pojo.dementia;

public interface SarcopeniaDao {
    public Page<Sarcopenia> selectByCondition(String queryString);
    public Page<dementia> demeselectByCondition(String queryString);
    public void add(Sarcopenia sarcopenia);
    public void deleteById(String user_id);
    public long findCountByCheckItemId(Integer user_id);
    public void edit(Sarcopenia sarcopenia);
    public Sarcopenia findById(Integer id);
}