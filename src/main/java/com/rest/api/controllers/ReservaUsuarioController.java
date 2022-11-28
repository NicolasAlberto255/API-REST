package com.rest.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rest.api.models.ReservaUsuario;
import com.rest.api.services.ReservaUsuarioService;

@RestController
@RequestMapping("reservaUsuario/")
public class ReservaUsuarioController {
    
    @Autowired
    ReservaUsuarioService reservaUsuarioService;

    @GetMapping("reservaUsuarios")
    public List<ReservaUsuario> getReservaUsuarios() {
        return reservaUsuarioService.getReservaUsuario();
    }

    @GetMapping("reservaUsuarioByIdReserva")
    public List<ReservaUsuario> getReservaUsuarioByIdReserva(@RequestParam int id) {
        return reservaUsuarioService.getReservaUsuarioByIdReserva(id);
    }

    @GetMapping("reservaUsuarioByIdUsuario")
    public List<ReservaUsuario> getReservaUsuarioByIdUsuario(@RequestParam int id) {
        return reservaUsuarioService.getReservaUsuarioByIdUsuario(id);
    }
}
