package com.rest.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rest.api.models.Reserva;
import com.rest.api.repositories.ReservaRepository;
import com.rest.api.reservaRequests.ReservaRequest;
import com.rest.api.services.ReservaServicioService;

@RestController
@RequestMapping("reserva/")
public class ReservaController {

    @Autowired
    ReservaServicioService reservaServiciosService;

    @Autowired
    ReservaRepository reservaRepository;

    @GetMapping("reservas")
    public List<Reserva> getReserva() {
        return reservaServiciosService.getReserva();
    }

    @GetMapping("reservaGet/{id}")
    public Reserva findById(@PathVariable("id") int id) {
        return this.reservaServiciosService.findById(id);
    }

    @PostMapping("reservaSave")
    public String saveReserva(@RequestBody Reserva reserva) {
        this.reservaServiciosService.saveReserva(reserva);
        return "Reserva Guardada";
    }

    @PostMapping("reservaAdd")
    public String addReserva(@RequestBody ReservaRequest reservaRequest) {
        this.reservaServiciosService.addReservaServicios(reservaRequest);
        return "Reserva Agregada";
    }

    @PutMapping("reservaPut/{id}")
    public String updateReserva(@PathVariable("id") int id, @RequestBody Reserva reserva) {
        Reserva reservaUpdate = reservaServiciosService.findById(id);
        reservaUpdate.setFechaInicio(reserva.getFechaInicio());
        reservaUpdate.setFechaFin(reserva.getFechaFin());
        reservaUpdate.setFechaCreacion(reserva.getFechaCreacion());
        reservaUpdate.setPrecioAbono(reserva.getPrecioAbono());
        reservaServiciosService.saveReserva(reservaUpdate);
        return "Reserva actualizada";
    }

    @DeleteMapping("reservaDelete/{id}")
    public String deleteById(@PathVariable("id") int id) {
        boolean ok = this.reservaServiciosService.deleteReserva(id);
        if (ok) {
            return "Se eliminó la Reserva con id " + id;
        } else {
            return "No se pudo eliminar la Reserva con id " + id;
        }
    }
}
