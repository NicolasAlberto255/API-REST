package com.rest.api.controllers;

import java.util.List;
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
    public List<CheckIn> getCheckIn() {
        return checkInService.getCheckIn();
    }

    @GetMapping("checkinGet/{id}")
    public CheckIn findById(@PathVariable("id") int id) {
        return this.checkInService.findById(id);
    }

    @PostMapping("checkinSave")
    public String saveCheckIn(@RequestBody CheckIn checkIn) {
        this.checkInService.saveCheckIn(checkIn);
        return "Check In Guardado";
    }

    @PutMapping("checkInUpdate/{id}")
    public String updateCheckIn(@PathVariable("id") int id, @RequestBody CheckIn checkIn) {
        CheckIn checkInUpdate = checkInService.findById(id);
        checkInUpdate.setNombreCliente(checkIn.getNombreCliente());
        checkInUpdate.setFechaCheckIn(checkIn.getFechaCheckIn());
        checkInUpdate.setAnotaciones(checkIn.getAnotaciones());
        checkInUpdate.setMontoFinalReserva(checkIn.getMontoFinalReserva());
        checkInService.saveCheckIn(checkInUpdate);
        return "Check In actualizado";
    }

    @DeleteMapping("checkInDelete/{id}")
    public String deleteCheckIn(@PathVariable("id") int id) {
        boolean ok = this.checkInService.deleteCheckIn(id);
        if (ok) {
            return "Check In eliminado";
        } else {
            return "Error al eliminar Check In";
        }
    }
}