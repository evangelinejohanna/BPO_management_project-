package com.eva.bpo.app.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
// import com.eva.bpo.app.domain.Project;
import com.eva.bpo.app.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping("/list")
    public String listProjects(Model model) {
        model.addAttribute("projects", projectService.getAllProjects());
        return "projectList";
    }
}