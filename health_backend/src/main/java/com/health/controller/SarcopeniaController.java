package com.health.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.health.constant.MessageConstant;
import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.entity.QueryPageBean2;
import com.health.entity.Result;
import com.health.pojo.*;
import com.health.service.FrontRequestService;
import com.health.service.SarcopeniaService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Sarcopenia")
public class SarcopeniaController {
    @Reference(version = "1.0.0")
    public SarcopeniaService sarcopeniaService;


    //查找肌少症
    @RequestMapping("/findPage")
    public PageResult findPage(@RequestBody QueryPageBean queryPageBean){
        PageResult pageResult = sarcopeniaService.pageQuery(
                queryPageBean.getCurrentPage(),
                queryPageBean.getPageSize(),
                queryPageBean.getQueryString());
        return pageResult;
    }
    //查找文章
    @RequestMapping("/articlefindPage")
    public PageResult articlefindPage(@RequestBody QueryPageBean queryPageBean){
        PageResult pageResult = sarcopeniaService.articlepageQuery(
                queryPageBean.getCurrentPage(),
                queryPageBean.getPageSize(),
                queryPageBean.getQueryString());
        return pageResult;
    }
    //查找食物

    //disorder營養失調
    @RequestMapping("/disfindPage")
    public PageResult disfindPage(@RequestBody QueryPageBean queryPageBean){
        PageResult pageResult = sarcopeniaService.dispageQuery(
                queryPageBean.getCurrentPage(),
                queryPageBean.getPageSize(),
                queryPageBean.getQueryString());
        return pageResult;
    }
    //衰弱症
    @RequestMapping("/fraifindPage")
    public PageResult fraifindPage(@RequestBody QueryPageBean queryPageBean){
        PageResult pageResult = sarcopeniaService.fraipageQuery(
                queryPageBean.getCurrentPage(),
                queryPageBean.getPageSize(),
                queryPageBean.getQueryString());
        return pageResult;
    }
    //骨质疏松
    @RequestMapping("/fracfindPage")
    public PageResult fracfindPage(@RequestBody QueryPageBean queryPageBean){
        PageResult pageResult = sarcopeniaService.fracpageQuery(
                queryPageBean.getCurrentPage(),
                queryPageBean.getPageSize(),
                queryPageBean.getQueryString());
        return pageResult;
    }
    //失智症
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
    //新增衰弱
    @RequestMapping("/fraiadd")
    public Result fraiadd(@RequestBody Frailty frailty){
        try {
            sarcopeniaService.fraiadd(frailty);
        }catch (Exception e){
            return new Result(false, MessageConstant.ADD_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.ADD_CHECKITEM_SUCCESS);
    }
    //营养失调
    @RequestMapping("/disadd")
    public Result disadd(@RequestBody Sarcopenia sarcopenia){
        try {
            sarcopeniaService.add(sarcopenia);
        }catch (Exception e){
            return new Result(false, MessageConstant.ADD_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.ADD_CHECKITEM_SUCCESS);
    }
    //骨质疏松
    @RequestMapping("/fracadd")
    public Result fracadd(@RequestBody Sarcopenia sarcopenia){
        try {
            sarcopeniaService.add(sarcopenia);
        }catch (Exception e){
            return new Result(false, MessageConstant.ADD_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.ADD_CHECKITEM_SUCCESS);
    }
    @RequestMapping("/foodadd")
    public Result foodadd(@RequestBody Article article){
        try {
            sarcopeniaService.foodadd(article);
        }catch (Exception e){
            return new Result(false, MessageConstant.ADD_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.ADD_CHECKITEM_SUCCESS);
    }


    //失智症
    @RequestMapping("/demeadd")
    public Result demeadd(@RequestBody Sarcopenia sarcopenia){
        try {
            sarcopeniaService.add(sarcopenia);
        }catch (Exception e){
            return new Result(false, MessageConstant.ADD_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.ADD_CHECKITEM_SUCCESS);
    }


    //肌少症
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
    //shuairuo
    @RequestMapping("/fraidelete")
    public Result fraidelete(String user_id){
        try {
            sarcopeniaService.fraidelete(user_id);
        }catch (RuntimeException e){
            return new Result(false,e.getMessage());
        }catch (Exception e){
            return new Result(false, MessageConstant.DELETE_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.DELETE_CHECKITEM_SUCCESS);
    }
    //骨质疏松
    @RequestMapping("/fracdelete")
    public Result fracdelete(String user_id){
        try {
            sarcopeniaService.fracdelete(user_id);
        }catch (RuntimeException e){
            return new Result(false,e.getMessage());
        }catch (Exception e){
            return new Result(false, MessageConstant.DELETE_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.DELETE_CHECKITEM_SUCCESS);
    }
    @RequestMapping("/deletearticle")
    public Result deletearticle(String id){
        try {
            sarcopeniaService.deletearticle(id);
        }catch (RuntimeException e){
            return new Result(false,e.getMessage());
        }catch (Exception e){
            return new Result(false, MessageConstant.DELETE_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.DELETE_CHECKITEM_SUCCESS);
    }
    @RequestMapping("/fooddeleteById")
    public Result fooddeleteById(Integer id){
        try {
            sarcopeniaService.fooddeleteById(id);
        }catch (RuntimeException e){
            return new Result(false,e.getMessage());
        }catch (Exception e){
            return new Result(false, MessageConstant.DELETE_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.DELETE_CHECKITEM_SUCCESS);
    }

    //失智症
    @RequestMapping("/demedelete")
    public Result demedelete(String user_id){
        try {
            sarcopeniaService.demedelete(user_id);
        }catch (RuntimeException e){
            return new Result(false,e.getMessage());
        }catch (Exception e){
            return new Result(false, MessageConstant.DELETE_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.DELETE_CHECKITEM_SUCCESS);
    }


    //肌少症
    @RequestMapping("/edit")
    public Result edit(@RequestBody Sarcopenia sarcopenia){
        try {
            sarcopeniaService.edit(sarcopenia);
        }catch (Exception e){
            return new Result(false,MessageConstant.EDIT_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.EDIT_CHECKITEM_SUCCESS);
    }
    //衰弱
    @RequestMapping("/fraiedit")
    public Result fraiedit(@RequestBody Frailty frailty){
        try {
            sarcopeniaService.fraiedit(frailty);
        }catch (Exception e){
            return new Result(false,MessageConstant.EDIT_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.EDIT_CHECKITEM_SUCCESS);
    }
    //骨质疏松症
    @RequestMapping("/fracedit")
    public Result fracedit(@RequestBody Patient patient){
        try {
            sarcopeniaService.fracedit(patient);
        }catch (Exception e){
            return new Result(false,MessageConstant.EDIT_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.EDIT_CHECKITEM_SUCCESS);
    }
    //失智症
    @RequestMapping("/demeedit")
    public Result demeedit(@RequestBody  Dementia dementia){
        try {
            sarcopeniaService.demeedit(dementia);
        }catch (Exception e){
            return new Result(false,MessageConstant.EDIT_CHECKITEM_FAIL);
        }
        return new Result(true,MessageConstant.EDIT_CHECKITEM_SUCCESS);
    }
    @RequestMapping("/foodeditById")
    public Result foodeditById(@RequestBody Article article){
        try {
            sarcopeniaService.foodeditById(article);
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
    @RequestMapping("/fraifindById")
    public Result fraifindById(String user_id){
        try{
            Frailty frailty = sarcopeniaService.fraifindById(user_id);
            return  new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS,frailty);
        }catch (Exception e){
            e.printStackTrace();
            //服务调用失败
            return new Result(false, MessageConstant.QUERY_CHECKITEM_FAIL);
        }
    }
    @RequestMapping("/fracfindById")
    public Result fracfindById(String user_id){
        try{
            Patient patient = sarcopeniaService.fracfindById(user_id);
            return  new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS,patient);
        }catch (Exception e){
            e.printStackTrace();
            //服务调用失败
            return new Result(false, MessageConstant.QUERY_CHECKITEM_FAIL);
        }
    }
    @RequestMapping("/demefindById")
    public Result demefindById(String user_id){
        try{
            Dementia dementia = sarcopeniaService.demefindById(user_id);
            return  new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS,dementia);
        }catch (Exception e){
            e.printStackTrace();
            //服务调用失败
            return new Result(false, MessageConstant.QUERY_CHECKITEM_FAIL);
        }
    }
    //添加新文章
    @RequestMapping("/articleadd")
    public Result articleadd(@RequestBody Article article){
        try {
            sarcopeniaService.articleadd(article);
        }catch (Exception e){
            return new Result(false, "失败");
        }
        return new Result(true,MessageConstant.ADD_CHECKITEM_SUCCESS);
    }


    @RequestMapping("/articlefindById")
    public Result articlefindById(Integer id){
        try{
            Article article = sarcopeniaService.articlefindById(id);
            return  new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS,article);
        }catch (Exception e){
            e.printStackTrace();
            //服务调用失败
            return new Result(false, MessageConstant.QUERY_CHECKITEM_FAIL);
        }
    }
    @RequestMapping("/foodfindById")
    public Result foodfindById(Integer id){
        try{
            Article article = sarcopeniaService.foodfindById(id);
            return  new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS,article);
        }catch (Exception e){
            e.printStackTrace();
            //服务调用失败
            return new Result(false, MessageConstant.QUERY_CHECKITEM_FAIL);
        }
    }
    @RequestMapping("/safindById")
    public Result safindById(String user_id){
        try{
            Sarcopenia sarcopenia = sarcopeniaService.safindById(user_id);
            return  new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS,sarcopenia);
        }catch (Exception e){
            e.printStackTrace();
            //服务调用失败
            return new Result(false, MessageConstant.QUERY_CHECKITEM_FAIL);
        }
    }


}