package cn.peppa.web;

import cn.peppa.pojo.User;
import cn.peppa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zyf
 */
@Controller
public class UserController {


    @Autowired
    UserService userService;

    @RequestMapping("toLogin")
    public String login(){
        return "redirect:/static/login.html";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(
            @RequestParam
                    String userName,
            @RequestParam
                    String password,
            Model model
    ){
        User user = userService.login(userName, password);
        if(user.getUserId() == null && user.getUserId() != 0){
            return "redirect:/static/login.html";
        }else{
            return "";
        }
    }

}
