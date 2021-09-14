package com.health.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.health.constant.MessageConstant;
import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.entity.Result;
import com.health.pojo.Sarcopenia;
import com.health.service.SarcopeniaService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Sarcopenia")
public class SarcopeniaController {
    @Reference(version = "1.0.0")
    public SarcopeniaService sarcopeniaService;


    //查找
    @RequestMapping("/findPage")
    public PageResult findPage(@RequestBody QueryPageBean queryPageBean){
        PageResult pageResult = sarcopeniaService.pageQuery(
                queryPageBean.getCurrentPage(),
                queryPageBean.getPageSize(),
                queryPageBean.getQueryString());
        return pageResult;
    }
    //disorder營養失調
    @RequestMapping("/disfindPage")
    public PageResult disfindPage(@RequestBody QueryPageBean queryPageBean){
        PageResult pageResult = sarcopeniaService.dispageQuery(
                queryPageBean.getCurrentPage(),
                queryPageBean.getPageSize(),
                queryPageBean.getQueryString());
        return pageResult;
    }
    @RequestMapping("/fraifindPage")
    public PageResult fraifindPage(@RequestBody QueryPageBean queryPageBean){
        PageResult pageResult = sarcopeniaService.fraipageQuery(
                queryPageBean.getCurrentPage(),
                queryPageBean.getPageSize(),
                queryPageBean.getQueryString());
        return pageResult;
    }
    @RequestMapping("/fracfindPage")
    public PageResult fracfindPage(@RequestBody QueryPageBean queryPageBean){
        PageResult pageResult = sarcopeniaService.fracpageQuery(
                queryPageBean.getCurrentPage(),
                queryPageBean.getPageSize(),
                queryPageBean.getQueryString());
        return pageResult;
    }
    @RequestMapping("/demefindPage")
    public PageResult demefindPage(@RequestBody QueryPageBean queryPageBean){
        PageResult pageResult = sarcopeniaService.demepageQuery(
                queryPageBean.getCurrentPage(),
                queryPageBean.getPageSize(),
                queryPageBean.getQueryString());
        return pageResult;
    }


    //新增
    @RequestMapping("/add")
    public Result add(@RequestBody Sarcopenia sarcopenia){
        try {
            sarcopeniaService.add(sarcopenia);
        }catch (Exception e){
            return new Result(false, MessageConstant.ADD_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.ADD_CHECKITEM_SUCCESS);
    }
    @RequestMapping("/delete")
    public Result delete(String user_id){
        try {
            sarcopeniaService.delete(user_id);
        }catch (RuntimeException e){
            return new Result(false,e.getMessage());
        }catch (Exception e){
            return new Result(false, MessageConstant.DELETE_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.DELETE_CHECKITEM_SUCCESS);
    }

    @RequestMapping("/edit")
    public Result edit(@RequestBody Sarcopenia sarcopenia){
        try {
            sarcopeniaService.edit(sarcopenia);
        }catch (Exception e){
            return new Result(false,MessageConstant.EDIT_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.EDIT_CHECKITEM_SUCCESS);
    }

    @RequestMapping("/findById")
    public Result findById(Integer id){
        try{
            Sarcopenia sarcopenia = sarcopeniaService.findById(id);
            return  new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS,sarcopenia);
        }catch (Exception e){
            e.printStackTrace();
            //服务调用失败
            return new Result(false, MessageConstant.QUERY_CHECKITEM_FAIL);
        }
    }

}