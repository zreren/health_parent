package com.health.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.health.dao.FrontRequestDao;
import com.health.entity.PageResult;
import com.health.pojo.*;
import com.health.service.FrontRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service(interfaceClass = FrontRequestService.class)
@Transactional
public class FrontRequestServiceImpl implements FrontRequestService{
    @Autowired
    private FrontRequestDao frontRequestDao;

    public void sarcopeniaadd(Sarcopenia sarcopenia) {
//        User user= getexit(sarcopenia.getUser_id());
//        if (user!=null){
//
//            }else{
            frontRequestDao.sarcopeniaadd(sarcopenia);
//        }
    }
    public void fraiadd(Frailty frailty) {
//        User user= getexit(sarcopenia.getUser_id());
//        if (user!=null){
//
//            }else{
        frontRequestDao.fraiadd(frailty);
//        }
    }
    public void malnutritionadd(Malnutrition malnutrition) {
        frontRequestDao.malnutritionadd(malnutrition);
    }

    public void articleadd(Article article){
        frontRequestDao.articleadd(article);
    }
    public void articleeditById(Article article){
        frontRequestDao.articleeditById(article);
    }
    public PageResult foodpageQuery(Integer currentPage, Integer pageSize, String queryString) {
        PageHelper.startPage(currentPage,pageSize);
        Page<Article> page = frontRequestDao.foodselectByCondition(queryString);
        return new PageResult(page.getTotal(),page.getResult());
    }
    public void dementiaadd(Dementia dementia) {
//        User user= getexit(sarcopenia.getUser_id());
//        if (user!=null){
//
//            }else{
        frontRequestDao.dementiaadd(dementia);
//        }
    }
    public void osteoporosisadd(Patient Patient) {
//        User user= getexit(sarcopenia.getUser_id());
//        if (user!=null){
//
//            }else{
        frontRequestDao.osteoporosisadd(Patient);
//        }
    }
    public void addpatient(Patient patient) {
//        User user= getexit(sarcopenia.getUser_id());
//        if (user!=null){
//
//            }else{
        frontRequestDao.addpatient(patient);
//        }
    }

    public Patient getuser(String user_id) {
        return frontRequestDao.getuser(user_id);

    }

    public Patient getanything(String user_id) {
        return frontRequestDao.getanything(user_id);


    }
    public Patient getanything2(String user_id) {
        return frontRequestDao.getanything2(user_id);


    }
    public Patient getanything3(String user_id) {
        return frontRequestDao.getanything3(user_id);


    }
    public Patient getanything4(String user_id) {
        return frontRequestDao.getanything4(user_id);


    }
    public Patient getanything5(String user_id) {
        return frontRequestDao.getanything5(user_id);


    }
    public User getuserog(String user_name) {
        return frontRequestDao.getuserog(user_name);
    }
    public User getexit(String user_id) {
        return frontRequestDao.getuserog(user_id);
    }

    public PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString) {
        PageHelper.startPage(currentPage,pageSize);
        Page<Sarcopenia> page = frontRequestDao.selectByCondition(queryString);
        return new PageResult(page.getTotal(),page.getResult());
    }
    public PageResult articlefind(Integer currentPage, Integer pageSize, String queryString) {
        PageHelper.startPage(currentPage,pageSize);
        Page<Article> page = frontRequestDao.articleselectByCondition(queryString);
        return new PageResult(page.getTotal(),page.getResult());
    }
    public PageResult depageQuery(Integer currentPage, Integer pageSize, String queryString) {
        PageHelper.startPage(currentPage,pageSize);
        Page<Dementia> page = frontRequestDao.deselectByCondition(queryString);
        return new PageResult(page.getTotal(),page.getResult());
    }
    public PageResult ospageQuery(Integer currentPage, Integer pageSize, String queryString) {
        PageHelper.startPage(currentPage,pageSize);
        Page<Patient> page = frontRequestDao.osselectByCondition(queryString);
        return new PageResult(page.getTotal(),page.getResult());
    }

    public void sarcopeniasum(){
        frontRequestDao.sarcopeniasum();
    }
}
