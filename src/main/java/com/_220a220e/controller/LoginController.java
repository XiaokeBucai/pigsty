package com._220a220e.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Garrosh
 * @date 2018/5/27
 */
@Controller
@RequestMapping("/passport")
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "/login/login";
    }
}
