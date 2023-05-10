package com.aimeelina.community.controller;

import com.aimeelina.community.entity.User;
import com.aimeelina.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
public class HomeController {
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/users",method = RequestMethod.GET)
    public String showUsers(Model model){
        List<User> users = userService.findAllUser(2);
        model.addAttribute("users",users);
        return "/showUsers";
    }
}
