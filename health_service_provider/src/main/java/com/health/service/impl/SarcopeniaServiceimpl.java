package com.health.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.health.dao.SarcopeniaDao;
import com.health.entity.PageResult;
import com.health.pojo.*;
import com.health.pojo.Sarcopenia;
import com.health.service.SarcopeniaService;
import org.jboss.netty.handler.codec.http.QueryStringDecoder;
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
    public PageResult articlepageQuery(Integer currentPage, Integer pageSize, String queryString) {
        PageHelper.startPage(currentPage,pageSize);
        Page<Article> page = sarcopeniaDao.articleselectByCondition(queryString);
        return new PageResult(page.getTotal(),page.getResult());
    }

    public PageResult dispageQuery(Integer currentPage, Integer pageSize, String queryString) {
        PageHelper.startPage(currentPage,pageSize);
        Page<Sarcopenia> page = sarcopeniaDao.selectByCondition(queryString);
        return new PageResult(page.getTotal(),page.getResult());
    }
    public PageResult fracpageQuery(Integer currentPage, Integer pageSize, String queryString) {
        PageHelper.startPage(currentPage,pageSize);
        Page<Patient> page = sarcopeniaDao.fracselectByCondition(queryString);
        return new PageResult(page.getTotal(),page.getResult());
    }
    public PageResult fraipageQuery(Integer currentPage, Integer pageSize, String queryString) {
        PageHelper.startPage(currentPage,pageSize);
        Page<Sarcopenia> page = sarcopeniaDao.selectByCondition(queryString);
        return new PageResult(page.getTotal(),page.getResult());
    }
    public PageResult demepageQuery(Integer currentPage, Integer pageSize, String queryString) {
        PageHelper.startPage(currentPage,pageSize);
        Page<Dementia> page = sarcopeniaDao.demeselectByCondition(queryString);
        return new PageResult(page.getTotal(),page.getResult());
    }

    public void add(Sarcopenia sarcopenia) {
        sarcopeniaDao.add(sarcopenia);
    }
    public void fraiadd(Frailty frailty) {
        sarcopeniaDao.fraiadd(frailty);
    }
    public void foodadd(Article article) {
        sarcopeniaDao.foodadd(article);
    }

    public void delete(String user_id) throws RuntimeException{
        sarcopeniaDao.deleteById(user_id);
    }
    public void fracdelete(String user_id) throws RuntimeException{
        sarcopeniaDao.fracdeleteById(user_id);
    }
    public void fraidelete(String user_id) throws RuntimeException{
        sarcopeniaDao.fraideleteById(user_id);
    }
    public void demedelete(String user_id) throws RuntimeException{
        sarcopeniaDao.demedeleteById(user_id);
    }
    public void deletearticle(String id) throws RuntimeException{
        sarcopeniaDao.deletearticle(id);
    }

    public void fooddeleteById(Integer id) throws RuntimeException{
        sarcopeniaDao.fooddeleteById(id);
    }

    public void edit(Sarcopenia sarcopenia) {
        sarcopeniaDao.edit(sarcopenia);
    }

    public void fraiedit(Frailty frailty) {
        sarcopeniaDao.fraiedit(frailty);
    }

    public void fracedit(Patient patient) {
        sarcopeniaDao.fracedit(patient);
    }
    public void demeedit(Dementia dementia) {
        sarcopeniaDao.demeedit(dementia);
    }
    public void foodeditById(Article article) {
        sarcopeniaDao.foodeditById(article);
    }
    public Sarcopenia findById(Integer id) {
        return sarcopeniaDao.findById(id);
    }
    public Dementia demefindById(String user_id) {
        return sarcopeniaDao.demefindById(user_id);
    }
    public Article articlefindById(Integer id) {
        return sarcopeniaDao.articlefindById(id);
    }

    public Article foodfindById(Integer id) {
        return sarcopeniaDao.foodfindById(id);
    }

    public Sarcopenia safindById(String user_id) {
        return sarcopeniaDao.safindById(user_id);
    }
    public Patient fracfindById(String user_id) {
        return sarcopeniaDao.fracfindById(user_id);
    }

    public Frailty fraifindById(String user_id) {
        return null;
    }


    public void articleadd(Article article){
        sarcopeniaDao.articleadd(article);
    }


}