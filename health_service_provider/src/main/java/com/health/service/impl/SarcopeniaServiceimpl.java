package com.health.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.health.dao.SarcopeniaDao;
import com.health.entity.PageResult;
import com.health.pojo.Sarcopenia;
import com.health.pojo.dementia;
import com.health.service.SarcopeniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service(version = "1.0.0",interfaceClass = SarcopeniaService.class)
@Transactional
public class SarcopeniaServiceimpl implements SarcopeniaService{
    @Autowired
    private SarcopeniaDao sarcopeniaDao;

    public PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString) {
        PageHelper.startPage(currentPage,pageSize);
        Page<Sarcopenia> page = sarcopeniaDao.selectByCondition(queryString);
        return new PageResult(page.getTotal(),page.getResult());
    }
    public PageResult dispageQuery(Integer currentPage, Integer pageSize, String queryString) {
        PageHelper.startPage(currentPage,pageSize);
        Page<Sarcopenia> page = sarcopeniaDao.selectByCondition(queryString);
        return new PageResult(page.getTotal(),page.getResult());
    }
    public PageResult fracpageQuery(Integer currentPage, Integer pageSize, String queryString) {
        PageHelper.startPage(currentPage,pageSize);
        Page<Sarcopenia> page = sarcopeniaDao.selectByCondition(queryString);
        return new PageResult(page.getTotal(),page.getResult());
    }
    public PageResult fraipageQuery(Integer currentPage, Integer pageSize, String queryString) {
        PageHelper.startPage(currentPage,pageSize);
        Page<Sarcopenia> page = sarcopeniaDao.selectByCondition(queryString);
        return new PageResult(page.getTotal(),page.getResult());
    }
    public PageResult demepageQuery(Integer currentPage, Integer pageSize, String queryString) {
        PageHelper.startPage(currentPage,pageSize);
        Page<dementia> page = sarcopeniaDao.demeselectByCondition(queryString);
        return new PageResult(page.getTotal(),page.getResult());
    }

    public void add(Sarcopenia sarcopenia) {
        sarcopeniaDao.add(sarcopenia);
    }

    public void delete(String user_id) throws RuntimeException{
        sarcopeniaDao.deleteById(user_id);
    }
    public void edit(Sarcopenia sarcopenia) {
        sarcopeniaDao.edit(sarcopenia);
    }

    public Sarcopenia findById(Integer id) {
        return sarcopeniaDao.findById(id);
    }


}