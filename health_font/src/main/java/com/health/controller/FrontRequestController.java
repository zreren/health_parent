package com.health.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.health.constant.MessageConstant;
import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.entity.Result;
import com.health.pojo.Patient;
import com.health.pojo.Sarcopenia;
import com.health.pojo.User;
import com.health.service.FrontRequestService;
import com.health.service.UserfileService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/front")
public class FrontRequestController {
    @Reference
    private FrontRequestService frontRequestService;
    private UserfileService userfileService;

    @RequestMapping("/sarcopeniaadd")
    public Result sarcopeniaadd(@RequestBody Sarcopenia sarcopenia){
        try {
            frontRequestService.sarcopeniaadd(sarcopenia);
        }catch (Exception e){
            return new Result(false, MessageConstant.ADD_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.ADD_CHECKITEM_SUCCESS);
    }

    @RequestMapping("/addpatient")
    public Result addpatient(@RequestBody Patient patient){
        try {
            frontRequestService.addpatient(patient);
        }catch (Exception e){
            return new Result(false, MessageConstant.ADD_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.ADD_CHECKITEM_SUCCESS);
    }

    @RequestMapping("/getuser")
    public Result getuser(String user_id){
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

    @RequestMapping("/findPage")
    public PageResult findPage(@RequestBody QueryPageBean queryPageBean){
        PageResult pageResult = frontRequestService.pageQuery(
                queryPageBean.getCurrentPage(),
                queryPageBean.getPageSize(),
                queryPageBean.getQueryString());
        return pageResult;
    }


    @RequestMapping("/sarcopeniasum")
    public Result sarcopeniasum(){
        try {
            frontRequestService.sarcopeniasum();
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



}
