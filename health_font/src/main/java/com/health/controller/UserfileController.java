package com.health.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.health.constant.MessageConstant;
import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.entity.Result;
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

    @RequestMapping("/adminfindPage")
    public PageResult adminfindPage(@RequestBody QueryPageBean queryPageBean){
        PageResult pageResult = userfileService.adminpageQuery(
                queryPageBean.getCurrentPage(),
                queryPageBean.getPageSize(),
                queryPageBean.getQueryString());
        return pageResult;
    }
//
//    //新增
//    @RequestMapping("/add")
//    public Result add(@RequestBody Patient patient){
//        try {
//            userfileService.add(patient);
//        }catch (Exception e){
//            return new Result(false, MessageConstant.ADD_CHECKITEM_FAIL);
//        }
//        return new Result(true,MessageConstant.ADD_CHECKITEM_SUCCESS);
//    }
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

    @RequestMapping("/countSatrue")
    public long countSatrue(){
        long countSatrue =userfileService.countSatrue();
        return countSatrue;
    }

//
//    @RequestMapping("/edit")
//    public Result edit(@RequestBody Patient patient){
//        try {
//            userfileService.edit(patient);
//        }catch (Exception e){
//            return new Result(false,MessageConstant.EDIT_CHECKITEM_FAIL);
//        }
//        return new Result(true,MessageConstant.EDIT_CHECKITEM_SUCCESS);
//    }

//    @RequestMapping("/findById")
//    public Result findById(Integer id){
//        try{
//            Sarcopenia sarcopenia = sarcopeniaService.findById(id);
//            return  new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS,sarcopenia);
//        }catch (Exception e){
//            e.printStackTrace();
//            //服务调用失败
//            return new Result(false, MessageConstant.QUERY_CHECKITEM_FAIL);
//        }
//    }

}

