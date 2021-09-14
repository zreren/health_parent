package com.health.dao;

import com.github.pagehelper.Page;
import com.health.pojo.CheckItem;
import com.health.pojo.Patient;
import com.health.pojo.User;

public interface UserfileServiceDao {
    public void add(Patient patient);
    public Page<Patient> selectByCondition(String queryString);
    public Page<User> adminselectByCondition(String queryString);
    public void deleteById(String user_id);
    public long findCountByCheckItemId(Integer checkItemId);
    public void edit(Patient patient);
    public Patient findById(Integer id);
    public long countSa();
    public long countSatrue();
}
