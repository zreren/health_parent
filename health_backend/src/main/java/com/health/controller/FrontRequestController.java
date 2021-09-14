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
            return new Result(false, MessageConstant.ADD_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.ADD_CHECKITEM_SUCCESS);
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
}
