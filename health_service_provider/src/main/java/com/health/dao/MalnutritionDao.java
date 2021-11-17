package com.health.dao;

import com.github.pagehelper.Page;
import com.health.pojo.*;

public interface MalnutritionDao {
    public Page<Malnutrition> selectByCondition(String queryString);
    public void add(Malnutrition malnutrition);

    public void deleteById(String user_id);

    public void edit(Malnutrition malnutrition);
    public Malnutrition findById(String user_id);

}