package com.eva.bpo.app.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
// import com.eva.bpo.app.domain.Employee;
import com.eva.bpo.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/list")
    public String listEmployees(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employeeList";
    }
}
