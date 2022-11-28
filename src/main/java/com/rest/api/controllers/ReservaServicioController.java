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

    @GetMapping("reservaServicioByIdReserva")
    public List<ReservaServicio> getReservaServicioByIdReserva(@RequestParam int id) {
        return reservaServicioService.getReservaServicioByIdReserva(id);
    }    

    @GetMapping("reservaServicioByIdServicio")
    public List<ReservaServicio> getReservaServicioByIdServicios(@RequestParam int id) {
        return reservaServicioService.getReservaServicioByIdServicios(id);
    }
}
