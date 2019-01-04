package com.test.xuleix;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    private static final Logger LOGGER = Logger.getLogger(LoginController.class);

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView handleLogin(String username, String password){
        ModelAndView mv = new ModelAndView("login");
        LOGGER.info("username is " + username + ", password is " + password);
        mv.addObject("msg", username);
        return mv;
    }
}
