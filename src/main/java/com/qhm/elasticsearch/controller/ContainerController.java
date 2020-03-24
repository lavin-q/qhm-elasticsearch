package com.qhm.elasticsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * @ Description:
 * @ Author: qhm
 * @ Date: 2020/3/24 10:15
 * @ Version: 1.0
 */
@Controller
@RequestMapping
public class ContainerController {

    @Autowired
    private ApplicationContext webApplicationContext;

    @RequestMapping(path = "/Ioc",method = RequestMethod.GET)
    @ResponseBody
    public HashMap<String,String[]> allInIoc(){
        String[] beanDefinitionNames = webApplicationContext.getBeanDefinitionNames();
        return new HashMap<String, String[]>(){{
            put("子容器",webApplicationContext.getBeanDefinitionNames());
            //put("父容器", webApplicationContext.getParent().getBeanDefinitionNames());
        }};
    }
}
