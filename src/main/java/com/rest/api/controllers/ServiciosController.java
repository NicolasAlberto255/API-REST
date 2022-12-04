package com.rest.api.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public List<Servicios> getServicioByEstado(@RequestParam String disponibilidadServicios) {
        return serviciosService.getServicioByEstado(disponibilidadServicios);
    }

    @GetMapping("servicioNombre")
    public List<Servicios> findServicioByNombreServicios(@RequestParam String nombreServicios) {
        return serviciosService.findServicioByNombreServicios(nombreServicios);
    }

    @GetMapping("serviciosGet/{id}")
    public Servicios findById(@PathVariable("id") int id) {
        return this.serviciosService.findById(id);
    }

    @GetMapping("countServicios")
    public int getCountServicio() {
        return serviciosService.getCountServicio();
    }

    @GetMapping("countServiciosByEstado")
    public Map<String, String> getCountServicioByEstado() {
        HashMap<String, String> map = new HashMap<>();
        List<String> list = serviciosService.getCountServicioByEstado();

        for (String string : list) {
            String[] parts = string.split(",");
            map.put(parts[0], parts[1]);
        }
        return map;
    }

    @PostMapping("serviciosSave")
    public Servicios saveServicios(@RequestBody Servicios servicios) {
        return this.serviciosService.saveServicios(servicios);
    }

    @PutMapping("serviciosUpdate/{id}")
    public String updateServicios(@PathVariable("id") int id, @RequestBody Servicios servicios) {
        Servicios serviciosUpdate = serviciosService.findById(id);
        serviciosUpdate.setNombreServicios(servicios.getNombreServicios());
        serviciosUpdate.setDescripcionServicios(servicios.getDescripcionServicios());
        serviciosUpdate.setEstadoServicios(servicios.getEstadoServicios());
        serviciosUpdate.setPrecioServicios(servicios.getPrecioServicios());
        return "Servicio Actualizado";
    }

    @DeleteMapping("serviciosDelete/{id}")
    public String deleteServicios(@PathVariable("id") int id) {
        boolean ok = this.serviciosService.deleteServicios(id);
        if (ok) {
            return "Servicio Eliminado";
        } else {
            return "Error al eliminar el servicio";
        }
    }
}