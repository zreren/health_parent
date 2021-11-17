package com.health.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.health.service.FrontRequestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Reference(version = "1.0.0")
    public FrontRequestService frontRequestService;
}
