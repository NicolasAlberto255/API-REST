package com.rest.api.controllers;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rest.api.models.Reserva;
import com.rest.api.models.Servicios;
import com.rest.api.services.ReservaServicioService;

@RestController
@RequestMapping("servicios/")
public class ServiciosController {

    @Autowired
    ReservaServicioService reservaServiciosService;

    @GetMapping("serviciosGet")
    public List<Servicios> getServicios() {
        return reservaServiciosService.getServicios();
    }

    @GetMapping("servicioName")
    public List<Servicios> getServicioByNombreServivicios(@RequestParam String nombreServicios) {
        return reservaServiciosService.findServicioByNombreServicios(nombreServicios);
    }

    @GetMapping("serviciosGet/{id}")
    public Reserva findById(@PathVariable("id") int id) {
        return this.reservaServiciosService.findById(id);
    }

    @PostMapping("serviciosSave")
    public Servicios saveServicios(@RequestBody Servicios servicios) {
        return this.reservaServiciosService.saveServicios(servicios);
    }

    @GetMapping("serviciosGetByIds")
    public List<Servicios> getByIds(@RequestBody Set<Integer> ids) {
        return reservaServiciosService.getByIds(ids);
    }

}