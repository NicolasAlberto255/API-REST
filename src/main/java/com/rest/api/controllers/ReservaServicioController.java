package com.rest.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rest.api.models.ReservaServicio;
import com.rest.api.services.ReservaServicioService;

@RestController
@RequestMapping("reservaServicio/")
public class ReservaServicioController {

    @Autowired
    ReservaServicioService reservaServicioService;

    @GetMapping("reservaServicios")
    public List<ReservaServicio> getReservaServicios() {
        return reservaServicioService.getReservaServicios();
    }

    @GetMapping("reservaServicioByIdReserva/{id}")
    public ReservaServicio findByIdReserva(@PathVariable("id") int id) {
        return this.reservaServicioService.findByIdReserva(id);
    }    

    @GetMapping("reservaServicioByIdServicio/{id}")
    public ReservaServicio findByIdServicio(@PathVariable("id") int id) {
        return this.reservaServicioService.findByIdServicios(id);
    }
}
