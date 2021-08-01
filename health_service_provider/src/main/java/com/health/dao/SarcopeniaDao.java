package com.health.dao;

import com.github.pagehelper.Page;
import com.health.pojo.CheckItem;
import com.health.pojo.Sarcopenia;

public interface SarcopeniaDao {
    public Page<Sarcopenia> selectByCondition(String queryString);
    public void add(Sarcopenia sarcopenia);
    public void deleteById(Integer id);
    public long findCountByCheckItemId(Integer user_id);
    public void edit(Sarcopenia sarcopenia);
    public Sarcopenia findById(Integer id);
}
