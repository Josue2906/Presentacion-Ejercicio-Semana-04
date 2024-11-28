package com.example.Ejercicio_Semana04.controller;

import com.example.Ejercicio_Semana04.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class FormController {
    
    @GetMapping("/form")    
    public String showForm(Model model){
        model.addAttribute("user", new User());
        return "form";
    }
    
    @PostMapping("/submit")
    public String submitForm(@ModelAttribute User user, Model model){
        model.addAttribute("user", user);
        return "success";
    }
}
