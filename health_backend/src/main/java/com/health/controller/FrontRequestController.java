package com.health.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.health.constant.MessageConstant;
import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.entity.Result;
import com.health.pojo.*;
import com.health.service.FrontRequestService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/front")
public class FrontRequestController {
    @Reference
    private FrontRequestService frontRequestService;

    @RequestMapping("/sarcopeniaadd")
    public Result sarcopeniaadd(@RequestBody Sarcopenia sarcopenia){
        try {
            frontRequestService.sarcopeniaadd(sarcopenia);
        }catch (Exception e){
            return new Result(false, "失败");
        }
        return new Result(true,MessageConstant.ADD_CHECKITEM_SUCCESS);
    }
    @RequestMapping("/frailtyadd")
    public Result fraiadd(@RequestBody Frailty frailty){
        try {
            frontRequestService.fraiadd(frailty);
        }catch (Exception e){
            return new Result(false, "失败");
        }
        return new Result(true,MessageConstant.ADD_CHECKITEM_SUCCESS);
    }


    @RequestMapping("/articleeditById")
    public Result articleeditById(@RequestBody Article article){
        try {
            frontRequestService.articleeditById(article);
        }catch (Exception e){
            return new Result(false, MessageConstant.ADD_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.ADD_CHECKITEM_SUCCESS);
    }

    @RequestMapping("/foodfindPage")
    public PageResult foodfindPage(@RequestBody QueryPageBean queryPageBean){
        PageResult pageResult = frontRequestService.foodpageQuery(
                queryPageBean.getCurrentPage(),
                queryPageBean.getPageSize(),
                queryPageBean.getQueryString());
        return pageResult;
    }


    @RequestMapping("/getuser")
    public Result getuser( String  user_id){
        try{
            Patient patient = frontRequestService.getuser(user_id);
            return  new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS,patient);
        }catch (Exception e){
            e.printStackTrace();
            //服务调用失败
            return new Result(false, MessageConstant.QUERY_CHECKITEM_FAIL);
        }
    }

    @RequestMapping("/getuserog")
    public Result getuserbyname(String user_name){
        try{
            User user = frontRequestService.getuserog(user_name);
            return  new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS,user);
        }catch (Exception e){
            e.printStackTrace();
            //服务调用失败
            return new Result(false, MessageConstant.QUERY_CHECKITEM_FAIL);
        }
    }
}
