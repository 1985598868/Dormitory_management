package com.example.uml_work.controller;


import com.example.uml_work.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password
            , HttpSession session, Model model){

        System.out.println(username+password);
        if (studentService.studentLogin(username, password)) {
            System.out.println("登入成功");

            session.setAttribute("loginUser",username);
            return "redirect:/success";
        }
        model.addAttribute("deLogin","密码或者账号错误");
        return "redirect:/";
    }

    @GetMapping("/success")
    public String login(){
        return "success";
    }
}
