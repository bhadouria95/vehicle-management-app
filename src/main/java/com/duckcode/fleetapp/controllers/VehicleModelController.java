package com.duckcode.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleModelController {

    @GetMapping("/vehicle-models")
    public String getVehicleModels() {
        return "vehicle-model";
    }
}
