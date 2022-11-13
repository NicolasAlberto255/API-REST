package com.rest.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rest.api.models.Reserva;
import com.rest.api.reservaRequests.ReservaRequest;
import com.rest.api.services.ReservaService;

@RestController
@RequestMapping("reserva/")
public class ReservaController {

    @Autowired
    ReservaService reservaService;

    @GetMapping("reservas")
    public List<Reserva> getReserva() {
        return reservaService.getReserva();
    }

    @GetMapping("reservaGet/{id}")
    public Reserva findById(@PathVariable("id") int id) {
        return this.reservaService.findById(id);
    }

    @GetMapping("estadoReserva")
    public List<Reserva> getReservasByEstado(@RequestParam String estadoReserva) {
        return reservaService.getReservasByEstado(estadoReserva);
    }

    @PostMapping("reservaSave")
    public String saveReserva(@RequestBody Reserva reserva) {
        this.reservaService.saveReserva(reserva);
        return "Reserva Guardada";
    }

    @PostMapping("reservaAdd")
    public String addReserva(@RequestBody ReservaRequest reservaRequest) {
        this.reservaService.addReservaServicios(reservaRequest);
        return "Reserva Agregada";
    }

    @PutMapping("reservaUpdate/{id}")
    public String updateReserva(@PathVariable("id") int id, @RequestBody Reserva reserva) {
        Reserva reservaUpdate = reservaService.findById(id);
        reservaUpdate.setFechaInicio(reserva.getFechaInicio());
        reservaUpdate.setFechaFin(reserva.getFechaFin());
        reservaUpdate.setFechaCreacion(reserva.getFechaCreacion());
        reservaUpdate.setPrecioAbono(reserva.getPrecioAbono());
        reservaUpdate.setEstadoReserva(reserva.getEstadoReserva());
        reservaUpdate.setPrecioTotal(reserva.getPrecioTotal());
        reservaService.saveReserva(reservaUpdate);
        return "Reserva actualizada";
    }

    @DeleteMapping("reservaDelete/{id}")
    public String deleteById(@PathVariable("id") int id) {
        boolean ok = this.reservaService.deleteReserva(id);
        if (ok) {
            return "Se eliminó la Reserva con id " + id;
        } else {
            return "No se pudo eliminar la Reserva con id " + id;
        }
    }
}
