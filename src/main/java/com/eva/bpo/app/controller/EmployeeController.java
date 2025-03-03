package com.batch2.artifact1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.batch2.artifact1.service.RegService;

@Controller
public class RegController {
    @Autowired
    private RegService service;

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register"; // Displays register.html
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password, Model model) {
        boolean isRegistered = service.registerUser(username, password);

        if (isRegistered) {
            model.addAttribute("message", "Registration successful! Please login.");
            return "login"; // Redirect to login page after successful registration
        } else {
            model.addAttribute("error", "Username already exists!");
            return "register"; // Stay on register page if registration fails
        }
    }
}