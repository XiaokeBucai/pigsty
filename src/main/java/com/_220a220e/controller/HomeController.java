package com._220a220e.controller;

import com._220a220e.entity.User;
import com._220a220e.service.UserService;
import com._220a220e.util.PasswordHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Garrosh
 * @date 2018/6/2
 */
@Controller
@RequestMapping("/static")
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String main() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        PasswordHelper.encryptPassword(user);
        userService.insert(user);
        return user.getUsername();
    }
}
