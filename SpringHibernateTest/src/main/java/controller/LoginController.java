package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.LoginService;

@Controller  //注解为控制器
@RequestMapping(value="/login")    //截获带有/login的请求
public class LoginController {

    @Autowired
    LoginService loginService;  //注入service层

    @RequestMapping(method=RequestMethod.GET)
    public String get(){  //用来返回一个页面
        return "login";  //返回指向login.jsp页面
    }

    @RequestMapping(method=RequestMethod.POST)
    public String post(User user){  //用来处理用户的登陆请求
        if (loginService.login(user.getUserName(), user.getPassword())==1) {
            return "login_success";  //登陆成功，跳转到login_success.jsp页面
        }
        return "login";
    }
}

