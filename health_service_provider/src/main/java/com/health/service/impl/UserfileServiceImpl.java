package com.health.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.health.dao.CheckItemDao;
import com.health.dao.UserfileServiceDao;
import com.health.entity.PageResult;
import com.health.pojo.CheckItem;
import com.health.pojo.Patient;
import com.health.pojo.User;
import com.health.pojo.dementia;
import com.health.service.SarcopeniaService;
import com.health.service.UserService;
import com.health.service.UserfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service(version = "1.0.0",interfaceClass = UserfileService.class)
@Transactional
public class UserfileServiceImpl implements UserfileService{
    @Autowired
    private UserfileServiceDao userfileServiceDao;


    //新增
    public void add(Patient patient) {
        userfileServiceDao.add(patient);
    }

    public PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString) {
        PageHelper.startPage(currentPage,pageSize);
        Page<Patient> page = userfileServiceDao.selectByCondition(queryString);
        return new PageResult(page.getTotal(),page.getResult());
    }

    public PageResult adminpageQuery(Integer currentPage, Integer pageSize, String queryString) {
        PageHelper.startPage(currentPage,pageSize);
        Page<User> page = userfileServiceDao.adminselectByCondition(queryString);
        return new PageResult(page.getTotal(),page.getResult());
    }

    public void delete(String user_id) throws RuntimeException{
        //查询当前检查项是否和检查组关联
        userfileServiceDao.deleteById(user_id);
    }
    public void edit(Patient patient) {
        userfileServiceDao.edit(patient);
    }

    public Patient findById(Integer id) {
        return userfileServiceDao.findById(id);
    }

    public long countSa(){return userfileServiceDao.countSa();}

    public long countSatrue(){return userfileServiceDao.countSatrue();}

}
