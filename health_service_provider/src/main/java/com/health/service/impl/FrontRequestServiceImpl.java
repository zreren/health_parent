package com.health.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.health.dao.FrontRequestDao;
import com.health.entity.PageResult;
import com.health.pojo.CheckItem;
import com.health.pojo.Patient;
import com.health.pojo.Sarcopenia;
import com.health.pojo.User;
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

    public void sarcopeniasum(){
        frontRequestDao.sarcopeniasum();
    }
}
