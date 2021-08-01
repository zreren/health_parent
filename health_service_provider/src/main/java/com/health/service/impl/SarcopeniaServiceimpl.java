package com.health.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.health.dao.SarcopeniaDao;
import com.health.entity.PageResult;
import com.health.pojo.CheckItem;
import com.health.pojo.Sarcopenia;
import com.health.service.CheckItemService;
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

    public void add(Sarcopenia sarcopenia) {
        sarcopeniaDao.add(sarcopenia);
    }

    public void delete(Integer id) throws RuntimeException{
        //查询当前检查项是否和检查组关联
        long count = sarcopeniaDao.findCountByCheckItemId(id);
        if(count > 0){
            //当前检查项被引用，不能删除
            throw new RuntimeException("当前检查项被引用，不能删除");
        }
        sarcopeniaDao.deleteById(id);
    }
    public void edit(Sarcopenia sarcopenia) {
        sarcopeniaDao.edit(sarcopenia);
    }

    public Sarcopenia findById(Integer id) {
        return sarcopeniaDao.findById(id);
    }


}
