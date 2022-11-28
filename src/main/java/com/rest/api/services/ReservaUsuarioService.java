package com.rest.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.api.models.ReservaUsuario;
import com.rest.api.repositories.ReservaUsuarioRepository;
import java.util.List;

@Service
public class ReservaUsuarioService {
    
    @Autowired
    ReservaUsuarioRepository reservaUsuarioRepository;

    public List<ReservaUsuario> getReservaUsuario() {
        return reservaUsuarioRepository.findAll();
    }

    public List<ReservaUsuario> getReservaUsuarioByIdReserva(int id) {
        return reservaUsuarioRepository.getReservaUsuarioByIdReserva(id);
    }

    public List<ReservaUsuario> getReservaUsuarioByIdUsuario(int id) {
        return reservaUsuarioRepository.getReservaUsuarioByIdUsuario(id);
    }
}
