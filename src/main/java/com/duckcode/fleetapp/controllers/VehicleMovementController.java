package com.duckcode.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMovementController {

    @GetMapping("/vehicle-movements")
    public String getVehicleMovements() {
        return "vehicle-movement";
    }
}
