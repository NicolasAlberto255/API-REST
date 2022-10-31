package com.rest.api.controllers;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rest.api.models.CheckIn;
import com.rest.api.services.CheckInService;

@RestController
@RequestMapping("checkin/")
public class CheckInController {

    @Autowired
    CheckInService checkInService;

    @GetMapping("checkins")
    public ArrayList<CheckIn> getCheckIn() {
        return checkInService.getCheckIn();
    }

    @GetMapping("checkinGet/{id}")
    public CheckIn findById(@PathVariable("id") int id) {
        return this.checkInService.findById(id);
    }

    @PostMapping("checkinSave")
    public String saveCheckIn(@RequestBody CheckIn checkIn) {
        this.checkInService.saveCheckIn(checkIn);
        return "CheckIn Guardado";
    }

    @PutMapping("checkinPut/{id}")
    public String updateCheckIn(@PathVariable("id") int id, @RequestBody CheckIn checkIn) {
        CheckIn checkInUpdate = checkInService.findById(id);
        checkInUpdate.setFechaCheckIn(checkIn.getFechaCheckIn());
        checkInUpdate.setAnotaciones(checkIn.getAnotaciones());
        checkInService.saveCheckIn(checkInUpdate);
        return "Check In actualizado";
    }
}