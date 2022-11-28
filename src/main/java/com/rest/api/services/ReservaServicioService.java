package com.rest.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.repositories.ReservaServicioRepository;
import com.rest.api.models.ReservaServicio;
import java.util.List;

@Service
public class ReservaServicioService {
    
    @Autowired
    ReservaServicioRepository reservaServicioRepository;

    public List<ReservaServicio> getReservaServicios() {
        return reservaServicioRepository.findAll();
    }
    
    public List<ReservaServicio> getReservaServicioByIdReserva(int id) {
        return reservaServicioRepository.getReservaServicioByIdReserva(id);
    }

    public List<ReservaServicio> getReservaServicioByIdServicios(int id) {
        return reservaServicioRepository.getReservaServicioByIdServicios(id);
    }
}
