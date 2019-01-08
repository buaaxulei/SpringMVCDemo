package com.test.xuleix;

import com.test.xuleix.Model.User;
import com.test.xuleix.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/index")
    public String index(){
        return "hello";
    }

    @RequestMapping("/user")
    public String getuser(){
        User user = userMapper.findById(1);
        System.out.println(user.toString());
        return "hello";
    }
}