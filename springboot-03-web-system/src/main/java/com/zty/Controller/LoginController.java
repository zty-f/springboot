package com.zty.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password")String password, Model model
            , HttpSession httpSession){

        //具体业务逻辑在下面写。

        if(!StringUtils.isEmpty(username)&&"123456".equals(password)){
            httpSession.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }
        else{
            //告诉用户，你登录失败
            model.addAttribute("msg","用户名或者密码错误!");
            return "index";
        }
    }
    @RequestMapping("/login/main")
    public String mainPlatform(){
        return "redirect:/main.html";
    }
}
