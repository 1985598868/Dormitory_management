package com.example.uml_work.controller;


import com.example.uml_work.Service.EquipmentService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpSession;

@Controller
public class SuccessController {

    @Autowired
    private EquipmentService equipmentService;


    @GetMapping("/roommate")
    public String roommate(){

        return "roommate";
    }


    @GetMapping("/equipments")
    public String equipments(HttpSession session,Model model){


        System.out.println(session.getAttribute("loginUser"));
//        equipmentService.selectAll();
        return "equipment";

    }

}
