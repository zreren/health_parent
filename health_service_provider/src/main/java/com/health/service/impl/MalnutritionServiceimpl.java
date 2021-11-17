package com.health.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.health.dao.MalnutritionDao;
import com.health.entity.PageResult;
import com.health.pojo.*;
import com.health.service.MalnutritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service(version = "1.0.0",interfaceClass = MalnutritionService.class)
@Transactional
public class MalnutritionServiceimpl implements MalnutritionService {
    @Autowired
    private MalnutritionDao malnutritionDao;

    public PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString) {
        PageHelper.startPage(currentPage,pageSize);
        Page<Malnutrition> page = malnutritionDao.selectByCondition(queryString);
        return new PageResult(page.getTotal(),page.getResult());
    }
    public void add(Malnutrition malnutrition) {
        malnutritionDao.add(malnutrition);
    }

    public void delete(String user_id) throws RuntimeException{
        malnutritionDao.deleteById(user_id);
    }
    public void edit(Malnutrition malnutrition) {
        malnutritionDao.edit(malnutrition);
    }
    public Malnutrition findById(String user_id) {
        return malnutritionDao.findById(user_id);
    }



}