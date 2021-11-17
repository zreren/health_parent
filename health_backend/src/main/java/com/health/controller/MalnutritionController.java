package com.health.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.health.constant.MessageConstant;
import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.entity.Result;
import com.health.pojo.Malnutrition;
import com.health.service.MalnutritionService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/malnutrition")
public class MalnutritionController {
    @Reference(version = "1.0.0")
    public MalnutritionService malnutritionService;


    //查找肌少症
    @RequestMapping("/findPage")
    public PageResult findPage(@RequestBody QueryPageBean queryPageBean) {
        PageResult pageResult = malnutritionService.pageQuery(
                queryPageBean.getCurrentPage(),
                queryPageBean.getPageSize(),
                queryPageBean.getQueryString());
        return pageResult;
    }
    //新增
    @RequestMapping("/add")
    public Result add(@RequestBody Malnutrition malnutrition){
        try {
            malnutritionService.add(malnutrition);
        }catch (Exception e){
            return new Result(false, MessageConstant.ADD_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.ADD_CHECKITEM_SUCCESS);
    }

    @RequestMapping("/delete")
    public Result delete(String user_id){
        try {
            malnutritionService.delete(user_id);
        }catch (RuntimeException e){
            return new Result(false,e.getMessage());
        }catch (Exception e){
            return new Result(false, MessageConstant.DELETE_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.DELETE_CHECKITEM_SUCCESS);
    }

    @RequestMapping("/edit")
    public Result edit(@RequestBody Malnutrition malnutrition){
        try {
            malnutritionService.edit(malnutrition);
        }catch (Exception e){
            return new Result(false,MessageConstant.EDIT_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.EDIT_CHECKITEM_SUCCESS);
    }


    @RequestMapping("/findById")
    public Result findById(String user_id){
        try{
            Malnutrition malnutrition = malnutritionService.findById(user_id);
            return  new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS,malnutrition);
        }catch (Exception e){
            e.printStackTrace();
            //服务调用失败
            return new Result(false, MessageConstant.QUERY_CHECKITEM_FAIL);
        }
    }



}