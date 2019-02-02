package com.test.xuleix;

import com.test.xuleix.Model.Car;
import com.test.xuleix.Model.User;

import com.test.xuleix.Service.UserService;
import com.test.xuleix.mapper.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private UserService userMapper;


    @RequestMapping("/index")
    public String index(){
        User user = new User("xuleix", "hahah");
        System.out.println(user);
        return "hello";
    }

    @RequestMapping("/user")
    public String getuser(){
        User user = userMapper.getUser(1);
        System.out.println(user.toString());
        return "hello";
    }
}