package com.mxiaixy.controller;

import com.mxiaixy.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Mxia on 2017/1/10.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    //测试jsp中传参
    @RequestMapping(value = "/save",method = RequestMethod.GET )
    public String save(int id){
        System.out.println(id);
        return "user/save";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(String username){
        System.out.println(username);
        return "redirect:/user/home?id=13";
    }
    @RequestMapping("/home")
    public String update(Integer id){
        System.out.println(id+"-------");
        return "user/home";
    }


    @RequestMapping(value = "/home",method = RequestMethod.POST)
    public void commit(User user){
        System.out.println(user.getUsername()+user.getPassword());

    }
    //springmvc传值方法
    @RequestMapping(value = "/params", method = RequestMethod.GET)
    public String params(Model model){
        model.addAttribute("params","传入参数");
        return "/param";
    }
    //
}
