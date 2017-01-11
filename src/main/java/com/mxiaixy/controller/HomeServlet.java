package com.mxiaixy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Mxia on 2017/1/10.
 */
//如何声明哪个类是controller是控制器类 在类的头部加上@controller 并且在配置文件中配置@Controller扫描
@Controller
public class HomeServlet {

    @RequestMapping("/home")
    public String save(){
        System.out.println("hello springmvc.....");
        return "home";
    }


}
