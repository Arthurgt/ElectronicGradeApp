package com.arthurgt.electronicgradeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/grade")
public class GradeController {
    @RequestMapping("/gradeForm")
    public String showForm(Model theModel) {
        return "grade-form";
    }

    @RequestMapping("/processForm")
    public String processForm(Model theModel) {
        return "grade-list";
    }
}
