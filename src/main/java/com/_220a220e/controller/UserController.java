package com._220a220e.controller;

import com._220a220e.entity.User;
import com._220a220e.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Garrosh
 * @date 2018/5/25
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String main(Model model) {
        User user = userService.findByUsername("admin");
        model.addAttribute("vo", user);
        return "/user/main";
    }

}
