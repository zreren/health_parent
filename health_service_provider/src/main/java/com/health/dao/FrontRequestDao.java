package com.health.dao;

import com.github.pagehelper.Page;
import com.health.pojo.CheckItem;
import com.health.pojo.Patient;
import com.health.pojo.Sarcopenia;
import com.health.pojo.User;

public interface FrontRequestDao {
    public Page<Sarcopenia> selectByCondition(String queryString);
    public void sarcopeniaadd(Sarcopenia sarcopenia);
    public void addpatient(Patient patient);
    public void sarcopeniasum();
    public Patient getuser(String user_id);
    public User getuserog(String user_name);
    public User getexit(String user_id);

}
