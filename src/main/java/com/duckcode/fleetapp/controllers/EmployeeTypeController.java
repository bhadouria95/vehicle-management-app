package com.duckcode.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeTypeController {

    @GetMapping("/employee-types")
    public String getEmployeeType() {
        return "employee-type";
    }
}
