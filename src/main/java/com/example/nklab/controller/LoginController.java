package com.example.nklab.controller;

import com.example.nklab.pojo.User;
import com.example.nklab.result.Result;
import com.example.nklab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;


@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping(value = "/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser){
        String email = requestUser.getEmail();
        email = HtmlUtils.htmlEscape(email);
        String password = requestUser.getPassword();
        User user = userService.findUserByEmailAndPassword(email, password);

        if(user == null){
//            System.out.println("test");
            return new Result(400);
        }else {
            return new Result(200);
        }
    }
}
