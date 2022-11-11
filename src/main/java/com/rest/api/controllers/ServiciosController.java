package com.rest.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rest.api.models.Servicios;
import com.rest.api.services.ServiciosService;

@RestController
@RequestMapping("servicio/")
public class ServiciosController {

    @Autowired
    ServiciosService serviciosService;

    @GetMapping("servicios")
    public List<Servicios> getServicios() {
        return serviciosService.getServicios();
    }

    @GetMapping("disponibilidad")
    public List<Servicios> getServicioByDisponibilidad(@RequestParam String disponibilidadServicios) {
        return serviciosService.getServicioByDisponibilidad(disponibilidadServicios);
    }

    @GetMapping("servicioName")
    public List<Servicios> findServicioByNombreServicios(@RequestParam String nombreServicios) {
        return serviciosService.findServicioByNombreServicios(nombreServicios);
    }

    @GetMapping("serviciosGet/{id}")
    public Servicios findById(@PathVariable("id") int id) {
        return this.serviciosService.findById(id);
    }

    @PostMapping("serviciosSave")
    public Servicios saveServicios(@RequestBody Servicios servicios) {
        return this.serviciosService.saveServicios(servicios);
    }
}