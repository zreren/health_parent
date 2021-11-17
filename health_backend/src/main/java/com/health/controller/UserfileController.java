package com.health.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.health.constant.MessageConstant;
import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.entity.QueryPageBean2;
import com.health.entity.Result;
import com.health.pojo.Patient;
import com.health.pojo.Sarcopenia;
import com.health.pojo.User;
import com.health.service.SarcopeniaService;
import com.health.service.UserfileService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userfile")
public class UserfileController {
    @Reference(version = "1.0.0")
    public UserfileService userfileService;

    //查找
    @RequestMapping("/findPage")
    public PageResult findPage(@RequestBody QueryPageBean queryPageBean){
        PageResult pageResult = userfileService.pageQuery(
                queryPageBean.getCurrentPage(),
                queryPageBean.getPageSize(),
                queryPageBean.getQueryString());
        return pageResult;
    }
    @RequestMapping("/findPagenoog")
    public PageResult findPagenoog(@RequestBody QueryPageBean queryPageBean){
        PageResult pageResult = userfileService.pageQuerynoog(
                queryPageBean.getCurrentPage(),
                queryPageBean.getPageSize(),
                queryPageBean.getQueryString());
        return pageResult;
    }

    @RequestMapping("/adminfindPage")
    public PageResult adminfindPage(@RequestBody QueryPageBean2 queryPageBean2){
        PageResult pageResult = userfileService.adminpageQuery(
                queryPageBean2.getCurrentPage(),
                queryPageBean2.getPageSize(),
                queryPageBean2.getOrganization());
        return pageResult;
    }
    @RequestMapping("/adminfindPagenoog")
    public PageResult adminfindPagenoog(@RequestBody QueryPageBean2 queryPageBean2){
        PageResult pageResult = userfileService.adminpageQuerynoog(
                queryPageBean2.getCurrentPage(),
                queryPageBean2.getPageSize());
        return pageResult;
    }

    //新增
    @RequestMapping("/add")
    public Result add(@RequestBody Patient patient){
        try {
            userfileService.add(patient);
        }catch (Exception e){
            return new Result(false, MessageConstant.ADD_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.ADD_CHECKITEM_SUCCESS);
    }
    @RequestMapping("/delete")
    public Result delete(String user_id){
        try {
            userfileService.delete(user_id);
        }catch (RuntimeException e){
            return new Result(false,e.getMessage());
        }catch (Exception e){
            return new Result(false, MessageConstant.DELETE_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.DELETE_CHECKITEM_SUCCESS);
    }

    @RequestMapping("/countSa")
    public long countSa(){
       long countSa =userfileService.countSa();
       return countSa;
    }


    @RequestMapping("/edit")
    public Result edit(@RequestBody Patient patient){
        try {
            userfileService.edit(patient);
        }catch (Exception e){
            return new Result(false,MessageConstant.EDIT_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.EDIT_CHECKITEM_SUCCESS);
    }

    @RequestMapping("/useredit")
    public Result useredit(@RequestBody User user){
        try {
            userfileService.useredit(user);
        }catch (Exception e){
            return new Result(false,MessageConstant.EDIT_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.EDIT_CHECKITEM_SUCCESS);
    }


    @RequestMapping("/adminfindById")
    public Result findById(String user_id){
        try{
            User user = userfileService.adminfindById(user_id);
            return  new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS,user);
        }catch (Exception e){
            e.printStackTrace();
            //服务调用失败
            return new Result(false, MessageConstant.QUERY_CHECKITEM_FAIL);
        }
    }

}

