package com.bdqn.controller.user;

import com.bdqn.entity.User;
import com.bdqn.services.user.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/3/13.
 */
@Controller
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserServices userServices;
    @ResponseBody
    @RequestMapping(value = "login",method = RequestMethod.POST,produces = {"application/json;charset=utf-8"})
    public String login(User user, HttpSession session, Model model){
        User user1=userServices.queryUserByUserName(user.getUserName());
        if (user!=null) {
            if (user.getPassword().equals(user1.getPassword())){
                session.setAttribute("loginUser",user1);
                return "main";
            }
            model.addAttribute("message","登陆失败,密码错误!");
            return "index";
        }
        model.addAttribute("message","登录失败,用户名不存在!");
        return "index";
    }
}
