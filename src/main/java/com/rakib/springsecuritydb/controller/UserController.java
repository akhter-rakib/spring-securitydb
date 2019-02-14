package com.rakib.springsecuritydb.controller;

import com.rakib.springsecuritydb.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/registration")
    public String userRegistrationView(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("result", "");
        return "adduser";
    }
}
