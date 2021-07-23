package com.health.dao;

import com.github.pagehelper.Page;
import com.health.pojo.CheckItem;

public interface CheckItemDao {
    public void add(CheckItem checkItem);
    public Page<CheckItem> selectByCondition(String queryString);
    public void deleteById(Integer id);
    public long findCountByCheckItemId(Integer checkItemId);
    public void edit(CheckItem checkItem);
    public CheckItem findById(Integer id);
}
