package com.Institute_Website_Project.controller;

import com.Institute_Website_Project.entity.Student_Register;
import com.Institute_Website_Project.helper.Message;
import com.Institute_Website_Project.repo.StudentRepo;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @RequestMapping("/userRegister")
    public String UserRegisterHandler(){

        return "index.html";
    }
//    @PostMapping("/save")
//    public String saveData(@ModelAttribute("register")Student_Register register){
//        studentRepo.save(register);
//        return "index.html";
//    }
    @PostMapping("/save")
    public String saveData(@ModelAttribute("register") Student_Register register,
                           @RequestParam(value = "agreement", defaultValue = "false")
                           boolean agreement , Model model , HttpSession session ) {

    try {
        studentRepo.save(register);

        session.setAttribute("message", new Message("Successfully Registered !!", "alert-success"));
        return "index.html";

    } catch (Exception e) {
        e.printStackTrace();
        session.setAttribute("message", new Message("Something Went wrong !!" + e.getMessage(), "alert-danger"));
        return "index.html";
    }
}}
