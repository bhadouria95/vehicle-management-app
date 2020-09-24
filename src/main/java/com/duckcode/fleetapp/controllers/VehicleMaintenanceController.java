package com.duckcode.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMaintenanceController {

    @GetMapping("/vehicle-maintenance")
    public String getVehicleMaintenance() {
        return "vehicle-maintenance";
    }
}
