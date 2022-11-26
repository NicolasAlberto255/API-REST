package com.rest.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rest.api.models.ReservaDepartamento;
import com.rest.api.services.ReservaDepartamentoService;

@RestController
@RequestMapping("reservaDepto/")
public class ReservaDeptoController {
    
    @Autowired
    ReservaDepartamentoService reservaDeptoService;

    @GetMapping("reservaDepto")
    public List<ReservaDepartamento> getReservaDepartamentos() {
        return reservaDeptoService.getReservaDepartamentos();
    }

    @GetMapping("reservaDeptoByIdReserva/{id}")
    public ReservaDepartamento findByIdReserva(@PathVariable("id") int id) {
        return this.reservaDeptoService.findByIdReserva(id);
    }

    @GetMapping("reservaDeptoByIdDepartamento/{id}")
    public ReservaDepartamento findByIdDepartamentos(@PathVariable("id") int id) {
        return this.reservaDeptoService.findByIdDepartamentos(id);
    }
}
