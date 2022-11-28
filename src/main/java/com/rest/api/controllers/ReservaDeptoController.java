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

    @GetMapping("reservaDeptoByIdReserva")
    public List<ReservaDepartamento> getReservaDeptoByIdReserva(@RequestParam int id) {
        return reservaDeptoService.getReservaDeptoByIdReserva(id);
    }

    @GetMapping("reservaDeptoByIdDepto")
    public List<ReservaDepartamento> getReservaDeptoByIdDepto(@RequestParam int id) {
        return reservaDeptoService.getReservaDeptoByIdDepto(id);
    }
}
